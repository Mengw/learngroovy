filePath = "db\\1.txt"
filePath1 = "db/1.txt"

new File(filePath).eachLine {
    line -> println line
}

new File(filePath1).eachLine {
    line, nb ->
        print nb + "-" + line
}

/*def count=0, MaxSize=3
new File(filePath1).withReader {
    reader ->
        while(reader.readLine()){
            if(++count>MaxSize){
                throw new RuntimeException("has 3 verse")
            }
        }
}*/

def list = new File(filePath1).collect {it}
print(list)