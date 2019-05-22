package learn1.UsingClosures


def iterate(n, closure){
    1.upto(n){
        println("In iterate with with value $it")
        closure(it)
    }
}

println('Calling iterate')

total=0

iterate(4){
    total += it
    println("in coluse total ${total}")
}
