package com.busu.library;

import com.busu.library.daorepository.MyBookRepository;
import com.busu.library.daorepository.MyUserRepository;
import com.busu.library.model.BooksEntity;
import com.busu.library.model.UserEntity;
import com.busu.library.service.MyUserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Created by BUSRAMUMCU on 20.05.2019.
 */

public class UserServiceTest {

    @Mock
    private MyUserRepository myUserRepository;
    @Mock
    private MyBookRepository myBookRepository;

    private MyUserService userServiceTest;
    private UserEntity userEntity;
    private BooksEntity booksEntity;

    @Before
    public void setUp() {
        initMocks(this);
        userServiceTest = new MyUserService(myBookRepository,myUserRepository);

        booksEntity = new BooksEntity();
        booksEntity.setId(10);
        booksEntity.setBookName("Deneme");
        booksEntity.setAuthor("Ozan");
        booksEntity.setUserId(2);

        Mockito.when(myBookRepository.findByBookName(anyString()))
                .thenReturn(booksEntity);
    }

    @Test
    public void testUserFindByName () {
        final String name = "Deneme";

        BooksEntity booksEntity = userServiceTest.findByBookName(name);
        assertEquals(name,booksEntity.getBookName());
    }

}
