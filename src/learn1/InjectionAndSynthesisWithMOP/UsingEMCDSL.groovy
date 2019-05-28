package learn1.InjectionAndSynthesisWithMOP

Integer.metaClass {
    daysFromNow = {
        ->
        Calendar today = Calendar.instance
        today.add(Calendar.DAY_OF_MONTH, (int)delegate)
        today.time
    }

    getDaysFromNow ={
        ->
        Calendar today = Calendar.instance
        today.add(Calendar.DAY_OF_MONTH, (int)delegate)
        today.time
    }

    'static'{
        isEven = {
            val -> val %2 ==0
        }
    }


    constructor = {
        Calendar calendar ->
            new Integer(calendar.get(Calendar.DAY_OF_YEAR))
    }

    constructor = {
        int val ->
            println('Intercepting constructor')
            constructor = Integer.class.getConstructor(Integer.TYPE)
            constructor.newInstance(val)
    }

}



