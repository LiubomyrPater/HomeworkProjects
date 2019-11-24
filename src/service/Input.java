package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Input {

    public enum VariableTypes{
        BYTE, SHORT, INTEGER, FLOAT, LONG, DOUBLE, CHAR, STRING
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static <T> T getScannerTrueValue(VariableTypes variableTypes){
        Object o = new Object();
        switch (variableTypes){
            case BYTE:{
                o = getInputTrueByte();
                break;
            }case SHORT:{
                o = getInputTrueShort();
                break;
            }case INTEGER: {
                o = getInputTrueInt();
                break;
            }case LONG:{
                o = getInputTrueLong();
                break;
            }case CHAR:{
                o = getInputTrueChar();
                break;
            }case FLOAT:{
                o = getInputTrueFloat();
                break;
            }case DOUBLE:{
                o = getInputTrueDouble();
                break;
            }case STRING:{
                o = getInputTrueString();
                break;
            }
        }
        return (T) o;
    }
    public static <T> T getScannerTrueValue(VariableTypes variableTypes, T from, T to){
        Object o = new Object();
        switch (variableTypes){
            case BYTE:{
                o = getInputTrueByte((byte)from, (byte)to);
                break;
            }case SHORT:{
                o = getInputTrueShort((short)from, (short)to);
                break;
            }case INTEGER: {
                o = getInputTrueInt((int)from, (int)to);
                break;
            }case LONG:{
                o = getInputTrueLong((long)from, (long)to);
                break;
            }case CHAR:{
                o = getInputTrueChar((char)from, (char)to);
                break;
            }case FLOAT:{
                o = getInputTrueFloat((float)from, (float)to);
                break;
            }case DOUBLE:{
                o = getInputTrueDouble((double)from, (double)to);
                break;
            }case STRING:{
                o = getInputTrueString((String)from, (String)to);
                break;
            }
        }
        return (T) o;
    }

    private static Byte getInputTrueByte(){return 2;}
    private static Byte getInputTrueByte(Byte from, Byte to){return  2;}

    private static Short getInputTrueShort(){return 2;}
    private static Short getInputTrueShort(Short from, Short to){return 2;}

    private static Integer getInputTrueInt() {
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
    private static Integer getInputTrueInt(Integer from, Integer to) {
        int x = getInputTrueInt();
        if (x < from || x > to){
            System.out.println("Only from " + from + " to " + to);
            getInputTrueInt(from, to);
        }
        return x;
    }

    private static Long getInputTrueLong(){return 4L;}
    private static Long getInputTrueLong(Long from, Long to){return 4L;}

    private static Float getInputTrueFloat(){return 3F;}
    private static Float getInputTrueFloat(Float from, Float to){return 3F;}

    private static Double getInputTrueDouble() {
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
    private static Double getInputTrueDouble(Double from, Double to) {


        return 5.5;
    }

    private static Character getInputTrueChar(){
        return 'Q';
    }
    private static Character getInputTrueChar(Character from, Character to){
        return 'Q';
    }

    private static String getInputTrueString(){return "a";}
    private static String getInputTrueString(String it, String any){return "alkjlas";}


}
