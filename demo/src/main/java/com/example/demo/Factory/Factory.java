package com.example.demo.Factory;

import com.example.demo.Entity.Log;
import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Model.AbstractSomething;
import com.example.demo.Model.Cinema;
import com.example.demo.Model.Restaurant;
import com.example.demo.Model.Ticket;
import com.example.demo.Service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Factory {

    @Autowired
    private LogService logService;

    public AbstractSomething get(Integer code) throws ResourceNotFoundException {

        switch (code){
            case 1:
                Log log1 =
                        Log.builder()
                                .code(code)
                                .date(LocalDateTime.now())
                                .build();
                logService.save(log1);
                return Restaurant.getInstance();
            case 2:
                Log log2 =
                        Log.builder()
                                .code(code)
                                .date(LocalDateTime.now())
                                .build();
                logService.save(log2);
                return Cinema.getInstance();
            case 3:
                Log log3 =
                        Log.builder()
                                .code(code)
                                .date(LocalDateTime.now())
                                .build();
                logService.save(log3);
                return Ticket.getInstance();
        }
        throw new ResourceNotFoundException("Couldn't find place with code " + code);
    }
}
