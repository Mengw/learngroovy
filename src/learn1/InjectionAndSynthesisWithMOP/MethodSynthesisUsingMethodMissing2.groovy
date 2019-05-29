package learn1.InjectionAndSynthesisWithMOP

class Person4{
    def work(){
        'working'
    }

    def plays = ['Tennis', 'BasketBall', 'VolleyBall']

    def methodMissing(String name, args){
        println("methodMissing called for $name")

        def  methodInList = plays.find{
            it == name.split('play')[1]
        }

        if(methodInList){
            def impl = {
                Object[] vargs ->
                    "playing ${name.split('play')[1]}"
            }

            Person4 instance = this

            instance.metaClass."$name"= impl

            impl(args)
        }else {
            throw new MissingMethodException(name, Person, args)
        }
    }
}

jack  =  new Person4()

println(jack.playTennis())


println(jack.playTennis())
