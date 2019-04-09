package RentingSystem;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ReservationRepository {

    public List<Participant> getParticipantsList() {
        return defaultParticipants();
    }

    private List<Participant> defaultParticipants() {
        List<Participant> participantList = new LinkedList<>();
        Participant participant1 = new Participant("Marek", "Darek",
                30, Sex.MALE, LocalDate.now(), LocalDate.now().plusDays(3));
        Participant participant2 = new Participant("Krzyś", "Nowak",
                18, Sex.MALE, LocalDate.of(2019, 3, 21), LocalDate.now());
        Participant participant3 = new Participant("Maria", "Kowalska",
                40, Sex.FEMALE, LocalDate.of(2019, 4, 9), LocalDate.of(2019, 4, 15));
        participantList.add(participant1);
        participantList.add(participant2);
        participantList.add(participant3);
        return participantList;
    }
}
