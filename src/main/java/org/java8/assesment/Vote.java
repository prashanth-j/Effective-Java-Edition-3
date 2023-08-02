package org.java8.assesment;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Vote {

    private String candidate;
    private Integer points;
}
