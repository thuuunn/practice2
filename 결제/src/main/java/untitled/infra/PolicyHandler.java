package untitled.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    결제Repository 결제Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='주문취소됨'"
    )
    public void whenever주문취소됨_결제취소됨(@Payload 주문취소됨 주문취소됨) {
        주문취소됨 event = 주문취소됨;
        System.out.println(
            "\n\n##### listener 결제취소됨 : " + 주문취소됨 + "\n\n"
        );

        // Sample Logic //
        결제.결제취소됨(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
