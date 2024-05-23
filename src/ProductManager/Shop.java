package ProductManager;
public class Shop {
    int maxlimit;
    int count = 0;
    Product[] listProduct = new Product[maxlimit];
    Shop(int maxlimit, Product[] listProduct){
        this.maxlimit = maxlimit;
        this.listProduct = listProduct;
    }


    public boolean checkAddProduct() {
        if (this.count >= 1000) {
            return false;
        }
        else{
            return true;
        }
    }
    public Product[] addProduct(Product[] products){
        Product[] newListProduct = new  Product[products.length + 1];
        if (checkAddProduct()){
            System.arraycopy(listProduct,0,newListProduct,0,listProduct.length);
            newListProduct[products.length] = products[products.length - 1];
        }
        return newListProduct;
    }

    public int getMaxlimit() {
        return maxlimit;
    }

    public void setMaxlimit(int maxlimit) {
        this.maxlimit = maxlimit;
    }
}
