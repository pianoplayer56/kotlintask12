fun main() {
    val likesAmount = readLine()!!.toInt()
    printLikes(likesAmount)
}

fun printLikes(likesAmount: Int) {
    val isOtherEnding: Boolean = likesAmount.toString().endsWith("1")
            && !likesAmount.toString().endsWith("11")
    println("Понравилось $likesAmount ${if (isOtherEnding) "человеку" else "людям"}")
}

