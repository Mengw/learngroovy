package learn1.WorkWithStrings

what = new StringBuffer('fence')

text = "the cow jumped over the $what"

println text


what.replace(0,5,"moon")

println(text)


def printClassInfo(obj){
    println("the stock closed at ${obj.getClass().name}")
    println("the super closed at ${obj.getClass().superclass.name}")
}

val = 125

printClassInfo("the closed at ${val}")
printClassInfo(/the stock closed at ${val}/)
printClassInfo("this is a simple String")
