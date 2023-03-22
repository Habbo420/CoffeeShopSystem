package za.ac.cput.factory;

import za.ac.cput.domain.Staff;
import za.ac.cput.util.StaffHelper;



public class StaffFactory {

    public static Staff buildStaff(String name, String lastName, String dateOfBirth){
        if(StaffHelper.isNullOrEmpty(name) || StaffHelper.isNullOrEmpty(lastName)){
            return null;
        }

        if (!StaffHelper.isValidBirthDate(dateOfBirth)){
            return null;
        }

        String staffNumber = StaffHelper.generateId();


        return new Staff.Builder().setStaffNumber(staffNumber)
                .setName(name)
                .setLastName(lastName)
                .setDateOfBirth(dateOfBirth)
                .build();


    }





}
