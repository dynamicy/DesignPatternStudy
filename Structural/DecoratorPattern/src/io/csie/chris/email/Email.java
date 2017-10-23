package io.csie.chris.email;

public class Email implements IEmail {

    private String content;

    public Email(String content) {
        this.content = content;
    }

    @Override
    public String getContents() {
        return this.content;
    }
}
