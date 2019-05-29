package learn1.InjectionAndSynthesisWithMOP

class PersonMe
//        implements GroovyInterceptable
{
    def work(){
        "work personMe"
    }

//    @Override
//    def invokeMethod(String name, Object args) {
//        System.out.println("interhahah")
//    }

    def methodMissing(String name, args){
        println("own method missing $name")
    }
}

// 这里测试发现即使这个类没有实现intepre接口，只要metaClass有这个方法，也会每个方法之前调用
// 而如果是自己定义了一个invokeMethod的方法，只有在没有这个方法的情况下，而且还没有其他methodMissing的情况下
//PersonMe.metaClass.invokeMethod = {
//    String name, args ->
//        System.out.println("invokeMethod in PersonMe metaClass $name")
//
//        def method = PersonMe.metaClass.getMetaMethod(name, args)
//
//        if(method){
//            method.invoke(delegate, args)
//        }else {
//            PersonMe.metaClass.invokeMissingMethod(delegate, name, args)
//        }
//}

//PersonMe.metaClass.methodMissing = {
//    String name, args ->
//        def plays = ['Tennis', 'BasketBall', 'VolleyBall']
//
//        System.out.println("methodMissing in PersonMe metaClass")
//        System.out.println("methodMissing called for $name")
//
//        def methodInList = plays.find {
//            it == name.split('play')[1]
//        }
//
//        System.out.println("methodMissing methodInList is " + (methodInList != null))
//        if (methodInList) {
//            def impl = {
//                Object[] vargs ->
//                    "playing ${name.split('play')[1]} ..."
//            }
//
//            PersonMe.metaClass."$name" = impl
//
//            impl(args)
//        } else {
//            throw new MissingMethodException(name, Person.class, args)
//        }
//}

jackMe = new PersonMe()

println jackMe.work()
println jackMe.playTennis()
println jackMe.playTennis()








