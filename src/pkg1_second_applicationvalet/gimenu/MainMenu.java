/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.gimenu;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import pkg1_second_applicationvalet.gi.EnableEditDelete;
import pkg1_second_applicationvalet.gi.MainFrame;
import pkg1_second_applicationvalet.gi.Refresh;
import pkg1_second_applicationvalet.gi.handler.FunctionHandler;
import pkg1_second_applicationvalet.gi.handler.Handler;
import pkg1_second_applicationvalet.gi.handler.MainMenuHandler;
import pkg1_second_applicationvalet.gi.handler.MenuHelpHandler;
import pkg1_second_applicationvalet.settings.HandlerCode;
import pkg1_second_applicationvalet.settings.Style;
import pkg1_second_applicationvalet.settings.Text;

/**
 *
 * @author Omen
 */
public class MainMenu extends JMenuBar implements Refresh, EnableEditDelete {
    
    private JMenuItem menuEdit;
    private JMenuItem menuDelete;
    private final MainFrame frame;
    
    public MainMenu(MainFrame frame) {
        super();
        this.frame = frame;
        init();
    }

    private void init() {
        
        JMenu file = new JMenu(Text.get("MENU_FILE"));
        JMenu settings = new JMenu(Text.get("MENU_SETTINGS"));
        JMenu help = new JMenu(Text.get("MENU_HELP"));
        
        file.setIcon(Style.ICON_MENU_FILE);
        settings.setIcon(Style.ICON_MENU_SETTINGS);
        help.setIcon(Style.ICON_MENU_HELP);
        
        add(file);
        add(settings);
        add(help);
        
        MainMenuHandler fileHandler = new MainMenuHandler(frame);
        FunctionHandler settingsHandler = new FunctionHandler(frame);
        MenuHelpHandler helpHandler = new MenuHelpHandler(frame);
        
        
        addMenuItem(file, Text.get("MENU_FILE_SAVE"), fileHandler, Style.ICON_MENU_FILE_SAVE, HandlerCode.MENU_FILE_SAVE, KeyEvent.VK_S);
        addMenuItem(file, Text.get("MENU_FILE_NEW"), fileHandler, Style.ICON_MENU_FILE_NEW, HandlerCode.MENU_FILE_NEW);
        addMenuItem(file, Text.get("MENU_FILE_UPDATE_CURRENCIES"), fileHandler, Style.ICON_MENU_FILE_UPDATE_CURRENCIES, HandlerCode.MENU_FILE_UPDATE_CURRENCIES);
        addMenuItem(file, Text.get("MENU_FILE_EXIT"), fileHandler, Style.ICON_MENU_FILE_EXIT, HandlerCode.MENU_FILE_EXIT);
        
        addMenuItem(settings, Text.get("TOOLBAR_ACCOUNTS"), settingsHandler, Style.ICON_ACCOUNTS, HandlerCode.MENU_SETTINGS_ACCOUNTS);
        addMenuItem(settings, Text.get("TOOLBAR_CALCULATIONS"), settingsHandler, Style.ICON_CALCULATIONS, HandlerCode.MENU_SETTINGS_CALCULATIONS);
        
        addMenuItem(help, Text.get("MENU_HELP_ABOUT"), helpHandler, Style.ICON_MENU_HELP_ABOUT, HandlerCode.MENU_HELP_ABOUT);
        
        
        
        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem menuRussian = new JRadioButtonMenuItem(Text.get("MENU_SETTINGS_LANGUAGE_RUSSIAN"));
        JRadioButtonMenuItem menuEnglish = new JRadioButtonMenuItem(Text.get("MENU_SETTINGS_LANGUAGE_ENGLISH"));
        group.add(menuRussian);
        group.add(menuEnglish);
        
    }
    
    private JMenuItem addMenuItem(JMenu menu, String title, Handler listener, ImageIcon icon, String action, int key) {
        JMenuItem item = new JMenuItem(title);
        item.setIcon(icon);
        item.setActionCommand(action);
        item.addActionListener(listener);
        if (key != 0) {
            KeyStroke shortKey = KeyStroke.getKeyStroke(key, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask());
            item.setAccelerator(shortKey);
        }
        menu.add(item);
        return item;
    }
    
    private JMenuItem addMenuItem(JMenu menu, String title, Handler listener, ImageIcon icon, String action) {
        return addMenuItem(menu, title, listener, icon, action, 0);
    }

    @Override
    public void refresh() {
        removeAll();
        init();
    }

    @Override
    public void setEnableEditDelete(boolean enable) {
        menuEdit.setEnabled(enable);
        menuDelete.setEnabled(enable);
    }
    
}
