package parknshop.parknshopapp.Rest.event;

import java.util.ArrayList;
import java.util.List;

import parknshop.parknshopapp.Model.Timeslot;

/**
 * Created by chrisyu on 8/4/16.
 */
public class TimeslotEvent extends BaseEvent {
    public List<Timeslot> timeslot = new ArrayList<Timeslot>();

    public List<Timeslot> getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(List<Timeslot> timeslot) {
        this.timeslot = timeslot;
    }
}
