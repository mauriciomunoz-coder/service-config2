package service.shopping.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.shopping.model.Product;

@FeignClient(name = "service-product")
@RequestMapping(value = "/products")
public interface ProductClient {


    @GetMapping(value = "/ById/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable(value = "id") Long id);

    @GetMapping("/{id}/stock")
    public ResponseEntity<Product> updateStock(@PathVariable("id") Long id, @RequestParam(name = "quantity", required = true) Double quantity);
}
