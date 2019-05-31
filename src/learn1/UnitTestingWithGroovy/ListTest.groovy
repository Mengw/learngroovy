package learn1.UnitTestingWithGroovy

class ListTest extends GroovyTestCase{

    void testListSize(){
        def lst = [1,2]
        assertEquals(2, lst.size())
    }

}

