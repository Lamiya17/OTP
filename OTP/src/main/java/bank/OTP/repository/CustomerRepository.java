package bank.OTP.repository;

import bank.OTP.entity.Customer;
import org.hibernate.boot.jaxb.mapping.spi.JaxbPluralAttribute;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByFin(String fin);
}
