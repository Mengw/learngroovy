package learn1.UsingBuilders


bl = new groovy.xml.MarkupBuilder(
)

bl.languages{
    language(name:'C++'){author('ssss')}
    language(name:'Java'){author('jjjj')}
    language(name:'C'){author('cccc')}
}

langs=['C++':'cccc', "java":'jjj']

writer = new StringWriter()

bl1 = new groovy.xml.MarkupBuilder(writer)

bl1.languages{
    langs.each{
        key, value ->
            language(name:key){
                author(value)
            }
    }
}

println(writer)

xmlDoc = new groovy.xml.StreamingMarkupBuilder().bind{
    mkp.xmlDeclaration()
    mkp.declareNamespace(computer:'computer')
    languages{
        comment << "created using Streaming"
        langs.each{
            key,value ->
                computer.language(name: key){
                    author(value)
                }
        }
    }
}

println xmlDoc