package gs.service.example.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gs.service.example.models.Cliente;
import gs.service.example.services.ClienteService;

@RestController
@RequestMapping("/v1")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping(value="/clientes")
	Cliente getClientes() {
		
		return clienteService.getAll();
	}
	
	@PostMapping(value="/clientes")
	public String addClientes() {
		return clienteService.addCliente();
	}
	
	@PutMapping(value="/clientes/{id}")
	public String updateClientes(@PathVariable long id) {
		return clienteService.updateCliente();
	}
	
	@DeleteMapping(value="/clientes/{id}")
	public String deleteClientes(@PathVariable long id) {
		return clienteService.deleteCliente();
	}

}
