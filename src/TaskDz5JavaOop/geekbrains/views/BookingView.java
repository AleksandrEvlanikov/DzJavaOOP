package TaskDz5JavaOop.geekbrains.views;

import TaskDz5JavaOop.geekbrains.models.Table;
import TaskDz5JavaOop.geekbrains.models.TableModel;
import TaskDz5JavaOop.geekbrains.presenters.View;
import TaskDz5JavaOop.geekbrains.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {


    private ViewObserver observer; // наблюдатель

    /**
     * Установить наблюдателя, отслеживающего действия пользователя
     * @param observer наблюдатель
     */
    public void setObserver(ViewObserver observer){
        this.observer = observer;
    }

    public ViewObserver getObserver() {
        return observer;
    }

    private TableModel tableModel;

    public void setTableModel(TableModel tableModel) {
        this.tableModel = tableModel;
    }

    /**
     * Отобразить список всех столиков
     * @param tables столики
     */
    public void showTables(Collection<Table> tables){
        for (Table table: tables) {
            System.out.println(table);
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование
     * столика
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя клиента
     */
    public void reservationTable(Date reservationDate, int tableNo, String name){
        observer.onReservationTable(reservationDate, tableNo, name);
    }

    /**
     * TODO: Доработать метод в рамках домашней работы
     * Действие клиента (пользователь нажал на кнопку изменения бронирования),
     * изменение бронирования столика
     *
     * @param oldReservation  старый номер бронирования
     * @param reservationDate новая дата бронирования
     * @param tableNo         номер столика
     * @param name            имя клиета
     * @return
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        observer.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        return oldReservation;
    }



    /**
     * Отобразить результат бронирования столика
     * @param reservationId номер брони
     */
    public void showChangeReservationTableStatus(int reservationId){
        if (reservationId > 0){
            System.out.printf("Столик успешно забронирован.\nНомер брони: #%d\n", reservationId);
        }
        else {
            System.out.println("Ошибка бронирования столика.\nПовторите попытку позже.");
        }
    }


}
