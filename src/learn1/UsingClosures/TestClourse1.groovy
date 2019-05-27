package learn1.UsingClosures

//普通类
class Enclosing {
    void run() {
        def whatIsThisObject = { getThisObject() }    //1
        assert whatIsThisObject() == this             //2
        def whatIsThis = { this }                     //3
        assert whatIsThis() == this                   //4


        def whatIsOwnerMethod = { getOwner() }      //1
        assert whatIsOwnerMethod() == this          //2
        def whatIsOwner = { owner }                 //3
        assert whatIsOwner() == this                //4
    }
}


//内部类
class EnclosedInInnerClass {

    class Inner {
        Closure c_this = { this }                         //5
        Closure c_owner = { owner }
    }

    void run() {
        def inner = new Inner()
        assert inner.c_this() == inner                    //6
        assert inner.c_owner() == inner
    }
}


//闭包嵌套定义
class NestedClosures {
    void run() {
        def nestedClosures_this = {
            def c_this = { this }                         //7
            c_this()
        }
        assert nestedClosures_this() == this               //8

        def nestedClosures_owner = {
            def c_owner = { owner }                      //7
            c_owner()
        }
        //owner 对应闭包，这就是 owner 和 this 的不同!!
        assert nestedClosures_owner() == nestedClosures_owner   //8
    }
}

new Enclosing().run()
new EnclosedInInnerClass().run()
new NestedClosures().run()




class MyClassTest {
    String myString1 = "111"
    def outerClosure = {
        def myString2 = "222";
        println myString1;     // outputs 111
        def nestedClosure = {
            println myString1;  // outputs 111
            println myString2;  // outputs 222
        }
        nestedClosure()
    }
}

def closure = new MyClassTest().outerClosure
closure()


