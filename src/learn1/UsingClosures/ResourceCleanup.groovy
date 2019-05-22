package learn1.UsingClosures

class Resource{
    def open(){
        println('open')
    }

    def close(){
        println('close')
    }

    def read(){
        println('read')
    }

    def write(){
        println('write')
    }

    def static use(closure) {
        def r = new Resource()
        try {
            r.open()
            closure(r)
        }finally{
            r.close()
        }
    }
}

def resource = new Resource()

Resource.use{
    res -> res.read()
        res.write()
}

