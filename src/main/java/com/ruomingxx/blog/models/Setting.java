package com.ruomingxx.blog.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "settings")
@Getter @Setter
public class Setting extends BaseModel{
    @Column(name = "_key", unique = true, nullable = false)
    private String key;

    @Lob
    @Column(name = "_value")
    private Serializable value;

}
