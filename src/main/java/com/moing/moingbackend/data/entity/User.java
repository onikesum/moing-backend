package com.moing.moingbackend.data.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
<<<<<<< Updated upstream
    private String username;  //이름
=======
    private String username;
>>>>>>> Stashed changes
    @Column(nullable = true, unique = true)
    private String account;  //id
    @Column(nullable = false)
    private String email;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(nullable = true)
    private String password;
    @Column(nullable = false)
    private String birthday;
    @Column(nullable = false, unique = true)
    private String nickname;  //닉네임
    @Column(nullable = false)
    private String phoneNumber;
    @ElementCollection(fetch = FetchType.EAGER)
    @Builder.Default
    private List<String> roles = new ArrayList<>();
<<<<<<< Updated upstream
    public Long getId() {
        return user_id;
    }
=======
>>>>>>> Stashed changes

}
