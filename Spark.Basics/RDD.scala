import org.apache.spark.SparkContext
import org.apache.spark.sparkConf

object RDD {
    def main(args: Array[String]) {
        val conf = new SparkConf().setAppName("RDD Application")
        val sc = new SparkContext(conf)

        val textFile = sc.textFile("test.txt")
    }
}