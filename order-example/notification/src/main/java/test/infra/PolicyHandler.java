package test.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import test.config.kafka.KafkaProcessor;
import test.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCooked_SendNotification(@Payload Cooked cooked) {
        if (!cooked.validate()) return;
        Cooked event = cooked;
        System.out.println(
            "\n\n##### listener SendNotification : " + cooked.toJson() + "\n\n"
        );
        // Sample Logic //

    }


    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverCookingCanceled_SendNotification(
        @Payload CookingCanceled cookingCanceled
    ) {
        if (!cookingCanceled.validate()) return;
        CookingCanceled event = cookingCanceled;
        System.out.println(
            "\n\n##### listener SendNotification : " +
            cookingCanceled.toJson() +
            "\n\n"
        );
        // Sample Logic //

    }
    // keep

}
