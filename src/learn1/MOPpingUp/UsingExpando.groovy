package learn1.MOPpingUp

car = new Expando(year:2019, miles:1, turn:{
    println "turn"
})

car.drive = {
    miles + 10
    println("$mile miles drive")
}


car.drive()
car.turn()

