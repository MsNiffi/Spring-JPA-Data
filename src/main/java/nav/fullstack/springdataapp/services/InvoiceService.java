package nav.fullstack.springdataapp.services;

import nav.fullstack.springdataapp.repositories.InvoiceRepository;
import nav.fullstack.springdataapp.services.interfaces.ICustomerSpender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public String getHighestSpenderCustomer() {
        ICustomerSpender value = invoiceRepository.findHighestSpenderCustomer();
        return "The customer ID with the highest invoice total is " + value.getCustomerId();
    }
}
