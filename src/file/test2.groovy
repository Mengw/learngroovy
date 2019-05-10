package file

def filePath = "F:\\placement\\data1\\allPGC-prod-20190509.csv"


def write = new File('F:/','placement/data1/result1.txt')

new File(filePath).eachLine({ line , nb ->
        println nb
        if (nb <= 1) return
        def lineArr = line.split("\t")
        def line1 = lineArr[0]
        def line2 = lineArr[1]
        def line2Arr = line2.split(",")
        for (item in line2Arr) {
            write.withWriterAppend('utf-8') {
                writer -> writer.writeLine("$line1 $item")
            }
//            write.append("$line1 $item\n")
        }
})


new File(filePath).eachLine( { line , nb ->
    ({
        println "2" + nb
        if (nb <= 1) return
        def lineArr = line.split("\t")
        def line1 = lineArr[0]
        def line2 = lineArr[1]
        def line2Arr = line2.split(",")
        for (item in line2Arr) {
            write.withWriterAppend('utf-8') {
                writer -> writer.writeLine("$line1 $item")
            }
//            write.append("$line1 $item\n")
        }
    })
})


//new File('F:/','placement\\data\\livetime-execl-result.txt').withWriter('utf-8', {
//    writer -> writer.writeLine("line")
//})

