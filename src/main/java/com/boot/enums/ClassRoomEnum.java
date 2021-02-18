package com.boot.enums;

public enum ClassRoomEnum {
    ENGLISH("eng"),
    MATH("mat");
    private String className;
    private int mark;

    public String getClassName() {
        return className;
    }

    public int getMark() {
        return mark;
    }

    ClassRoomEnum(String className) {
        this.className = className;
        this.mark = 1 << ordinal();
    }

    public static void main(String[] args) {
        System.out.println(ClassRoomEnum.ENGLISH.getMark());
    }
}
