object fibonacci {
    def main(args: Array[String]) {
        val current: Int = 23
        val value = findFibonacci(0, 1, current - 2, current)
        println(value)
    }

    def findFibonacci(two: Int, one: Int, step: Int, total: Int): Int = {
        if (total == 1) {
            two
        } else if (total == 2) {
            one
        } else if (step == 0){
            two + one
        } else {
            findFibonacci(one, two + one, step - 1, total)
        }
    }
}