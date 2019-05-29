package learn1.ClassedAndScripts;

public class CallDyMethod {

    public static void main(String[] args) {
        groovy.lang.GroovyObject instance = new DyGroovyClass();

        Object result1 = instance.invokeMethod("squek", new
                Object[]{});

        System.out.println("received:" + result1);

        Object result2 = instance.invokeMethod("quack", new Object[]{
                "like", "a", "duck"
        });

        System.out.println("receive" + result2);
    }
}
