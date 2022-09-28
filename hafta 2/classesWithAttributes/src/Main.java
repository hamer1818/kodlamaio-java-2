public class Main {
    public static void main(String[] args) {
//        Product product = new Product(1,"Laptop","Asus Laptop",300,2,"Siyah");
        Product product = new Product();
        product.setName("laptop");
        product.setId(1);
        product.setDescription("Asus Laprop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("siyah");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}