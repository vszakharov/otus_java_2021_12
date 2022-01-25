package homework;

import java.util.Deque;
import java.util.LinkedList;

public class CustomerReverseOrder {
    private final Deque<Customer> deque = new LinkedList<>();

    public void add(Customer customer) {
        deque.push(customer);
    }

    public Customer take() {
        return deque.pop();
    }
}
