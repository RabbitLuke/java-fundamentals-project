package org.example.emums;

import lombok.Getter;

@Getter
public enum Status {
    NEW("New"),
    ACTIVE("Active"),

    COMPLETE("Complete");

    private final String label;

    Status(String label){this.label = label;}

}
