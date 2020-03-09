package com.busu.library.service;

import com.busu.library.daorepository.MyBookRepository;
import com.busu.library.daorepository.MyUserRepository;
import com.busu.library.model.BooksEntity;
import com.busu.library.model.Register;
import com.busu.library.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by BUSRAMUMCU on 20.05.2019.
 */
@Service("myUserService")
public class MyUserService {

    private MyBookRepository myBookRepository; // Interface class
    private MyUserRepository userRepository; // Interface class

    @Autowired
    public MyUserService(MyBookRepository myBookRepository, MyUserRepository userRepository) {
        this.myBookRepository = myBookRepository;
        this.userRepository = userRepository;
    }

    public BooksEntity findByBookName(String name) {
        return myBookRepository.findByBookName(name);
    }

    public UserEntity findByName (String name) {
        return userRepository.findByName(name);
    }

    public void saveUser(Register register) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(register.getName());
        userEntity.setPassword(register.getPassword());
        userEntity.setId(6);
        userRepository.save(userEntity);
    }

    public List<BooksEntity> getAllBook () {
        return myBookRepository.findAll();

    }
}

