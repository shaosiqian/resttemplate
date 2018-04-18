package com.ssq.restful.vo;  
  
import java.math.BigDecimal;  
/** 
 * @author ssq 
 * 创建时间：2018-4-18 13:05:45 
 * @return 
 */  
public class User {  
  private Long id;  
  
  private String username;  
  
  private String name;  
  
  private Short age;  
  
  private BigDecimal balance;  
  

@Override  
public String toString() {  
    return "User [id=" + id + ", username=" + username + ", name=" + name  
            + ", age=" + age + ", balance=" + balance + "]";  
}


public Long getId() {
    return id;
}


public void setId(Long id) {
    this.id = id;
}


public String getUsername() {
    return username;
}


public void setUsername(String username) {
    this.username = username;
}


public String getName() {
    return name;
}


public void setName(String name) {
    this.name = name;
}


public Short getAge() {
    return age;
}


public void setAge(Short age) {
    this.age = age;
}


public BigDecimal getBalance() {
    return balance;
}


public void setBalance(BigDecimal balance) {
    this.balance = balance;
}  
}  