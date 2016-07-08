package parknshop.parknshopapp.Rest.event;

/**
 * Created by chrisyu on 29/4/16.
 */
public class SwipeBasicEvent extends BaseEvent {
    public int swipeDirection;

    public int getSwipeDirection() {
        return swipeDirection;
    }

    public void setSwipeDirection(int swipeDirection) {
        this.swipeDirection = swipeDirection;
    }
}
