package learn1.UsingClosures



def examiningClosure(closure){
    closure()
}

examiningClosure() {
    println("in first")
    println("class is" + getClass().name)
    println("this is" + this + ", super:" + this.getClass().superclass.name)
    println("owner is" + owner + ", super:" + owner.getClass().superclass.name )
    println("delegate is" + delegate + ", super"+ delegate.getClass().superclass.name)


    examiningClosure() {
        println("in first")
        println("class is" + getClass().name)
        println("this is" + this + ", super:" + this.getClass().superclass.name)
        println("owner is" + owner + ", super:" + owner.getClass().superclass.name )
        println("delegate is" + delegate + ", super"+ delegate.getClass().superclass.name)
    }
}