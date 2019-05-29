
package learn1.ExploringMOP

def printInfo(obj){
    usrRequestedProperty = 'bytes'
    usrRequestedMethod = 'toUpperCase'

    println(obj[usrRequestedProperty])

    println(obj."$usrRequestedProperty")

    println(obj."$usrRequestedMethod"())

    println(obj.invokeMethod(usrRequestedMethod, null))
}

printInfo('hello')

'hello'.properties.each {
    println(it)
}

