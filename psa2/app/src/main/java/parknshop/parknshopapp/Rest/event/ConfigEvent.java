package parknshop.parknshopapp.Rest.event;

import com.orhanobut.hawk.Hawk;

import parknshop.parknshopapp.Model.Config;

/**
 * Created by chrisyu on 9/5/16.
 */
public class ConfigEvent extends BaseEvent {
    Config config;

    public void setConfig(Config config) {
        this.config = config;
        Hawk.put("config", config);
    }

    public Config getConfig() {
        return config;
    }
}
