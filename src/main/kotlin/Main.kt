fun main(args: Array<String>) {

    val name = "Hello Benjamin!"
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    hello(name)
    println(hello(name))

}

fun hello(name : String) : String {
    val res: String = name
    println(name)
    return res
}