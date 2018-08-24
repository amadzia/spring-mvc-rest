package com.example.springmvcrest.bootstrap;

import com.example.springmvcrest.domain.Customer;
import com.example.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Loading Customer Data");

        Customer customer1 = new Customer();
        customer1.setFirstName("Ann");
        customer1.setLastName("Kowal");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("John");
        customer2.setLastName("Doe");
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setFirstName("Mark");
        customer3.setLastName("Swan");
        customerRepository.save(customer3);

        System.out.println("number of saved customers: " + customerRepository.count());
    }
}
