package learn1.UsingClosures

def clousre = {
    println this
    println owner
    println delegate
}


clousre()
clousre.call()

class Demo{
    def clousre = {
        println this
        println owner
        println delegate
    }


    def closure1 ={
        println this
        println owner
        println delegate

        def closure2 = {
            println("closure2")
            println this
            println owner == closure1
            println delegate

            def closure3 = {
                println("closure3")
                println this
                println owner == closure2
                println delegate
            }

            closure3()
        }

        closure2()
    }
}

demo = new Demo()
println demo.clousre
demo.clousre.call()
demo.clousre()


println('-----------------')
demo.closure1()
demo.closure1.call()

