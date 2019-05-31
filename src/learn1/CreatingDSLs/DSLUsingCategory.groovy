package learn1.CreatingDSLs

class DateUtil{
    static int getDays(Integer self){
        self
    }

    static Calendar getAgo(Integer self){
        def date = Calendar.instance
        date.add(Calendar.DAY_OF_MONTH, -self)
        date
    }

    static Date at(Calendar self, Double time){
        def hour = (int) time.doubleValue()
        def minute = (int) (Math.round((time.doubleValue() - hour) * 100))
        self.set(Calendar.HOUR_OF_DAY, hour)
        self.set(Calendar.MINUTE, minute)
        self.set(Calendar.SECOND, 0)
        self.time
    }
}

use(DateUtil){
    println 2.days.ago.at(4.3)
}


def getDays(Integer self){
    println self
    self
}

Calendar getAgo(Integer self){
    def date = Calendar.instance
    date.add(Calendar.DAY_OF_MONTH, -self)
    date
}

Date at(Calendar self, Double time){
    def hour = (int) time.doubleValue()
    def minute = (int) (Math.round((time.doubleValue() - hour) * 100))
    self.set(Calendar.HOUR_OF_DAY, hour)
    self.set(Calendar.MINUTE, minute)
    self.set(Calendar.SECOND, 0)
    self.time
}

getDays()
getDays 2 times {
    print it
}
println ("getDays 2  getClass()")
