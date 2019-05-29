package learn1.UsingBuilders


bl = new groovy.xml.MarkupBuilder(
)

bl.languages{
    language(name:'C++'){author('ssss')}
    language(name:'Java'){author('jjjj')}
    language(name:'C'){author('cccc')}
}
