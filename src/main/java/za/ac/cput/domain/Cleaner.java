package za.ac.cput.domain;

/* Cleaner.java
 Entity for the Cleaner
 Author: Alexander Draai - 220118744
 Date: 22 March 2023
*/


import java.util.Objects;

public class Cleaner {
    String staffNumber ;
    String firstName;
    String lastName;

    private Cleaner(){
    }

    public String getStaffNumber() {return staffNumber;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cleaner cleaner = (Cleaner) o;
        return Objects.equals(staffNumber, cleaner.staffNumber) && Objects.equals(firstName, cleaner.firstName) && Objects.equals(lastName, cleaner.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffNumber, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "staffNumber='" + staffNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    private Cleaner(Builder b){
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
        public Cleaner build(){
           return new Cleaner(this);
        }

    }

}
