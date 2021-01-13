/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import pkg1_second_applicationvalet.settings.Style;

/**
 *
 * @author Omen
 */
public class MainButton extends JButton{

    public MainButton(String title, ImageIcon icon, ActionListener listener, String action) {
        super(title);
        setIcon(icon);
        setActionCommand(action);
        addActionListener(listener);
        addMouseListener(new HoverButton());
        
        setFont(Style.FONT_MAIN_BUTTON);
        setFocusPainted(false);
        setBackground(Style.COLOR_BUTTON_BG_NORMAL);
    }
    
    public MainButton(String title, ActionListener listener, String action) {
        this(title, null, listener, action);
    }
    
    public MainButton(ImageIcon icon, ActionListener listener, String action) {
        this("", icon, listener, action);
    }
    
    private class HoverButton implements MouseListener {
        
        @Override
        public void mouseClicked(MouseEvent me) {}

        @Override
        public void mousePressed(MouseEvent me) {}

        @Override
        public void mouseReleased(MouseEvent me) {}

        @Override
        public void mouseEntered(MouseEvent me) {
            ((MainButton) me.getSource()).setBackground(Style.COLOR_BUTTON_BG_HOVER);
        }

        @Override
        public void mouseExited(MouseEvent me) {
            ((MainButton) me.getSource()).setBackground(Style.COLOR_BUTTON_BG_NORMAL);
        }
    }
    
}
