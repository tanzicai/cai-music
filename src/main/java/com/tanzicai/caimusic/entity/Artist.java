package com.tanzicai.caimusic.entity;

import com.tanzicai.caimusic.enums.GeneralStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Artist extends TraceableBaseEntity {

    private String name;

    private String remark;

    @OneToOne
    private File photo;

    @ManyToMany
    @JoinTable(name = "artist_music", joinColumns = @JoinColumn(name = "artist_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "music_id", referencedColumnName = "id"))
    private List<Music> musicList;

    private GeneralStatus status = GeneralStatus.DRAFT;

    private Boolean recommended = false;

    private Integer recommendFactor = 0;
}
