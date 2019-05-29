package learn1.InjectionAndSynthesisWithMOP

class PersonHelper{}


def emc = new ExpandoMetaClass(PersonHelper)

emc.methodMissing = {
    String name, args ->
        "emc methodMissing $name"
}

emc.initialize()


def jack = new PersonHelper()
def paul = new PersonHelper()


jack.metaClass = emc

println(jack.sing())
println jack.dance()
println(jack.juggle())

try{
    paul.sing()
}catch(ex){
    println ex
}

