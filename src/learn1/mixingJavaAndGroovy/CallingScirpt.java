package learn1.mixingJavaAndGroovy;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class CallingScirpt {


    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();

        ScriptEngine scriptEngine = manager.getEngineByName("groovy");

        System.out.println("call from java");

        try{
            scriptEngine.eval("println 'hello from Groovy'");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
