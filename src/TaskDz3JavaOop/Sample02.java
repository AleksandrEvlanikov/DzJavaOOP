package TaskDz3JavaOop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Sample02 {

    private static Random random = new Random();

    /**
     * TODO: 2. Переработать метод generateEmployee(). Метод должен возвращать
     * любого случайного сотрудника разного типа (Worker, Freelancer)
     * @return
     */
    public static Employee generateEmployee() {
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        String[] dataB = new String[] {"1989", "1990","1991","1992","1993","1994","1995","1996","1997", "1998","1999", "2000","2001", "1987" ,"1986"};
//        int[] dataB = new int[] {1989,1990,1991,992,1993,1994};
        int salary = random.nextInt(900, 1500);
        int salaryIndex = random.nextInt(28, 31);

        if (random.nextBoolean()) {
            int salaryNumOfHour = random.nextInt(3, 12);
            int salaryDay = random.nextInt(5, 31);
            int salaryHour = 1200;

            return new Freelancer(names[random.nextInt(10)], surnames[random.nextInt(10)], dataB[random.nextInt(15)], salaryDay * salaryNumOfHour * salaryHour);
        } else {
            return new Worker(names[random.nextInt(10)], surnames[random.nextInt(10)],dataB[random.nextInt(15)], salary * salaryIndex);
        }
    }


    public static void main(String[] args) {

        //Worker worker = new Worker("Глеб", "Григорьев", 120000);
        //System.out.println(worker);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++){
            employees[i] = generateEmployee();
        }

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        Arrays.sort(employees , new yearOfBirth());

        System.out.println("\n*** Отсортированный массив сотрудников ***\n");

        for (Employee employee: employees) {
            System.out.println(employee);
        }


        /*int a = 2;
        boolean f = true;
        String str = "Hello!";
        System.out.println(worker);
        System.out.println(a);
        System.out.println(f);
        System.out.println(str);*/

    }

}
class yearOfBirth implements Comparator<Employee> {

    @Override
    public int compare(Employee o2, Employee o1) {
        return o1.dataOfBirth.compareTo(o2.dataOfBirth);
    }
}

class SalaryComparator implements Comparator<Employee>{

    // 1 0 -1
    @Override
    public int compare(Employee o1, Employee o2) {

        return Double.compare(o2.calculateSalary(), o1.calculateSalary());
        //return o1.calculateSalary() == o2.calculateSalary() ? 0 :
        //        (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
    }
}

class SurNameComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.surName.compareTo(o2.surName);
    }

}

abstract class Employee implements Comparable<Employee>{

    protected String firstName;
    protected String surName;
    protected double salary;
    protected String dataOfBirth;

    public Employee(String firstName, String surName, String dataOfBirth, double salary) {
        this.firstName = firstName;
        this.surName = surName;
        this.salary = salary;
        this.dataOfBirth = dataOfBirth;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return String.format("Сотрудник: %s %s %s; Ставка: %.2f; Среднемесячная заработная плата: %.2f",
                surName, firstName, dataOfBirth, salary, calculateSalary());
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
    }
}

class Worker extends Employee{

    public Worker(String firstName, String surName,String dataOfBirth, double salary) {
        super(firstName, surName, dataOfBirth, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; Рабочий; Среднемесячная заработная плата: %.2f",
                surName, firstName, dataOfBirth, calculateSalary());
    }
}

/**
 * TODO: 1. Разработать самостоятельно в рамках домашней работы.
 */
class Freelancer extends Employee{
    public Freelancer(String firstName, String surName, String dataOfBirth, double salary) {
        super(firstName, surName,dataOfBirth, salary);
    }
    @Override
    public double calculateSalary() {
        return salary;
    }

    public String toString() {
        return String.format("%s %s %s; Фрилансер; Среднемесячная заработная плата: %.2f",
                surName, firstName, dataOfBirth, calculateSalary());
    }
}
