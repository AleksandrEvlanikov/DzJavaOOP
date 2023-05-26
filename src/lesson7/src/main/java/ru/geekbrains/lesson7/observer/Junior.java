package ru.geekbrains.lesson7.observer;

public class Junior implements Observer{

    private String name;
    private double salary;

    public Junior(String name) {
        this.name = name;
        salary = 7000;
    }

    @Override
    public void receiveOffer(String nameCompany,String nameJobs, double salary) {
        if (this.salary < salary){
            System.out.printf("Junior %s >>> Мне нужна эта работа! [%s(%s) - %f]\n",
                    name, nameCompany,nameJobs, salary);
            this.salary = salary;
        }
        else{
            System.out.printf("Junior %s >>> Я найду работу получше! [%s(%s) - %f]\n",
                    name, nameCompany,nameJobs, salary);
        }
    }
}
