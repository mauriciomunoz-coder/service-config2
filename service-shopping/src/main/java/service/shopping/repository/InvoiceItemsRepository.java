package service.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import service.shopping.entity.InvoiceItem;

public interface InvoiceItemsRepository extends JpaRepository<InvoiceItem,Long> {
}
