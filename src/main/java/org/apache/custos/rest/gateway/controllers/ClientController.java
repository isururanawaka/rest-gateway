package org.apache.custos.rest.gateway.controllers;

import org.apache.custos.rest.gateway.models.Client;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("client")
public class ClientController {

@GetMapping("get")
public Client getClient(@RequestParam String registrationURI){
return null;
}

@PostMapping("create")
public Client createClient(@RequestBody Client client){
return client;
}

@PutMapping("update")
public Client updateClient(@RequestBody Client client){
return null;
}

@DeleteMapping("delete")
public Client deleteClient(@RequestParam String registrationURI){
return null;
}


}
