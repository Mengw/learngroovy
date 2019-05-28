package learn1.InjectionAndSynthesisWithMOP

class Person1{
    def play(){
        println( 'playing')
    }
}

def jack = new Person1()
def paul = new Person1()


jack.metaClass.sing = {
    ->
    'ob baby'
}

println(jack.sing())

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




