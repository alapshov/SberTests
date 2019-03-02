package dataManager;

public class Item {
    public String getPositionId() {
        return positionId;
    }

    private void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    private String positionId;

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getQuantity() {
        return quantity;
    }

    private void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    private String quantity;

    /**
     * Конструкторв класса, создает item карзины
     * @param positionId
     * @param name
     * @param quantity
     */
    public void item(String positionId, String name, String quantity ){
        setPositionId(positionId);
        setName(name);
        setQuantity(quantity);
    }
}
