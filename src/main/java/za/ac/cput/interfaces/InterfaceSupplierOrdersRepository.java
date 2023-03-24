package za.ac.cput.interfaces;
import za.ac.cput.domain.SupplierOrder;

import java.util.Set;
public interface InterfaceSupplierOrdersRepository extends InterfaceRepository<SupplierOrder, String>{
    public Set<SupplierOrder> getAll();
}
