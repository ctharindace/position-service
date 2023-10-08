package com.chethiya.position.controllers;

import com.chethiya.position.services.CommonService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public abstract class CommonController<T, S> {

    @ResponseBody
    @PutMapping(path = "/put", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces =
            {MediaType.APPLICATION_JSON_VALUE})
    public T add(@RequestBody T dto) {
        return getService().saveEntity(dto);
    }

    @ResponseBody
    @GetMapping(path = "/get/{code}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public T get(@PathVariable(name = "code") S id) {
        return getService().getEntity(id);
    }

    @ResponseBody
    @PostMapping(path = "/post", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces =
            {MediaType.APPLICATION_JSON_VALUE})
    public T update(@RequestBody T dto) {
        return getService().updateEntity(dto);
    }

    abstract CommonService<T, S> getService();
}
