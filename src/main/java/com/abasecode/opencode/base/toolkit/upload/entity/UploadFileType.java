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
public enum UploadFileType {
    /**
     * File type
     */
    FILE(1, "File"),
    /**
     * JPG,PNG
     */
    IMAGE(2, "JPG,PNG");
    private Integer typeCode;
    private String typeName;

    UploadFileType(Integer typeCode, String typeName) {
        this.typeCode = typeCode;
        this.typeName = typeName;
    }
}