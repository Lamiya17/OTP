package bank.OTP.Service;

import bank.OTP.entity.Card;
import bank.OTP.entity.Customer;
import bank.OTP.repository.CardRepository;
import bank.OTP.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;
    public Card addCard(Card card){
        return cardRepository.save(card);
    }
    public List<Card>getCards(String custAcNo){
        return cardRepository.findByCustAcNo(custAcNo);
    }
}
