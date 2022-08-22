fun main()
{
    print("enter a number : ")
    var x : Int = readLine()!!.toInt()

    if(x % 2 == 0)
        println("even number")
    else
        println("odd number")
}