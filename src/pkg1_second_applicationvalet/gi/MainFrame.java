/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gi;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import pkg1_second_applicationvalet.gi.handler.FunctionToolBarHandler;
import pkg1_second_applicationvalet.gi.handler.MainWindowHandler;
import pkg1_second_applicationvalet.gi.panel.LeftPanel;
import pkg1_second_applicationvalet.gi.panel.RightPanel;
import pkg1_second_applicationvalet.gi.panel.RightPanelBelow;
import pkg1_second_applicationvalet.gimenu.MainMenu;
import pkg1_second_applicationvalet.settings.Style;
import pkg1_second_applicationvalet.settings.Text;
import pkg1_second_applicationvalet.toolbur.MainToolBar;

/**
 *
 * @author Omen
 */
public class MainFrame extends JFrame implements Refresh{
    
    private GridBagConstraints constraints;
    private final MainMenu mb;
    private final LeftPanel leftPanel;
    private final RightPanel rightPanel;
    private final RightPanelBelow rightPanelBelow;
    private final MainToolBar tb;
    
    
    
    public MainFrame(){
        super(Text.get("PROGRAMME NAME"));
        setResizable(false);
        setIconImage(Style.ICON_MAIN.getImage());
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
       // new MassageDialog().setVisible(true);
        
        //new AddCurrency().setVisible(true);
        
        //new СonvertVal().setVisible(true);
        
        mb = new MainMenu(this);
        setJMenuBar(mb);
        
        setLayout(new GridBagLayout());
        
        constraints = new GridBagConstraints();
        
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        
        //add toolbar
        
        tb = new MainToolBar(new FunctionToolBarHandler(this));
        add(tb, constraints);
        
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        
        leftPanel = new LeftPanel(this);
        add(leftPanel, constraints); 
        
        
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        
        rightPanel = new RightPanel(this);
        add(rightPanel, constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.anchor = GridBagConstraints.NORTH;
        
        rightPanelBelow = new RightPanelBelow(this);
        add(rightPanelBelow, constraints);
        
        pack();
        setLocationRelativeTo(null);
        
        addWindowListener(new MainWindowHandler());
    }

    @Override
    public void refresh() {
        SwingUtilities.updateComponentTreeUI(this);
        mb.refresh();
        leftPanel.refresh();
        rightPanel.refresh();
        rightPanelBelow.refresh();
        pack();
    }
    
}
