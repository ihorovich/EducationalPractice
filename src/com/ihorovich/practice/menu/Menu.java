package com.ihorovich.practice.businesslogic;

import com.ihorovich.practice.catalog.JsonCatalog;

public class Menu {
    private int numberFirst = 1;
    private int numberTwo = 2;
    private int numberThree = 3;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public void printInfo(){
      System.out.println(ANSI_YELLOW + "=======================================" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "========== " + ANSI_RESET + ANSI_BLUE + "КАТАЛОГ САДІВНИКА " + ANSI_RESET + ANSI_YELLOW +  "==========" + ANSI_RESET);
      System.out.println(ANSI_YELLOW + "=======================================" + ANSI_RESET);
      System.out.println(ANSI_BLACK + "---------------- МЕНЮ ----------------" + ANSI_RESET);
      System.out.println(ANSI_BLACK + "Виберіть пункт меню:" + ANSI_RESET);
      System.out.println("[1]. Реєстрація");
      System.out.println("[2]. Авторизація");
      System.out.println("[3]. Перегляд");


    }


}
