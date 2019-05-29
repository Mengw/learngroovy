package learn1.ExploringMOP

str = "hello"
methodName = 'toUpperCase'

methodOfInterest = str.metaClass.getMetaMethod(methodName)

println(methodOfInterest.invoke(str))


println( "Does String respond to toUpperCase()? " )

println(String.metaClass.respondsTo(str, 'toUpperCase')) ? 'yes' : 'no'

