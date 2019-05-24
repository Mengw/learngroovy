package learn1.UsingClosures

class Handler{
    def f1(){
        println("f1 ")
    }

    def f2(){
        println("f2 " )
    }

}

class Example{
    def f1(){
        println("f1 e ")
    }

    def f2(){
        println("f2 e" )
    }

    def foo(closure) {
        closure.delegate = new Handler()
        closure()
    }
}


def f1() {
    println(" script f1")
}


new Example().foo(){
    f1()
    f2()
}

