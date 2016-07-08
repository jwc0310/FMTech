package parknshop.parknshopapp.Utils;

import com.orhanobut.hawk.Hawk;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * Created by kwongyuenpan on 28/6/16.
 */
public class ReceivedCookiesInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Response originalResponse = chain.proceed(chain.request());

        if (!originalResponse.headers("Set-Cookie").isEmpty()) {
            HashSet<String> cookies = new HashSet<>();

            for (String header : originalResponse.headers("Set-Cookie")) {
                cookies.add(header);
            }

            if(cookies.size() == 0)
                return originalResponse;

            Iterator<String> it = cookies.iterator();
            while (it.hasNext()) {
                String cookie = it.next();
                if(cookie.contains("JSESSIONID")) {
                    String strJSession = cookie.replace("JSESSIONID=", "").replaceFirst(";", "---");
                    String[] arrCookies = strJSession.split("---");
                    String jSessionId = arrCookies[0];
                    Hawk.put("JSESSIONID", jSessionId);
                }
            }

        }


        return originalResponse;
    }
}