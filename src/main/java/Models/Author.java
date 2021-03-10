package Models;

public class Author {
    private String author_first_name;
    private String author_last_name;
    private int id;

    public Author(){ }

    public Author(String author_first_name, String author_last_name, int id){
        this.author_first_name=author_first_name;
        this.author_last_name=author_last_name;
        this.id=id;
    }

    public String getAuthor_first_name() {
        return author_first_name;
    }

    public void setAuthor_first_name(String author_first_name) {
        this.author_first_name = author_first_name;
    }

    public String getAuthor_last_name() {
        return author_last_name;
    }

    public void setAuthor_last_name(String author_last_name) {
        this.author_last_name = author_last_name;
    }

    public int getId() {
        return id;
    }

    public void setId(String content) {
        this.id = id;
    }



}
