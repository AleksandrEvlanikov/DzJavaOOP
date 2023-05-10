package TaskDz5JavaOop.geekbrains;


import TaskDz5JavaOop.geekbrains.models.Reservation;
import TaskDz5JavaOop.geekbrains.models.Table;
import TaskDz5JavaOop.geekbrains.models.TableModel;
import TaskDz5JavaOop.geekbrains.presenters.BookingPresenter;
import TaskDz5JavaOop.geekbrains.views.BookingView;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Date;

public class Main {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        BookingView view = new BookingView();
        TableModel model = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.loadTables();
        bookingPresenter.updateView();


        view.reservationTable(new Date(2023, 4, 9, 17, 30), 4, "Александр");
        view.reservationTable(new Date(2023, 4, 12, 19, 00), 5, "Ирина");
        view.reservationTable(new Date(2023, 4, 9, 18, 00), 2, "Станислав");


        try {
            FileWriter writer = new FileWriter("Booking.txt");
            Collection<Table> tables = model.loadTables();



            for (Table table : tables) {
                writer.write("Столик #" + table.getNo() + "\n");
                for (Reservation reservation : table.getReservations()) {
                    writer.write("Бронь #" + reservation.getId() + "/"
                            + reservation.getName() + "/" + reservation.getDate() + "\n" );
                }
                writer.write("\n");

            }
            writer.write("----------------------------------------------------" + "\n");
            writer.close();
            System.out.println("Запись успешно выполнена.*");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        view.changeReservationTable(1003, new Date(), 2, "Станислав");
//        view.changeReservationTable(1001, new Date(), 4, "Александр");

        System.out.println("------------------------------------");
        int reservationId = view.changeReservationTable(1002, new Date(2023, 4, 12, 20, 00), 5, "Расул");

        if (reservationId > 0) {
            try {
                FileWriter writer = new FileWriter("Booking.txt", true);
                Collection<Table> tables = model.loadTables();

                for (Table table : tables) {
                    for (Reservation reservation : table.getReservations()) {
                        if (reservation.getId() == reservationId) {
                            writer.write("Обновление брони." + "\n");
                            writer.write("Столик #" + table.getNo() + "\n");
                            writer.write("Бронь #" + reservation.getId() + "/"
                                    + reservation.getName() + "/" + reservation.getDate() + "\n");
                            writer.write("\n");
                        }
                    }
                }

                writer.close();
                System.out.println("Бронь успешно обновлена.**");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Ошибка изменения брони.");
        }


    }

}