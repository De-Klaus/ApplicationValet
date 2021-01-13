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
import pkg1_second_applicationvalet.gi.handler.AddCurrencyHandler;
import pkg1_second_applicationvalet.model.Account;
import pkg1_second_applicationvalet.saveload.SaveData;
import pkg1_second_applicationvalet.settings.HandlerCode;
import pkg1_second_applicationvalet.settings.Style;
import pkg1_second_applicationvalet.settings.Text;

/**
 *
 * @author Omen
 */
public class AddCurrency extends JDialog{
    
    
    private JTextField text;
    private JComboBox comb;
    
    private MainFrame frame;
    
    

    public AddCurrency(MainFrame frame) {
        super(frame, true);
        init();
        setTitle(Text.get("POPOLNIT"));
        setIconImage(Style.ICON_ADDV.getImage());
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
        
        JLabel label = new JLabel(Text.get("MENU_POPOLNIT"));
        label.setIcon(Style.ICON_EDIT);
        label.setFont(Style.FONT_DIALOG_LABEL);
        
        text = new JTextField();
        text.setPreferredSize(Style.DIMENSION_DIALOG_TEXTFIELD_SIZE);
        //text.setText("Fgfdg");
        
        Style st = new Style();
        
        comb = new JComboBox(st.curency());
        
        
               
        //text.addKeyListener(new AddEditDialogHandler(frame, this));
        //comb.addKeyListener(new AddEditDialogHandler(frame, this));
        text.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        comb.setAlignmentX(JComponent.LEFT_ALIGNMENT);
        add(label);
        add(Box.createVerticalStrut(Style.PADDING_DIALOG));
        add(text);
        add(Box.createVerticalStrut(Style.PADDING_DIALOG));
        add(comb);
        add(Box.createVerticalStrut(Style.PADDING_DIALOG));
        
        
        MainButton ok = new MainButton(Text.get("ADD"), Style.ICON_OK, new AddCurrencyHandler(frame, this), HandlerCode.ADD);
                
        MainButton cancel = new MainButton(Text.get("CANCEL"), Style.ICON_CANCEL, new AddCurrencyHandler(frame, this), HandlerCode.CANCEL);
        
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
    
    public void sentMassage() throws ModelException{
        
        new Account().getBalanceCurrency((String) comb.getSelectedItem(), Double.parseDouble(text.getText()));

        SaveData sd = SaveData.getInstance();           
        sd.falseFile();
       }
    
}
