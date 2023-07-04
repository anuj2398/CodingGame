package com.crio.jukebox.repositories;

public interface CRUDRepository<T> {
    public T save(T entity);
    public void delete(T entity);
}
