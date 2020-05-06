package filewriter.caretaker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author urosv
 * Originator
 */
public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    //Creates the memento
    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    //Restore into its earlier state
    public void undo(Object o) {
        Memento memento = (Memento) o;
        this.fileName = memento.fileName;
        this.content = memento.content;

    }

    private class Memento {

        private String fileName;
        private StringBuilder content;

        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }

    }

}
