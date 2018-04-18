package com.ssq.restful.controller;  
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ssq.restful.vo.User;  
  
      
@RestController  
public class RestTemplateController {  
    @Autowired  
    private RestTemplate restTemplate;  
    // Restful服务对应的url地址  
    @Value("${user.userServicePath}")  
    private String userServicePath; 
  
    @GetMapping("/template/{id}")  
    public User findById(@PathVariable Long id) {  
               // http://localhost:7900/user/是前面服务的对应的url  
               User u = this.restTemplate.getForObject(this.userServicePath + id,  
                User.class);  
        System.out.println(u);  
        return u;  
    }  
}  