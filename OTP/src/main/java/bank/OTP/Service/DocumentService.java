package bank.OTP.Service;

import bank.OTP.entity.Customer;
import bank.OTP.entity.Document;
import bank.OTP.repository.CustomerRepository;
import bank.OTP.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;

@Service
public class DocumentService {
@Autowired
    DocumentRepository documentRepository;
@Autowired
    CustomerRepository customerRepository;
public Document createDocument(String fin, String name){
    Document doc =new Document();
    doc.setDocumentName(name);
    doc.setFin(fin);
    doc.setSigned(false);
    return documentRepository.save(doc);
}
public String signDocument(Long docId, String otp){
    Document doc = documentRepository.findById(docId).orElse(null);
    if(doc==null){
        return "document not found";
    }
    Customer c = customerRepository.findByFin(doc.getFin());

    if(c==null){
        return "Customer not found";
    }
    if(!c.getOtp().equals(otp)){
        return "OTP incorrect";
    }
    doc.setSigned(true);
    documentRepository.save(doc);
    return "document signed";

}




}
