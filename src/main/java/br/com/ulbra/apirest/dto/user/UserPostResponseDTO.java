package br.com.ulbra.apirest.dto.user;


public class UserPostResponseDTO {
    private String descricao;

    public UserPostResponseDTO(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
