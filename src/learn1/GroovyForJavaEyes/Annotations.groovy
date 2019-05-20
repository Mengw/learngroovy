package learn1.GroovyForJavaEyes

import groovy.transform.Canonical
import groovy.transform.Immutable
import sun.font.CreatedFontTracker

//@Canonical(excludes="lastName, age")
class Person{
    String firstName
    String lastName
    int age
}

def sara = new Person(firstName: 'aaaa', lastName: 'bbbb', age: 1)
println(sara)

class Worker{
    def work(){
        println('get work done')
    }

    def analyze(){
        println('analyze')
    }

    def writeReport(){
        println('report')
    }
}

class Expert{
    def analyze(){
        print('expert ana')
    }
}

class Manager {
    @Delegate
    Expert expert = new Expert()
    @Delegate
    Worker worker = new Worker()
}

def berine = new Manager()
berine.analyze()
berine.work()
berine.writeReport()

@Immutable
class CreditCard{
    String cardNumber
    int creditLimit
}


class Heavy{
    def size=10
    Heavy(){
        println("creating heavy with $size")
    }
}

class AsNeeded {
    def value

    @Lazy
    Heavy heavy1 = new Heavy()
    @Lazy
    Heavy heavy2 = {
        new Heavy(size: value)
    }()

    AsNeeded(){
        println("create AsNeeded")
    }
}

def asNeeded = new AsNeeded(value: 1000)
println(asNeeded.heavy1.size)
println(asNeeded.heavy1.size)
println(asNeeded.heavy2.size)


@Newify([Person, CreditCard])
def fluentCreate(){
    println(Person.new())
    println(Person())
    println(CreditCard())


}


@Singleton(lazy = true)
class TheUnique{
    private TheUnique(){
        println("the unique")
    }

    def hello(){
        println('hello')
    }
}

TheUnique.instance.hello()