package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.domain.배달시작됨;
import untitled.domain.배달취소됨;
import untitled.가게Application;

@Entity
@Table(name = "주문처리_table")
@Data
//<<< DDD / Aggregate Root
public class 주문처리 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();

        배달취소됨 배달취소됨 = new 배달취소됨(this);
        배달취소됨.publishAfterCommit();
    }

    public static 주문처리Repository repository() {
        주문처리Repository 주문처리Repository = 가게Application.applicationContext.getBean(
            주문처리Repository.class
        );
        return 주문처리Repository;
    }

    //<<< Clean Arch / Port Method
    public static void 요리시작(결제승인됨 결제승인됨) {
        //implement business logic here:

        /** Example 1:  new item 
        주문처리 주문처리 = new 주문처리();
        repository().save(주문처리);

        */

        /** Example 2:  finding and process
        

        repository().findById(결제승인됨.get???()).ifPresent(주문처리->{
            
            주문처리 // do something
            repository().save(주문처리);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void 배달취소(주문취소됨 주문취소됨) {
        //implement business logic here:

        /** Example 1:  new item 
        주문처리 주문처리 = new 주문처리();
        repository().save(주문처리);

        */

        /** Example 2:  finding and process
        

        repository().findById(주문취소됨.get???()).ifPresent(주문처리->{
            
            주문처리 // do something
            repository().save(주문처리);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
