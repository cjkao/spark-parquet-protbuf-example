package a

/**
 * @author peter
 */

import org.apache.parquet.hadoop.{ParquetOutputFormat, ParquetInputFormat}
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.hadoop.mapreduce.Job
import org.apache.parquet.proto._
import org.apache.parquet.filter.{RecordFilter, UnboundRecordFilter}
import java.lang.Iterable
import org.apache.parquet.column.ColumnReader
import org.apache.parquet.filter.ColumnRecordFilter._
import org.apache.parquet.filter.ColumnPredicates._
import com.google.common.io.Files
import java.io.File
import org.apache.avro._
import acid._
import com.example.tutorial.BookProtos.Book
import com.example.tutorial.BookProtos.BookOrBuilder
object ProtoParquetExample {

  // This predicate will remove all amino acids that are not basic
  class BasicProtoPredicate extends UnboundRecordFilter {
    def bind(readers: Iterable[ColumnReader]): RecordFilter = {
      column("query", equalTo("AAAAA")).bind(readers)
    }
  }

  // Only prints non-null amino acids
  private def protoPrinter(tuple: Tuple2[Void, BookOrBuilder]) = {
    println(tuple._2.getQuery())
  }

  def main(args: Array[String]) {
    val sc = new SparkContext("local", "ParquetExample")
    val job = new Job()

    val tempDir = Files.createTempDir()
    val outputDir = new File("/Users/peter/workspace-spark/g01/tmp/book").getAbsolutePath
    println(outputDir)

    // Set a predicate and Parquet only deserializes amino acids that are basic.
    ParquetInputFormat.setReadSupportClass(job, classOf[ProtoReadSupport[BookOrBuilder]])
    val file = sc.newAPIHadoopFile(outputDir, classOf[ParquetInputFormat[BookOrBuilder]],
      classOf[Void], classOf[BookOrBuilder], job.getConfiguration)
    file.foreach(protoPrinter)
    
    
    
    // Non-basic amino acids will returned as null.
    ParquetInputFormat.setUnboundRecordFilter(job, classOf[BasicProtoPredicate])
    val filteredFile = sc.newAPIHadoopFile(outputDir, classOf[ParquetInputFormat[BookOrBuilder]],
      classOf[Void], classOf[BookOrBuilder], job.getConfiguration)
    filteredFile.foreach(protoPrinter)
  }


}