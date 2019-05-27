package learn1

import groovy.transform.Immutable

def printMetaClassInfo(instance){
    println(" metaClass of ${instance} is ${instance.metaClass.class.simpleName}")
    println(" with delegate ${instance.metaClass.delegate.class.simpleName}")
}

def a = 2
printMetaClassInfo(a)

println("MetaClass of Integer is ${Integer.metaClass.class.simpleName}")


println("MetaClass of Integer add is start")
Integer.metaClass.someNewMethod = {
    -> /**/
}

printMetaClassInfo(a)
println("MetaClass of Integer is ${Integer.metaClass.class.simpleName}")


println("===========")
@Immutable
class MyClassIm{
    String name
}


obj1= new MyClassIm("obj1")

printMetaClassInfo(obj1)
println("add a method metaClass MyClassIm")

MyClassIm.metaClass.someNewMethod = {
    -> /**/
}

printMetaClassInfo(obj1)

println("obj2 created")
obj2 = new MyClassIm("obj2")
printMetaClassInfo(obj2)

// integer 在添加之后打印出来的内容和自己定义类的有区别，已经申明的obj添加之后重新打印还是一样的
// 添加之后新加的类才表现和Integer同样的效果