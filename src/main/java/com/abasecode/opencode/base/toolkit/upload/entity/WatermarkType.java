package com.abasecode.opencode.base.toolkit.upload.entity;

import lombok.Getter;

/**
 * @author Jon
 * e-mail: ijonso123@gmail.com
 * url: <a href="https://jon.wiki">Jon's blog</a>
 * url: <a href="https://github.com/abasecode">project github</a>
 * url: <a href="https://abasecode.com">AbaseCode.com</a>
 */
@Getter
public enum WatermarkType {
    /**
     * Text watermark
     */
    TEXT(1, "Text watermark"),
    /**
     * Image watermark
     */
    IMAGE(2, "Image watermark"),
    /**
     * Without watermark
     */
    NONE(0, "Without watermark");
    private Integer type;
    private String typeName;

    WatermarkType(Integer type, String typeName) {
        this.type = type;
        this.typeName = typeName;
    }
}