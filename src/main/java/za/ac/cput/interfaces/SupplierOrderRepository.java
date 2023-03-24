package za.ac.cput.interfaces;
import za.ac.cput.domain.SupplierOrder;

import java.util.HashSet;
import java.util.Set;

public class SupplierOrderRepository implements InterfaceSupplierOrdersRepository{
    private Set<SupplierOrder> supplierOrderDB = null;
    private static SupplierOrderRepository repository = null;
    private SupplierOrderRepository(){
        supplierOrderDB = new HashSet<SupplierOrder>();
    }

    public static SupplierOrderRepository getRepository(){
        if (repository == null){
            repository = new SupplierOrderRepository();
        }
        return repository;
    }

    @Override
    public SupplierOrder create(SupplierOrder supplier) {
        return null;
    }

    @Override
    public SupplierOrder read(String s) {
        return null;
    }

    @Override
    public SupplierOrder update(SupplierOrder supplier) {
        return null;
    }

    @Override
    public SupplierOrder delete(SupplierOrder supplier) {
        return null;
    }

    @Override
    public Set<SupplierOrder> getAll() {
        return null;
    }
}
