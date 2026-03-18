package bank.OTP.controller;

import bank.OTP.Service.DocumentService;
import bank.OTP.entity.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {
    @Autowired
    DocumentService documentService;

    @PostMapping("/createDocument")
    public Document createDocument (String fin, String name){
        return documentService.createDocument(fin,name);
    }
    @PostMapping("/signDocument")
    public String signDocument(Long id,String otp){
        return documentService.signDocument(id,otp);
    }
}
