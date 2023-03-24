package za.ac.cput.interfaces;
import za.ac.cput.domain.Supplier;

import java.util.HashSet;
import java.util.Set;

public class SupplierRepository implements InterfaceSupplierRepository {
    private Set<Supplier> supplierDB = null;
    private static SupplierRepository repository = null;
    private SupplierRepository(){
        supplierDB = new HashSet<Supplier>();
    }

    public static SupplierRepository getRepository(){
        if (repository == null){
            repository = new SupplierRepository();
        }
        return repository;
    }

    @Override
    public Supplier create(Supplier supplier) {
        return null;
    }

    @Override
    public Supplier read(String s) {
        return null;
    }

    @Override
    public Supplier update(Supplier supplier) {
        return null;
    }

    @Override
    public Supplier delete(Supplier supplier) {
        return null;
    }

    @Override
    public Set<Supplier> getAll() {
        return null;
    }

}
