package com.ruomingxx.blog.forms;

import com.ruomingxx.blog.models.Tag;
import com.ruomingxx.blog.models.support.PostFormat;
import com.ruomingxx.blog.models.support.PostStatus;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.Set;


@Data
public class PostForm {
    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    @NotNull
    private PostFormat postFormat;

    @NotNull
    private PostStatus postStatus;

    @NotNull
    private String permalink;

    @NotNull
    private String postTags;

}
