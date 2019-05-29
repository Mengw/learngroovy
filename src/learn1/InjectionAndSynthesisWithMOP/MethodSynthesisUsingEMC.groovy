package learn1.InjectionAndSynthesisWithMOP

class Person8 extends Person7{
    def work(){
        ("working in person8")
    }
}
//

person7 = new Person7()
println(person7.work())
println(person7.playTennis())
println(person7.playTennis())
try {
    println(person7.playaaa())
}catch(ex){
    println(ex.message)
}

person8 = new Person8()
println person8.work()
println person8.playTennis()
println person8.playTennis()
//person8.playaa()

class Person9{
    def work(){
        println("working in person9")
    }
}

Person9.metaClass.methodMissing = {
    String name, args ->
        def plays = ['Tennis', 'BasketBall', 'VolleyBall']

        System.out.println("methodMissing in person9 metaClass")
        System.out.println("methodMissing called for $name")

        def methodInList = plays.find {
            it == name.split('play')[1]
        }

        System.out.println("methodMissing methodInList is " + (methodInList != null))
        if (methodInList) {
            def impl = {
                Object[] vargs ->
                    "playing ${name.split('play')[1]} ..."
            }
            Person9.metaClass."$name" = impl

            System.out.println("args" + args)
            impl(args)
        } else {
            throw new MissingMethodException(name, Person.class, args)
        }
}

jack9 = new Person9()

println jack9.work()
println jack9.playTennis()
println jack9.playTennis()
try{
    jack9.playP()
}catch(ex){
    println ex.message
}
