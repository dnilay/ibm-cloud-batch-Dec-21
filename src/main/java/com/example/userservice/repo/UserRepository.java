package com.example.userservice.repo;

import com.example.userservice.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends CrudRepository<UserEntity,Integer> {
    @Query
    public UserEntity findByUserId(String userId);

    public UserEntity findByEmail(String email);
}
