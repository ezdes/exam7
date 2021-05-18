package com.example.demo.Service;

import com.example.demo.Entity.Log;
import com.example.demo.Repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogRepository logRepository;

    @Override
    public Log save(Log log) {
        return logRepository.save(log);
    }
}
