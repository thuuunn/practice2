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
    주문처리Repository 주문처리Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='결제승인됨'"
    )
    public void whenever결제승인됨_요리시작(@Payload 결제승인됨 결제승인됨) {
        결제승인됨 event = 결제승인됨;
        System.out.println(
            "\n\n##### listener 요리시작 : " + 결제승인됨 + "\n\n"
        );

        // Sample Logic //
        주문처리.요리시작(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='주문취소됨'"
    )
    public void whenever주문취소됨_배달취소(@Payload 주문취소됨 주문취소됨) {
        주문취소됨 event = 주문취소됨;
        System.out.println(
            "\n\n##### listener 배달취소 : " + 주문취소됨 + "\n\n"
        );

        // Sample Logic //
        주문처리.배달취소(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
