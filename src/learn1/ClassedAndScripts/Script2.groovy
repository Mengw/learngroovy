package learn1.ClassedAndScripts


println("In Script2")
shell = new GroovyShell()
shell.evaluate(new File("1.groovy"))
