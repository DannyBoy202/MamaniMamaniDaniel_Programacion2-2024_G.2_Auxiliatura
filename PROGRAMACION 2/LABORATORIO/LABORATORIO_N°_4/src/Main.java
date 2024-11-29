public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Accessory("Headphones", 150.0));
        store.addProduct(new Accessory("Charger", 25.0));
        store.addProduct(new Accessory("Phone Case", 10.0));
        store.addProduct(new Accessory("USB Cable", 5.0));
        store.addProduct(new Accessory("Screen Protector", 8.0));
        store.addProduct(new Accessory("Portable Speaker", 45.0));
        store.addProduct(new Accessory("Smartwatch", 200.0));
        store.addProduct(new Accessory("Bluetooth Earbuds", 75.0));
        store.addProduct(new Accessory("Laptop Stand", 30.0));
        store.addProduct(new Accessory("Wireless Mouse", 20.0));

       
        Discountable fifteenPercentDiscount = product -> product.getPrice() * 0.85;
        store.applyDiscount(fifteenPercentDiscount);

      
        Discountable combinedDiscount = product -> (product.getPrice() * 0.90) - 5.0;
        store.applyDiscount(combinedDiscount);
    }
}
