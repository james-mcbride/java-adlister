package Models;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album twentyFive = new Album(1, "Chris Stapleton", "25", 2018, 4.5, "country rock");
        Author billBryson=new Author("Bill", "Bryson", 1);
        Author tolkien=new Author("JRR", "Tolkien", 2);
        Quote walk=new Quote(1, 1, "A walk in the woods is good for the soul");
        Quote australia=new Quote(2, 1, "Australia is da bomb");
        Quote wizard = new Quote(3, 2, "A wizard is neither late nor early");
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(billBryson);
        authors.add(tolkien);
        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(walk);
        quotes.add(australia);
        for (Quote quote: quotes){
            for (Author author: authors){
                if (quote.getAuthorId()==author.getId() &&author.getAuthor_last_name().equalsIgnoreCase("Bryson")){
                    System.out.println(author.getAuthor_first_name()+" "+ author.getAuthor_last_name());
                    System.out.println(quote.getContent());
                }
            }
        }



    }
}
