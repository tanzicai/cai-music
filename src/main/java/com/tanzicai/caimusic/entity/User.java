package com.tanzicai.caimusic.entity;


import com.tanzicai.caimusic.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class User  extends AbstractEntity{


    @Column(unique = true)
    private String username;

//    @ManyToMany(fetch = FetchType.LAZY)
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "role_id",referencedColumnName = "id"))
    private List<Role> roles;

    private String nickname;

    private String password;

    private Boolean locked;

    private Boolean enabled;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String lastLoginIp;

    private Date lastLoginTime;


}
