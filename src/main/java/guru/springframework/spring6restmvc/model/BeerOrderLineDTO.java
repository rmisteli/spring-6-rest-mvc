package guru.springframework.spring6restmvc.model;

import jakarta.validation.constraints.Min;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Builder
@Data
public class BeerOrderLineDTO {

    private UUID id;

    private Long version;

    @Min(value = 0, message = "Quantity On Hand must be greater than 0")
    private Integer orderQuantity;

    private Integer quantityAllocated;

    private BeerDTO beer;

    private Timestamp createdDate;

    private Timestamp lastModifiedDate;

}
