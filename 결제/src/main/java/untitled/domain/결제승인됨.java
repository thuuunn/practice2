package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class 결제승인됨 extends AbstractEvent {

    private Long id;

    public 결제승인됨(결제 aggregate) {
        super(aggregate);
    }

    public 결제승인됨() {
        super();
    }
}
//>>> DDD / Domain Event
