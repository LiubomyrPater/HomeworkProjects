package IO;

import java.util.ArrayList;
import java.util.List;

/**
          Створити клас Employee, описати даний клас наступними полями: name, id, salary.
          Дані поля повинні бути private. Описати getters and setters.

          Створити клас Methods де описати всього два методи serialize() and deserealize().
          В даних методах повинно бути бути використано FileInputStream/FileOutputStream, ObjectInputStream/ObjectOutputStream.

       1. Створити метод Main, створити екземпляр класу Employee і провести сереалізацію та десереалізацію.
          Результат Десереалізації вивести на консоль.

       2. Помітити поле salary модифікатором transient і провести сереалізацію і десереалізацію. Результат вивести на екран.

       3. Створити колекцію об’єктів Employee, провести сереалізацію та десереалізацю колекції
*/

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setId(777777777);
        employee1.setName("Elvis");
        employee1.setSalary(1234567.7654321);
        System.out.println("\nInstance before serialize:                   " + employee1 + "\n");
        Methods.serialize(employee1, "object.out");

        Employee employee2 = (Employee) Methods.deserialize("object.out");
        System.out.println("New instance after deserialize old instance: " + employee2 + "\n");


        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee1);
        employees.add(employee1);
        employees.add(employee1);
        employees.add(employee1);

        System.out.println("List before serialize:" + "\n" + "----------------------");
        for (Object o : employees) {
            System.out.println(o);
        }

        Methods.serialize(employees, "list.out");
        List list = (List<Employee>) Methods.deserialize("list.out");

        System.out.println("\nList after serialize:" + "\n" + "----------------------");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
