package com.tanzicai.caimusic.entity;

import com.tanzicai.caimusic.enums.FileStatus;
import com.tanzicai.caimusic.enums.FileType;
import com.tanzicai.caimusic.enums.Storage;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
public class File extends TraceableBaseEntity {
    private String name;

    @Column(name = "file_key")
    private String key;

    private String ext;

    private Integer size;

    @Enumerated(EnumType.STRING)
    private FileType type;

    @Enumerated(EnumType.STRING)
    private Storage storage;

    @Enumerated(EnumType.STRING)
    private FileStatus status = FileStatus.UPLOADING;
}
