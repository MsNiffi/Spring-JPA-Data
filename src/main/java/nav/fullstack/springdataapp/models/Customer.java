package nav.fullstack.springdataapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity()
//@Getter @Setter
public class Customer {

    @Id
    @Column(nullable = false)
    private int customerId;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(length = 40, nullable = false)
    private String firstName;

    @Column(length = 20, nullable = false)
    private String lastName;

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(length = 40)
    private String country;

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Column(length = 10)
    private String postalCode;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(length = 24)
    private String phone;

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(length = 60, nullable = false)
    private String email;

    public Customer() {
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + customerId + " " + postalCode + " " + country + " " + phone + " " + email;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

