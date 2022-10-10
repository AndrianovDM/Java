package Homework6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NoteBook n1 = new NoteBook("1", "MSI", "2.4", "256", "4");
        NoteBook n2 = new NoteBook("2", "acer", "3.2", "512", "8");

        ArrayList<NoteBook> al = new ArrayList<NoteBook>();
        al.add(n1);
        al.add(n2);

        Scanner in = new Scanner(System.in);
        System.out.println("В нашей базе есть следующие ноутбуки:" +
                "\n" + n1 +
                "\n" + n2);

        System.out.println("Введите поле, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterField = in.next();
        System.out.println("Введите значение, введённого ранее поля, по которому хотите выполнить поиск ноутбука: ");
        String userAnswerFilterValue = in.next();
        in.close();

        NotebookContoller contoller = new NotebookContoller();

        System.out.println(contoller.getFilteredNotebookList(al,userAnswerFilterField,userAnswerFilterValue));

    }
}
