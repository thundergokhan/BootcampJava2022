package com.example.languageframework.kodlamaio;

public class Language {
    private int id;
    private String name;
    private String[] technologies;

    public Language(int id, String name, String[] technologies) {
        this.id = id;
        this.name = name;
        this.technologies = technologies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String[] technologies) {
        this.technologies = technologies;
    }
}
