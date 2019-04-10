package RentingSystem.reservation;

import RentingSystem.Exceptions.InvalidDateException;
import RentingSystem.participant.Participant;

public interface ReservationService {

    Participant createParticipant() throws InvalidDateException;

}
