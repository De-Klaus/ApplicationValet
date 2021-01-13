/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.settings;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Omen
 */
final public class Style {
    
    public static final ImageIcon ICON_MAIN = new ImageIcon("images/main.png");
   
    public static final Color COLOR_BUTTON_BG_NORMAL = new Color(240, 240, 240);
    public static final Color COLOR_BUTTON_BG_HOVER = Color.YELLOW;
    public static final Color COLOR_LEFTPANEL_BALANCE = Color.WHITE;
    
    public static final EmptyBorder BORDER_PANEL = new EmptyBorder(10, 10, 10, 10);
    public static final EmptyBorder BORDER_DIALOG = new EmptyBorder(10, 10, 10, 10);
    public static final EmptyBorder BORDER_MAIN_TOOLBAR = new EmptyBorder(10, 10, 10, 10);
    
    public static final Font FONT_MAIN_BUTTON = new Font("Roboto-Light", Font.BOLD, 14);
    public static final Font FONT_DIALOG_LABEL = new Font("Roboto-Light", Font.BOLD, 12);
    public static final Font FONT_LABEL_HEADER = new Font("Roboto-Light", Font.BOLD, 16);
    public static final Font FONT_LABEL_LEFT_PANEL_CURRENCY = new Font("Roboto-Light", Font.BOLD, 14);
    public static final Font FONT_LABEL_LEFT_PANEL_AMOUNT = new Font("Roboto-Light", Font.PLAIN, 14);
    
    public static final Dimension DIMENSION_DIALOG_TEXTFIELD_SIZE = new Dimension(200, 25);
    public static final Dimension DIMENSION_PADDING_BALANCE = new Dimension(10, 0);
    public static final Dimension DIMENSION_DIALOG_PADDING_BUTTON = new Dimension(10, 0);
    
    public static final EmptyBorder BORDER_LEFT_PANEL = new EmptyBorder(0, 10, 10, 10);
    
    public static final int PADDING_DIALOG = 10;
    public static final int PADDING_BALANCE = 3;
    
    public static final ImageIcon ICON_MENU_FILE = new ImageIcon("images/menu_file.png");
    public static final ImageIcon ICON_MENU_SETTINGS = new ImageIcon("images/menu_settings.png");
    public static final ImageIcon ICON_MENU_HELP = new ImageIcon("images/menu_help.png");
    public static final ImageIcon ICON_MAIN_HELP = new ImageIcon("images/mains.png");

    public static final ImageIcon ICON_MENU_FILE_SAVE = new ImageIcon("images/menu_file_save.png");
    public static final ImageIcon ICON_MENU_FILE_NEW = new ImageIcon("images/menu_file_new.png");
    public static final ImageIcon ICON_MENU_FILE_UPDATE_CURRENCIES = new ImageIcon("images/menu_file_update_currencies.png");
    public static final ImageIcon ICON_MENU_FILE_EXIT = new ImageIcon("images/menu_file_exit.png");
    
    public static final ImageIcon ICON_MENU_SETTINGS_LANGUAGE = new ImageIcon("images/menu_settings_language.png");
    public static final ImageIcon ICON_MENU_SETTINGS_LANGUAGE_RUSSIAN = new ImageIcon("images/menu_settings_language_russian.png");
    public static final ImageIcon ICON_MENU_SETTINGS_LANGUAGE_ENGLISH = new ImageIcon("images/menu_settings_language_english.png");
    public static final ImageIcon ICON_ACCOUNTS = new ImageIcon("images/menu_accounts.png");
    public static final ImageIcon ICON_CALCULATIONS = new ImageIcon("images/menu_calculations.png");
    
    public static final ImageIcon ICON_MENU_HELP_ABOUT = new ImageIcon("images/menu_help_about.png");
    public static final ImageIcon ICON_RIGHT_PANEL_BELOW_RATES = new ImageIcon("images/transfers_panel.png");
        
    public static final ImageIcon ICON_OK = new ImageIcon("images/ok.png");
    public static final ImageIcon ICON_CANCEL = new ImageIcon("images/cancel.png");
    
    public static final ImageIcon ICON_LEFT_PANEL_BALANCE_CURRENCIES = new ImageIcon("images/balance_currencies.png");
    public static final ImageIcon ICON_RIGHT_PANEL_EXCHANGE_RATES = new ImageIcon("images/exchange_rates.png"); 
    
    public static final ImageIcon ICON_TOOLBAR_ACCOUNTS = new ImageIcon("images/accounts.png");
    public static final ImageIcon ICON_TOOLBAR_CALCULATIONS = new ImageIcon("images/calculations.png");
    public static final ImageIcon ICON_KONVERT = new ImageIcon("images/transactions_panel.png");
    
    public static final ImageIcon ICON_ADD = new ImageIcon("images/add.png");
    public static final ImageIcon ICON_ADDV = new ImageIcon("images/addV.png");
    public static final ImageIcon ICON_EDIT = new ImageIcon("images/edit.png");
        
    public String[] curency(){
        String[] val = {"CHF",
                        "KZT",
                        "ZAR",
                        "CNY",
                        "UZS",
                        "AUD",
                        "KRW",
                        "JPY",
                        "PLN",
                        "GBP",
                        "MDL",
                        "BYN",
                        "AMD",
                        "HUF",
                        "TRY",
                        "TJS",
                        "RUB",
                        "HKD",
                        "EUR",
                        "DKK",
                        "USD",
                        "CAD",
                        "XDR",
                        "BGN",
                        "NOK",
                        "RON",
                        "SGD",
                        "AZN",
                        "CZK",
                        "KGS",
                        "SEK",
                        "TMT",
                        "BRL",
                        "UAH"};
        return val;
    }
    
}
