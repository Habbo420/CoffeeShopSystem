package za.ac.cput.domain;

import java.util.Objects;

/* Barista.java
 Entity for the Barista
 Author: Alexander Draai - 220118744
 Date: 22 March 2023
*/


public class Barista {

    String staffNumber ;
    String firstName;
    String lastName;

    private Barista(){

    }

    public String getStaffNumber() {return staffNumber;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Barista barista = (Barista) o;
        return Objects.equals(staffNumber, barista.staffNumber) && Objects.equals(firstName, barista.firstName) && Objects.equals(lastName, barista.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffNumber, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Barista{" +
                "staffNumber='" + staffNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    private Barista(Builder b){
        this.staffNumber = b.staffNumber;
        this.firstName = b.firstName;
        this.lastName = b.lastName;
    }
    public static class Builder{
        private String staffNumber ;
        private String firstName;
        private String lastName;
        public Builder setStaffNumber(String staffNumber) {
            this.staffNumber = staffNumber;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder copy(Cleaner cleaner){
            this.staffNumber = cleaner.staffNumber;
            this.firstName = cleaner.firstName;
            this.lastName = cleaner.lastName;
            return this;
        }
        public Barista build(){
            return new Barista(this);
        }
    }

}
