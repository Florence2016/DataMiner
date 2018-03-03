import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.awt.print.Book;
import java.io.*;
import java.util.List;

public class DataMinerExtensionMain {

    private static Document document;
    static DataMiner dataMiner = new DataMiner();
    private static String title;
    private static String users;
    private static String reviews;
    private static String value;

    public static void main(String [] args) throws IOException, WriteException {
        {

            getDataMetaMask(document);
            getDataGreatSuspender(document);
            getDataWhatFont(document);
            getDataInboxbyGmail(document);
            getDataGoogleKeepChromeExtension(document);



        }
    }



    private static void getDataGoogleKeepChromeExtension(Document document) throws IOException {
        document = Jsoup.connect("https://chrome.google.com/webstore/detail/google-keep-chrome-extens/lpcaedmchfhocbbapmcbpinfpgnhiddi").get();
        dataMiner.getDataUsersReviewsRatings(document, title, users, reviews, value);

    }

    private static void getDataInboxbyGmail(Document document) throws IOException {
        document = Jsoup.connect("https://chrome.google.com/webstore/detail/inbox-by-gmail/gkljgfmjocfalijkgoogmfffkhmkbgol").get();
        dataMiner.getDataUsersReviewsRatings(document, title, users, reviews, value);
    }

    private static void getDataWhatFont(Document document) throws IOException {
        document = Jsoup.connect("https://chrome.google.com/webstore/detail/whatfont/jabopobgcpjmedljpbcaablpmlmfcogm").get();
        dataMiner.getDataUsersReviewsRatings(document, title, users, reviews, value);
    }

    private static void getDataGreatSuspender(Document document) throws IOException {
        document = Jsoup.connect("https://chrome.google.com/webstore/detail/the-great-suspender/klbibkeccnjlkjkiokjodocebajanakg").get();
        dataMiner.getDataUsersReviewsRatings(document, title, users, reviews, value);


    }

    private static void getDataMetaMask(Document document) throws IOException {
        document = Jsoup.connect("https://chrome.google.com/webstore/detail/metamask/nkbihfbeogaeaoehlefnkodbefgpgknn").get();
        dataMiner.getDataUsersReviewsRatings(document, title, users, reviews, value);


    }
}
