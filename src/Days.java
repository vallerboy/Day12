public enum Days {
    PONIEDZIALEK(false),
    WTOREK(false),
    SRODA(false),
    CZWARTEK(false),
    PIATEK(false),
    SOBOTA(true),
    NIEDZIELA(true);

    private boolean isWeekend;

    Days(boolean isWeekend){
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend(){
        return isWeekend;
    }
}
