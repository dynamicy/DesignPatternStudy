package io.csie.chris;

import io.csie.chris.image.common.IImage;
import io.csie.chris.image.proxy.ProxyImage;

public class Main {

    public static void main(String args[]) {
        IImage iImage = new ProxyImage("picture_2014_12_31.png");

        iImage.display();
        System.out.println("======================");
        iImage.display();
    }
}
