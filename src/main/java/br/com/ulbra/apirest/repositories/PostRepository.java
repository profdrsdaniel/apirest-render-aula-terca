package br.com.ulbra.apirest.repositories;

import br.com.ulbra.apirest.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {}
