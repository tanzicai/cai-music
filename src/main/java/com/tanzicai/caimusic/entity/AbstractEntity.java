package com.tanzicai.caimusic.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Data
@MappedSuperclass
public class AbstractEntity {

    @Id
    @GeneratedValue(generator = "ksuid")
    @GenericGenerator(name="ksuid",strategy = "com.tanzicai.caimusic.utils.KsuidIdentifiterGenerator")
    private String id;

    @CreationTimestamp
    private Date lastCreateTime;

    @UpdateTimestamp
    private Date lastUpdateTime;

}
