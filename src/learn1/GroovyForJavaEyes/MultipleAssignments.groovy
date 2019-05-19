package learn1.GroovyForJavaEyes

def splitName(fullName){
    fullName.split(' ')
}

(firstName, lastName) = splitName('A B')
println("$firstName $lastName")

def name1 = 'tom'
def name2 = 'too'

println("$name1 $name2")

(name1, name2) = [name2, name1]

println("$name1 $name2")
