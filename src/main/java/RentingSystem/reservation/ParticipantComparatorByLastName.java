package RentingSystem.reservation;

import RentingSystem.participant.Participant;

import java.util.Comparator;

public class ParticipantComparatorByLastName implements Comparator<Participant> {
    @Override
    public int compare(Participant o1, Participant o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
