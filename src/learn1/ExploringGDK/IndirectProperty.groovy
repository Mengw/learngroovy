package learn1.ExploringGDK

class Car{
    int miles, fuelLevel
}

car=new Car(fuelLevel: 1, miles: 88)

properties=['miles', 'fuelLevel']

properties.each {
    name ->
        println("$name = ${car[name]}")
}

car[properties[1]]=100

println("${car.fuelLevel}")



class Person{
    def walk(){

    }

    def walk(int mile){

    }

    def walk(int mile, String where){

    }
}

peter = new Person()



