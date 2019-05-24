package learn1.WorkingWithXML

document = groovy.xml.DOMBuilder.parse(new FileReader("E:\\mygroovy\\src\\learn1\\WorkingWithXML\\1.xml"))

rootElement = document.documentElement

use(groovy.xml.dom.DOMCategory){
    println("langua")
    languages = rootElement.language
    languages.each {
        language ->
            println("${language.'@name'} authored by ${language.author[0].text()}" )
    }
}

languages = groovy.xml.DOMBuilder.parse(new FileReader("E:\\mygroovy\\src\\learn1\\WorkingWithXML\\1.xml"))

println("Languages and authors")

languages.each {
    println("${it.@name} authored by ${it.author[0].text()}")
}

def languagesByAuthor = {
    authorName ->
        languages.findAll{
            it.author[0].text() == authorName
        }.collect{
            it.@name
        }.join(', ')
}

println("by author" + languagesByAuthor('Wirth'))