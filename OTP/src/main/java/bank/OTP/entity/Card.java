package bank.OTP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String custAcNo;
    private String cardNo;
    private String cardProduct;
    private String nameOnCard;
    private int cardBalannce;
    public Long getId(){
        return id;
    }
    public String getCustAcNo(){
        return custAcNo;
    }
    public String getCardNo(){
        return cardNo;
    }
    public String getCardProduct(){
        return cardProduct;
    }
    public String getNameOnCard(){
        return nameOnCard;
    }
    public int getCardBalannce(){
        return cardBalannce;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustAcNo(String custAcNo) {
        this.custAcNo = custAcNo;
    }
    public void setCardNo(String cardNo){
        this.cardNo=cardNo;
    }
    public void setCardProduct(String cardProduct){
        this.cardProduct=cardProduct;
    }
    public void setNameOnCard(String nameOnCard){
        this.nameOnCard=nameOnCard;
    }
    public void setCardBalannce(int cardBalannce){
        this.cardBalannce=cardBalannce;
    }
}
