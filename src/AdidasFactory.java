public class AdidasFactory extends BrandFactory {
    @Override
    public Shirt createShirt() {
        return new AdidasShirt();
    }

    @Override
    public Pants createPants() {
        return new AdidasPants();
    }

    @Override
    public Sneakers createSneakers() { return new AdidasSneakers();}
}
