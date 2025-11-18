package br.com.ulbra.apirest.dto.user;

import java.util.List;

public class UserResponseDTO {
    private String name;
    private String email;
    private List<UserPostResponseDTO> post;

    public UserResponseDTO(String name, String email, List<UserPostResponseDTO> post) {
        this.name = name;
        this.email = email;
        this.post = post;
    }

    public List<UserPostResponseDTO> getPost() {
        return post;
    }

    public void setPost(List<UserPostResponseDTO> post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
