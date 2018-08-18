package main.java.com.design.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * directory class
 *
 * @author :yunpeng.wang
 */
public class Directory extends Entry {

    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> entryIterator = directory.iterator();
        while (entryIterator.hasNext()) {
            size += entryIterator.next().getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = iterator.next();
            entry.printList(prefix + "/" + name);
        }
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
