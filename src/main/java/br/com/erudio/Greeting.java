package br.com.erudio;

public class Greeting {
    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.content = content;
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }
}
