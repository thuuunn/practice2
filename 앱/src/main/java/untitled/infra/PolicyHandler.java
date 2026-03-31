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
    주문Repository 주문Repository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='배달시작됨'"
    )
    public void whenever배달시작됨_주문상태확인(
        @Payload 배달시작됨 배달시작됨
    ) {
        배달시작됨 event = 배달시작됨;
        System.out.println(
            "\n\n##### listener 주문상태확인 : " + 배달시작됨 + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='배달취소됨'"
    )
    public void whenever배달취소됨_주문상태확인(
        @Payload 배달취소됨 배달취소됨
    ) {
        배달취소됨 event = 배달취소됨;
        System.out.println(
            "\n\n##### listener 주문상태확인 : " + 배달취소됨 + "\n\n"
        );
        // Sample Logic //

    }
}
//>>> Clean Arch / Inbound Adaptor
