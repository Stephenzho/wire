package io.netty.example.study.common.order;

import io.netty.example.study.common.OperationResult;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderOperationResult extends OperationResult {

    private final int tableId;
    private final String dish;
    private final boolean complete;

}
