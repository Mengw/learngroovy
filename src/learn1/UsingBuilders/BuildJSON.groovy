package learn1.UsingBuilders

import groovy.json.JsonSlurper


class Person{
    String first
    String last
    def sigs
    def tools
}

john = new Person(first: 'john', last: 'j', sigs: ['java' ,'groovy'], tools: ['script':'groovy', 'test':'spock'])

b = new groovy.json.JsonBuilder(john)
writer = new StringWriter()
b.writeTo(writer)
println( writer )


bl1 = new groovy.json.JsonBuilder()
bl1{
    firstName john.first
    lastName john.last
    "special interest" john.sigs
    "preferred tools"{
        numberOfTools john.tools.size()
        tools john.tools
    }
}

writer1 = new StringWriter()
bl1.writeTo(writer1)
println(writer1)


def sluper = new JsonSlurper()
def personFromJson = sluper.parse(new FileReader('person.json'))
println(personFromJson)
println "from json file result : $personFromJson.first $personFromJson.last interested in ${personFromJson.sigs.join(', ')}"



