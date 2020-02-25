fun main(args: Array<String>)
{
    fun func() 
    {
        val i: Int = 555
        if (i > 5) {
            println("Number of arguments is ${args.size}")
        } else {
            println("Hello, Kt!")
        }
    }
    
    func()
}