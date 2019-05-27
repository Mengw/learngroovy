package learn1.UsingClosures


class MyClass{
    def outerClosure = {
        println this.class.name    // outputs MyClass
        println owner.class.name    // outputs MyClass
        println delegate.class.name  //outputs MyClass
        def nestedClosure = {
            println this.class.name    // outputs MyClass
            println owner.class.name    // outputs MyClass$_closure1
            println delegate.class.name  // outputs MyClass$_closure1
        }
        nestedClosure()
    }

    def run(){
        println this.class.name    // outputs MyClass
//        println owner.class.name    // outputs MyClass
//        println delegate.class.name  //outputs MyClass
        def c1 = { println this.class.name    // outputs MyClass
            println owner.class.name    // outputs MyClass$_closure1
            println delegate.class.name  // outputs MyClass$_closure1
            }
        c1()
    }
}

def myClass = new MyClass()
def closure = myClass.outerClosure
closure()
myClass.run()

println("==================")

class MyClass1 {
    String myString = "myString1"
    def outerClosure1 = {
        println myString;     // outputs myString1
        def nestedClosure = {
            println myString;  // outputs myString1
        }
        nestedClosure()
    }
}

MyClass1 myClass1 = new MyClass1()
def closure1 = new MyClass1().outerClosure1
closure1()

println myClass1.myString