/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Neoris.Controller;
import com.Neoris.Repository.UserDTO;
import com.Neoris.Service.UserService;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author seba_
 */
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired 
    private UserService usuarioServicio;  

    
    @GetMapping
    public  ResponseEntity<List<UserDTO>> encontrarTodos(@RequestParam(required=false) String filtro) {
        return new ResponseEntity<>(usuarioServicio.encontrarTodos(),HttpStatus.OK);
    }
    
    @PostMapping
    public ResponseEntity<UserDTO> UserCreate(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<>(usuarioServicio.UserCreate(userDTO),HttpStatus.CREATED);
        
    }
    
    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> searchUser(@PathVariable UUID userID) {
    	return new ResponseEntity<>(usuarioServicio.searchUser(userID),HttpStatus.OK);
    }
       
}
