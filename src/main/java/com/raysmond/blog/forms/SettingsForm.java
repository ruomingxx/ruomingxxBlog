package com.raysmond.blog.forms;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * @author Raysmond<i@Raysmond.com>
 */
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
