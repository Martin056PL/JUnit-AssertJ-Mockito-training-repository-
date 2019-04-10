package RentingSystem.reservation;

import RentingSystem.participant.Participant;
import RentingSystem.Utils.RentingUtils;
import RentingSystem.participant.Sex;

import java.time.LocalDate;

public class ReservationServiceBean implements ReservationService {
    @Override
    public Participant createParticipant() {
        System.out.println("Podaj imię użytkownika: ");
        String firstName = RentingUtils.insertData();
        System.out.println("Podaj nazwisko użytkownika: ");
        String lastName = RentingUtils.insertData();
        System.out.println("Podaj wiek użytkownika");
        Integer age = Integer.parseInt(RentingUtils.insertData());
        System.out.println("Płeć automatycznie dopasowana na podstawie imienia");
        Enum <Sex> sex = RentingUtils.setSexByFirstName(firstName);
        System.out.println("Podaj datę rozpoczącia rezerwacji w formacie yyyy-MM-dd");
        LocalDate startReservation = RentingUtils.parseStringToLocalDate(RentingUtils.insertData());
        System.out.println("Podaj datę zakończenia rezerwacji w foramcie yyyy-MM-dd");
        LocalDate endReservation = RentingUtils.parseStringToLocalDate(RentingUtils.insertData());

        Participant participant = new Participant(firstName,lastName,age,sex,startReservation,endReservation);
        System.out.println(participant.toString());
        return participant;
    }
}
