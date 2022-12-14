package pj.corporation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/cliente/v1/")

public class Controller {
    @Autowired
    Repository repository;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        Cliente clienteSaved = repository.save(cliente);
        return clienteSaved;

    }
    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Cliente> getClienteById(@PathVariable Long id){
        Optional<Cliente> clienteReturned = repository.findById(id);
        return clienteReturned;
    }
    @DeleteMapping("/{id}")
    public void deleteClienteById(@PathVariable Long id){
        repository.deleteById(id);
    }
    @GetMapping
    public List<Cliente> listClientes(){
        return repository.findAll();
    }
    @PutMapping("/atualize/{id}")
    public String updateClienteById(@RequestBody ClienteDTO clienteDTO, @PathVariable Long id) {
        Optional<Cliente> velhoCliente = repository.findById(id);

        if (velhoCliente.isPresent()) {
            Cliente cliente = velhoCliente.get();
            cliente.setEndereco(clienteDTO.getEndereco());
            repository.save(cliente);
            return "Cliente de ID "+cliente.getId()+" atualizado com sucesso!";

        } else {
            return "Cliente de ID "+ id + " não existe!";
        }
    }
}