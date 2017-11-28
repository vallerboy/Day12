public class Starter {
    public static void main(String[] args) {

        Days today = Days.WTOREK;
        //Days someDay = new Days(); - tak sie nie da!

        System.out.println(today.isWeekend());
        
        switch (today){
            case WTOREK:
                System.out.println("Czy jest dzis weekend? " + today.isWeekend());
                break;
            case SOBOTA:
                System.out.println("WOLNE!");
                break;
        }
    }
}
