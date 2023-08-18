package HomeWork13;

import java.util.Objects;

public class Author {
    private String name;
    private String surName;

    public Author(String name,String surName) {
        this.name = name;
        this.surName = surName;
    }

    public  String getName() {
        return this.name;
    }

    public String getSurName() {
        return  this.surName;
    }

    public String toString() {
        return (this.name + this.surName);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(name, author.name) && Objects.equals(surName, author.surName);
    }

    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
