package com.scu275.invoicemanagement.controller;

import com.scu275.invoicemanagement.common.result.Result;
import com.scu275.invoicemanagement.dto.CustomerDto;
import com.scu275.invoicemanagement.dto.InvoiceDto;
import com.scu275.invoicemanagement.entity.Customer;
import com.scu275.invoicemanagement.entity.CustomerRepository;
import com.scu275.invoicemanagement.service.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/")
    @Operation(summary = "create customer", description = "create an invoice ")
    public Result<String> createCustomer(@RequestBody CustomerDto customerDto) {
        return customerService.createCustomer(customerDto);
    }

    @GetMapping("/")
    @Operation(summary = "get all customers", description = "get customers")
    public List<Customer> getCustomers(){
        return customerService.getAll();
    }
}
