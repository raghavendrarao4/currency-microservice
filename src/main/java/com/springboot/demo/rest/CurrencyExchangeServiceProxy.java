package com.springboot.demo.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.demo.service.CurrencyConversionBean;

@FeignClient(name="forex-service", url="localhost:8008")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	  public CurrencyConversionBean retrieveExchangeValue
	    (@PathVariable("from") String from, @PathVariable("to") String to);
}
