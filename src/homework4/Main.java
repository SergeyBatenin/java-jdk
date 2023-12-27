package homework4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ReferenceBook referenceBook = ReferenceBook.initialBook();

        // Добавить метод, который ищет сотрудника по стажу (может быть список)
        System.out.println(referenceBook.getEmployeesWhoseExperienceMoreThan(4));

        // Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
        // Правда не понятно про какой список шла речь...
        System.out.println(referenceBook.getNumberEmployee("Ivan Ivanov"));
        System.out.println(referenceBook.getNumberEmployee("Sidorov"));
        System.out.println(referenceBook.getNumberEmployees(List.of("Petr Petrov", "Kuzma Rybkin", "Sidorov")));

        // Вспомогательный метод, для получения табельного номера случайного сотрудника
        long personNumber = referenceBook.getPersonNumberRandomEmployee();
        // Добавить метод, который ищет сотрудника по табельному номеру
        System.out.println(referenceBook.findEmployeeByPersonNumber(personNumber));
        System.out.println(referenceBook.findEmployeeByPersonNumber(21343575686L));

        // Добавить метод добавление нового сотрудника в справочник
        System.out.println("Old book");
        referenceBook.printBook();
        referenceBook.addNewEmployee(new Employee("+79243547547", "Sidorov", 3));
        System.out.println("New book:");
        referenceBook.printBook();
    }
}
