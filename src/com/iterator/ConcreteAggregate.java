package com.iterator;

import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements  Iterable<Entity>{
    private List<Entity> entitys;

    public List<Entity> getEntitys() {
        return entitys;
    }

    public ConcreteAggregate setEntitys(List<Entity> entitys) {
        this.entitys = entitys;
        return this;
    }

    @Override
    public Iterator<Entity> iterator() {
        return new ConcreteIterator().setConcreteAggregate(this);
    }
}

