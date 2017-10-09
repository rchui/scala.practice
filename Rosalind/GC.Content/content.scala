import scala.io.Source
import scala.collection.mutable.ListBuffer

object content {
    def main(args: Array[String]) {
        var pair = ("", ListBuffer.empty)
        for (line <- Source.fromFile("sequences.fasta").getLines) {
            if (line(0) == '>') {
                pair = pair.copy(_1 = line)
            } else {
                var buffer: ListBuffer[String] = pair._2
                buffer += line
                pair = pair.copy(_2 = buffer)
            }
            println(pair)
        }
    }
}