
package az.perfect.util;

import az.perfect.beans.Student;
import az.perfect.beans.Teacher;
import java.io.Serializable;
import java.util.LinkedList;


public class Config implements Serializable{
    private LinkedList<Teacher> teachers = new LinkedList<>();
    private LinkedList<Student> students =new LinkedList<>();
    public static Config config = null;
    private static boolean loggedIn;
    public static void initialize(){
    
   Object obj = FileUtility.readObjectFromFile("app.obj");
        if (obj instanceof Config) {
            config = (Config) obj;
            
        }
    
    }

    public static  void save(){
    FileUtility.writeObjectToFile(Config.instance(), "app.obj");
    
    }
    
    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }
    
    
    public static Config instance(){
        if (config==null) {
            config = new Config();
            
        }
    return config;
    
    }

    public LinkedList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }
    
    
}
