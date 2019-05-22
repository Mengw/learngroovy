package learn1.UsingClosures


def doSomeThing(closure){
    if(closure){
        closure()
    }else {
        println("Using default implementation")
    }
}

doSomeThing(){
    println("use spe implement")
}

doSomeThing()
