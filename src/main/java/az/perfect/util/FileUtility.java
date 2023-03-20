
package az.perfect.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileUtility {
     public static void writeObjectToFile(Serializable object, String name)  {
        try ( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(name))){
            oos.writeObject(object);
        } catch (Exception ex) {
             Logger.getLogger(FileUtility.class.getName()).log(Level.SEVERE, null, ex);
         } 
    }    
//Object fayli oxumaq

    public static Object readObjectFromFile(String name) {
        Object obj = null;
        
      
        
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))) {
            obj = in.readObject();
        } finally {
            return obj;
        }
        
    }
    
}
