package com.AnnasWeb.demo.Rest.RequestBody;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.logging.Logger;

@Controller
public class PaymentController1 {

    Logger logger = Logger.getLogger(PaymentController1.class.getName());

    @PostMapping("/pay")
    public ResponseEntity<PaymentDetails> pay(@RequestBody PaymentDetails paymentDetails){
        logger.info("Amount: " + paymentDetails.getAmount());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
