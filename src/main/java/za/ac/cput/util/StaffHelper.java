package za.ac.cput.util;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.regex.Pattern;


public class StaffHelper {

    public static boolean isNullOrEmpty(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isValidBirthDate(String dateOfBirth){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        dateFormat.setLenient(false);

        try{
            Date bDay = dateFormat.parse(dateOfBirth);
            Date currentDate = new Date();
            if(bDay.after(currentDate)) {
                return false;
            }
        }catch (ParseException e){
            return false;
        }
        return true;
    }


    public static boolean isValidHours(String hours){
        Pattern pattern = Pattern.compile(".*\\d.*");
        return true;
    }





    public static String generateId(){
        return UUID.randomUUID().toString();
    }

}
