package learn1.WorkingWithXML

langs = [ 'C++': 'Stous' , 'Java': 'Gos', "Lip":'MC']

content=''

langs.each {
    language, author ->
        fragment = """
        <language name="${language}">
            <author>${author}</author>
           </language>
        """

        content += fragment
}

xml = "<language>${content}</language>"
println xml


xmlDocument = new groovy.xml.StreamingMarkupBuilder().bind{
    mkp.xmlDeclaration()
    mkp.declareNameSpace(computer: "Computer")
    languages{
        commment << "Created using StreamingMarkupBuilder"
        langs.each{
            key, value ->
                computer.language(name, value){
                    author(value)
                }
        }
    }
}

println(xmlDocument)

