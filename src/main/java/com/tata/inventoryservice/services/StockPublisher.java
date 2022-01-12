package com.tata.inventoryservice.services;


import com.tata.inventoryservice.facades.InventoryStreams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;


@Service
public class StockPublisher {
	private final InventoryStreams inventoryStreams;
	   @Autowired
		private StockService stockService;
	public StockPublisher(InventoryStreams inventoryStreams)
	{
		this.inventoryStreams=inventoryStreams;
	}
	public boolean sendStockDetails(long productId)
	{
		//JPA code
		//skeleton
		//Notification
		MessageChannel messageChannel = inventoryStreams.outboundInventory();
	       return  messageChannel.send(MessageBuilder
	                .withPayload(stockService.getAllStocksAboveBufferLevel(productId))
	                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
	                .build());

		
	}
	

}
