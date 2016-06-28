import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.net.ProxyChangeListener;

public final class rjk
  extends BroadcastReceiver
{
  public rjk(ProxyChangeListener paramProxyChangeListener) {}
  
  private static rjj a(Intent paramIntent)
  {
    for (;;)
    {
      try
      {
        if (Build.VERSION.SDK_INT <= 19)
        {
          str1 = "android.net.ProxyProperties";
          str2 = "proxy";
          Object localObject = paramIntent.getExtras().get(str2);
          if (localObject == null) {
            return null;
          }
          Class localClass = Class.forName(str1);
          Method localMethod1 = localClass.getDeclaredMethod("getHost", new Class[0]);
          Method localMethod2 = localClass.getDeclaredMethod("getPort", new Class[0]);
          Method localMethod3 = localClass.getDeclaredMethod("getExclusionList", new Class[0]);
          String str3 = (String)localMethod1.invoke(localObject, new Object[0]);
          int i = ((Integer)localMethod2.invoke(localObject, new Object[0])).intValue();
          String[] arrayOfString;
          if (Build.VERSION.SDK_INT <= 19)
          {
            arrayOfString = ((String)localMethod3.invoke(localObject, new Object[0])).split(",");
            if (Build.VERSION.SDK_INT == 19)
            {
              String str4 = (String)localClass.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(localObject, new Object[0]);
              if (TextUtils.isEmpty(str4)) {
                continue;
              }
              return new rjj(str3, i, str4, arrayOfString);
            }
          }
          else
          {
            arrayOfString = (String[])localMethod3.invoke(localObject, new Object[0]);
            continue;
          }
          if (Build.VERSION.SDK_INT > 19)
          {
            Uri localUri = (Uri)localClass.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(localObject, new Object[0]);
            if (!Uri.EMPTY.equals(localUri)) {
              return new rjj(str3, i, localUri.toString(), arrayOfString);
            }
          }
          rjj localrjj = new rjj(str3, i, null, arrayOfString);
          return localrjj;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + localClassNotFoundException);
        return null;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + localNoSuchMethodException);
        return null;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + localIllegalAccessException);
        return null;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + localInvocationTargetException);
        return null;
      }
      catch (NullPointerException localNullPointerException)
      {
        Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + localNullPointerException);
        return null;
      }
      String str1 = "android.net.ProxyInfo";
      String str2 = "android.intent.extra.PROXY_INFO";
    }
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
      ProxyChangeListener.a(this.a, a(paramIntent));
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     rjk
 * JD-Core Version:    0.7.0.1
 */