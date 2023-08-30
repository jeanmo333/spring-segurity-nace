package com.example.repositories;

import com.example.models.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

    Optional<UserEntity> findByUsername(String username);

    public Optional<UserEntity> findByEmail(String email);

    public Optional<UserEntity> findByUsernameOrEmail(String username,String email);

    @Query("select u from UserEntity u where u.username = ?1")
    Optional<UserEntity> getName(String username);


    public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);
}
