package io.csie.chris.decorator;

import io.csie.chris.email.IEmail;

public class SecureEmailDecorator extends EmailDecorator {

    private String content;

    public SecureEmailDecorator(IEmail iEmail) {
        originalEmail = iEmail;
    }

    @Override
    public String getContents() {
        content = encryptEmailContent(originalEmail.getContents());
        return content;
    }

    private String encryptEmailContent(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}