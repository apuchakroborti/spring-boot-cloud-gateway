package com.apu.microservices.cloudgateway.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/employee-fallback")
    public Mono<String> employeeServiceFallback(){
        return Mono.just("Employee Service is taking too long to respond or is down. Please try again later");
    }

    @RequestMapping("/payslip-fallback")
    public Mono<String> payslipServiceFallback(){
        return Mono.just("Payslip Service is taking too long to respond or is down. Please try again later");
    }

    @RequestMapping("/provident-fund-fallback")
    public Mono<String> providentFundServiceFallback(){
        return Mono.just("Provident Fund Service is taking too long to respond or is down. Please try again later");
    }

    @RequestMapping("/tax-fallback")
    public Mono<String> taxServiceFallback(){
        return Mono.just("Tax Service is taking too long to respond or is down. Please try again later");
    }
}
