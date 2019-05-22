package learn1.UsingClosures


writer = new FileWriter('output.txt')
writer.write('?')


new FileWriter('output.txt').withWriter {
    writer ->
        writer.write('a')
}