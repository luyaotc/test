package com.iterator;

public class Entity {
    private String name;

    public String getName() {
        return name;
    }

    public Entity setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "Entity{" + "name='" + name + '\'' + '}';
    }
}
