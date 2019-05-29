package learn1.ClassedAndScripts

class DyGroovyClass{
    def methodMissing(String name , args){
        println("you called $name with ${args.join(', ')}")
        args.size()
    }
}
