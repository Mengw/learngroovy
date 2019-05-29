package learn1.ExploringMOP

class TestMethodInvocation extends GroovyTestCase{

    void testInterceptedMethodCallonPOJO() {
        def val = new Integer(3)
        Integer.metaClass.toString = {
            -> 'intercepted'
        }
        println(val.toString())
    }

    void testInterceptableCalled(){
        def obj = new AnInterceptable()
        obj.existingMethod()
        obj.nonExistingMethod()
    }

    void testInterceptedExistingmethodCalled(){
        AGroobyObject.metaClass.existingMethod2 = {
            -> 'intercepted'
        }

        def obj = new AGroobyObject()

        obj.existingMethod2()
    }

    void testUnInterceptedExistingMethodCalled() {
        def obj = new AGroobyObject()
        obj.existingMethod()
    }

    void testPropertyThatIsClosureCalled() {
        def obj = new AGroobyObject()
        obj.closureProp()
    }

    void testMethodMissingCalledOblyForNonExistent() {
        def obj = new ClassWithInvokeAndMissingMethod()
        obj.existingMethod()
        obj.nonExistingMethod()
    }


    void testInvokeMethodCalledForOnlyNonExistent(){
        def obj = new ClassWithInvokeOnly()
        obj.existingMethod()
        obj.nonExistingMethod()
    }

    void testMethodFailsOnNonExistent(){
        def obj = new TestMethodInvocation()
        shouldFail(MissingMethodException) {obj.nonExistingMethod()}
    }




}


class AnInterceptable  implements GroovyInterceptable{
    def existingMethod(){}
    def invokeMethod(String name, args){
        'intercepted'
    }
}

class AGroobyObject{
    def existingMethod(){
        'existingMethod'
    }

    def existingMethod2(){
        'existingMethod2'
    }

    def closureProp = {
        'closure called'
    }
}

class ClassWithInvokeAndMissingMethod{
    def existingMethod(){
        'existingMethod'
    }

    def invokeMethod(String name, args){
        'invoke called'
    }

    def methodMissing(String name, args){
        'misssing called'
    }
}

class ClassWithInvokeOnly{
    def existingMethod(){
        'existingMethod'
    }

    def invokeMethod(String name, args){
        'invoke called'
    }
}
