package com.chethiya.position.services;

public interface CommonService<T, S> {

    T saveEntity(T dto);

    T getEntity(S id);

    T updateEntity(T dto);

}
