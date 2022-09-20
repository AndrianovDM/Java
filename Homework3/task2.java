// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package Homework3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class task2 {     
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        list.add(22);
        list.add(5);
        list.add(10);
        list.add(13);
        list.add(11);
        list.sort(Comparator.naturalOrder());
        float count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i);
        }
        float average = (count / list.size());
        int min = list.get(0);
        int max = list.get(list.size()-1);
        System.out.printf("min = %d; max = %d; average = %f", min, max, average);
    }   
}
