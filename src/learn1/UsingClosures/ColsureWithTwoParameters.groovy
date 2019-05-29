package learn1.UsingClosures

def tellFortune(closure){
    closure new Date('09/20/2019'), 'your day'
}

tellFortune(){
    date, fortune -> println("fortune ${date} is ${fortune}")
}

tellFortune(){
    Date date, String fortune ->
        println("fortune ${date} is ${fortune}")
}