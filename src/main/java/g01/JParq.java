package g01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.fs.Path;
import org.apache.parquet.proto.ProtoParquetWriter;

import com.example.tutorial.BookProtos;
import com.example.tutorial.BookProtos.Book;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;

public class JParq {

	public static void main(String[] args) throws IOException {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		Book.Builder b=BookProtos.Book.newBuilder();
		b.addAllPhone(list);
		b.setPageNumber(1);
		b.setQuery("AAAAA");
		Book book=b.build();
		System.out.println(book);
		Path path=new Path("/Users/peter/workspace-spark/g01/tmp/book");
		Book.Builder c=BookProtos.Book.newBuilder();
		c.addAllPhone(list);
		c.setPageNumber(2);
		c.setQuery("Z");
		
		Book book2=c.build();
		writeMessages(Book.class,path,book,book,book,book2,book2);
		
		
	}
	
	
	
	  public static void writeMessages(Class<? extends Message> cls, Path file,
			  MessageOrBuilder... records) throws IOException {

	      ProtoParquetWriter<MessageOrBuilder> writer =
	              new ProtoParquetWriter<MessageOrBuilder>(file, cls);
	
	      try {
	        for (MessageOrBuilder record : records) {
	          writer.write(record);
	        }
	      } finally {
	        writer.close();
	      }
	    }


}
