package com.oop.design.principles.slap.wrong;

import java.net.URI;
import java.net.URISyntaxException;

public class TextNormalizer {

    private String text;

    public TextNormalizer(String text) {
        this.text = text;
    }

    public String normalize() {
        if(text != null && !text.isEmpty()) {
            text = text.replace(" ", "");

            if(text.length() > 250) {
                text = text.substring(0, 250);
            }

            if(text.startsWith("http")) {
                try {
                    URI uri = new URI(text);
                    URI normalizedUri = uri.normalize();
                    text = normalizedUri.toString();
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return text;
    }

}
