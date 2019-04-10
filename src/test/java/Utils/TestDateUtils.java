package Utils;

import RentingSystem.Exceptions.InvalidDateException;
import RentingSystem.Utils.DateUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

public class TestDateUtils {

    private LocalDate startDate;
    private LocalDate endDate;

    @Test
    public void shouldReturnFalseForProperDate() throws InvalidDateException {
        startDate = DateUtils.parseStringToLocalDate("2019-04-10");
        endDate = DateUtils.parseStringToLocalDate("2019-05-10");
        Assert.assertFalse(DateUtils.doesReservationDatesAreCorrect(startDate, endDate));
    }
    @Test(expected = InvalidDateException.class)
    public void shouldThrowInvalidDateExceptionForIncorrectDate() throws InvalidDateException {
        startDate = DateUtils.parseStringToLocalDate("2019-04-10");
        endDate = DateUtils.parseStringToLocalDate("2019-03-10");
        Assert.assertTrue(DateUtils.doesReservationDatesAreCorrect(startDate, endDate));
    }
    @Test
    public void shouldReturnFalseForSameDate() throws InvalidDateException {
        startDate = DateUtils.parseStringToLocalDate("2019-04-10");
        endDate = DateUtils.parseStringToLocalDate("2019-04-10");
        Assert.assertFalse(DateUtils.doesReservationDatesAreCorrect(startDate, endDate));
    }
}