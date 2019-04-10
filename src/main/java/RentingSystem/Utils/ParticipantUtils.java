package RentingSystem.Utils;

import RentingSystem.participant.NameExceptions;
import RentingSystem.participant.Sex;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ParticipantUtils {

    private static final Sex M = Sex.M;
    private static final Sex F = Sex.F;

    public static String insertData() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
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

}
