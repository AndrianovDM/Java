// Дана строка. Необходимо написать метод, который отсортирует слова в строке по длине с помощью TreeMap.
// Строки с одинаковой длиной не должны “потеряться”.
// Пример:
// “Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись”
// Результат:
// [и], [ты], [Еще], [день, друг, Пора], 
// [Мороз], [солнце], [чудесный, дремлешь, проснись], 
// [красавица], [прелестный]


package Homework5;

import java.util.logging.Logger;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.TreeMap;

public class task1{

    public static void main(String[] args) {
        String stroka = "Moroz i solntse den chudesnyy Yeshche ty dremlesh drug prelestnyy Pora krasavitsa prosnis";
        Logger logger = Logger.getAnonymousLogger();
        logger.info(String.valueOf(Sort(stroka)));
    }

    private static ArrayList<String> Sort(String List){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(List.split(" ")));
        ArrayList<String> listTwo = new ArrayList<String>(); 
        TreeMap<String, Integer> dic = new TreeMap<>();
        // Создание treeMap
        for (int i = 0; i < list.size(); i++){
            dic.put(list.get(i).toString(), list.get(i).length());
            }
        // Создание пары по длине слова
        for(Map.Entry<String,Integer> one :dic.entrySet()){
            ArrayList<String> ListOne = new ArrayList<String>();
                for(Map.Entry<String,Integer> two :dic.entrySet()) {
                    if (one.getValue() == two.getValue()){
                        ListOne.add(two.getKey());
                    }
              }
            listTwo.add(ListOne.toString());
            // удаление повторяющихся копий с помощью Hahset
            Set<String> set = new HashSet<>(listTwo);
            listTwo.clear();
            listTwo.addAll(set);
    }
    // Сортировка по возрастанию длины слов по ключам которые обозначают кол-во символов
    TreeMap<Integer, String> dicTwo = new TreeMap<>();
    for (int i = 0; i < listTwo.size(); i++) {
        dicTwo.put(listTwo.get(i).length(), listTwo.get(i).toString());
        }
        // Создание итогового списка
        Collection<String> values = dicTwo.values();
        ArrayList<String> finalyList = new ArrayList<String>( values );
        return finalyList;
}
}


