package lesson_18;

public enum Month {
    January(31),
    February(28),
    March(31),
    April(30),
    May(31),
    June(31),
    July(30),
    August(31),
    September(30),
    October(31),
    November(30),
    December(31);

    private final int numOfDays;

    Month (int numOfDays){
        this.numOfDays = numOfDays;
    }
    public int getNumOfDays(){
        return numOfDays;
    }


}
