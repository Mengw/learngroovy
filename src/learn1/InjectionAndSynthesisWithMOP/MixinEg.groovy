package learn1.InjectionAndSynthesisWithMOP


class Friend{
    def listen(){
        println "$name is listening as a friend"
    }
}

@Mixin(Friend)
class Person2{
    String firstName
    String lastName

    String getName(){
        "$firstName $lastName"
    }
}

john =  new Person2(firstName: 'aaa', lastName: 'bbb')
println john.listen()


class Dog{
    String name
}



//Dog.mixin Friend
Dog.mixin(Friend.class)
buddy = new Dog(name: "aaa")
buddy.listen()


class Cat{
    String name
}


try{
    cat = new Cat(name: 'cat')
    cat.listen()
}catch(ex){
    println(ex)
}

socks = new Cat(name: 'cat1')
socks.metaClass.mixin(Friend)
println(socks.listen())

