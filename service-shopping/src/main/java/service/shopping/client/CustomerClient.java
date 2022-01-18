package service.shopping.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.shopping.model.Customer;


@FeignClient(name = "service-customer")

public interface CustomerClient {

    @GetMapping(value = "/encontrar/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id);
}
