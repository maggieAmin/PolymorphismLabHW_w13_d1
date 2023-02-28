import java.util.ArrayList;

public class Wallet {
    private ArrayList<IChargeable> collection;
    private IChargeable selectedIChargeable;

    public Wallet() {
        this.collection = new ArrayList<>();
        this.selectedIChargeable = null;
    }

    public ArrayList<IChargeable> getCollection() {
        return collection;
    }

    public IChargeable getSelectedIChargeable() {
        return selectedIChargeable;
    }

    public void setSelectedIChargeable(IChargeable selectedIChargeable) {
        this.selectedIChargeable = selectedIChargeable;
    }

    public void addToCollection(IChargeable card) {
        collection.add(card);

    }

}
