package RentingSystem.reservation;

import RentingSystem.participant.Participant;
import RentingSystem.participant.Sex;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ReservationRepository {

    public List<Participant> getDefaultParticipantsList() {
        return defaultParticipantsList();
    }

    private List<Participant> defaultParticipantsList() {
        List<Participant> participantList = new LinkedList<>();
        Participant participant1 = new Participant("Marek", "Darek",
                30, Sex.M, LocalDate.now(), LocalDate.now().plusDays(3));
        Participant participant2 = new Participant("Krzyś", "Nowak",
                18, Sex.M, LocalDate.of(2019, 3, 21), LocalDate.now());
        Participant participant3 = new Participant("Maria", "Kowalska",
                40, Sex.F, LocalDate.of(2019, 4, 9), LocalDate.of(2019, 4, 15));
        Participant participant4 = new Participant("Maria", "Wolska",
                40, Sex.F, LocalDate.of(2019, 4, 9), LocalDate.of(2019, 4, 15));
        Participant participant5 = new Participant("Maria", "Banach",
                40, Sex.F, LocalDate.of(2019, 4, 9), LocalDate.of(2019, 4, 15));
        participantList.add(participant1);
        participantList.add(participant2);
        participantList.add(participant3);
        participantList.add(participant4);
        participantList.add(participant5);
        return participantList;
    }
    /*public List<Participant> loadParticipantListFromFile(){
        List<Participant> participantsList = new LinkedList<>();
        for (Participant participant : participantsList) {

        }
    }*/

}
