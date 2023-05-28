package ru.geekbrains.lesson7.observer;

public class Master implements Observer {

    private String name;
    private boolean knowledgeJava;
    private double salary;

    public Master(String name, boolean knowledgeJava) {
        this.name = name;
        this.knowledgeJava = knowledgeJava;
        salary = 80000;
    }

    @Override
    public boolean hasJavaSkills() {
        return knowledgeJava;
    }

    @Override
    public void receiveOffer(String nameCompany, String nameJobs, boolean knowledgeJava, double salary) {
        if (nameJobs.equalsIgnoreCase("Уборщик") && !knowledgeJava && salary > this.salary) {
            System.out.printf("Master %s >>> Мне нужна эта работа! [%s(%s) - %f]\n",
                    name, nameCompany, nameJobs, salary);
            this.salary = salary;
        } else if (!nameJobs.equalsIgnoreCase("Уборщик") && knowledgeJava && salary > this.salary) {
            System.out.printf("Master %s >>> Мне нужна эта работа! [%s(%s) - %f]\n",
                    name, nameCompany, nameJobs, salary);
            this.salary = salary;
        } else {
            System.out.printf("Master %s >>> Я найду работу получше! [%s(%s) - %f]\n",
                    name, nameCompany, nameJobs, salary);
        }
    }


}
