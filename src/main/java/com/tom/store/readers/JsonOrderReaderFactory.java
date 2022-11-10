package com.tom.store.readers;




import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.tom.store.entity.Order;
import com.tom.store.entity.Product;

@Component
public class JsonOrderReaderFactory {
	
	
	@Bean
	public JsonItemReader<Order> jsonReader() {
		JsonItemReader<Order> jsonItemReader = new JsonItemReader<Order>();

		
		jsonItemReader.setJsonObjectReader(new JacksonJsonObjectReader<>(Order.class));
		
		
		return jsonItemReader;
		
	}
	
	
	
	
	
}
