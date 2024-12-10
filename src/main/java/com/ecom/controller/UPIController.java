package com.ecom.controller;
import com.ecom.service.impl.QRCodeGeneratorService;
import com.google.zxing.WriterException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/upi")
public class UPIController {

    @Autowired
    private QRCodeGeneratorService qrCodeGeneratorService;

    @GetMapping("/generate-qr")
    public ResponseEntity<byte[]> generateQRCode(
            @RequestParam String upiId,
            @RequestParam String name,
            @RequestParam double amount
    ) {
        try {
            byte[] qrCode = qrCodeGeneratorService.generateUPIQRCode(upiId, name, amount);

            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Type", "image/png");

            return new ResponseEntity<>(qrCode, headers, HttpStatus.OK);
        } catch (WriterException | IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
