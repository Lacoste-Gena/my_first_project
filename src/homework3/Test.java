package homework3;

import java.io.*;
import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) throws IOException {
        Toyota toyota = new Toyota();
        Lada lada = new Lada();
        toyota.music();
        lada.breakDown();
        toyota.go();
        toyota.stop();
        toyota.light();
        lada.go();
        lada.stop();
        lada.light();
        //Задача №2
        //Необходимо:
        // 1. Создать папку resource, пометить ее как папку Resourсe root.
        // 2. Создать в ней файл "my_first_file.txt". На первой строке написать: "Моя бабушка", на второй: "читает газету жизнь"
        // 3. Прочитать файл, и вывести на экран все слова файла в одну строку
        // Ожидаемый результат: "Моя бабушка читает газету жизнь"
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Repos\\my_first_project\\resource\\my_first-file.txt"));
        String result = "";
        while (reader.ready()){
            result += reader.readLine() + " ";
        }
        reader.close();
        System.out.println(result);
        //Задача №3
        //Необходимо:
        // 1. Создать класс Financial record, с двумя атрибутами: incomes, outcomes (доходы, расходы)
        // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
        // 3. Создать объект этого класса прямо здесь (class Homework3, метод main), с доходами 500, расходами 300
        // 4. Записать в файл "report.txt" данные из объекта класса.
        // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы 300
        FinencialRecord finencialRecord = new FinencialRecord(500, 300);
        String path = "D:\\Repos\\my_first_project\\resource\\report.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write("доходы = " + finencialRecord.getIncomes() + "расходы = " + finencialRecord.getOutcomes());
        bufferedWriter.close();

    }
}
