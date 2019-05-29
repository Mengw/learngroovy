package learn1.InjectionAndSynthesisWithMOP

/*
对于pogo，调用方法和属性参照书中的第十二章的截图，理解就能记住大概的流程
* */
class Person5 implements GroovyInterceptable{

    def work(){
        'working'
    }

    def plays = ['Tennis', 'BasketBall', 'VolleyBall']

    def invokeMethod(String name, args){
        System.out.println("invokeMethod ${name}")

        def method = metaClass.getMetaMethod(name, args)
        System.out.println("invokeMethod method is in metaClass:" + (method != null))
        if(method){
            method.invoke(this, args)
        }
        else {
            metaClass.invokeMethod(this, name, args)
        }
    }

    def methodMissing(String name, args){
//        System.out.println("methodMissing ${name}")
        println("methodMissing ${name}")

        def  methodInList = plays.find{
            it == name.split('play')[1]
        }

        if(methodInList){
            def impl = {
                Object[] vargs ->
                    "playing ${name.split('play')[1]}"
            }

            Person5 instance = this

            instance.metaClass."$name"= impl

            impl(args)
        }else {
            throw new MissingMethodException(name, Person, args)
        }
    }
}


jack = new Person5()

println(jack.work())
println(jack.playTennis())
println(jack.playTennis())



class Person6{

    def work(){
        'working'
    }

    def plays = ['Tennis', 'BasketBall', 'VolleyBall']

    def invokeMethod(String name, args){
        System.out.println("invokeMethod ${name}")

        def method = metaClass.getMetaMethod(name, args)
        System.out.println("invokeMethod method is in metaClass:" + (method != null))
        if(method){
            method.invoke(this, args)
        }
        else {
//            metaClass.invokeMethod(this, name, args)
        }
    }

    def methodMissing1(String name, args){
//        System.out.println("methodMissing ${name}")
        println("methodMissing ${name}")

        def  methodInList = plays.find{
            it == name.split('play')[1]
        }

        if(methodInList){
            def impl = {
                Object[] vargs ->
                    "playing ${name.split('play')[1]}"
            }

            Person5 instance = this

            instance.metaClass."$name"= impl

            impl(args)
        }else {
            throw new MissingMethodException(name, Person, args)
        }
    }
}


println("=======================")

jack = new Person6()

println(jack.work())
println(jack.playTennis())
println(jack.playTennis())

println(jack.playaaa())


class Person7{

    def work(){
        'working'
    }

    def plays = ['Tennis', 'BasketBall', 'VolleyBall']

    def invokeMethod(String name, args){
        System.out.println("Person7 invokeMethod ${name}")

        def method = metaClass.getMetaMethod(name, args)
        System.out.println("Person7 invokeMethod method is in metaClass:" + (method != null))
        if(method){
            method.invoke(this, args)
        }
        else {
            metaClass.invokeMethod(this, name, args)
        }
    }

    def methodMissing(String name, args){
//        System.out.println("methodMissing ${name}")
        println("Person7 methodMissing ${name}")

        def  methodInList = plays.find{
            it == name.split('play')[1]
        }

        println("Person7 methodMissing methodInList:" + (methodInList != null))

        if(methodInList){
            def impl = {
                Object[] vargs ->
                    "Person7 playing ${name.split('play')[1]}"
            }

            Person7 instance = this

            println("Person7 instance" + instance)

            instance.metaClass."$name"= impl

            impl(args)
        }else {
            throw new MissingMethodException(name, Person, args)
        }
    }
}


println("=======================Person7")

jack = new Person7()

println(jack.work())
println(jack.playTennis())
println(jack.playTennis())

println(jack.playaaa())

