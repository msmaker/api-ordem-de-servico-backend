package com.msmaker.os;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.msmaker.os.domain.Cliente;
import com.msmaker.os.domain.OS;
import com.msmaker.os.domain.Tecnico;
import com.msmaker.os.domain.euns.Prioridade;
import com.msmaker.os.domain.euns.Status;
import com.msmaker.os.repositories.ClienteRepository;
import com.msmaker.os.repositories.OSRepository;
import com.msmaker.os.repositories.TecnicoRepository;

@SpringBootApplication
public class OsApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private OSRepository osRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico t1 = new Tecnico(null, "Marco Silva", "998.165.840-50", "(88) 98888-8888");
		Cliente c1 = new Cliente(null, "Betina Campos", "707.608.320-56", "(88) 98888-7777");
		OS os1 = new OS(null, Prioridade.ALTA, "Teste create OD", Status.ANDAMENTO, t1, c1);
		
		t1.getList().add(os1);
		c1.getList().add(os1);
		
		tecnicoRepository.saveAll(Arrays.asList(t1));
		clienteRepository.saveAll(Arrays.asList(c1));
		osRepository.saveAll(Arrays.asList(os1));

	}

}
