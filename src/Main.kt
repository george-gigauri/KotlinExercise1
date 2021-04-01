fun main() {
    print("Enter number: ")
    val i = readLine()

    try {
        val n = i?.toInt()
        print(isComposite(n!!))
    } catch (e: Exception) {
        print("Entered number is incorrect. See more details: \n${e.message}")
    }
}

fun isComposite(n: Int): Boolean {
    when {
        n <= 1 -> return false
        n <= 3 -> return false
        ((n % 2 == 0) or (n % 3 == 0)) -> return true
    }

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return true
        i += 6
    }

    return false
}