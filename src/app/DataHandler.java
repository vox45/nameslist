package src.app;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    // Метод формує виведення імені за певним індексом
    public String formOutput(List<String> list, int index) {
        try {
            String name = list.get(index);  // Отримуємо ім'я за індексом
            return "Name: " + name + " is in index " + index;
        } catch (IndexOutOfBoundsException e) {
            return "Wrong index!";
        }
    }

    // Метод формує виведення нумерованого списку імен
    public String formListOutput(List<String> list) {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(1);  // Лічильник для нумерації
        for (String name : list) {
            sb.append(String.format("%d) %s%n", count.getAndIncrement(), name));
        }
        return "Names:\n" + sb;
    }
}
