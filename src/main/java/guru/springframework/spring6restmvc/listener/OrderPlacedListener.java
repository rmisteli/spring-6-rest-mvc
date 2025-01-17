package guru.springframework.spring6restmvc.listener;

import guru.springframework.spring6restmvcapi.events.OrderPlacedEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;

@Configuration
public class OrderPlacedListener {

    @Async
    @EventListener
    public void listen(OrderPlacedEvent event) {

        // todo add sent to Kafka
        System.out.println("Order placed Event Received");
    }
}
