package homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReferenceBook {

    private List<Employee> employees;

    public ReferenceBook(List<Employee> employees) {
        this.employees = employees;
    }

    public static ReferenceBook initialBook() {
        List<Employee> empls = new ArrayList<>();
        empls.add(new Employee("+71234567890", "Vasya Pupkin", 4));
        empls.add(new Employee("+71034658658", "Ivan Ivanov", 1));
        empls.add(new Employee("+79253464734", "Petr Petrov", 2));
        empls.add(new Employee("+79742546625", "Ded Makar", 7));
        empls.add(new Employee("+79035365657", "Kuzma Rybkin", 5));
        return new ReferenceBook(empls);
    }

    public List<Employee> getEmployeesWhoseExperienceMoreThan(int yearExperience) {
        List<Employee> filterList = new ArrayList<>();
        for (Employee employee : employees) {
            if(employee.getExperience() > yearExperience) {
                filterList.add(employee);
            }
        }
        return filterList;
    }

    public String getNumberEmployee(String name) {
        String result = "";
        for (Employee employee : employees) {
            if (employee.getFullName().equals(name)) {
                result = employee.getPhoneNumber();
                break;
            }
        }
        // Здесь по хорошему надо бросать исключение что такого сотрудника нет
        // но для простоты буду возвращать сообщение
        if (result.isEmpty()) {
            return "Такого сотрудника нет";
        }
        return result;
    }
    public List<String> getNumberEmployees(List<String> names) {
        List<String> phones = new ArrayList<>();
        String currentPhone;
        for (String name : names) {
            currentPhone = "такого сотрудника не обнаружено";
            for (Employee employee : employees) {
                if (employee.getFullName().equals(name)) {
                    currentPhone = employee.getPhoneNumber();
                    break;
                }
            }
            phones.add(name + ": " + currentPhone);
        }
        return phones;
    }

    public Employee findEmployeeByPersonNumber(long personNumber) {
        for (Employee employee : employees) {
            if (employee.getPersonNumber() == personNumber) {
                return employee;
            }
        }
        return null;
    }

    public long getPersonNumberRandomEmployee() {
        int index = new Random().nextInt(employees.size());
        return employees.get(index).getPersonNumber();
    }

    public void printBook() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public boolean addNewEmployee(Employee employee) {
        return employees.add(employee);
    }
}
