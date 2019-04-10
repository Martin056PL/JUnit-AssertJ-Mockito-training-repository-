package RentingSystem.reservation;

import RentingSystem.participant.Participant;

import java.util.Comparator;

public class ParticipantComparatorByFirstName implements Comparator<Participant> {
    @Override
    public int compare(Participant o1, Participant o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
