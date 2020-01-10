package cinema;

import service.Input;

public abstract class Service {

    public static boolean mainGateProgram(boolean language, Cinema cinema){

        boolean recurs = true;

        System.out.println(UserInterface.CHOICE_LANGUAGE.getText(language));
        System.out.print(UserInterface.EXIT_FROM_PROGRAM.getText(language));

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

            Menu.printMenu(language);

            String command = Input.getString();

            switch (command){
                case "1": {
                    Menu.addSeanceSchedule(language, cinema);
                    break;
                }case "2": {
                    Menu.removeSeanceSchedule(language, cinema);
                    break;
                }case "3": {
                    Menu.addMovie(language, cinema);
                    break;
                }case "4": {
                    Menu.addSeanceCinema(language, cinema);
                    break;
                }case "5": {
                    Menu.removeMovie(language, cinema);
                    break;
                }case "6": {
                    Menu.removeSeanceCinema(language, cinema);
                    break;
                }case "<": {
                    cinemaProgram = false;
                    break;
                }
                default:
                    System.out.println(UserInterface.BAD.getText(language));
            }

        }
        return language;
    }
}
