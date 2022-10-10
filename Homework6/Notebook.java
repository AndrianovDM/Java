// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Реализовать методы фильтрации-сортировки ноутбуки их первоначального множества и вывести проходящие по условиям. 
// Сделать так, как мы обсуждали на семинаре (M - V - C)


package HomeWork6;

public class Notebook {

    private String id;
    private String model;
    private String processor;
    private String memory;
    private String videocard;

    public NoteBook(String id, String model, String processor, String memory, String videocard) {
        this.id = id;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
        this.videocard = videocard;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }


    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }


    public String getMemory() {
        return memory;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }


    public String getVideocard() {
        return videocard;
    }
    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }

    public String toString() {
        return "Notebook id=" + id + ", " +
                "model:'" + model + "', " +
                "processor: " + processor + " Hz, " +
                "memory:" + memory + " Gb";
                "videocard:" + videocard + "Gb";
    }
}

