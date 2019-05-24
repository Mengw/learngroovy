package learn1.ClassedAndScripts;

public class UseAGroovy {

    public static void main(String[] args) {
        AGroovyClass instance = new AGroovyClass();

        Object result = instance.useClosure(new Object() {
            public String call() {
                return "AAA";
            }
        });
        System.out.println("result" + result);
    }

}
