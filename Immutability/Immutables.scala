object Immutables {
    def main(args: Array[String]) {
        val vec: Vector[Int] = fibonacci(1, 10000, scala.collection.immutable.Vector.empty)
        // println(vec)
    }

    def fibonacci(value: Int, stop: Int, vec: Vector[Int]): Vector[Int] = {
        if (value > stop) {
            vec
        } else {
            println(vec)
            fibonacci(value + value, stop, vec :+ value)
        }
    }
}