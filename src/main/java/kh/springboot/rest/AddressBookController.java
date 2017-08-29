package kh.springboot.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kh.springboot.domain.Address;
import kh.springboot.service.AddressBookService;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

	@Autowired
	private AddressBookService addressService;
	
	@GetMapping("/addresses")
	public ResponseEntity<List<Address>> getAddresses(String id){
		List<Address> addresses = this.addressService.findAllAdresses();
		
		return new ResponseEntity<List<Address>>(addresses, HttpStatus.OK);
	}
	
	@PutMapping("/addresses")
	public ResponseEntity<Address> saveAddress(@RequestBody Address address){
		this.addressService.saveAddress(address);
		
		return new ResponseEntity<Address>(address, HttpStatus.OK);
	}
}
