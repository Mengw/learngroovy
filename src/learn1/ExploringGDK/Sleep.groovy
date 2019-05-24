package learn1.ExploringGDK


//thread = Thread.start {
//    println('Thread started')
//
//    startTime = System.nanoTime()
//
//    new Object().sleep(2000)
//
//    endTime = System.nanoTime()
//
//    println("thread done in ${endTime - startTime}/ 10 * 9 seconds")
//}
//
//
//new Object().sleep(100)
//println 'interrupt thread'
//thread.interrupt()
//thread.join()


def playWithSleep(flag){
    thread = Thread.start {
        println('Thread started')

        startTime = System.nanoTime()

        new Object().sleep(2000){
            println ("Interruped" + it)
            flag
        }

        endTime = System.nanoTime()

        println("thread done in ${endTime - startTime}/ 10 * 9 seconds")
    }

    thread.interrupt()
    thread.join()
}


playWithSleep(true)
playWithSleep(false)
