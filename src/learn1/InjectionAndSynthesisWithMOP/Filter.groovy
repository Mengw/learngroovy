package learn1.InjectionAndSynthesisWithMOP

abstract class Writer{
    abstract void write(String message)
}


class StringWriter extends Writer {

    def target = new StringBuffer()

    void write(String message){
        target.append(message)
    }

    String toString(){
        target.toString()
    }

}


def writeStuff(writer){
    writer.write("writeStuffstupid")
    println writer
}


def create(theWriter, Object[] filters=[]){
    def instance = theWriter.newInstance()
    filters.each {
        filter -> instance.metaClass.mixin(filter)
    }
    instance
}

writeStuff(create(StringWriter))


class UppercaseFilter{
    void write(String message) {
        def allUpper = message.toUpperCase()

        invokeOnPreviousMixin(metaClass, 'write', allUpper)
    }
}

Object.metaClass.invokeOnPreviousMixin = {
    MetaClass currentMixinMetaClass, String method, Object[] args ->
        def previousMixin = delegate.getClass()
        for(mixin in mixedIn.mixinClasses){
            if(mixin.mixinClass.theClass == currentMixinMetaClass.delegate.theClass)
                break
            previousMixin = mixin.mixinClass.theClass
        }
        mixedIn[previousMixin]."$method"(*args)
}

writeStuff(create(StringWriter, UppercaseFilter))


class Profan{
    void write(String message){
        def filter = message.replaceAll(
                'stupid', 's***'
        )
        invokeOnPreviousMixin(metaClass, "write", filter)
    }
}

writeStuff(create(StringWriter, Profan))