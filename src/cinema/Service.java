package cinema;

import service.Input;

public abstract class Service {

    public static boolean mainGateProgram(boolean language, Cinema cinema){

        boolean recurs = true;

        System.out.println(UserInterface.CHOICE_LANGUAGE.getText(language));

        String command = Input.getString();

        if (command.matches("[01<]"))
            if (command.equals("<"))
                System.exit(0);
            else
                recurs = mainCinema(command.equals("0"), cinema);
        else {
            System.out.println(UserInterface.BAD.getText(language));
            recurs = mainGateProgram(language, cinema);
        }

        return recurs;
    }





    private static boolean mainCinema(boolean language, Cinema cinema){
        boolean cinemaProgram = true;
        while (cinemaProgram){
            String command = Input.getString();

            switch (command){
                case "1":{
                    System.out.println(cinema);
                    break;
                }case "2":{

                }case "<":{
                    cinemaProgram = false;
                    break;
                }
                default:
            }
        }

        return language;
    }
}
