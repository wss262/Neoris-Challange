/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Neoris.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.Neoris.Repository.UserDTO;

/**
 *
 * @author seba_
 */
@Service
public class UserService {
    
    private final Map<UUID, UserDTO> users = new HashMap<>();

    public UserDTO UserCreate(final UserDTO usuarioDTO) {
    	final UUID id = UUID.randomUUID();
        return users.put(id, usuarioDTO);
       
    }
    
    public List<UserDTO> encontrarTodos() {
        return users.keySet().stream()
                .map(users::get)
                .collect(Collectors.toList());
    }
    
    public UserDTO searchUser(final UUID id) {
    	return users.get(id);
    }
    
    public void userDelete(final UUID id) {
        users.remove(id);
    }
    
}
