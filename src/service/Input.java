package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Input {

    public enum VariableTypes{
        BYTE, SHORT, INTEGER, FLOAT, LONG, DOUBLE, CHAR, STRING
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static <T> T getScannerTrueValue(VariableTypes variableTypes){
        switch (variableTypes){
            case BYTE:{
                return (T) getInputTrueByte();
            }case SHORT:{
                return (T) getInputTrueShort();
            }case INTEGER: {
                return (T) getInputTrueInt();
            }case LONG:{
                return (T) getInputTrueLong();
            }case CHAR:{
                return (T) getInputTrueChar();
            }case FLOAT:{
                return (T) getInputTrueFloat();
            }case DOUBLE:{
                return (T) getInputTrueDouble();
            }case STRING:{
                return (T) getInputTrueString();
            }
        }
        return null;
    }
    public static <T> T getScannerTrueValue(VariableTypes variableTypes, T from, T to){
        switch (variableTypes){
            case BYTE:{
                return (T) getInputTrueByte((byte)from, (byte)to);
            }case SHORT:{
                return (T) getInputTrueShort((short)from, (short)to);
            }case INTEGER: {
                return (T) getInputTrueInt((int)from, (int)to);
            }case LONG:{
                return (T) getInputTrueLong((long)from, (long)to);
            }case CHAR:{
                return (T) getInputTrueChar((char)from, (char)to);
            }case FLOAT:{
                return (T) getInputTrueFloat((float)from, (float)to);
            }case DOUBLE:{
                return (T) getInputTrueDouble((double)from, (double)to);
            }case STRING:{
                return (T) getInputTrueString((String)from, (String)to);
            }
        }
        return null;
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

    private static String getInputTrueString(String it, String any){return "alkjlas";}


}
