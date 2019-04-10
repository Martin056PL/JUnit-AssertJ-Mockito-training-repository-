package RentingSystem.Utils;

import RentingSystem.Exceptions.InvalidDateException;
import RentingSystem.participant.NameExceptions;
import RentingSystem.participant.Sex;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RentingUtils {

    private static final Sex M = Sex.M;
    private static final Sex F = Sex.F;

    public static String insertData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static LocalDate parseStringToLocalDate(String date) {
        return LocalDate.parse(date);
    }

    public static Enum<Sex> setSexByFirstName(String name) {
        if (name.endsWith("a")) {
            List<String> ExceptionNamesList = new LinkedList<>();
            for (Enum enumName : NameExceptions.values()) {
                ExceptionNamesList.add(enumName.toString());
            }
            String firstNameToLowerCase = name.toLowerCase();
            return ExceptionNamesList.contains(firstNameToLowerCase) ? M : F;
        } else return M;
    }

    public static LocalDate getEndReservationDate(LocalDate startReservation) throws InvalidDateException {
        return ifDataIsIncorrectInsertEndReservationDateAgain(startReservation);

    }

    private static LocalDate ifDataIsIncorrectInsertEndReservationDateAgain(LocalDate startReservation) throws InvalidDateException {
        boolean isIncorrect;
        LocalDate endReservationDate;
        do {
            System.out.println("Podaj datę konca rezerwacji");
            endReservationDate = LocalDate.parse(RentingUtils.insertData());
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
