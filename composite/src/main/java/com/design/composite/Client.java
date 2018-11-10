package com.design.composite;

/**
 * Client
 *
 * @author :yunpeng.wang
 */
public class Client {

    public static void main(String[] args) {
        try {
            System.out.println("Making root entries ...");
            Directory rootDir = new Directory("root");
            Directory bindDir = new Directory("bind");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(bindDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            bindDir.add(new File("vi", 100));
            bindDir.add(new File("latex", 100));

            System.out.println("");
            System.out.println("Making user entries ...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako ");
            Directory tomura = new Directory("tomura");
            usrDir.add(yuki);
            usrDir.add(hanako);
            usrDir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 100));
            hanako.add(new File("memo.tex", 300));

            tomura.add(new File("ganme.doc", 200));
            tomura.add(new File("junk.mail", 300));
            rootDir.printList();
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }

    }
}
