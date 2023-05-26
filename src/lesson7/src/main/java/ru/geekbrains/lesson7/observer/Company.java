package ru.geekbrains.lesson7.observer;

import java.util.Random;

/**
 * Компания
 */
public class Company {

    private Random random;
    private String nameCompany;
    private String nameJobs;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, String nameJobs, double maxSalary, Publisher jobAgency) {

        this.nameCompany = nameCompany;
        this.nameJobs = nameJobs;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }

    public void needEmployee(){
        double salary = random.nextDouble(3000, maxSalary);
        jobAgency.sendOffer(nameCompany, nameJobs, salary);
    }


}
