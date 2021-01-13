/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.settings;

import java.util.HashMap;

/**
 *
 * @author Omen
 */
final public class Text {
    
    private static final HashMap<String, String> data = new HashMap();
    
    public static String get(String key) {
        if (data.containsKey(key)) return data.get(key);
        System.out.println("Такого ключа в Text не существует!"); // Для отладки
        return "";
    }
    public static void init() {
        
        data.put("PROGRAMME NAME", "Ваши валютные счета");
        
        data.put("MENU_FILE", "Файл");
        data.put("MENU_SETTINGS", "Настройки");
        data.put("MENU_HELP", "Помощь");
        
        data.put("CONFIRM_EXIT_TEXT", "Вы действительно хотите выйти? Все несохранённые данные будут потеряны!");
        data.put("CONFIRM_EXIT_TITLE", "Подтверждение выхода");
            
        data.put("MENU_FILE_SAVE", "Сохранить");
        data.put("MENU_FILE_NEW", "Новый");
        data.put("MENU_FILE_UPDATE_CURRENCIES", "Обновить курс валют");
        data.put("MENU_FILE_EXIT", "Выход");
            
        data.put("MENU_SETTINGS_LANGUAGE", "Язык");
        data.put("MENU_SETTINGS_LANGUAGE_RUSSIAN", "Русский");
        data.put("MENU_SETTINGS_LANGUAGE_ENGLISH", "Английский");
        
        data.put("ADD", "Добавить");
        data.put("EDIT", "Изменить");
        data.put("DELETE", "Удалить");
        data.put("CANCEL", "Закрыть");
           
        data.put("MENU_HELP_ABOUT", "О программе");
        data.put("MENU_POPOLNIT", "Укажите сумму увелечения счёта");
        data.put("POPOLNIT", "Пополнить");
        
        data.put("YES", "Да");
        data.put("NO", "Нет");
        
        data.put("KONVERT", "Конвертер");
        data.put("KONV", "Конвертировать");
        data.put("IN", "Введите сумму и выберите валюты конвертации");
        
        data.put("ERROR", "Error");
        
        data.put("TOOLBAR_ACCOUNTS", "Пополнить счёт");
        data.put("TOOLBAR_CALCULATIONS", "Конвертор");
        
        data.put("BALANCE_CURRENCIES", "Баланс по валютам");
        data.put("EXCHANGE_RATES", "Курс основных валют");
        data.put("CALCULATION_RATES", "Результат конвертации валют");
        
        data.put("DIALOG_ABOUT_TITLE", "О программе");
            data.put("ABOUT", "<body style='font-size: 120%; text-align: center; width: 370px;'>"
                    + "<h1>Валютные счета.</h1><p><img src='file:images/mains.png' /></p>"
                    + "<p>Данная программа созданна с целью облегчить жизнь инвесторам в различные валюты "
                    + "<br />\"Валютным инвесторам\"."
                    + "<br />Приятного использования!!!"
                    + "<p>С Уважением, Петько Николай!</p></body>");
        
    }
    
    
}
