package RentingSystem.reservation;

import RentingSystem.Exceptions.InvalidDateException;
import RentingSystem.Utils.DateUtils;
import RentingSystem.participant.Participant;
import RentingSystem.Utils.ParticipantUtils;
import RentingSystem.participant.Sex;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class ReservationServiceBean implements ReservationService {

    @Override
    public Participant createParticipant() throws InvalidDateException {
        System.out.println("Podaj imię użytkownika: ");
        String firstName = ParticipantUtils.insertData();
        System.out.println("Podaj nazwisko użytkownika: ");
        String lastName = ParticipantUtils.insertData();
        System.out.println("Podaj wiek użytkownika");
        Integer age = Integer.parseInt(ParticipantUtils.insertData());
        System.out.println("Płeć automatycznie dopasowana na podstawie imienia");
        Enum<Sex> sex = ParticipantUtils.setSexByFirstName(firstName);
        System.out.println("Podaj datę rozpoczącia rezerwacji w formacie yyyy-MM-dd");
        LocalDate startReservation = ParticipantUtils.parseStringToLocalDate(ParticipantUtils.insertData());
        System.out.println("Podaj datę zakończenia rezerwacji w foramcie yyyy-MM-dd");
        LocalDate endReservation = DateUtils.getEndReservationDate(startReservation);

        Participant participant = new Participant(firstName, lastName, age, sex, startReservation, endReservation);
        System.out.println(participant.toString());
        return participant;
    }

    @Override
    public List<Participant> findParticipantForFirstName() {
        System.out.println("Wpisz imię po którym mam wyszukać rezerwacje: ");
        String name = ParticipantUtils.insertData();
        ReservationRepository repository = new ReservationRepository();
        List<Participant> allParticipantRepository = repository.getDefaultParticipantsList();
        List<Participant> selectedParticipantRepository = new LinkedList<>();
        for (Participant participant : allParticipantRepository) {
            if (participant.getFirstName().equals(name)) {
                selectedParticipantRepository.add(participant);
            }
        }
        if (selectedParticipantRepository.isEmpty()) {
            System.out.println("Nie ma takich użytkowników!");
        }
        ParticipantComparatorByLastName comparator = new ParticipantComparatorByLastName();
        selectedParticipantRepository.sort(comparator);
        for (Participant participant : selectedParticipantRepository) {
            System.out.println(participant);
        }
        return selectedParticipantRepository;
    }
}
