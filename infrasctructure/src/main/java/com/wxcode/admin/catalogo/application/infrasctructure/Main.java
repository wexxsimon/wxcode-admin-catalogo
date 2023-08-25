package com.wxcode.admin.catalogo.application.infrasctructure;

import com.wxcode.admin.catalogo.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        System.out.println(new UseCase().execute());
    }
}