package com.practice.beginner.service;

import java.util.List;
import java.util.Optional;

public interface BeginnerService<T, ID> {
    void save (T t);

    Optional<T> getById(ID id);

    List<T> findMany();

    void deleteById(ID id);

    void update(T T, ID id);

    default T findInteresting(){
        return null;
    }


}
