package learn1.InjectionAndSynthesisWithMOP

daysFromNow = {
    Calendar today = Calendar.instance
    today.add(Calendar.DAY_OF_MONTH, (int)delegate)
    today.time
}

a= {
    println(a)
}

Integer.metaClass.daysFromNow = daysFromNow
Long.metaClass.daysFromNow = daysFromNow


println(5.daysFromNow())
println(5L.daysFromNow())

Number.metaClass.someMethod = {
    println("someMethod")
}

2.someMethod()

Integer.metaClass.'static'.isEven = {
    val -> val % 2 == 0
}

println(Integer.isEven(2))
println(Integer.isEven(3))

Integer.metaClass.constructor << {
    Calendar calendar ->
        new Integer(calendar.get(Calendar.DAY_OF_YEAR))
}

println(new Integer(Calendar.instance))


Integer.metaClass.constructor = {
    int val ->
        println('Intercepting constructor')
        constructor = Integer.class.getConstructor(Integer.TYPE)
        constructor.newInstance(val)
}

println(new Integer(4))
println(new Integer(8))

