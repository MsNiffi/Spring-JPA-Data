package nav.fullstack.springdataapp.services;

import nav.fullstack.springdataapp.models.Customer;
import nav.fullstack.springdataapp.repositories.CustomerRepository;
import nav.fullstack.springdataapp.services.interfaces.ICustomerGenre;
import nav.fullstack.springdataapp.services.interfaces.IHighestCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository
    ) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> readAllTheCustomers() {
        return customerRepository.findAll();
    }

    public Optional<Customer> getCustomerById(int customerId) {
        return customerRepository.findByCustomerId(customerId);
    }

    public List<Customer> getCustomerByName(String firstName, String lastName) {
        List<Customer> value = customerRepository.findByFirstNameOrLastNameContainingIgnoreCase(firstName, lastName);
        return value;
    }

    public Set<Customer> getCustomersOffsetLimit(int o, int l) {
        return customerRepository.getSetOfCustomersUsingOffsetAndLimit(o, l);
    }

    public Customer addCustomer(int customerId, String fName, String lastName, String country, String postalCode, String phone, String email) {
        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setFirstName(fName);
        customer.setLastName(lastName);
        customer.setCountry(country);
        customer.setPostalCode(postalCode);
        customer.setPhone(phone);
        customer.setEmail(email);
        customerRepository.save(customer);
        return customer;
    }

    public Boolean updateCustomerPhone(int customerId, String phone) {
        Customer customer = customerRepository.findById(customerId).get();
        customer.setPhone(phone);
        customerRepository.save(customer);
        return true;
    }

    public String getCountryWithMostCustomers() {
        IHighestCountry value = customerRepository.countryWithMostCustomers();
        return "The country with the highest amount of customers is " + value.getHighestCountry();
    }

    public List<String> getFavoriteGenre(int id) {
        ICustomerGenre value = customerRepository.getCustomerFavoriteGenre(id);
        return value.getGenreName();
    }
}
