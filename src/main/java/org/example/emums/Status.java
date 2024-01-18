package org.example.emums;

public enum Status {
    NEW("New"),
    ACTIVE("Active"),

    COMPLETE("Complete");

    private final String label;

    Status(String label){this.label = label;}

    public String getLabel() {
        return label;
    }
}
