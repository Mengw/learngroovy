package learn1.UsingClosures

def product(n){
    total = 0
    for(int i=2; i<n; i+=2){
        total+=i
    }
    total
}

def sqr(n){
    total = 0
    for(int i=2; i<n; i+=2){
        total+=i
    }
    total
}


def pickEven(n, block){
    for(int i=2; i<n; i+=2){
        block(i)
    }
}

pickEven(10, { print(it)})

pickEven(10){
    print( it )
}
