package com.borrowhut.ws;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import com.borrowhut.ws.contoller.Home;
import com.borrowhut.ws.contoller.ProductController;
import com.borrowhut.ws.contoller.ProductListingController;
import com.borrowhut.ws.contoller.UiCardController;


@Configuration
public class jerseyConfig extends ResourceConfig {
	
	
	public jerseyConfig()
	{
		packages("com.borrowhut.ws.exception");
		register(Home.class);
		register(ProductListingController.class);
		register(UiCardController.class);
		register(ProductController.class);
		
	}
	
	
}