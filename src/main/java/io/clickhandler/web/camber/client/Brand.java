package io.clickhandler.web.camber.client;

public enum Brand {
    PRIMARY("primary"),
    SECONDARY("secondary");

    private String className;

    Brand(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
