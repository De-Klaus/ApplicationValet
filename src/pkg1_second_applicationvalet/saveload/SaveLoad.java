/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_second_applicationvalet.saveload;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import pkg1_second_applicationvalet.settings.Settings;

/**
 *
 * @author Omen
 */
public class SaveLoad {
    
    public static void load(SaveData sd){
        try {
            JAXBContext context = JAXBContext.newInstance(Wrapper.class);
            Unmarshaller um = context.createUnmarshaller();
            Wrapper wrapper = (Wrapper) um.unmarshal(Settings.getFileSave());
            sd.setAccounts(wrapper.getAccounts());
            
        } catch (JAXBException ex) {
            System.out.println("Файл не существует");
        }
    }
    
    public static void save(SaveData sd){
        try {
            JAXBContext context = JAXBContext.newInstance(Wrapper.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); //для того, чтобы был переход на новую строку
            
            Wrapper wrapper = new Wrapper(); 
            wrapper.setAccounts(sd.getAccounts());

            m.marshal(wrapper, Settings.getFileSave()); //указываем куда будет сохраняться файл
            
        } catch (JAXBException ex) {
            Logger.getLogger(SaveLoad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
