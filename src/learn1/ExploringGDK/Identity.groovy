package learn1.ExploringGDK

lst1 = [1,2]
lst1.with{
    add(3)
    add(4)
    println size()
    println contains(2)
}

lst1.with {
    println("this is ${this}")
    println("owner is ${owner}")
    println("delegate is ${delegate}")
}

