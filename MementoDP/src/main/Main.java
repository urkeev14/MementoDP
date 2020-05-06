/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import filewriter.caretaker.FileWriterUtil;
import filewriter.originator.FileWriterCaretaker;

/**
 *
 * @author urosv
 */
public class Main {

    //OPEN CONSOLE TO VIEW THE OUTPUT
    
    public static void main(String[] args) throws InterruptedException {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First set of data:\n\tUros\n\tMarija\n");

        System.out.println(fileWriter + "\n\n");
        
        waitABit();
        
        //Lets save the file
        caretaker.save(fileWriter);

        //Now continuing to write something else...
        fileWriter.write("Second set of data:\n\tNikola\n\tMarija\n");

        //Checking file contents
        System.out.println(fileWriter + "\n\n");
        
        waitABit();

        //Now undo to last save
        caretaker.undo(fileWriter);

        //Checking file content again...
        System.out.println(fileWriter + "\n\n");

    }

    private static void waitABit() throws InterruptedException {
        Thread.currentThread().sleep(1500);
    }

}
