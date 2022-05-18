package com.tanzicai.caimusic.entity;


import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Role extends AbstractEntity{

    private String name;

    //显示的名称
    private String title;

}
