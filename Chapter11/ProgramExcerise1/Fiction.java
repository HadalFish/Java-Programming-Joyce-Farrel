
public class Fiction extends Book {

    public Fiction(String title) {
        super(title);
        setPrice();
    }

    
    public void setPrice() {
        price = 24.99;
    }
}
