package bank.OTP.controller;

import bank.OTP.Service.CardService;
import bank.OTP.Service.CustomerService;
import bank.OTP.entity.Card;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CardService cardService;
    @PostMapping("/sendOTP")
    public String sendOTP(String fin, String mobile,String otp){
        return customerService.sendOtp(fin,mobile,otp);
    }
    @PostMapping("/verifyotp")
    public String verifyOTP(String fin, String otp){
        return customerService.verifyOTP(fin,otp);
    }
    @PostMapping("/savepin")
    public String savePin(String fin, String pin){
        return customerService.savePin(fin, pin);
    }
    @PostMapping("/addcard")
    public Card addCard(Card card){
       return cardService.addCard(card);
    }
    @GetMapping("/getcard")
    public List<Card>getCard(String custAcNo){
        return cardService.getCards(custAcNo);
    }

}
