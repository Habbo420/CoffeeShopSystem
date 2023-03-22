package za.ac.cput.interfaces;

import za.ac.cput.domain.Staff;

import java.util.Set;

public interface InterfaceStaffRepository extends InterfaceRepository<Staff, String>{
    public Set<Staff> getAll();


}
