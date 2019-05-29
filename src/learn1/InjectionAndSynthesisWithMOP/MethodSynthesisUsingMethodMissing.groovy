package learn1.InjectionAndSynthesisWithMOP

class Person3{
    def work(){
        'working'
    }

    def plays = ['Tennis', 'BasketBall', 'VolleyBall']

//    def methodMissing(String name, args){
//        println("methodMissing called for $name")
//        def methodInList = plays.find{
//            it == name.split('play')[1]
//        }
//
//        if(methodInList){
//            "playing ${name.split("play")[1]}..."
//        }else{
//            throw new MissingMethodException(name, Person, args)
//        }
//    }

    def invokeMethod(String name, args){
        println("invokeMethod $name")
    }
}

jack = new Person3()

println( jack.work())
println( jack.playTennis())
println( jack.playBasketBall())
println( jack.playVolleyBall())
println( jack.playTennis())

try{
    jack.playPolitics()
}catch(ex){
    println(ex)
}




