package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Worded extends AbstractEvent {

    private Long id;

    public Worded(World aggregate) {
        super(aggregate);
    }

    public Worded() {
        super();
    }
}
