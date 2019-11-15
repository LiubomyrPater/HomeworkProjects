package calc;

public class ParsedInputData {
    private double x;
    private double y;
    private String act;

    public ParsedInputData(String textRow) {
        textRow = textRow.replaceAll("\\s+","");
        textRow = textRow.replaceAll("[^-0123456789,./*!%+S^]","");
        textRow = textRow.replace(',', '.');
        int helpMinus = 1;
        if (textRow.startsWith("-")){
            helpMinus = -1;
            textRow = textRow.replaceFirst("-","");
        }
        act = textRow;
        String operands[] = textRow.split("[-!%*/S^+]");
        if (!operands[0].isEmpty()){
            if (operands.length == 2){
                x = (Double.parseDouble(operands[0])) * helpMinus;
                y = Double.parseDouble(operands[1]);
            }else if (operands.length == 1){
                x = (Double.parseDouble(operands[0])) * helpMinus;
            }else {
                PrintFrases.badInput();
            }
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getAct() {
        return act;
    }

}
