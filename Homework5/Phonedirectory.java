// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

package Homework5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonedirectory {
    Map<String, List<String>> directory = new HashMap();
    List<String> phoneNum;
    
    public void add(String name, String phoneNumber) {
            if (directory.containsKey(name)) {
                phoneNum = directory.get(name);
                phoneNum.add(phoneNumber);
                directory.put(name, phoneNum);
            }
            else{
                phoneNum = new ArrayList<>();
                phoneNum.add(phoneNumber);
                directory.put(name, phoneNum);
            }
        }
    
    public List<String> get(String name) {
            return directory.get(name);
        }

    public static void main(String[] args) {
        Phonedirectory direct = new Phonedirectory();
        direct.add("Dima", "89901334122");
        direct.add("Dima", "891123");
        direct.add("Anton", "8915552");
        direct.add("Anton", "861345322");
        direct.add("Igor", "77777");
        System.out.println(direct.get("Dima"));
        System.out.println(direct.get("Anton"));
        System.out.println(direct.get("Igor"));
        }
}

