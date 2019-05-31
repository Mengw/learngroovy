package learn1.CreatingDSLs

def (forward, left ,then , fast, right) =
['forword', 'left' ,'' , 'fast', 'right']


move forward and then turn left
jump fast, forward
and then
turn right

def move(dir){
    println "moveing $dir"
    println 'this:' + this
//    this
}

def and(then){
    println 'this:' + this
//    this
}

def turn(dir){
    println("turning $dir")
    println 'this:' + this
//    this
}

def jump(speed, dir){
    println("jumping $speed and $dir")
    println 'this:' + this
//    this
}

