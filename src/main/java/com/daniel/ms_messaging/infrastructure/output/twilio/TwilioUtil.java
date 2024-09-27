package com.daniel.ms_messaging.infrastructure.output.twilio;

import com.daniel.ms_messaging.domain.model.OrderMessage;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;

public class TwilioUtil implements ITwilioUtil {

    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.account.token}")
    private String accountToken;

    @Value("${twilio.phonenumber.from}")
    private String fromPhone;


    public String sendSms(OrderMessage orderMessage) {
        Twilio.init(accountSid, accountToken);

        Message message = Message.creator(
                new PhoneNumber(orderMessage.getClientPhoneNumber()),
                new PhoneNumber(fromPhone),
                orderMessage.generateMessage()
        ).create();

        return message.getSid();
    }

}
