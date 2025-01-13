package guru.springframework.spring6restmvc.event;

import guru.springframework.spring6restmvc.entity.Beer;
import org.springframework.security.core.Authentication;

public interface BeerEvent {

    Beer getBeer();

    Authentication getAuthentication();

}
