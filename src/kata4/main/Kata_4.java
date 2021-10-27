package kata4.main;

import java.util.List;
import kata4.model.*;
import kata4.view.*;

public class Kata_4 {

    public static void main(String[] args) {
        String filename = new String("C:\\Users\\anime\\OneDrive\\Documentos\\NetBeansProjects\\Kata_4\\email.txt");

        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogramDisplay = new HistogramDisplay(mailHistogram);
        histogramDisplay.execute();
    }

}
