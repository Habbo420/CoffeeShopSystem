package za.ac.cput.interfaces;

import za.ac.cput.domain.StaffType;
import java.util.*;
import java.util.Set;

public class StaffTypeRepository implements InterfaceStaffTypeRepository{

private Set<StaffType> staffTypeDB = null;
private static StaffTypeRepository repository = null;

    private StaffTypeRepository(){
        staffTypeDB = new HashSet<StaffType>();
    }

    public static StaffTypeRepository getRepository(){
        if(repository == null){
            repository = new StaffTypeRepository();
        }
        return repository;
    }



    @Override
    public Set<StaffType> getAll() {
        return null;
    }
}
