package Homework6;

import java.util.ArrayList;
import java.util.List;

public class NotebookService {

    public List<NoteBook> methodFindAndWriteFilteringValue(List<NoteBook> list, String field, String value) {
        List<NoteBook> fList = new ArrayList<>();
        for (NoteBook notebook : list) {
            switch (field) {
                case "id":
                    if (notebook.getId().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "model":
                    if (notebook.getModel().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "processor":
                    if (notebook.getProcessor().equals(value)) {
                        fList.add(notebook);
                    }
                    break;

                case "memory":
                    if (notebook.getMemory().equals(value)) {
                        fList.add(notebook);
                    }
                    break;


                case "videocard":
                    if (notebook.getVideocard().equals(value)) {
                        fList.add(notebook);
                    }
                    break;
            }
        }

        return fList;
    }
}
