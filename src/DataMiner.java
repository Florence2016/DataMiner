import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.Formatter;


public class DataMiner {

    private String value;
    private String reviews;
    private String users;
    private String title;
    private String ExtensionList;
    Formatter printerExtensions;

    /**
     * This is the constant getting value of extensions from web chrome store
     * Title
     * Users
     * Reviews
     * Ratings
     **/

    public DataMiner() {

    }


    public void getDataUsersReviewsRatings(Document document, String title, String users, String reviews, String value) throws IOException {

       // this.title = title;
       // this.users = users;
       // this.reviews = reviews;
       // this.value = value;

        Elements container = document.select("div.e-f-w-Va");

        //get extension name on the container
        title = container.select("h1.e-f-w").text();

        //get extension users on the container
        users = container.select("span.e-f-ih").text();
        //removes other characters, only numbers of users
        users = users.replaceAll(" users", "");

        //get extension reviews on the container
        reviews = container.select("span.q-N-nd").text();
        //removes parenthesis, only numbers of reviews
        reviews = reviews.replaceAll("[()]", "");

        //get value in a tag on the container
        Elements stars= document.select("span.q-N-nd[aria-label]");

        //get value attribute
        value = stars.attr("aria-label");

        //removes characters, remains number only
        value = value.replaceAll("[^0-9.]", "");

        //shows only first three value which is the rating
        value =value.substring(0, 3);

        //System.out.println(" Extension: "+ title);
        //System.out.println(" Users: " + users);
        //System.out.println(" Reviews: " + reviews);
        //System.out.println(" Ratings: " + value);

        ExtensionList = (" Extension: "+ title + " Users: " + users + " Reviews: " + reviews + " Ratings: " + value);
        System.out.println(ExtensionList);
        System.out.println("");


    }
    public void setTitle(String title) {
        title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setUsers(String users) {
        users = users;
    }
    public String getUsers(){
        return ExtensionList;
    }

    public void setReviews(String reviews) {
        reviews = reviews;
    }
    public String getReviews(){
        return reviews;
    }

    public void setValue(String value) {
        value = value;
    }
    public String getValue(){
        return value;
    }
}
