package ru.geekbrains.lesson7.observer;

public class Junior implements Observer {

    private String name;
    private boolean knowledgeJava;
    private double salary;

    public Junior(String name, boolean knowledgeJava) {
        this.name = name;
        this.knowledgeJava = knowledgeJava;
        salary = 5000;
    }

    @Override
    public boolean hasJavaSkills() {
        return knowledgeJava;
    }

    @Override
    public void receiveOffer(String nameCompany, String nameJobs, boolean knowledgeJava, double salary) {
        if (nameJobs.equalsIgnoreCase("Уборщик") && !knowledgeJava && salary > this.salary) {
            System.out.printf("Junior %s >>> Мне нужна эта работа! [%s(%s) - %f]\n",
                    name, nameCompany, nameJobs, salary);
            this.salary = salary;
        } else if (!nameJobs.equalsIgnoreCase("Уборщик") && knowledgeJava && salary > this.salary) {
            System.out.printf("Junior %s >>> Мне нужна эта работа! [%s(%s) - %f]\n",
                    name, nameCompany, nameJobs, salary);
            this.salary = salary;
        } else {
            System.out.printf("Junior %s >>> Я найду работу получше! [%s(%s) - %f]\n",
                    name, nameCompany, nameJobs, salary);
        }
    }



}
