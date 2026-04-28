class Motorcycle extends Vehicle {
    public Motorcycle(String brand) {
        super(brand);
    }
    @Override
    public void accelerate() {
        speed += 15;
        System.out.println("Motorcycle twists throttle.");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println("Motorcycle applies handbrakes.");
    }
    public void gas() {
        System.out.println("Refiling small fuel tank.");
    }

}