package dev.pfe.spring.login.payload.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Getter
@Setter
public class SignupRequest {

    private String firstName;

    private String lastName;

    private String username;

    private int cin;

    private String email;

    private int phone;

    private String password;

    private Set<String> role;

    
    public Set<String> getRole() {
      return this.role;
    }
    
    public void setRole(Set<String> role) {
      this.role = role;
    }

}
