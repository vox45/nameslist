package src.app;

public class Main {

    public static void main(String[] args) {
        DataRepository repository = new DataRepository();  // Отримуємо репозиторій з даними
        DataHandler handler = new DataHandler();           // Створюємо обробник даних
        UIOperator uiOperator = new UIOperator();          // Оператор для виведення результатів

        // Виведення нумерованого списку імен
        uiOperator.getOutput(handler.formListOutput(repository.getData()));

        // Виведення імені за певним індексом
        uiOperator.getOutput(handler.formOutput(repository.getData(), 2));  // Індекс 2
    }
}
