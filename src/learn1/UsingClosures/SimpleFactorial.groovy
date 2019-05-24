package learn1.UsingClosures

def factorial(BigInteger number){
    if(number  == 1) 1 else number * factorial(number -1)
}

try{
    println("factorial of 5 is ${factorial(5)}")
    println("factorial of 5 is ${factorial(5000).bitCount()}")
}catch(ex){
    println("caught ${ex.class.name}")
}

