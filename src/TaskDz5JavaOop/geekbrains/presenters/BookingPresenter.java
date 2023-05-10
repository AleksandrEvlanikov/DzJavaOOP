package TaskDz5JavaOop.geekbrains.presenters;

import TaskDz5JavaOop.geekbrains.models.Reservation;
import TaskDz5JavaOop.geekbrains.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private Collection<Table> tables;

    private final Model model;
    private final View view;
    private Reservation oldReservation;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }

    /**
     * Получение списка всех столиков
     */
    public void loadTables(){
        tables = model.loadTables();
    }

    /**
     * Отобразить список всех столиков
     */
    public void updateView(){
        view.showTables(tables);
    }

//    public void updateReservationTableStatus(int reservationId){
//        view.showReservationTableStatus(reservationId);
//    }

    @Override
    public void onReservationTable(Date reservationDate, int tableNo, String name) {
        if (reservationDate == null) {
            if (oldReservation != null) {
                int reservationId = model.changeReservationTable(oldReservation.getId(), reservationDate, tableNo, name);
                updateChangeReservationTableStatus(reservationId);
            }
        } else {
            int reservationId = model.reservationTable(reservationDate, tableNo, name);
            updateChangeReservationTableStatus(reservationId);
        }
    }
    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int reservationId = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        updateChangeReservationTableStatus(reservationId);
    }




    public void updateChangeReservationTableStatus(int reservationId) {
        view.showChangeReservationTableStatus(reservationId);
    }




}
