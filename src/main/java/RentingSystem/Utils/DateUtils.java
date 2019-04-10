package RentingSystem.Utils;

import RentingSystem.Exceptions.InvalidDateException;

import java.time.LocalDate;

public class DateUtils {
    public static LocalDate getEndReservationDate(LocalDate startReservation) throws InvalidDateException {
        return ifDataIsIncorrectInsertEndReservationDateAgain(startReservation);

    }

    private static LocalDate ifDataIsIncorrectInsertEndReservationDateAgain(LocalDate startReservation) throws InvalidDateException {
        boolean isIncorrect;
        LocalDate endReservationDate;
        do {
            System.out.println("Podaj datę konca rezerwacji");
            endReservationDate = LocalDate.parse(ParticipantUtils.insertData());
            try {
                isIncorrect = doesReservationDatesAreCorrect(startReservation, endReservationDate);
            } catch (InvalidDateException e) {
                System.out.println("Błędna data rezerwacji! (" + e + ")");
                isIncorrect = true;
            }
        } while (isIncorrect);
        return endReservationDate;
    }

    private static boolean doesReservationDatesAreCorrect(LocalDate startReservationDate, LocalDate endReservationDate) throws InvalidDateException {
        boolean startIsAfterEnd = startReservationDate.isAfter(endReservationDate);
        boolean endIsBeforeStart = endReservationDate.isBefore(startReservationDate);
        if (startIsAfterEnd || endIsBeforeStart) {
            throw new InvalidDateException();
        } else return false;
    }
}