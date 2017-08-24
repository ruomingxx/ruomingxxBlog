package com.ruomingxx.blog.forms;

import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
public class UserForm {
    @NotNull
    private String password;

    @NotNull
    private String newPassword;
}
