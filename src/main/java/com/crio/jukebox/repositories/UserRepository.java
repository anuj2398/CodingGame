package com.crio.jukebox.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.crio.jukebox.entities.User;

public class UserRepository implements IUserRepository{
    private final Map<String,User> userMap;
    private Integer autoIncrement = 0;

    public UserRepository(){
        userMap = new HashMap<String,User>();
    }

    public UserRepository(Map<String, User> userMap) {
        this.userMap = userMap;
        this.autoIncrement = userMap.size();
    }

    @Override
    public User save(User entity) {
        if( entity.getId() == null ){
            autoIncrement++;
            User u = new User(Integer.toString(autoIncrement),entity.getName());
            userMap.put(u.getId(),u);
            return u;
        }
        userMap.put(entity.getId(),entity);
        return entity;
    }
    @Override
    public void delete(User entity) {
        // TODO Auto-generated method stub     
    }

    @Override
    public Optional<User> findByName(String name) {
        List<User> listOfUsers=new ArrayList<>();
        for(Map.Entry<String,User> entry : userMap.entrySet()){
            if(entry.getValue().getName().equals(name)){
                listOfUsers.add(entry.getValue());
            }
        }
        return listOfUsers.stream().findFirst();
    }
}
