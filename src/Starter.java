public class Starter {
    public static void main(String[] args) {

        Days today = Days.WTOREK;
        //Days someDay = new Days(); - tak sie nie da!

        Weather weather = Weather.SNOWY;
        weather.setAverageTemp(10);

        System.out.println("AS: " + weather.getAverageTemp());
        System.out.println("AS: " + Weather.SNOWY.getAverageTemp());

        System.out.println(today.isWeekend());

        switch (today){
            case WTOREK:
                System.out.println("Czy jest dzis weekend? " + today.isWeekend());
                break;
            case SOBOTA:
                System.out.println("WOLNE!");
                break;
        }


//        for (Weather weather : Weather.values()) {
//            if(weather.getAverageTemp() > 0){
//                System.out.println(weather);
//            }
//        }
    }
}
