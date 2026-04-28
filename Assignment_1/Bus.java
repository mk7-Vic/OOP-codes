
class Bus extends Vehicle {
    public Bus (String brand) {
        super(brand);
    }
    @Override
    public void accelerate() {
        speed += 5;
        System.out.println("Bus accelerates slowly.");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println("Bus applies air brakes.");
    }
    public void gas() {
        System.out.println("Refilling large fuel tank.");
    }
}
