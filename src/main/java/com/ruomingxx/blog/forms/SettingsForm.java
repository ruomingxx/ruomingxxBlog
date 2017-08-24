package com.ruomingxx.blog.forms;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Data
public class SettingsForm {
    @NotEmpty
    @NotNull
    private String siteName;

    @NotNull
    private String siteSlogan;

    @NotNull
    private Integer pageSize;

}
