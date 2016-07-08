package parknshop.parknshopapp.Model;

import java.io.Serializable;
import java.util.ArrayList;

import parknshop.parknshopapp.WishListHelper;

/**
 * Created by panther945 on 2015/7/29.
 */
public class WishListResponse implements Serializable {

    private static final long serialVersionUID = -7060210544600464481L;

    private String pk;
    private String name;
    private ArrayList<Entry> entries;

    private boolean isStaticList;

    public ArrayList<Entry> getEntries() {
        if(entries == null)
            entries = new ArrayList<>();
        return entries;
    }

    public void addEntry(Entry entry) {
        if(entries == null)
            entries = new ArrayList<>();
        entries.add(entry);
    }

    public void setPrimaryKey(String pk) {
        this.pk = pk;
    }

    public String getPrimaryKey() {
        return pk;
    }

    public boolean isStaticList() {
        return isStaticList;
    }

    public void setStaticList(boolean staticList) {
        isStaticList = staticList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAppList() {
        return getName() != null && getName().equals(WishListHelper.WISH_LIST_NAME);
    }

    public int size() {
        return entries != null ? entries.size() : 0;
    }

    public Product getProduct(int index) {
        try {
            if (entries != null) {
                return entries.get(index).product;
            }
        } catch (IndexOutOfBoundsException e) {
            return null;
        }

        return null;
    }

    public void addProduct(Product product){
        if(entries == null){
            entries = new ArrayList<>();
        }
        Entry entry = new Entry();
        entry.setProduct(product);
        entries.add(entry);
    }

    public static class Entry implements Serializable {
        private Product product;
        private int quantity;

        public Product getProduct() {
            return product;
        }

        public void setProduct(Product product) {
            this.product = product;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getQuantity() {
            return quantity;
        }
    }
}
