package customerManager.service;

import customerManager.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerImpl implements CustomerService {
    private static Map<Integer, Customer> customers;
    static {
        customers = new HashMap<>();
        customers.put(1,new Customer(1,"Hiếu","hieu@codegym.vn","Nghệ An"));
        customers.put(2,new Customer(2,"Trung","trung@codegym.vn","Hà Nội"));
        customers.put(3,new Customer(3,"Huân","huan@codegym.vn","Hà Nội"));
        customers.put(4,new Customer(4,"Lực","luc@codegym.vn","Thanh Hoá"));
        customers.put(5,new Customer(5,"Vinh","vinh@codegym.vn","Hoà Bình"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
