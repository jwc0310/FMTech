package parknshop.parknshopapp.Base.HttpController;

import android.os.StrictMode;

import java.io.IOException;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import parknshop.parknshopapp.Constants;

/**
 * Created by chrisyu on 15/12/10.
 */
public class HttpClient {
    private static OkHttpClient client = getUnsafeOkHttpClient();
    
    public static OkHttpClient getHttpClient() {
        return client;
    }
    public static final MediaType MEDIA_TYPE_MARKDOWN
            = MediaType.parse("text/x-markdown; charset=utf-8");
    public static void makeRequest(String url, Callback callback) {
        Request request = new Request.Builder().url(url).build();

        HttpClient.getHttpClient().newCall(request).enqueue(callback);
    }

    public static String makePostRequest(String url, String postBody) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Request request = new Request.Builder().url(url)
        .addHeader("Accept", "application/json; q=0.5").addHeader("Accept", "application/vnd.github.v3+json").
        post(RequestBody.create(MEDIA_TYPE_MARKDOWN, postBody)).build();

        Response response = null;
        try {
            response = HttpClient.getHttpClient().newCall(request).execute();
            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void makePostRequest(String url, String postBody, Callback callback) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Request request = new Request.Builder().url(url)
                .addHeader("Accept", "application/json; q=0.5").addHeader("Accept", "application/vnd.github.v3+json").
                        post(RequestBody.create(MEDIA_TYPE_MARKDOWN, postBody)).build();

        HttpClient.getHttpClient().newCall(request).enqueue(callback);
    }

    private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient.Builder builder = new OkHttpClient.Builder();

            if(Constants.TEST_MODE)
                builder.addInterceptor(interceptor);

            builder.sslSocketFactory(sslSocketFactory);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            OkHttpClient okHttpClient = builder.build();
            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
