package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nit.dto.CustomerDTO;
import com.nit.service.CustomerMnmtService;

@SpringBootApplication
public class SpringDataProj1CrudRepoDirectmethod1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		CustomerMnmtService service=null;
		CustomerDTO dto=null;
		// get bIOC container
		ctx=SpringApplication.run(SpringDataProj1CrudRepoDirectmethod1Application.class, args);
		// get service class object
		service=ctx.getBean("custService",CustomerMnmtService.class);
		// invokr method
		try {
			dto=new CustomerDTO();
			dto.setCname("VISHAL");
			dto.setCadd("MUM");
			dto.setBillAmt(9000.00);
			System.out.println(service.registerCustomer(dto));
		}
		catch (DataAccessException dae) {
			dae.printStackTrace();
		}
		// close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
