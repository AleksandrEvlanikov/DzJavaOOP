package ru.geekbrains.lesson7.observer;

import java.util.Random;

/**
 * Компания
 */
public class Company {

    private Random random;
    private String nameCompany;
    private String nameJobs;

    private boolean knowledgeJava;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, String nameJobs, boolean knowledgeJava, double maxSalary, Publisher jobAgency) {

        this.nameCompany = nameCompany;
        this.nameJobs = nameJobs;
        this.knowledgeJava = knowledgeJava;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }


    public void needEmployee() {
        double salary = random.nextDouble(3000, maxSalary);
        if (nameJobs.equalsIgnoreCase("Уборщик")) {
            if (!knowledgeJava) {
                jobAgency.sendOffer(nameCompany, nameJobs, knowledgeJava, salary);
            }
        } else {
            if (knowledgeJava) {
                jobAgency.sendOffer(nameCompany, nameJobs, knowledgeJava, salary);
            }
        }
    }


}