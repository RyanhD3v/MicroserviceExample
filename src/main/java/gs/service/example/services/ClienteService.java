package gs.service.example.services;


import org.springframework.stereotype.Service;

import gs.service.example.models.Cliente;

@Service
public class ClienteService {

	public Cliente getAll(){
		Cliente c1 = new Cliente();
		c1.setName("Nestor");
		c1.setApellido("Barralez");
		c1.setCorreo("nestor.barralez@example.com.mx");
		c1.setEdad(29);
		return c1;
	}
	
	public String addCliente() {
		return "Respuesta desde el metodo POST";
	}
	
	public String updateCliente() {
		return "Respuesta desde el metodo PUT";
	}
	
	public String deleteCliente() {
		return "Respuesta desde el metodo DELETE";
	}
}
