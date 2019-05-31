package learn1.CreatingDSLs
def fslDef = new File("E:\\mygroovy\\src\\learn1\\CreatingDSLs\\GroovyPizzaDSL.groovy").text

def dsl = new File("E:\\mygroovy\\src\\learn1\\CreatingDSLs\\orderPizza.dsl").text


def script = """
${fslDef}
acceptor{
    ${dsl}
}
"""


new GroovyShell().evaluate(script)

