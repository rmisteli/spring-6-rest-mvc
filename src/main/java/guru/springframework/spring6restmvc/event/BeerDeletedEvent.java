package guru.springframework.spring6restmvc.event;

import guru.springframework.spring6restmvc.entity.Beer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class BeerDeletedEvent implements BeerEvent {

    private Beer beer;

    private Authentication authentication;

}
