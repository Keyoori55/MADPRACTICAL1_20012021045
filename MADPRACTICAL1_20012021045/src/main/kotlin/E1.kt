fun main() {

    println("With using third variable:")
    var x = 10
    var y = 20
    println("--Before swapping--")
    print("x = $x")
    println("y = $y")
    val temporary = x
    x = y
    y = temporary
    println("--After swapping--")
    println("x = $x")
    println("y = $y")

    println("Without using third variable")
    var x1 = 80
    var x2 = 32

    println("--Before swap--")
    println("a = $x1")
    println("b = $x2")

    x1 = x1 - x2
    x2 = x1 + x2
    x1 = x2 - x1

    println("--After swap--")
    println("a = $x1")
    println("b = $x2")
}
