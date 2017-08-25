package com.ruomingxx.blog.utils;

import com.ruomingxx.blog.support.web.MarkdownService;
import com.ruomingxx.blog.support.web.PegDownMarkdownService;

public class Markdown {

    private static final MarkdownService MARKDOWN_SERVICE = new PegDownMarkdownService();

    public static String markdownToHtml(String content){
        return MARKDOWN_SERVICE.renderToHtml(content);
    }
}
