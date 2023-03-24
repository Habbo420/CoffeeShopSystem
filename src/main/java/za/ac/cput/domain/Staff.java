package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;


public class Staff {

    public String name;
    public String lastName;
    public String position;
    public String dateOfBirth;
    public String staffNumber;
    public String staffType;
    public String positionId;
    private String shifts;
    private String experience;
    private double pay;
    private int hours;

    public Staff(String name, String lastName, String position, String dateOfBirth, double pay,
                 int hours, String shifts, String experience, String staffNumber, String staffType, String positionId) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.dateOfBirth = dateOfBirth;
        this.pay = pay;
        this.hours = hours;
        this.shifts = shifts;
        this.experience = experience;
        this.staffNumber = staffNumber;
        this.staffType = staffType;
        this.positionId = positionId;

    }

    public double getPay() {
            return pay;
        }

        public int getHours() {
            return hours;
        }

        public String getShifts() {
            return shifts;
        }

        public String getExperience() {
            return experience;
        }

        public String getStaffNumber() {
            return staffNumber;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPosition() {
            return position;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }
        public String getStaffType(){return staffType;}

    public String getPositionId(){return positionId;}


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Staff staff = (Staff) o;
            return Double.compare(staff.pay, pay) == 0 && hours == staff.hours && Objects.equals(shifts, staff.shifts)
                    && Objects.equals(experience, staff.experience) && Objects.equals(staffNumber, staff.staffNumber)
                    && Objects.equals(name, staff.name) && Objects.equals(lastName, staff.lastName) && Objects.equals(position, staff.position)
                    && Objects.equals(dateOfBirth, staff.dateOfBirth) && Objects.equals(positionId, staff.positionId) && Objects.equals(positionId, staff.positionId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(pay, hours, shifts, experience, staffNumber, name, lastName, position, dateOfBirth, staffType, positionId);
        }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", pay=" + pay +
                ", hours=" + hours +
                ", shifts='" + shifts + '\'' +
                ", experience='" + experience + '\'' +
                ", staffNumber='" + staffNumber + '\'' +
                ", staffType='" + staffType + '\'' +
                ", positionId='" + positionId + '\'' +
                '}';
    }

    public Staff(Builder b){
        this.pay = b.pay;
        this.staffNumber = b.staffNumber;
        this.name = b.name;
        this.lastName = b.lastName;
        this.experience = b.experience;
        this.shifts = b.shifts;
        this.dateOfBirth = b.dateOfBirth;
        this.position = b.position;
        this.hours = b.hours;
        this.staffType = b.staffType;
        this.positionId = b.positionId;
    }

    public static class Builder{
        public String name;
        public String lastName;
        public String dateOfBirth;
        public String position;
        public String staffNumber;
        public String staffType;
        public String positionId;
        private double pay;
        private int hours;
        private String experience;
        private String shifts;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder setStaffNumber(String staffNumber) {
            this.staffNumber = staffNumber;
            return this;
        }

        public Builder setStaffType(String staffType) {
            this.staffType = staffType;
            return this;
        }

        public Builder setPay(double pay) {
            this.pay = pay;
            return this;
        }

        public Builder setHours(int hours) {
            this.hours = hours;
            return this;
        }

        public Builder setpositionId(String positionId) {
            this.positionId = positionId;
            return this;
        }

        public Builder setExperience(String experience) {
            this.experience = experience;
            return this;
        }

        public Builder setShifts(String shifts) {
            this.shifts = shifts;
            return this;
        }


        public Builder copy(Staff staff){
            this.pay = staff.pay;
            this.staffNumber = staff.staffNumber;
            this.name = staff.name;
            this.lastName = staff.lastName;
            this.experience = staff.experience;
            this.shifts = staff.shifts;
            this.dateOfBirth = staff.dateOfBirth;
            this.position = staff.position;
            this.hours = staff.hours;
            this.staffType = staff.staffType;
            this.positionId = staff.positionId;
            return this;
        }

        public Staff build(){
            return new Staff(this);
        }



    }



}



