package learn1.UsingClosures


def examine(closure){
    println("$closure.maximumNumberOfParameters parameter(s) given:")

    for(apara in closure.parameterTypes){
        println(apara.name)
        println(apara)
    }

    println('--')

}

examine(){}
examine(){it}
examine(){->}
examine(){val1 ->}
examine(){Date val1 -> }

