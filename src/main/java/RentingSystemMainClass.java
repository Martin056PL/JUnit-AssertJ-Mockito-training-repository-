import RentingSystem.Exceptions.InvalidDateException;
import RentingSystem.Utils.RentingUtils;

import java.time.LocalDate;

public class RentingSystemMainClass {

    public static void main(String[] args) throws InvalidDateException {
       // ReservationService bean = new ReservationServiceBean();
        //bean.createParticipant();
        LocalDate date1 = LocalDate.parse("2001-01-01");
        LocalDate date2 = LocalDate.parse("2000-01-02");
        System.out.println(RentingUtils.getEndReservationDate(date1));

    }
}
