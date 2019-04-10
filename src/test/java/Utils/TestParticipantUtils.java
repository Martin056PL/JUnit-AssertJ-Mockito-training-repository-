package Utils;

import RentingSystem.Utils.ParticipantUtils;
import RentingSystem.participant.Participant;
import RentingSystem.participant.Sex;
import RentingSystem.reservation.ReservationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TestParticipantUtils {

    private ReservationRepository repository;


    @Before
    public void loadParticipantsList(){
        repository = new ReservationRepository();
    }

    @Test
    public void shouldCheckIsNotNull(){
        List<Participant> participantList = repository.getDefaultParticipantsList();
        Assert.assertNotNull(participantList);
    }

    @Test
    public void shouldReturnMForNameKrzysztof(){
        Assert.assertEquals(Sex.M,ParticipantUtils.setSexByFirstName("Krzysztof"));
    }
    @Test
    public void shouldReturnMForNameKosma(){
        Assert.assertEquals(Sex.M,ParticipantUtils.setSexByFirstName("Kosma"));
    }
    @Test
    public void shouldReturnMForNameAgnieszka(){
        Assert.assertEquals(Sex.F,ParticipantUtils.setSexByFirstName("Agnieszka"));
    }
    @Test
    public void shouldReturnMForNameJarema(){
        Assert.assertEquals(Sex.M,ParticipantUtils.setSexByFirstName("Jarema"));
    }

}
