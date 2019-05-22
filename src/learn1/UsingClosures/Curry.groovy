package learn1.UsingClosures

def tellFortunes(closure) {
    Date date = new Date("09/02/2019")

    postFortune = closure.curry(date)

    postFortune "your date"
    postFortune "they are features"
}


tellFortunes(){
    date, fortune ->
        println("${date}   is ${fortune}")
}