package other

def ac = ["g", "b", "k"]

ac.each{
    value -> println value
}

def hash = [name:"Andy", "VPN-#":45, name:"neo"]
hash.each{ key, value ->
    println "${key} : ${value}"
}

hash.each{ key, value ->
    println key + "-" + value
}


def excite = { word ->
    return "${word}!!"
}

assert "Groovy!!" == excite("Groovy")
assert "Java!!" == excite.call("Java")
