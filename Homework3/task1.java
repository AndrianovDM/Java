// Задача №1
// Пусть дан произвольный список(ArrayList) целых чисел, удалить из него четные числа

package Homework3;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class task1 {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<Integer>();
            list.add(11);
            list.add(50);
            list.add(13);
            list.add(30);
            list.add(121);
            list.add(20);
            System.out.println("Old List: " + list);
            for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
                Integer number = iterator.next();
                if (number % 2 == 0) {
                    iterator.remove();}
                }
            System.out.println("New List: " + list);
            }
        }
