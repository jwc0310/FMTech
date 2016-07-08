package parknshop.parknshopapp.Base.HttpController;

import okhttp3.CookieJar;

public interface ClearableCookieJar extends CookieJar {

    void clear();
}