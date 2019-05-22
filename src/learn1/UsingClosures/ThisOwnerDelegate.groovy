package learn1.UsingClosures



def examiningClosure(closure){
    closure()
}

examiningClosure() {
    println("in first")
    println("class is" + getClass().name)
    println("super class" + getClass().superclass.name)

    println("owner is " + owner  )
    println("owner is " + delegate  )
}