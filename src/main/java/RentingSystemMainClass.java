import RentingSystem.Exceptions.InvalidDateException;
import RentingSystem.InputOutput.FileInputStream;
import RentingSystem.reservation.ReservationRepository;
import RentingSystem.reservation.ReservationService;
import RentingSystem.reservation.ReservationServiceBean;

import java.io.IOException;


public class RentingSystemMainClass {

    public static void main(String[] args) throws InvalidDateException, IOException {
      // ReservationService bean = new ReservationServiceBean();
       ReservationRepository repository = new ReservationRepository();
        System.out.println(repository.getDefaultParticipantsList());
       // FileInputStream file = new FileInputStream();
       // FileInputStream.readWriteToFile();


    }
}
