
package com.mycompany.model;

public class Category {
    public String id;
    public String label;

    public Category() {
    }

    public Category(String id, String label) {
        this.id = id;
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", label=" + label + '}';
    }
    
}
