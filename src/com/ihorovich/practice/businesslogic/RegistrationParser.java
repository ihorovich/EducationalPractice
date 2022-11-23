package com.ihorovich.practice;

import com.google.gson.JsonObject;
import java.io.IOException;

public class RegistrationParser {
    private String userName;
    private int password;
    private int repeatPassword;
    private boolean notCorrectLogin;

    public User parse() {



        System.out.println("Ви обрати перший пункт меню");

        return null;

    }

//
//        File file = Path.of("resources", "log.json").toFile();
//        if(file.exists() == false){
//            file.createNewFile();
//        }
//        do {
//            Scanner scanner = new Scanner(System.in);
//            notCorrectLogin = true;
//            System.out.println("Введіть логін");
//            userName = scanner.nextLine();
//            if(userName.length() == 0){
//                System.out.println("Увага!!! Логін не може бути пустим");
//                notCorrectLogin = false;
//            }
//            System.out.println("Введіть пароль");
//            password = scanner.nextInt();
//            if (String.valueOf(password).length() == 0){
//                System.out.println("Увага!!! Пароль не може бути пустим");
//                notCorrectLogin = false;
//            }
//            System.out.println("Введіть пароль повторно");
//            repeatPassword = scanner.nextInt();
//            if (String.valueOf(repeatPassword).length() == 0){
//                System.out.println("Увага!!! Пароль не може бути пустим");
//                notCorrectLogin = false;
//            }
//        }while (!notCorrectLogin);
//




}
