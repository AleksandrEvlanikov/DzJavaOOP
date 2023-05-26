package ru.geekbrains.lesson7.observer;

public interface Publisher {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendOffer(String nameCompany, String nameJobs, double salary);
}
