package guru.springframework.spring6restmvc.bootstrap;

import guru.springframework.spring6restmvc.repository.BeerOrderRepository;
import guru.springframework.spring6restmvc.repository.BeerRepository;
import guru.springframework.spring6restmvc.repository.CustomerRepository;
import guru.springframework.spring6restmvc.service.BeerCsvService;
import guru.springframework.spring6restmvc.service.BeerCsvServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import(BeerCsvServiceImpl.class)
class BootstrapDataTest {

    @Autowired
    BeerOrderRepository beerOrderRepository;

    @Autowired
    BeerRepository beerRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BeerCsvService beerCsvService;

    BootstrapData bootstrapData;

    @BeforeEach
    void setUp() {
        bootstrapData = new BootstrapData(beerRepository, customerRepository, beerCsvService, beerOrderRepository);
    }

    @Test
    void testRun() throws Exception {
        bootstrapData.run(null);

        assertThat(beerRepository.count()).isEqualTo(2413);
        assertThat(customerRepository.count()).isEqualTo(3);
    }
}