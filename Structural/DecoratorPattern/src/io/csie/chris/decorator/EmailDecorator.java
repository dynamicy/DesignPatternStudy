package io.csie.chris.decorator;

import io.csie.chris.email.IEmail;

public abstract class EmailDecorator implements IEmail {

    IEmail originalEmail;
}
