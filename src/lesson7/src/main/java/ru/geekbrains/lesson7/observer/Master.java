package ru.geekbrains.lesson7.observer;

public class Master implements Observer {

    private String name;
    private double salary;

    public Master(String name) {
        this.name = name;
        salary = 80000;
    }

    @Override
    public void receiveOffer(String nameCompany,String nameJobs, double salary) {
        if (this.salary < salary){
            System.out.printf("Специалист %s >>> Мне нужна эта работа! [%s(%s) - %f]\n",
                    name, nameCompany,nameJobs, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Специалист %s >>> Я найду работу получше! [%s(%s) - %f]\n",
                    name, nameCompany,nameJobs, salary);
        }
    }

}
