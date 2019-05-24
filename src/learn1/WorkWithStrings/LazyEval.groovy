package learn1.WorkWithStrings

//price = 684.71
//company = 'Google'
//quote = "to"

stocks = [Apple:663.01, MIcro: 30.11]
companyClosure = { it.write(company)}
priceClosure = { it.write("$price") }


quote = "today ${companyClosure} stock closed at ${priceClosure}"
stocks.each{
    key, value ->
        company = key
        price = value
        println(quote)
}

