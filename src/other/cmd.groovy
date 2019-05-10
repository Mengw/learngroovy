package other

println "other.cmd /C dir".execute().text
println "other.cmd /C groovy -v".execute().getClass().name
println "other.cmd /C groovy -v".execute().text

