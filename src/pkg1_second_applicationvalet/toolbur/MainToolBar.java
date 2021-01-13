/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.toolbur;


import pkg1_second_applicationvalet.gi.handler.FunctionToolBarHandler;
import pkg1_second_applicationvalet.settings.HandlerCode;
import pkg1_second_applicationvalet.settings.Style;
import pkg1_second_applicationvalet.settings.Text;

/**
 *
 * @author Omen
 */
public final class MainToolBar extends AbstractToolBar{

    public MainToolBar(FunctionToolBarHandler handler) {
        super(Style.BORDER_MAIN_TOOLBAR, handler);
        init();
    }

    @Override
    protected void init() {
        
        addButton(Text.get("TOOLBAR_ACCOUNTS"), Style.ICON_TOOLBAR_ACCOUNTS, HandlerCode.TOOLBAR_ACCOUNTS, true);
        addButton(Text.get("TOOLBAR_CALCULATIONS"), Style.ICON_TOOLBAR_CALCULATIONS, HandlerCode.TOOLBAR_CALCULATIONS, true);
    }
    
}
