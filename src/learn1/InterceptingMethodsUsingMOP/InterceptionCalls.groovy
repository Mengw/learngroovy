package learn1.InterceptingMethodsUsingMOP


class Car implements GroovyInterceptable{
    def check(){
        System.out.println 'check'
    }

    def start(){
        System.out.println 'start'
    }

    def drive(){
        System.out.println 'drive'
    }

    def invokeMethod(String name, args){
//        println "call to $name intercepted"
        System.out.println("call to $name intercepted")

        if(name != 'check'){
            System.out.println 'running filter'
            Car.metaClass.getMetaMethod('check').
            invoke(this, null)
        }

        def validMethod = Car.metaClass.getMetaMethod(name, args)

        if(validMethod!=null)
            validMethod.invoke(this,args)
        else
            Car.metaClass.invokeMethod(this, name ,args)

    }
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

