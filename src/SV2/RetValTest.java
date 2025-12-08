package SV2;

class ErrorSequenceEmpty extends Exception {}
class EmailNotFound extends Exception {}

// [James] Yes. The model answers further suggest that these two exceptions should inherit from a common abstract parent. That woudl seem overkill to me.
public class RetValTest {
    public static String sEmail = "";


    public static void extractCamEmail(String sentence) throws ErrorSequenceEmpty, EmailNotFound {
        if (sentence == null || sentence.length() == 0) {
            throw new ErrorSequenceEmpty();
        }

        String tokens[] = sentence.split(" "); // split into tokens
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].endsWith("@cam.ac.uk")) {
                sEmail = tokens[i];
            }
        }

        throw new EmailNotFound();
    }

    public static void main(String[] args) {
        try {
            RetValTest.extractCamEmail("My email is rkh23@cam.ac.uk");
        }
        catch (ErrorSequenceEmpty e) {
            // [James] Much better is to take the error message from the exception with e.getMessage(), or e.toString()
            System.out.println("Supplied string empty");
            return;
        }
        catch (EmailNotFound e) {
            System.out.println("No @cam address in supplied string");
            return;
        }
        System.out.println("Success: " + RetValTest.sEmail);

    }
}
