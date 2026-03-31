package untitled.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import lombok.Data;
import untitled.domain.주문됨;
import untitled.domain.주문취소됨;
import untitled.앱Application;

@Entity
@Table(name = "주문_table")
@Data
//<<< DDD / Aggregate Root
public class 주문 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        주문됨 주문됨 = new 주문됨(this);
        주문됨.publishAfterCommit();

        주문취소됨 주문취소됨 = new 주문취소됨(this);
        주문취소됨.publishAfterCommit();
    }

    public static 주문Repository repository() {
        주문Repository 주문Repository = 앱Application.applicationContext.getBean(
            주문Repository.class
        );
        return 주문Repository;
    }
}
//>>> DDD / Aggregate Root
