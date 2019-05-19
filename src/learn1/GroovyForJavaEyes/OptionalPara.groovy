package learn1.GroovyForJavaEyes


def log(x, base=10){
    Math.log(x) / Math.log(base)
}

println(log(1024))
println(log(1024, 10))
println(log(1024, 2))

def log1(x, String[] de){
    println(" $x --- $de")
}

log1('call', '123')
log1('call', '123', '234')
log1('call')