package parknshop.parknshopapp.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by chrisyu on 16/3/13.
 */

public class FilterData implements Parcelable {
    private String id;
    private String name;
    private String countName;
    private String imageUrl;
    int count;
    public String query;
    public boolean selected;

    public static final Parcelable.Creator<FilterData> CREATOR = new Parcelable.Creator<FilterData>() {
        public FilterData createFromParcel(Parcel in) {

            return new FilterData(in);
        }

        public FilterData[] newArray(int size) {
            return new FilterData[size];
        }
    };

    public FilterData(String id, String name, String countName) {
        this.id = id;
        this.name = name;
        this.countName = countName;
    }

    public FilterData(String name, String countName) {

        this.name = name;
        this.countName = countName;
    }

    public FilterData(Parcel in) {
        id = in.readString();
        name = in.readString();
        countName = in.readString();
    }

    public String getQuery() {
        return query;
    }

    public String getCountName() {
        return countName != null ? countName : "";
    }


    public String getName() {
        return name != null ? name : "";
    }

    public String getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(id);
        out.writeString(name);
        out.writeString(countName);
    }
}
