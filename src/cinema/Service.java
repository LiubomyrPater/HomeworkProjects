package cinema;

import service.Input;
import java.time.LocalTime;
import java.util.*;


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



    public static TreeSet<LocalTime> parsingTimes(boolean language){
        String timesText;
        while (true){
            System.out.println(UserInterface.INPUT_SEANCE_TIME.getText(language));
            String timesTemp = Input.getString().trim();
            timesText = timesTemp.replaceAll("\\s","");

            if (timesTemp.length() < 5
                    || !timesTemp.contains(":")
                    || (timesTemp.length() > 5 && !timesTemp.contains(","))
                    || (timesTemp.length() == 5 && !(timesTemp.matches("[01][0123456789]:[012345][0123456789]") || timesTemp.matches("[2][0123]:[012345][0123456789]")))
            )
                System.out.println(UserInterface.TIME_IS_EMPTY.getText(language));
            else
                break;
        }


        ArrayList<String> splitTimes = new ArrayList<>();
        ArrayList<String> notAdded = new ArrayList<>();

        if (timesText.contains(",")) {

            String[] temp = timesText.split(",");
            ArrayList<String> timesList = new ArrayList<>();
            Collections.addAll(timesList, temp);

            timesList.forEach(a -> {
                if (a.matches("[01][0123456789]:[012345][0123456789]") || a.matches("[2][0123]:[012345][0123456789]"))
                    splitTimes.add(a);
                else
                    notAdded.add(a);
            });

        }
        else
            if (timesText.matches("[01][0123456789]:[012345][0123456789]") || timesText.matches("[2][0123]:[012345][0123456789]"))
                splitTimes.add(timesText);
            else
                notAdded.add(timesText);


        if (!notAdded.isEmpty()){
            System.out.print(UserInterface.BAD_TIME.getText(language));
            notAdded.forEach(System.out::print);
            System.out.println("\n");
        }


        TreeSet<LocalTime> times = new TreeSet<>();
        splitTimes.forEach(x -> times.add(LocalTime.of(Integer.valueOf(x.substring(0, 2)), Integer.valueOf(x.substring(3, 5)))));

        return times;
    }
}
