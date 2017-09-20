object Iteration {
    def main(args: Array[String]) {
        val phoneBattery = List(82.3, 31.6, 72.5, 64.7)

        phoneBattery.map(_ / 100 * 5400).map((value) => {println(value + " mAh")})
    }
}