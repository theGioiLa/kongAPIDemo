package com.quynq.KongAPIEx.controller;

import java.security.Principal;

// import javax.annotation.security.RolesAllowed;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestHeader;
// import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestAPIController {
    @RequestMapping(value = "", method = RequestMethod.GET) 
    public ResponseEntity<String> getAnonymous(Principal principal) {
        return ResponseEntity.ok("Hello " + principal.getName());
    }

    @GetMapping(path = "/token")
    public ResponseEntity<String> getToken(Principal principal) {
        String response = String.format("Token for %s: %s", principal.getName(), JWTUtil.getJWTToken());
        return ResponseEntity.ok(response);
    }
}
