import RentingSystem.Exceptions.InvalidDateException;
import RentingSystem.Utils.DateUtils;
import RentingSystem.reservation.ReservationService;
import RentingSystem.reservation.ReservationServiceBean;

import java.time.LocalDate;

public class RentingSystemMainClass {

    public static void main(String[] args) throws InvalidDateException {
       ReservationService bean = new ReservationServiceBean();
       bean.findParticipantForName();


    }
}
