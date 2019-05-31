package learn1.UnitTestingWithGroovy


try{
    2/0
    fail 'expected arithmeticException'
}catch(ex){
    assert true
}


//shouldFail ArithmeticException, 2/0

shouldFail{ 2/0 }
shouldFail ArithmeticException, {2/0}
