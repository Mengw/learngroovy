package learn1.CreatingDSLs

def large = 'large'
def thin = 'thin'
def visa = 'Visa'
def Olives = 'Olives'
def Onions = 'Onions'
def Bell_Pepper = 'Bell Pepper'

orderInfo = [:]
def methodMissing(String name, args){
    orderInfo[name] = args
}

def acceptor(closure){
    closure.delegate = this
    closure()
    println("validation and processing perform")
    orderInfo.each{
        key, value ->
            println("$key -> ${value.join(', ')}")
    }
}


