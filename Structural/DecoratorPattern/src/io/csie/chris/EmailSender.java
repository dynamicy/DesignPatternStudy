package io.csie.chris;

import io.csie.chris.decorator.ExternalEmailDecorator;
import io.csie.chris.decorator.SecureEmailDecorator;
import io.csie.chris.email.Email;

public class EmailSender {

    public static void main(String args[]) {

        Email email = new Email("This an e-mail!");
        System.out.println(email.getContents());

        ExternalEmailDecorator externalEmailDecorator = new ExternalEmailDecorator(email);
        System.out.println(externalEmailDecorator.getContents());

        SecureEmailDecorator secureEmailDecorator = new SecureEmailDecorator(email);
        System.out.println(secureEmailDecorator.getContents());
    }
}