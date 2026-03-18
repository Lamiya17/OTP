package bank.OTP.Service;

import bank.OTP.entity.Customer;
import bank.OTP.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public String sendOtp(String fin, String mobile,String otp){
        Customer c= customerRepository.findByFin(fin);
        if(c==null){
            c=new Customer();
            c.setFin(fin);
            c.setMobile(mobile);
        }
        c.setOtp(otp);
        customerRepository.save(c);
        return "OTP sent";
    }
public String verifyOTP(String fin, String otp){
        Customer c= customerRepository.findByFin(fin);
        if(c.getOtp().equals(otp)){
            return "ok";
        }
        return "wrong otp";
}

public String savePin(String fin, String pin){
        Customer c= customerRepository.findByFin(fin);
        c.setPin(pin);
        customerRepository.save(c);
        return "PIN saved";
}

}
