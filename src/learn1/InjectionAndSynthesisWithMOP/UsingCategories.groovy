package learn1.InjectionAndSynthesisWithMOP

import javax.print.attribute.standard.Fidelity

class StringUtil{
    def static toSSN(self){
        if(self.size() == 9){
            "${self[0..2]}-${self[3..4]}-${self[5..8]}"
        }
    }
}

use(StringUtil){
    println("123456789".toSSN())
    println(new StringBuffer("999222111").toSSN())
}

try{
    println(StringUtil.toSSN("111112222"))
}catch(ex){
    println(ex.message)
}

@Category(String)
class StringUtilAnnotated{
    def toSSN(){
        if(size() == 9){
            "${this[0..2]}-${this[3..4]}-${this[5..8]}"
        }
    }
}

use(StringUtilAnnotated){
    println("123456789".toSSN())
}

class FindUtil{
    def static extractOnly(String self, closure){
        def result = ''
        self.each {
            if(closure(it)) {
                result += it
            }
        }
        result
    }
}

use(FindUtil){
    println("123456".extractOnly{
        it == '4' || it=='5'
    })
}


class Helper{
    def static toString(String self){
        def method = self.metaClass.methods.find{
            it.name == 'toString'
        }

        '!!' + method.invoke(self, null) + '!!'
    }
}

use(Helper){
    println('hello'.toString())
}


use(StringUtil, FindUtil){
    str = "123456789"
    println(str.toSSN())
    println(str.extractOnly({
        it == '8' || it == '1'
    }))
}


