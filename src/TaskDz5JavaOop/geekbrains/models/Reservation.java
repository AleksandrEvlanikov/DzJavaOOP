package TaskDz5JavaOop.geekbrains.models;

import java.util.Date;

public class Reservation {

    private static int counter = 1000;
    private Date date;
    private String name;

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    private final int id;

    {
        id = ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Reservation.counter = counter;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Reservation(Date date, String name){
        this.date = date;
        this.name = name;
    }


    public void setData(Date data) {
        this.date = data;
    }
}
