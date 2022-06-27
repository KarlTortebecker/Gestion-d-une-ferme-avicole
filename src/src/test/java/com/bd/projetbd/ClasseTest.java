package com.bd.projetbd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.bd.projetbd.entities.Client;
import com.bd.projetbd.repositories.ClientRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class ClasseTest {
	@Autowired 
	private TestEntityManager entity;
	@Autowired
	private ClientRepository repo;
	
	@Test
	public void test() {
		Client c= new Client();
				c.setEmail("string");
				c.setNomClient("string");
				c.setPrenomClient("string");
				c.setTel(0235);
				
				Client savedUser = repo.save(c);
				Client existUser = entity.find(Client.class,savedUser.getIdClient());
			    assertThat(c.getEmail()).isEqualTo(existUser.getEmail());
		
	}
}
