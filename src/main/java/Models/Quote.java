package Models;

import java.io.Serializable;

public class Quote {
    private int id;
    private int authorId;

    public Quote(){ }

    public Quote(int id, int authorId, String content){
        this.id=id;
        this.authorId=authorId;
        this.content=content;
    }

    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
