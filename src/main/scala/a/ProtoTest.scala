package a

import com.example.tutorial.BookProtos.Book
import com.example.tutorial.BookProtos
import collection.JavaConversions._

/**
 * @author peter
 */
object ProtoTest extends App {
  var b=BookProtos.Book.newBuilder();
  b.setPageNumber(1)
  val list=List[Integer](1,2,3)
  b.addAllPhone(list)
  val book=b.build()
  print(book)
}