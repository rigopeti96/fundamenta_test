package entity;

public class LineData {
    private final Product product;
    private final String businessAssociateName;
    private final int prize;

    public LineData(Product product, String businessAssociateName, int prize) {
        this.product = product;
        this.businessAssociateName = businessAssociateName;
        this.prize = prize;
    }

    public Product getProduct() {
        return product;
    }

    public int getPrize() {
        return prize;
    }

    public String getBusinessAssociateName() {
        return businessAssociateName;
    }
}
