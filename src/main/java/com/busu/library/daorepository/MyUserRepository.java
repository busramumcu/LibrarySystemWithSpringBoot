package com.busu.library.daorepository;

import com.busu.library.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface MyUserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByName(String name);
}
