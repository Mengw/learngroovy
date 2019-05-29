package learn1.MOPpingUp


class Worker{
    def simpleWork1(spec){
        println( "work spec $spec")
    }

    def simpleWork2(){
        println('work work2')
    }
}

class Expert{
    def advancedWork1(spec){
        println( "Expert spec $spec")
    }

    def advancedWork2(scope, spec){
        println("Expert work2 $scope --$spec")
    }
}

class Manager{

    def worker = new Worker()

    def expert = new Expert()


    def schedule() {
        println 'schedule'
    }

    def methodMissing(String name, args){
        println "intercepting call to $name"

        def delegateTo = null

        if(name.startsWith('simple')){
            delegateTo = worker
        }
        if(name.startsWith('advanced')){
            delegateTo = expert
        }

        if(delegateTo?.metaClass.respondsTo(delegateTo, name, args)){
            Manager instance = this
            instance.metaClass."$name" = {
                Object[] varArgs ->
                    delegateTo.invokeMethod(name, varArgs)
            }

            delegateTo.invokeMethod(name, args)
        }else {
            throw new MissingMethodException(name, Manager.class, args)
        }



    }



}


p = new Manager()
p.schedule()
p.simpleWork1('1')
p.simpleWork1('11')
p.simpleWork1()
p.simpleWork1()
p.simpleWork2()
p.simpleWork2()
p.advancedWork1('2')
p.advancedWork1('22')

p.advanceddddd()