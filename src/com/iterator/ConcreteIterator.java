package com.iterator;


import java.util.Iterator;

public class ConcreteIterator implements Iterator<Entity> {
    private ConcreteAggregate concreteAggregate;
    private int index;
    private int length;


    public ConcreteAggregate getConcreteAggregate() {
        return concreteAggregate;
    }

    public ConcreteIterator setConcreteAggregate(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.length = concreteAggregate.getEntitys().size();
        this.index = -1;
        return this;
    }

    @Override
    public boolean hasNext() {
        return index+1 < length;
    }

    @Override
    public Entity next() {
        return concreteAggregate.getEntitys().get(++index);
    }
}
