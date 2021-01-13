/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.panel;

import javax.swing.JPanel;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.gi.Refresh;

/**
 *
 * @author Omen
 */
abstract public class AbstractPanel extends JPanel implements Refresh {
    
    protected final MainFrame frame;
            
    public AbstractPanel(MainFrame frame){
        this.frame = frame;
    }
       

    @Override
    public void refresh() {
        removeAll();
        init();
    }
    
    abstract protected void init();
    
}
