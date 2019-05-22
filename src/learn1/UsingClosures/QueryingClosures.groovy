package learn1.UsingClosures

def completeOrder(amout, taxComputer){

    tax = 0

    if(taxComputer.maximumNumberOfParameters == 2){
        tax = taxComputer(amout, 6.05)
    }else
        tax = taxComputer(amout)

    println("Sale tax is ${tax}")
}

completeOrder(100){
    it * 0.001
}

completeOrder(100){
    amout , rate ->
        amout * (rate /100)
}

