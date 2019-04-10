import RentingSystem.reservation.ReservationService;
import RentingSystem.reservation.ReservationServiceBean;

public class RentingSystemMainClass {

    public static void main(String[] args) {
        ReservationService bean = new ReservationServiceBean();
        bean.createParticipant();

    }
}
