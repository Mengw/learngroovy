package learn1.MOPpingUp


aa = {
    b{
        i = 'cccc'
        println(i)
    }
    d{
        j='dddd'
        println(j)
    }
}

println(aa)


class Manager1{

    { delegateCallsTo Worker, Expert, GregorianCalendar }

    def schedule(){
        println('schedule')
    }

}

Object.metaClass.delegateCallsTo={
    Class... klassOfDelegates ->
        def objectOfDelegates = klassOfDelegates.collect{
            it.newInstance()
        }

        delegate.metaClass.methodMissing = {
            String name, args ->
                println  "Intercepting to $name"
                def delegateTo = objectOfDelegates.find{
                    it.metaClass.respondsTo(it, name, args)
                }

                if(delegateTo){
                    delegate.metaClass."${name}" = {
                        Object[] varArgs ->
                            delegateTo.invokeMethod(name, varArgs)
                    }
                    delegateTo.invokeMethod(name, args)
                }else{
                    throw new MissingMethodException(name, delegate.class, args)
                }
        }
}

p = new Manager1()

p.schedule()
p.simpleWork1('1')
p.simpleWork1('11')
p.simpleWork1()
p.simpleWork1()
p.simpleWork2()
p.simpleWork2()
p.advancedWork1('2')
p.advancedWork1('22')

println( p.isLeapYear(2019))



