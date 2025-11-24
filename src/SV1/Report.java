package SV1;


// [James] Yes. Additionally you need a Report (or similar) class that is composed of these three classes, and calls each in turn
// Also in Java you should [nearly] always have each Class in a separate file. This file is called 'Report.java], and hence must define a
// public class Report {...}
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