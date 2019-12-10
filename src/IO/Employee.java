package IO;

//        Створити клас Employee, описати даний клас наступними полями: name, id, salary.
//        Дані поля повинні бути private. Описати getters and setters.

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private Integer id;
    transient private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}
