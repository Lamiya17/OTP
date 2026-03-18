package bank.OTP.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fin;
    private String mobile;
    private String otp;
    private String pin;
    public long getId(){
        return id;
    }
    public String getFin(){
        return fin;
    }
    public String getMobile(){
        return mobile;
    }
    public String getOtp(){
        return otp;
    }
    public String getPin(){
        return pin;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public void setMobile(String mobile) {
            this.mobile = mobile;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
