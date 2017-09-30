object recurrence {
    def main(args: Array[String]) {
        val months: Int = 5
        val litter: Int = 3
        val rabbits: Int = 1
        val pairs = getPairs(months - 1, litter, rabbits)
        println(pairs)
    }

    def getPairs(months: Int, litter: Int, rabbits: Int): Int = {
        println(months, litter, rabbits)
        if (months == 0) {
            0
        } else {
            val population: Int = rabbits * litter
            (population) + getPairs(months - 1, litter, population)
        }
    }
}