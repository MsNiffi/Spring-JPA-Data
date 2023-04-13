package nav.fullstack.springdataapp.repositories;

import nav.fullstack.springdataapp.models.CustomerSpender;
import nav.fullstack.springdataapp.services.interfaces.ICustomerSpender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<CustomerSpender, Integer> {

    // Find the customer with the highest sum invoice total
    @Query(value = """
            SELECT customer_id as customerId, SUM(total) as totalInvoice
            FROM invoice
            GROUP BY customer_id
            ORDER BY totalInvoice DESC
            LIMIT 1""", nativeQuery = true)
    ICustomerSpender findHighestSpenderCustomer();
}
