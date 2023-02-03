package com.ap.orderservice.messaging;

public record OrderDispatchedMessage (
        Long orderId
){}
