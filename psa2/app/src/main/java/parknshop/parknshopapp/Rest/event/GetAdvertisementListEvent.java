package parknshop.parknshopapp.Rest.event;

import java.util.Comparator;

import parknshop.parknshopapp.Model.Advertisement;

/**
 * Created by kwongyuenpan on 15/3/16.
 */
public class GetAdvertisementListEvent extends BaseEvent {
    Advertisement advertisement;
    String type;

    public String getType() {
        return type;
    }

    public GetAdvertisementListEvent(String type) {
        this.type = type;
    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
        //Collections.sort(advertisement.data, new AdvertisementComparator());
    }

    public class AdvertisementComparator implements Comparator<Advertisement.Data> {

        public AdvertisementComparator() {
        }

        @Override
        public int compare(Advertisement.Data o1, Advertisement.Data o2) {
            if (o1.getId() == o2.getId())
                return 0;
            else if (o1.getId() > o2.getId())
                return 1;
            else
                return -1;
        }
    }
}
