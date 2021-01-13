/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.handler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import pkg1_second_applicationvalet.gi.MainFrame;

/**
 *
 * @author Omen
 */
public abstract class Handler implements ActionListener{
    
    protected final MainFrame frame;
    
    public Handler(MainFrame frame){
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        frame.refresh();
    }
    
}
