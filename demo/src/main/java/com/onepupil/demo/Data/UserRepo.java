package com.onepupil.demo.Data;

import java.util.List;
import java.util.Optional;
import com.onepupil.demo.Model.user;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<user, String> {
Optional<user> findByEmail(String email);
void deleteByEmail(String email);
}