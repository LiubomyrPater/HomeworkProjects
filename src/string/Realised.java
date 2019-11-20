package string;

public abstract class Realised {

    public static void palindrom(String word){
        if (word.length() == 5){
            char[] temp = word.toCharArray();
            String word2 = "";
            for (int i = 0; i <5 ; i++) {
                word2 += temp[4 - i];
            }
            if (word.equalsIgnoreCase(word2)){
                System.out.println("Is palindrom");
            }else {
                System.out.println("Isn't palindrom");
            }
        }else {
            System.out.println("Size word isn't 5 char");
        }
    }

    public static String repalaceLoudLetters(String text){
        return text.replaceAll("[euioaуеіаояиюЇ]","-");
    }

    public static int countWords(String text){
        String count[] = text.split(" ");
        return count.length;
    }

    public static int countSentence(String text){
        String count[] = text.split("[.]");
        return count.length;
    }

    public static String theMostRepetitiveLocalWord(String text){
        String temp = "";
        String sentences[] = text.split("[.]");
        String words[] = sentences[0].split(" ");



        return temp;
    }

    /*public static String theMostRepetitiveWordInGeneral(String text){


        return temp;
    }*/
}
