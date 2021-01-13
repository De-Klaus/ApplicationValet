/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.diaalog;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import pkg1_second_applicationvalet.exception.ModelException.ModelException;
import pkg1_second_applicationvalet.gi.MainButton;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.gi.handler.ConvertValHandler;
import pkg1_second_applicationvalet.model.Calculation;

import pkg1_second_applicationvalet.settings.HandlerCode;
import pkg1_second_applicationvalet.settings.Style;
import pkg1_second_applicationvalet.settings.Text;

/**
 *
 * @author Omen
 */
public class СonvertVal extends JDialog{

private JComboBox comb, combs;
private JTextField text;

private MainFrame frame;


    public СonvertVal(MainFrame frame) {
        super(frame, true);
        init();
        setTitle(Text.get("KONVERT"));
        setIconImage(Style.ICON_KONVERT.getImage());
        setResizable(false);
    }
    
    public final void showDialog() {
        init();
        setVisible(true);
    }
    
    public final void closeDialog() {
        setVisible(false); 
        dispose();
    }

    private void init() {     
        
        setTitle(Text.get("ADD"));
        setIconImage(Style.ICON_ADD.getImage());
           
        setTitle(Text.get("EDIT"));
        setIconImage(Style.ICON_EDIT.getImage());
        
        getContentPane().removeAll(); //стираем всё с панели в случае закрытия
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); //вертикальное расположение элементов
        ((JPanel) getContentPane()).setBorder(Style.BORDER_DIALOG); //чтобы элементы плотно друг с другом не распологалсь
        
        JLabel label = new JLabel(Text.get("IN"));
        label.setIcon(Style.ICON_EDIT);
        label.setFont(Style.FONT_DIALOG_LABEL);
        
        Style st = new Style();
        
        comb = new JComboBox(st.curency());
                
        text = new JTextField();
        text.setPreferredSize(Style.DIMENSION_DIALOG_TEXTFIELD_SIZE);
        
        combs = new JComboBox(st.curency());
               
        text.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        
        comb.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        combs.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        add(label);
        add(Box.createVerticalStrut(Style.PADDING_DIALOG));
        add(comb);
        add(Box.createVerticalStrut(Style.PADDING_DIALOG));
        add(text);
        add(Box.createVerticalStrut(Style.PADDING_DIALOG));
        add(combs);
        add(Box.createVerticalStrut(Style.PADDING_DIALOG));
        
        
        MainButton ok = new MainButton(Text.get("KONV"), Style.ICON_OK, new ConvertValHandler(frame, this), HandlerCode.ADD);
                
        MainButton cancel = new MainButton(Text.get("CANCEL"), Style.ICON_CANCEL, new ConvertValHandler(frame, this), HandlerCode.CANCEL);
        
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new BorderLayout());
        panelButtons.setAlignmentX(JPanel.LEFT_ALIGNMENT);
        panelButtons.add(ok, BorderLayout.WEST);
        panelButtons.add(Box.createRigidArea(Style.DIMENSION_DIALOG_PADDING_BUTTON), BorderLayout.CENTER);
        panelButtons.add(cancel, BorderLayout.EAST);
        
        add(panelButtons);
        pack();
        setLocationRelativeTo(null);
    }
    
    public void sentMassage() throws ModelException, Exception{
        
        new Calculation().calculations((String) comb.getSelectedItem(), (String) combs.getSelectedItem(), Double.parseDouble(text.getText()));
    }
}