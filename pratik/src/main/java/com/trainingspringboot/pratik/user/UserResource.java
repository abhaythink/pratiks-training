package com.trainingspringboot.pratik.user;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    // GET /users
    private UserDaoService service;

    public UserResource(UserDaoService service){
        this.service=service;
    }

    @GetMapping("/users")
   public List<User> retrieveAllUsers(){
       return service.findAll();
   }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        User user = service.findOne(id);
        if(user==null)
            throw new UserNotFoundException ("id : " + id);
        return user;
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
        service.deleteById(id);
    }



    @PostMapping("/users")
    public void createUser(@Valid @RequestBody User user){
        service.save(user);
    }
}


/*  OUTPUT of the program will be in JSON format -->  for /users
[
{
"name": "Pratik",
"id": 1,
"birthDate": "2021-04-10"
},
{
"name": "Karan",
"id": 1,
"birthDate": "2024-04-10"
},
{
"name": "Abhay",
"id": 1,
"birthDate": "2015-04-10"
}
]

for the second GetMapping
{
"name": "Pratik",
"id": 1,
"birthDate": "2021-04-10"
}


after hitting the post request and passing the essential parameters in the body we will receive
ouptput -->
[
{
"name": "Pratik",
"id": 1,
"birthDate": "2021-04-10"
},
{
"name": "Karan",
"id": 2,
"birthDate": "2024-04-10"
},
{
"name": "Abhay",
"id": 3,
"birthDate": "2015-04-10"
},
{
"name": "Rahul",
"id": 4,
"birthDate": "2024-04-10"
}
]
 */