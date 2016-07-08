package parknshop.parknshopapp.Fragment.Splash;

import com.orhanobut.hawk.Hawk;

import parknshop.parknshopapp.Base.HttpController.CustomRunnable;
import parknshop.parknshopapp.Fragment.Tutorial.TutorialFragment;
import parknshop.parknshopapp.Model.ConfigInfoResponse;

/**
 * Created by chrisyu on 16/3/12.
 */
public class SplashRunnable extends CustomRunnable {
    SplashFragment splashFragment;

    public SplashRunnable(SplashFragment splashFragment) {
        this.splashFragment = splashFragment;
    }

    @Override
    public void run() {
        ConfigInfoResponse configInfoResponse = (ConfigInfoResponse)this.data;

        for (ConfigInfoResponse.ConfigInfo configInfo : configInfoResponse.results.config_info) {
            Hawk.put(configInfo.key, configInfo);
        }
        splashFragment.placeFragment(new TutorialFragment());
    }
}
