package learn1.GroovyForJavaEyes

enum CoffeeSize{
    SHORT,
    SMALL,
    MEDIUM,
    LARGE,
    MUG
}

def orderCoffee(size) {
    print("Coffee order received for size $size")

    switch (size){
        case[CoffeeSize.SHORT, CoffeeSize.SMALL]:
            println("you are health conscious")
            break
    }
}

