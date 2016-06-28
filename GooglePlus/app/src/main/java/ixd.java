import android.content.Context;
import java.io.File;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.HttpUrlConnectionUrlRequestFactory;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.UrlRequestContextConfig;
import org.json.JSONObject;

public final class ixd
{
  public static File a;
  private static volatile HttpUrlRequestFactory b;
  
  public static HttpUrlRequestFactory a(Context paramContext)
  {
    for (;;)
    {
      try
      {
        if (b == null) {}
        HttpUrlRequestFactory localHttpUrlRequestFactory2;
        try
        {
          if (b == null)
          {
            localObject3 = (HttpUrlRequestFactory)mbb.b(paramContext, HttpUrlRequestFactory.class);
            if (localObject3 == null)
            {
              CronetEngine.Builder localBuilder = (CronetEngine.Builder)mbb.a(paramContext, UrlRequestContextConfig.class);
              boolean bool = localBuilder.a.optBoolean("ENABLE_LEGACY_MODE");
              localHttpUrlRequestFactory2 = null;
              if (!bool) {
                localHttpUrlRequestFactory2 = HttpUrlRequestFactory.a(paramContext, localBuilder);
              }
              if (localHttpUrlRequestFactory2 == null)
              {
                localObject3 = new HttpUrlConnectionUrlRequestFactory(paramContext, localBuilder);
                new StringBuilder("Using network stack: ").append(((HttpUrlRequestFactory)localObject3).b());
              }
            }
            else
            {
              b = (HttpUrlRequestFactory)localObject3;
            }
          }
          else
          {
            HttpUrlRequestFactory localHttpUrlRequestFactory1 = b;
            return localHttpUrlRequestFactory1;
          }
        }
        finally {}
        Object localObject3 = localHttpUrlRequestFactory2;
      }
      finally {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ixd
 * JD-Core Version:    0.7.0.1
 */