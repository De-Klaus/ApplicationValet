/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.panel;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.saveload.SaveData;
import pkg1_second_applicationvalet.settings.Style;
import pkg1_second_applicationvalet.settings.Text;

/**
 *
 * @author Omen
 */
public class RightPanelBelow extends AbstractPanel{

    public RightPanelBelow(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    public void init() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(Style.BORDER_LEFT_PANEL);
        JLabel headerBC = new JLabel(Text.get("CALCULATION_RATES"));
        headerBC.setFont(Style.FONT_LABEL_HEADER);
        headerBC.setIcon(Style.ICON_RIGHT_PANEL_BELOW_RATES);
        headerBC.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        add(headerBC);
        
        try {
            addBalance();
        } catch (Exception ex) {
            Logger.getLogger(RightPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void addBalance() throws Exception {
               
            add(Box.createVerticalStrut(Style.PADDING_BALANCE));
                       
            HashMap<String, String> sd = SaveData.getInstance().getTransaction();
            Set<String> keys = sd.keySet();
            keys.forEach((i) -> {
                add(new PanelBalanceCurrency(i, sd.get(i)));
        });
            
    }
    
    private class PanelBalanceCurrency extends JPanel {
        
        public PanelBalanceCurrency(String currencyF, String currencyS) {
            super();
            setLayout(new BorderLayout());
            setBackground(Style.COLOR_LEFTPANEL_BALANCE);
            setBorder(Style.BORDER_PANEL);
            
            JLabel currencyLabel = new JLabel(currencyF);
            JLabel centerLabel = new JLabel("            >  ");
            JLabel amountLabel = new JLabel(currencyS);
            
            currencyLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_AMOUNT);
            centerLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_CURRENCY);
            amountLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_AMOUNT);
            
            add(currencyLabel, BorderLayout.WEST);
            add(Box.createRigidArea(Style.DIMENSION_PADDING_BALANCE));
            add(centerLabel, BorderLayout.CENTER);
            add(amountLabel, BorderLayout.EAST);
        }
    }
    
}
