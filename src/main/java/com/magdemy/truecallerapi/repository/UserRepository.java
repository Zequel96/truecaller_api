package com.magdemy.truecallerapi.repository;

import com.magdemy.truecallerapi.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
    User getUserByPhone(String phone);
}
