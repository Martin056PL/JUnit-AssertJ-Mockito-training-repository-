package RentingSystem.reservation;

import RentingSystem.Exceptions.InvalidDateException;
import RentingSystem.participant.Participant;

import java.util.List;

public interface ReservationService {

    Participant createParticipant() throws InvalidDateException;
    List<Participant> findParticipantForName();

}
