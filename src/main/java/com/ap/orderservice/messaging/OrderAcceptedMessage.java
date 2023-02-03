package com.ap.orderservice.messaging;

public record OrderAcceptedMessage (
        Long orderId
){}
