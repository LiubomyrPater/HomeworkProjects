package service;

import java.util.InputMismatchException;

import java.util.Scanner;

public final class Input {

    private static final Scanner scanner = new Scanner(System.in);


    public static int getInt(){
        int temp = 0;
        try {
            temp = scanner.nextInt();

            scanner.nextLine();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }
        return temp;
    }

    public static float getFloat(){
        float temp = 0;
        try {
            temp = scanner.nextFloat();
        }catch (InputMismatchException e){
            scanner.nextLine();
            e.printStackTrace();
        }
        return temp;
    }

    public static String getString(){
        return scanner.nextLine();
    }




/*
    public enum VariableTypes{
        BYTE,
        SHORT,
        INTEGER,
        FLOAT,
        LONG,
        DOUBLE,
        CHAR,
        STRING
    }

    public enum ParametricableTypes{
        LONG,
        DOUBLE,
        CHAR
    }

    public enum SimpleTypes {
        LONG,
        DOUBLE,
        STRING
    }




    public static <T> T getScannerUncheckedValue(SimpleTypes types){
        switch (types){
            case LONG: {
                return (T) (Long)scanner.nextLong();
            }case DOUBLE:{
                return (T) (Double)scanner.nextDouble();
            }case STRING:{
                return (T) scanner.nextLine();
            }
        }
        return null;
    }



    public static <T> T getScannerCheckedValue(VariableTypes types){
        switch (types){
            case BYTE:{
                //return (T) getInputTrueByte();
            }case SHORT:{
                //return (T) getInputTrueShort();
            }case INTEGER: {
                //return (T) getInputTrueInt();
            }case LONG:{
                //return (T) getLong();
            }case CHAR:{
                //return (T) getChar();
            }case FLOAT:{
                //return (T) getInputTrueFloat();
            }case DOUBLE:{
               // return (T) getDouble();
            }case STRING:{
                return (T) getInputTrueString();
            }
        }
        return null;
    }

    private static Byte getInputTrueByte(){
        return 2;
    }

    private static Short getInputTrueShort(){
        return 2;
    }

    private static Integer getInputTrueInt(){
        Integer temp;
        while (true){
            try {
                temp = scanner.nextInt();
                break;
            }catch (InputMismatchException e){
                scanner.nextLine();//empty scanner!!!!!
                System.out.println("Only natural numbers!!!");
            }
        }
        //scanner.close();
        return temp;
    }

    private static Long getLong(){
        Long temp;
        while (true){
            try {
                temp = scanner.nextLong();
                break;
            }catch (InputMismatchException e){
                scanner.nextLine();//empty scanner!!!!!
                System.out.println("Only natural numbers!!!");
            }
        }
        //scanner.close();
        return temp;
    }

    private static Float getInputTrueFloat(){
        return 3F;
    }

    private static Double getDouble(){
        Double temp;
        while (true){
            try {
                temp = scanner.nextDouble();
                break;
            }catch (InputMismatchException e){
                scanner.nextLine();//empty scanner!!!!!
                System.out.println("Only numbers!!!");
            }
        }
        scanner.close();
        return temp;
    }

    private static Character getChar(){
        return 'Q';
    }

    private static String getInputTrueString(){
        while (true){
            String temp = scanner.nextLine();
            if (!temp.isEmpty()){
                if (!temp.matches("\\s+")){
                    return temp;
                }
            }
        }
    }



    public static <T> T getScannerParametricValue(ParametricableTypes types, T from, T to){
        switch (types){
            case LONG:{
                return (T) getLong((long)from, (long)to);
            }case CHAR:{
                return (T) getChar((char)from, (char)to);
            }case DOUBLE: {
                return (T) getDouble((double) from, (double) to);
            }
        }
        return null;
    }

    private static Long getLong(Long from, Long to){
        Long x = getLong();
        if (x < from || x > to){
            System.out.println("Only from " + from + " to " + to);
            getLong(from, to);
        }
        return x;
    }

    private static Double getDouble(Double from, Double to){
        return 5.5;
    }

    private static Character getChar(Character from, Character to){
        return 'Q';
    }*/


}
