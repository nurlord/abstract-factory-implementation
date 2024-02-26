public class Main {
    // Abstract Factory Implementation By Samatov Nurzat SE-2319
    public static void main(String[] args) {
        BrandFactory adidas = new AdidasFactory();
        Shirt adidasShirt = adidas.createShirt();
        Pants adidasPants = adidas.createPants();
        Sneakers adidasSneakers = adidas.createSneakers();

        BrandFactory nike = new NikeFactory();
        Shirt nikeShirt = nike.createShirt();
        Pants nikePants = nike.createPants();
        Sneakers nikeSneakers = nike.createSneakers();

        adidasShirt.wear();
        adidasPants.wear();
        adidasSneakers.wear();

        nikeShirt.wear();
        nikePants.wear();
        nikeSneakers.wear();
    }
}


