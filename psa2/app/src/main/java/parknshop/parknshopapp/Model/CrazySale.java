package parknshop.parknshopapp.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by chrisyu on 30/3/16.
 */
public class CrazySale {
    public String tillDateString;
    public String crazySaleTitle;
    public String crazySaleMessage;
    public Date tillDate;
    public boolean showTimer;
    public ArrayList<String> loadingUrl = new ArrayList<>();
}
