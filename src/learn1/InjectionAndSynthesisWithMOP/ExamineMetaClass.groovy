package learn1.InjectionAndSynthesisWithMOP


Integer.metaClass.invokeMethod = {
    String name, args -> /**/
}

println(Integer.metaClass.getClass().name)


