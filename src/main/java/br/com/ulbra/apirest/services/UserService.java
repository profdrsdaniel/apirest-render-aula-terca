package br.com.ulbra.apirest.services;

import br.com.ulbra.apirest.dto.UserDTO;
import br.com.ulbra.apirest.dto.user.UserPostResponseDTO;
import br.com.ulbra.apirest.dto.user.UserResponseDTO;
import br.com.ulbra.apirest.entities.User;
import br.com.ulbra.apirest.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        return this.userRepository.findById(id).orElseThrow();
    }

    public List<UserResponseDTO> getUsers() {
        return this.userRepository
                .findAll()
                .stream()
                .map(item -> new UserResponseDTO(
                        item.getName(), item.getEmail(),
                        item.getPosts().stream().map(post -> new UserPostResponseDTO(post.getDescricao())).toList()
                )).toList();
    }

    public User createUser(User user) {
        return this.userRepository.save(user);
    }

    public void deleteUser(Long id) {
        User user = this.userRepository.findById(id).orElseThrow();
        this.userRepository.delete(user);
    }

}
