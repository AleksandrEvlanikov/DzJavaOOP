package ru.geekbrains.lesson7.observer;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     *   добавить новый тип соискателя.
     *   **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *   **.3 Предусмотреть тип вакансии (enum)
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", "Преподаватель", 70000, jobAgency);
        Company google = new Company("Google", "Уборщик", 50000, jobAgency);
        Company google1 = new Company("Google", "Программист Java", 100000, jobAgency);
        Company yandex = new Company("Yandex","Программист Java",120000, jobAgency);

        Master ivanov = new Master("Ivanov");
        Master petrov = new Master("Petrov");
        Student sidorov = new Student("Sidorov");
        Junior Fomaf = new Junior("Fomaf");
        Junior Ortega = new Junior("Ortega");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(Fomaf);
        jobAgency.registerObserver(Ortega);

        for(int i = 0; i < 4; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            google1.needEmployee();
            yandex.needEmployee();
        }

    }

}
