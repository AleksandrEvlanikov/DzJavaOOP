package ru.geekbrains.lesson7.observer;

public interface Observer {
    boolean hasJavaSkills();
    void receiveOffer(String nameCompany, String nameJobs, boolean knowledgeJava, double salary);

}
