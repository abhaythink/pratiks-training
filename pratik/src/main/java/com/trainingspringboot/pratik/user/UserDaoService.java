package com.trainingspringboot.pratik.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {
    private static List <User> users = new ArrayList <>();

    private static int usercount = 0;

    static{
        users.add(new User("Pratik", ++usercount, LocalDate.now().minusYears(4)));
        users.add(new User("Karan", ++usercount, LocalDate.now().minusYears(1)));
        users.add(new User("Abhay", ++usercount, LocalDate.now().minusYears(10)));
    }
    public List<User>findAll(){
        return users;
    }

    public User findOne(int id){
        Predicate<? super User> predicate = user ->user.getId().equals(id);
       return  users.stream().filter(predicate).findFirst().get();
    }

    public User deleteById(int id){
        Predicate<? super User> predicate = user ->user.getId().equals(id);
        users.removeIf(predicate);
        return  users.stream().filter(predicate).findFirst().get();
    }

    public User save (User user){
        user.setId(++usercount);
        users.add(user);
        return user;
    }
}
