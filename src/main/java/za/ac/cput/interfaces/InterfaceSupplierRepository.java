package za.ac.cput.interfaces;
import za.ac.cput.domain.Supplier;

import java.util.Set;
public interface InterfaceSupplierRepository extends InterfaceRepository<Supplier, String>{
    public Set<Supplier> getAll();
}
