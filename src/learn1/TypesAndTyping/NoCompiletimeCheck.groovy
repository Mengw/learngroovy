package learn1.TypesAndTyping

import groovy.transform.TypeChecked

@TypeChecked
def shout(String str){
    println('print in up')

    println(str.toUpperCase())


    println('print in up')

    println(str.toUpperCase())
}

try{
    shout('hello')
}catch(ex){
    println('fail')
}
