package TaskDz5JavaOop.geekbrains.presenters;


import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date reservationDate, int tableNo, String name);

    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);


}
