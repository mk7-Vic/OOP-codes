class SportsCar extends Vehicle implements Automobile {
    public SportsCar(String brand) { super(brand); }

    @Override
    public void accelerate() { speed += 40; System.out.println("SportsCar roars to life!"); }

    @Override
    public void stop() { speed = 0; System.out.println("Ceramic brakes applied."); }

    @Override
    public void gas() { System.out.println("Filling with premium racing fuel."); }

    @Override
    public void checkSafetySystems() { System.out.println("Stability control active."); }

    @Override
    public void openTrunk() { System.out.println("Small rear storage opened."); }
}