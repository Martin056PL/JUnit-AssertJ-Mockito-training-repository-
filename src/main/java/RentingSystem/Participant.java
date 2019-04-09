package RentingSystem;

import java.time.LocalDate;
import java.util.Objects;

public class Participant {

    private String firstName;
    private String lastName;
    private Integer age;
    private Enum<Sex> sex;
    private LocalDate startReservation;
    private LocalDate endReservation;

    public Participant(String firstName, String lastName,Integer age, Enum<Sex> sex, LocalDate startReservation, LocalDate endReservation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.startReservation = startReservation;
        this.endReservation = endReservation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Enum<Sex> getSex() {
        return sex;
    }

    public LocalDate getStartReservation() {
        return startReservation;
    }

    public LocalDate getEndReservation() {
        return endReservation;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        if(age<=0) throw new IllegalArgumentException();
        else this.age = age;
    }

    public void setSex(Enum<Sex> sex) {
        this.sex = sex;
    }

    public void setStartReservation(LocalDate startReservation) {
        this.startReservation = startReservation;
    }

    public void setEndReservation(LocalDate endReservation) {
        this.endReservation = endReservation;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", startReservation=" + startReservation +
                ", endReservation=" + endReservation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(age, that.age) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(startReservation, that.startReservation) &&
                Objects.equals(endReservation, that.endReservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, sex, startReservation, endReservation);
    }
}
