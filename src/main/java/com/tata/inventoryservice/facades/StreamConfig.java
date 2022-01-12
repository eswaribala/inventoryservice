package com.tata.inventoryservice.facades;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(InventoryStreams.class)
public class StreamConfig {
}
