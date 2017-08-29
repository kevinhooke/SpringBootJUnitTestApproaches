package kh.springboot.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import kh.springboot.domain.Address;

@Component
public class AddressDao {

	@PersistenceContext
	private EntityManager em;
	
	public void saveAddress(Address address){
		em.persist(address);
	}
	
	public List<Address> findAllAddresses(){
		return em.createQuery("from Address").getResultList();
	}
}
