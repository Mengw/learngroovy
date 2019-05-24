package learn1.UsingClosures

def factorial

factorial = {
    int number, BigInteger theFactorial ->
        number == 1 ? theFactorial :
                theFactorial.trampoline(number -1, number * theFactorial)
}.trampoline()

