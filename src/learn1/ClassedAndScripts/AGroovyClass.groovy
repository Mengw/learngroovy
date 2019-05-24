package learn1.ClassedAndScripts

class AGroovyClass{
    def useClosure(clouse){
        println("calling clouse")
        clouse()
    }


    def passToClosure(int value, closure){
        println("Simply passing $value to the given closure")
        closure(value)
    }

}

