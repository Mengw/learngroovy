package other

def repeat(val, repeat=5){
    for(i in 0..<repeat){
        println val
    }
}

repeat("Hello World", 2)
repeat("Goodbye sunshine", 4)
repeat("foo")


def coll = ["Groovy", "Java", "Ruby"]
assert  coll instanceof Collection
assert coll instanceof ArrayList

coll.add("Python")
coll << "Smalltalk"
coll[5] = "Perl"