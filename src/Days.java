public enum Days {
    PONIEDZIALEK(),
    WTOREK(),
    SRODA(),
    CZWARTEK(),
    PIATEK(),
    SOBOTA(true),
    NIEDZIELA(true);

    private boolean isWeekend;

    Days(){
        this(false);
    }

    Days(boolean isWeekend){
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend(){
        return isWeekend;
    }
}
