package com.company;

public enum EnumBro implements Comparable <EnumBro> {
    ADMIN(0),
    GUEST(1),
    AUTORIZATE(2),
    USER(3);

public int number;

    EnumBro(int i) {

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

