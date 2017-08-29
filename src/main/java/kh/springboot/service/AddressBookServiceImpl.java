package kh.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import kh.springboot.data.AddressDao;
import kh.springboot.domain.Address;

@Component
public class AddressBookServiceImpl implements AddressBookService{

	@Autowired
	private AddressDao addressDao;

	@Override
	@Transactional
	public void saveAddress(Address address) {
		this.addressDao.saveAddress(address);

	}


	@Override
	public List<Address> findAllAdresses() {
		return this.addressDao.findAllAddresses();
	}

}
