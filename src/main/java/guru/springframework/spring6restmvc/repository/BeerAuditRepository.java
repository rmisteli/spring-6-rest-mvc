package guru.springframework.spring6restmvc.repository;

import guru.springframework.spring6restmvc.entity.BeerAudit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BeerAuditRepository extends JpaRepository<BeerAudit, UUID> {
}
