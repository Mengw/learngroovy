package learn1.ExploringGDK

class PriceExtension{

    public static double getPrice(String self) {
        def url = "".toURL()

        def data = url.readLines()[1].split(",")

        Double.parseDouble(data[-1])
    }

}

class PriceStaticExtension{
    public static double getPrice(String selfType, String ticker) {
        def url = "".toURL()

        def data = url.readLines()[1].split(",")

        Double.parseDouble(data[-1])
    }
}

