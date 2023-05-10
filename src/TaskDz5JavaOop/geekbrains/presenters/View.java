package TaskDz5JavaOop.geekbrains.presenters;

import TaskDz5JavaOop.geekbrains.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    /**
     * Отобразить список всех столиков
     * @param tables столики
     */
    void showTables(Collection<Table> tables);

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    void showChangeReservationTableStatus(int reservationId);

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);


}
