package filewriter.originator;

import filewriter.caretaker.FileWriterUtil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author urosv
 */
public class FileWriterCaretaker {
    
    private Object savedState;
    
    public void save(FileWriterUtil fileWriter){
        this.savedState = fileWriter.save();
    }
    
    public void undo(FileWriterUtil fileWriterUtil){
        fileWriterUtil.undo(savedState);
    }
    
}
