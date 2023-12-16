public class App {
    public static void main(String[] args) {

        // creating instances of devices
        Laptop laptop = new Laptop() {
            @Override
            public void charge() {
                System.out.println("Charging the laptop.");
            }
        };

        Refrigerator refrigerator = new Refrigerator() {
            @Override
            public void startCooling() {
                System.out.println("Starting the refrigerator's cooling system.");
            }
        };

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger() {
            @Override
            public void chargePhone() {
                System.out.println("Charging the smartphone.");
            }
        };

        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();
    }
}