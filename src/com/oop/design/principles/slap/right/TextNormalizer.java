package com.oop.design.principles.slap.right;

import java.net.URI;
import java.net.URISyntaxException;

public class TextNormalizer {

    private String text;

    public TextNormalizer(String text) {
        this.text = text;
    }

    public String normalize() {
        if (!isBlank()) {
            removeSpaces();
            shorten();
            applyUrlFilter();
        }
        return text;
    }

    private boolean isBlank() {
        return text == null || text.isEmpty();
    }

    private void removeSpaces() {
        text = text.replace(" ", "");
    }

    private void shorten() {
        if (text.length() > 250) {
            text = text.substring(0, 250);
        }
    }

    private void applyUrlFilter() {
        if (isUrlText()) {
            normalizeAsUrl();
        }
    }

    private boolean isUrlText() {
        return text.startsWith("http");
    }

    private void normalizeAsUrl() {
        try {
            URI uri = new URI(text);
            URI normalizedUri = uri.normalize();
            text = normalizedUri.toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}
