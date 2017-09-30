import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object WordCount {
    def main(args: Array[String]) {
        if (args.length < 1) {
            System.err.println("Usage: WordCount <file>")
            System.exit(1)
        }

        val conf = new SparkConf().setAppName("WordCount")
        val sc = new SparkContext(conf)

        val counts = sc.textFile(args(0))
            .flatMap(line => line.split("\\W"))
            .map(word => (word, 1)).reduceByKey(_ + _)
        counts.collect().foreach(println)

        sc.stop()

    }
}