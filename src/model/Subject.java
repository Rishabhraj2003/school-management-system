package model;

import java.io.Serializable;

public class Subject implements Serializable {
    private String code;
    private String name;

    public Subject(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
