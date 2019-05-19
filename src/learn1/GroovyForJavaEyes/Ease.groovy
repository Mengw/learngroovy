package learn1.GroovyForJavaEyes

def foo(str){
    str?.reverse()
}

println(foo('hello'))
print(foo(null))
