fun main() {
//    1. piramida bintang
    printNormalPiramid()
    println()
    println()
//   2. piramida terbalik bintang
    printInvertedPiramid()
    println()
    println()
//   3. pramida bintang dan terbalik
    printNormalPiramid()
    printInvertedPiramid()
    println()
    println()
//   4. X bintang
    printInvertedPiramidOut()
    printNormalPiramidOut()
    println()
    println()
//   5. segitiga siku siku
    printTriangle()

}

private fun printTriangle() {
    for (i in 1..8) {
        for (j in 1..i) print("* ")
        println()
    }
    /*
    print segitiga biasa
    */
}

private fun printInvertedPiramid() {
    for (i in 8 downTo 1) {
        for (j in 1..8 - i)  print("  ")
        for (k in i until 2 * i) print("* ")
        for (l in 0 until i - 1) print("* ")
        println()
    }

    /*
    pakai downto
    for pada i untuk menentukan banyaknya baris
    for pada j membentuk segitiga 90 derajat kiri bawah / awalan
    for pada k membentuk segitiga 90 derajat kanan atas
    for pada k membentuk segitiga 90 derajat kiri atas
   */
}

private fun printNormalPiramid() {
    for (i in 1..8) {
        for (j in 1..8 - i) print("  ")
        for (k in 1 until 2 * i) print("* ")
        println()
    }
    /*
    for pada i untuk menentukan banyaknya baris
    for pada j membentuk segitiga 90 derajat kiri atas
    for pada k print biasa setelah for j
    println untuk enter setelah selesai i
    */
}

private fun printInvertedPiramidOut() {
    for (i in 8 downTo 1) {
        for (j in 1..8 - i) print("  ")
        for (j in i until 2 * i) if (j == i ) print("* ") else print("  ")
        for (j in 0 until i - 1) if (j == i-1-1) print("* ") else print("  ")
        println()
    }
    /*
    ini sama kayak printInvertedPiramid
    cuman diambil luarnya saja
     */
}
private fun printNormalPiramidOut() {
    var k = 0
    for (i in 1..8) {
        for (space in 1..8 - i) print("  ")
        while (k != 2 * i - 1) {
            if (k==0 || k==2*i-2) print("* ") else print("  ")
            k++
        }
        println()
        k = 0
    }
    /*
    ini sama kayak printNormalPiramid
    cuman diambil luarnya saja
     */

}




