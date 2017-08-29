package kh.springboot.service;

import java.util.List;

import org.springframework.stereotype.Component;

import kh.springboot.domain.Address;

@Component
public interface AddressBookService {

	public List<Address> findAllAdresses();
	
	public void saveAddress(Address address);
}
