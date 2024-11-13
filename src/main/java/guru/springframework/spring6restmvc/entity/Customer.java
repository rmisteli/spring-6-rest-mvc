package guru.springframework.spring6restmvc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private UUID id;

    @Version
    private Integer version;

    private String name;

    private LocalDateTime createdDate;

    private LocalDateTime updateDate;

}
