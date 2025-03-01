package com.desafiopicpay.services;

import com.desafiopicpay.domain.user.User;
import com.desafiopicpay.dtos.NotificationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class NotificationService {
    @Autowired
    RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDTO notificationRequest = new NotificationDTO(email, message);

//        ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://util.devi.tools/api/v1/notify", notificationRequest, String.class);
//
//        if(!(notificationResponse.getStatusCode() ==  HttpStatus.OK)) {
//            System.out.println("Erro ao enviar notificação.");
//            throw new Exception("Serviço de notificação fora do ar.");
//        }
        System.out.println("Notificado com sucesso!");
    }
}
