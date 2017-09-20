object Iteration {
    def main(args: Array[String]) {
        val phoneBattery = List(82.3, 31.6, 72.5, 64.7)

        def printValue(value: Double) = {
            println(value + " mAh")
        }

        phoneBattery.map(_ / 100 * 5400).map(printValue)
    }
}