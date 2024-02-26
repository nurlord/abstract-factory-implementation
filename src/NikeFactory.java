public class NikeFactory extends BrandFactory {
    @Override
    public Shirt createShirt() {
        return new NikeShirt();
    }

    @Override
    public Pants createPants() {
        return new NikePants();
    }

    @Override
    public Sneakers createSneakers() { return new NikeSneakers();}
}
