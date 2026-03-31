package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.domain.결제승인됨;
import untitled.결제Application;

@Entity
@Table(name = "결제_table")
@Data
//<<< DDD / Aggregate Root
public class 결제 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        결제승인됨 결제승인됨 = new 결제승인됨(this);
        결제승인됨.publishAfterCommit();
    }

    public static 결제Repository repository() {
        결제Repository 결제Repository = 결제Application.applicationContext.getBean(
            결제Repository.class
        );
        return 결제Repository;
    }

    //<<< Clean Arch / Port Method
    public static void 결제취소됨(주문취소됨 주문취소됨) {
        //implement business logic here:

        /** Example 1:  new item 
        결제 결제 = new 결제();
        repository().save(결제);

        */

        /** Example 2:  finding and process
        

        repository().findById(주문취소됨.get???()).ifPresent(결제->{
            
            결제 // do something
            repository().save(결제);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
