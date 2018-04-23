package com.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<Entity>() {{
            add(new Entity().setName("bbb"));
            add(new Entity().setName("aaa"));
            add(new Entity().setName("ccc"));
            add(new Entity().setName("eee"));
            add(new Entity().setName("ddd"));
        }};
        entities.sort((o1,o2)->o1.getName().compareToIgnoreCase(o2.getName()));
        ConcreteAggregate entities1 = new ConcreteAggregate().setEntitys(entities);
        Iterator<Entity> iterator = entities1.iterator();
        while (iterator.hasNext()){
            Entity next = iterator.next();
            System.out.println(next);
        }
    }
}
