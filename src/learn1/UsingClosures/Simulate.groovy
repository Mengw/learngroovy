package learn1.UsingClosures

class Equipment{
    def calculator
    Equipment(calc){
        calculator = calc
    }

    def simulate(){
        println('running')
        calculator()
    }
}

def eqq = new Equipment({println('calcal')})

eqq.simulate()


