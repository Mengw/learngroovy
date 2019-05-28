package learn1.InjectionAndSynthesisWithMOP

class Person3{
    def work(){
        'working'
    }

    def plays = ['tennis', 'basktball', 'volleyball']

    def methodMissing(String name, args){
        println("")
    }
}

