package com.crio.jukebox.repositories;

import java.util.Optional;
import com.crio.jukebox.entities.User;

public interface IUserRepository extends CRUDRepository<User>{
    public Optional<User> findByName(String name);
}
