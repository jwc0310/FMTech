package parknshop.parknshopapp.Utils;

/**
 * Created by kwongyuenpan on 3/5/16.
 */

import com.orhanobut.hawk.Hawk;

public class PushStorage {

    static final String PRENAME = "PUSH";

    static final int MAX_VALUE = 50;

    static final String NOTIFYID = "NotifyID";
    static final String lastUpdate = "lastupdate";


    public int getNotifyID(){
        int id = Hawk.get(NOTIFYID, 0);
        if(id >= MAX_VALUE)
            id = 0;
        Hawk.put(NOTIFYID, id + 1);
        return id;
    }

}
