package edu.nf.ch17.service.impl;

import edu.nf.ch17.service.StuService;
import org.springframework.stereotype.Service;

/**
 * @author LZ
 * @date 2020/12/8
 */
@Service
public class StuServiceImpl implements StuService {

    public String save(String name) {
        System.out.println("insert....."+name);
        return "success";
    }
}
