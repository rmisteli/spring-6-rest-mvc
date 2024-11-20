package guru.springframework.spring6restmvc.mapper;

import guru.springframework.spring6restmvc.entity.Customer;
import guru.springframework.spring6restmvc.model.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDTO customerDto);

    CustomerDTO customerToCustomerDto(Customer customer);

}
