package learn1.GroovyForJavaEyes


class Robot{
    def type, height, width

    def access(location, weight, fragile){
        println "fragile $fragile, weight $weight, location, $location"
    }

    def access1(Map location, wegiht, fragile){

    }
}

robot = new Robot(type: 'arm', width: 10, height: 40)

//robot.access(x:30, y:20,z:50, 80, true)
robot.access(50, 'hello ', x:30, y:20,z:50)
robot.access(50, 'hello ',305)
