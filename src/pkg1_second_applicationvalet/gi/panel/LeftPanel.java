/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.panel;

import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.Set;
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
public final class LeftPanel extends AbstractPanel{

    public LeftPanel(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    protected void init() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(Style.BORDER_LEFT_PANEL);
        JLabel headerBC = new JLabel(Text.get("BALANCE_CURRENCIES"));
        headerBC.setFont(Style.FONT_LABEL_HEADER);
        headerBC.setIcon(Style.ICON_LEFT_PANEL_BALANCE_CURRENCIES);
        headerBC.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        add(headerBC);
        
        addBalance();
    }
    
    private void addBalance() {
                    
            HashMap<String, Double> sd = SaveData.getInstance().getAccounts();
            
            Set<String> keys = sd.keySet();
            keys.forEach((i) -> {
                add(new PanelBalanceCurrency(i, sd.get(i)));
        });            
            add(Box.createVerticalStrut(Style.PADDING_BALANCE));
    }
    
    
    private class PanelBalanceCurrency extends JPanel {
        
        public PanelBalanceCurrency(String currency, double amount) {
            super();
            setLayout(new BorderLayout());
            setBackground(Style.COLOR_LEFTPANEL_BALANCE);
            setBorder(Style.BORDER_PANEL);
            
            JLabel currencyLabel = new JLabel(currency);
            JLabel amountLabel = new JLabel(amount + " " + currency);
            
            currencyLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_CURRENCY);
            amountLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_AMOUNT);
            
            add(currencyLabel, BorderLayout.WEST);
            add(Box.createRigidArea(Style.DIMENSION_PADDING_BALANCE));
            add(amountLabel, BorderLayout.EAST);
        }
    }
}
