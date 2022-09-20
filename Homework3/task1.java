// Задача №1
// Пусть дан произвольный список(ArrayList) целых чисел, удалить из него четные числа

package Homework3;

import java.util.Arrays;

public class task1 {

    static int[] AddItemInArray(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;}

        public static void main(String[] args) {
            int[] ArrayList = new int[] {};
            int[] ArrayListNew = new int[] {};
            ArrayList = AddItemInArray(ArrayList, 11);
            ArrayList = AddItemInArray(ArrayList, 50);
            ArrayList = AddItemInArray(ArrayList, 13);
            ArrayList = AddItemInArray(ArrayList, 30);
            ArrayList = AddItemInArray(ArrayList, 121);
            ArrayList = AddItemInArray(ArrayList, 20); 
            for (int i = 0; i < ArrayList.length; i++){
                if( ArrayList[i]%2 !=0){
                    ArrayListNew = AddItemInArray(ArrayListNew, ArrayList[i]);}
            }
            System.out.println(Arrays.toString(ArrayListNew));
        }
}
