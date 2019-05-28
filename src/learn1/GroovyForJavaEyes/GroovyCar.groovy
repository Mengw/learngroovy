package learn1.GroovyForJavaEyes

class Car{
    def mile = 0
    final int year
    private mile1 = 1

//    Car(year) {
//        this.year = year
//    }

    def getA(){
        "aaa"
    }

}

//Car car = new Car(2019)

Car car1 = new Car()
print (car1.year)
//car1.year = 1000

print(car1.mile)
car1.mile = 2222
print(car1.a)
//car1.a=3333

//println "year $car.year"
//println "mile $car.mile"
//
//car.mile = 25
//
//println("mile change: $car.mile")

