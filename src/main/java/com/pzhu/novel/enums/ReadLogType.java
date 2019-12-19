package com.pzhu.novel.enums;

public enum ReadLogType {
    INSERT("insert"), UPDATE("update");

    private String type;

    ReadLogType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
