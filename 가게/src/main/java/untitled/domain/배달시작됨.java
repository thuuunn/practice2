package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 배달시작됨 extends AbstractEvent {

    private Long id;

    public 배달시작됨(주문처리 aggregate) {
        super(aggregate);
    }

    public 배달시작됨() {
        super();
    }
}
//>>> DDD / Domain Event
