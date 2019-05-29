package learn1.InterceptingMethodsUsingMOP

Car.metaClass.invokeMethod = {
    String name, args ->
        System.out.println "1 call to $name in"

        if(name != 'check'){
            System.out.println '1 running filter'
            Car.metaClass.getMetaMethod('check').
                    invoke(delegate, null)
        }

        def validMethod = Car.metaClass.getMetaMethod(name, args)

        if(validMethod!=null)
            validMethod.invoke(delegate,args)
        else
            Car.metaClass.invokeMissingMethod(delegate, name ,args)
}

Car car = new Car()

car.start()
car.drive()
car.check()

try{
    car.speed()
}catch(Exception ex){
    println ex
}