// Тип данных Object – «всему голова»
// Упаковка – любой тип можно положить в переменную типа Object
// Распаковка – преобразование Object-переменной в нужный тип
// Иерархия типов – любой тип «ниже» Object’а

// package Lecture3;

// public class Lecture3 {
//     public static void main(String[] args) {
//         Object o = 1; GetType(o);    // java.lang.Integer      
//         o = 1.2; GetType(o);         // java.lang.Double
//     }
//     static void GetType(Object obj) {
//         System.out.println(obj.getClass().getName());
//     }
// }

// public class Lecture3 {
//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2));
//         System.out.println(Sum(1, 2.0));
//         System.out.println(Sum(1.2, 2.1));
//     }
//  }


// public class Lecture3 {
//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2));
//         System.out.println(Sum(1, 2.0));
//         System.out.println(Sum(1.2, 2.1));
//     }
//     static Object Sum(Object a, Object b) {
 
//         if (a instanceof Double && b instanceof Double) {
//             return  (Object)((Double) a + (Double) b);
//         } else if(a instanceof Integer && b instanceof Integer) {
//             return (Object)((Integer) a + (Integer) b);
//         } else return 0;
//     }
//  }
 

// public class Lecture3 {
//     public static void main(String[] args) {
//         int[] a = new int[] { 1, 9 };
//         int[] b = new int[3];
//         System.arraycopy(a, 0, b, 0, a.length);
 
//         for (int i : a) { System.out.printf("%d ", i);} // 1 9
 
//         for (int j : b) { System.out.printf("%d ", j);} 
        // 0 9 0 0 0 0 0 0 0 0
    // } }
 
// public class Lecture3 {
//         static int[] AddItem(int[] array, int item) {
//             int length = array.length;
//             int[] temp = new int[length + 1];
//             System.arraycopy(array, 0, temp, 0, length);
//             temp[length] = item;
//             return temp;
//         }
//         public static void main(String[] args) {
//             int[] a = new int[] { 0, 9 };
//             for (int i : a) { System.out.printf("%d ", i); }
//             a = AddItem(a, 2);
//             a = AddItem(a, 3);
//             for (int j : a) { System.out.printf("%d ", j); }
//         }
//      }
     

// package Lesson_03;
// import java.util.ArrayList;
// public class Ex002 {

//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        //ArrayList list = new ArrayList();
//        list.add(2809);


//        for (Object o : list) {
//            System.out.println(o);
//        }
//    }
// }

// package Lesson_03;

// public class Ex001 {
//     static int[] AddItemInArray(int[] array, int item) {
//         int length = array.length;
        
//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }

//     public static void main(String[] args) {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) { System.out.printf("%d ", i); }
//         a = AddItemInArray(a, 11);
//         a = AddItemInArray(a, 111);
//         a = AddItemInArray(a, 1111);
//         System.out.println();
//         for (int j : a) { System.out.printf("%d ", j); }
//         System.out.println();
//     }
// }

// package Lesson_03;

// import java.util.ArrayList;

// public class Ex003 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list1 = new ArrayList<Integer>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>(10);
//         ArrayList<Integer> list4 = new ArrayList<>(list3);
//         System.out.println(list3);
//         list3.add(123);
//         System.out.println(list4);

//     }
// }

// package Lesson_03;
// import java.util.Arrays;
// import java.util.List;

// public class Ex004 {
//     public static void main(String[] args) {
//         int day = 29;
//         int month = 9;
//         int year = 1990;
//         Integer[] date = { day, month, year };
//         List<Integer> d = Arrays.asList(date);
//         System.out.println(d); // [29, 9, 1990]
//     }
// }

// package Lesson_03;

// import java.util.Arrays;
// import java.util.List;

// public class Ex005 {
//     public static void main(String[] args) {
//         StringBuilder day = new StringBuilder("28");
//         StringBuilder month = new StringBuilder("9");
//         StringBuilder year = new StringBuilder("1990");
//         List<StringBuilder> d = Arrays.asList(day, month, year);
//         System.out.println(d); // [29, 9, 1990]
//         day = new StringBuilder("09");
//         System.out.println(d); // [29, 09, 1990]
//     }
// }

// package Lesson_03;

// import java.util.List;

// public class Ex006 {
//     public static void main(String[] args) {
//         Character value = null;
//         List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
//         System.out.println(list1);
//         list1.remove(1); // java.lang.UnsupportedOperationException
//         List<Character> list2 = List.copyOf(list1);
        
//     }
// }

// package Lesson_03;

// import java.util.*;

// public class Ex007 {
//     public static void main(String[] args) {
//         List<Integer> list = List.of(1, 12, 123, 1234, 12345);

//         for (int item : list) {
//             System.out.println(item);
//         }

//         Iterator<Integer> col = list.iterator();
//         System.out.println();

//         while (col.hasNext()) {
//             col.remove();
//             System.out.println(col.next());
//             //col.next();
//         }

//     }
// }

// add(args) – добавляет элемент в список ( в т.ч. на нужную позицию)

// get(pos) – возвращает элемент из списка по указанной позиции

// indexOf(item) – первое вхождение или -1

// lastIndexOf(item) – последнее вхождение или -1

// remove(pos) – удаление элемента на указанной позиции и его возвращение


// set(int pos, T item) – gjvtoftn значение item элементу, который находится 
// на позиции pos

// void sort(Comparator) – сортирует набор данных по правилу

// subList(int start, int end) – получение набора данных от позиции start до end

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список

