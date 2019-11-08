package org.apache.custos.rest.gateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthController {

@GetMapping("/isUserAuthenticated")
public boolean isUserAuthenticated (@RequestParam String accessToken, @RequestParam String userName, @RequestParam String gatewayId) {
    return true;
}

}
