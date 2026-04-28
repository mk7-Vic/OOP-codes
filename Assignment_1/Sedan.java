
class Sedan extends Vehicle implements Automobile{
    public Sedan(String brand) {
        super(brand);
    }
    @Override
    public void accelerate() {
        speed +=10;
        System.out.println("Sedan is accelerating. Current speed: " + speed + " km/h");
    }
    public void accelerate(int increment) {
        speed += increment;
        System.out.println("Sedan boosted by " + increment + "km/h. Current Speed: " + speed);
    }
    @Override
    public void stop() {
        speed = 0; 
        System.out.println("Sedan comes to a controlled stop.");

    }
    @Override
    public void gas() { 
        System.out.println("Filling Sedan with Unleaded petrol."); }
    @Override
    public void checkSafetySystems() {
        System.out.println("Checking Airbags and ABS...");
    }
    @Override 
    public void openTrunk() {
        System.out.println("Trunk opened via remote key.");
    }

}

