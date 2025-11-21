package SV1;

class DatabaseFetcher {
    private String data;

    public void fetchDataFromDatabase() {
        System.out.println(" Fetching data ... ");
        this.data = " raw data ";
    }
}

class XMLParser {
    public void parseXMLData(String data) {
        System.out.println(" Parsing data as XML ... ");
// logic to parse this . data
    }
}

class ReportPrinter {
    public void printToConsole(String data) {
        System.out.println(" --- REPORT ---");
        System.out.println(data);
        System.out.println(" --- END ---");
    }
}