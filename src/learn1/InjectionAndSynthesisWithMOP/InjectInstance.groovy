package learn1.InjectionAndSynthesisWithMOP

class Person{
    def play(){
        println('play')
    }
}

def emc = new ExpandoMetaClass(Person)


emc.sing = {
    -> 'oh baby baby ..'
}

emc.initialize()


def jack = new Person()
def paul = new Person()


jack.metaClass = emc

println(jack.sing())
println(jack.play())

try{
    paul.play()
    paul.sing()
}catch(ex){
    println(ex)
}


jack.metaClass = null
try{
    jack.play()
    jack.sing()
}catch(ex){
    println(ex)
}
