public class AverageSpeed {
    public static void main(String[] args){
        System.out.println("Runner runs 24 miles in 1 hour, 40 minutes and 35 seconds");
        System.out.println("1 mile = 1.6 km");
        System.out.print("Kilometers run=24*1.6=");
        System.out.println(24*1.6);
        System.out.print("Seconds passed=1*3600+40*60+35");
        System.out.println(1*3600+40*60+35);
        System.out.print("average speed=");
        System.out.println((24.0*1.6)/((1.0*3600+40*60+35)/3600));
    }
}
