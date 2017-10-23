package io.csie.chris.builder;

import java.util.ArrayList;

public class Product {

    private ArrayList<String> szParts = new ArrayList<String>();

    public void Add(String pPart) {
        szParts.add(pPart);
    }

    public void Show() {

        System.out.println("\nParts on product:");

        for (String szPart : szParts) System.out.println(szPart);
    }
}