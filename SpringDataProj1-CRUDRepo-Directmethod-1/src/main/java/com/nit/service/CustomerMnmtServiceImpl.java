package com.nit.service;

import java.util.Arrays;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dto.CustomerDTO;
import com.nit.entity.Customer;
import com.nit.repo.CustomerRepo;

@Service("custService")
public class CustomerMnmtServiceImpl implements CustomerMnmtService {
	@Autowired
	private CustomerRepo custRepo;
	@Override
	public String registerCustomer(CustomerDTO dto) {
System.out.println(custRepo.getClass()+"--->"+Arrays.toString(custRepo.getClass().getInterfaces()));
Customer cust=null;
// Convert dto to entity
cust=new Customer();
BeanUtils.copyProperties(dto, cust);
//use Repo
cust=custRepo.save(cust);
return cust!=null?"Object Saved with id"+cust.getCno():"Object Not save";
	}

}
