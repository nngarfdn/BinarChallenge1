fun main() {
    println("Hello World!")

    val rows = 5
    val k = 0

//    1. piramida bintang
    printNormalPiramid(rows, k)
//   2. piramida terbalik bintang
    printInvertedPiramid(rows)
//   3. pramida bintang dan terbalik
    printNormalPiramid(rows, k)
    printInvertedPiramid(rows)
//   4. X bintang
    printInvertedPiramidOut(rows)
    printNormalPiramidOut(rows, k)
//   5. segitiga siku siku
    printTriangle(rows)

}

private fun printTriangle(rows: Int) {
    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

private fun printInvertedPiramid(rows: Int) {
    for (i in rows downTo 1) {

        for (space in 1..rows - i) {
            print("  ")
        }

        for (j in i..2 * i - 1) {
            print("* ")
        }

        for (j in 0..i - 1 - 1) {
            print("* ")
        }

        println()
    }
}

private fun printNormalPiramid(rows: Int, k: Int) {
    var k1 = k
    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }

        while (k1 != 2 * i - 1) {
            print("* ")
            ++k1
        }

        println()
        k1 = 0
    }
}

private fun printInvertedPiramidOut(rows: Int) {
    for (i in rows downTo 1) {

        for (space in 1..rows - i) {
            print("  ")
        }

        for (j in i until 2 * i) {
            if (j == i ) {
                print("* ")
            } else {
                print("  ")
            }
        }

        for (j in 0 until i - 1) {
            if (j == i-1-1) {
                print("* ")
            } else {
                print("  ")
            }
        }

        println()
    }
}
private fun printNormalPiramidOut(rows: Int, k: Int) {
    var k1 = k
    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }

        while (k1 != 2 * i - 1) {
            if (k1==0 || k1==2*i-2) {
                print("* ")
            } else {
                print("  ")
            }
            ++k1
        }

        println()
        k1 = 0
    }

}




