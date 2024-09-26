package src.app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    // Метод повертає список імен
    public List<String> getData() {
        List<String> list = new ArrayList<>();  // Створюємо список
        list.add("Alice");
        list.add("Bob");
        list.add("Lucy");
        list.add("Denis");
        list.add("Tom");
        return list;
    }
}
