package com.tanzicai.caimusic.vo;

import com.tanzicai.caimusic.enums.GeneralStatus;
import lombok.Data;

import java.util.List;

@Data
public class AlbumVo extends BaseVo {
    private String name;

    private String description;

    private FileVo cover;

    private GeneralStatus status;

    private Boolean recommended;

    private Integer recommendFactor;
    
    private List<ArtistVo> artists;

    private List<MusicVo> musicList;
}
