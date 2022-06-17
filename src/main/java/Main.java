public class Main {
    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=KbIdk5BRn0w

        PhoneBuilder builder1 = new PhoneBuilder()
                .setOs("iOS")
                .setCamera(3)
                .setScreenSize(12.5d);

        Phone phone_iOS = builder1.getPhone();
        System.out.println(phone_iOS);

        System.out.println();

        PhoneBuilder builder2 = new PhoneBuilder()
                .setCamera(2)
                .setScreenSize(14.7d)
                .setOs("Android")
                .setBattery(1500)
                .setProcessor("tuned");

        Phone phone_Android = builder2.getPhone();
        System.out.println(phone_Android);
    }
}
