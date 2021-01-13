/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi.panel;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import pkg1_second_applicationvalet.gi.MainFrame;
import static pkg1_second_applicationvalet.model.currency.RateCurrency.getRates;
import pkg1_second_applicationvalet.settings.Style;
import pkg1_second_applicationvalet.settings.Text;

/**
 *
 * @author Omen
 */
public class RightPanel extends AbstractPanel{
    
    public RightPanel(MainFrame frame) {
        super(frame);
        init();
    }

    @Override
    protected void init() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(Style.BORDER_LEFT_PANEL);
        JLabel headerBC = new JLabel(Text.get("EXCHANGE_RATES"));
        headerBC.setFont(Style.FONT_LABEL_HEADER);
        headerBC.setIcon(Style.ICON_RIGHT_PANEL_EXCHANGE_RATES);
        headerBC.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        add(headerBC);
        
        try {
            addBalance();
        } catch (Exception ex) {
            Logger.getLogger(RightPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void addBalance() throws Exception {
               
            add(Box.createVerticalStrut(Style.PADDING_BALANCE));
            add(new PanelBalanceCurrency("USD", getRates().get("USD")));
            add(new PanelBalanceCurrency("EUR", getRates().get("EUR")));
            add(new PanelBalanceCurrency("AUD", getRates().get("AUD")));
    }
    
    
    private class PanelBalanceCurrency extends JPanel {
        
        public PanelBalanceCurrency(String currency, double amount) {
            super();
            setLayout(new BorderLayout());
            setBackground(Style.COLOR_LEFTPANEL_BALANCE);
            setBorder(Style.BORDER_PANEL);
            
            JLabel currencyLabel = new JLabel(currency);
            JLabel amountLabel = new JLabel(amount + " " +"RUB");
            
            currencyLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_CURRENCY);
            amountLabel.setFont(Style.FONT_LABEL_LEFT_PANEL_AMOUNT);
            
            add(currencyLabel, BorderLayout.WEST);
            add(Box.createRigidArea(Style.DIMENSION_PADDING_BALANCE));
            add(amountLabel, BorderLayout.EAST);
        }
    }
    
}
