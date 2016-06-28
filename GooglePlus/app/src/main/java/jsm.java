import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.libraries.social.picasalegacy.PicasaStoreFacade;
import java.util.ArrayList;

public final class jsm
{
  static jso a = null;
  public static final ThreadLocal<ArrayList<jso>> b = new jsn();
  private static final long c = mga.a("picasasync.metrics.time", 100L);
  
  public static int a(String paramString)
  {
    ArrayList localArrayList = (ArrayList)b.get();
    localArrayList.add(jso.a(paramString));
    return localArrayList.size();
  }
  
  public static void a(int paramInt)
  {
    a(paramInt, null);
  }
  
  public static void a(int paramInt, String paramString)
  {
    ArrayList localArrayList = (ArrayList)b.get();
    if ((paramInt > localArrayList.size()) || (paramInt <= 0))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localArrayList.size());
      arrayOfObject[1] = Integer.valueOf(paramInt);
      throw new IllegalArgumentException(String.format("size: %s, id: %s", arrayOfObject));
    }
    if (paramInt < localArrayList.size())
    {
      jso localjso2 = (jso)localArrayList.remove(-1 + localArrayList.size());
      String str = String.valueOf(localjso2.toString());
      if (str.length() != 0) {
        "WARNING: unclosed metrics: ".concat(str);
      }
      for (;;)
      {
        if (!localArrayList.isEmpty()) {
          ((jso)localArrayList.get(-1 + localArrayList.size())).a(localjso2);
        }
        localjso2.a();
        break;
        new String("WARNING: unclosed metrics: ");
      }
    }
    jso localjso1 = (jso)localArrayList.remove(-1 + localArrayList.size());
    localjso1.g = SystemClock.elapsedRealtime();
    if ((Log.isLoggable("MetricsUtils", 3)) && (c >= 0L) && (localjso1.g - localjso1.f >= c))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append('[').append(localjso1.a);
      if (localjso1.b != 0) {
        localStringBuilder.append(" query-result:").append(localjso1.b);
      }
      if (localjso1.c != 0) {
        localStringBuilder.append(" update:").append(localjso1.c);
      }
      if (localjso1.d != 0L) {
        localStringBuilder.append(" in:").append(localjso1.d);
      }
      if (localjso1.e != 0L) {
        localStringBuilder.append(" out:").append(localjso1.e);
      }
      if (localjso1.h > 0L) {
        localStringBuilder.append(" net-time:").append(localjso1.h);
      }
      if (localjso1.i > 1) {
        localStringBuilder.append(" net-op:").append(localjso1.i);
      }
      long l5 = localjso1.g - localjso1.f;
      if (l5 > 0L) {
        localStringBuilder.append(" time:").append(l5);
      }
      if (paramString != null) {
        localStringBuilder.append(" report:").append(paramString);
      }
      localStringBuilder.append(']');
    }
    if (!localArrayList.isEmpty()) {
      ((jso)localArrayList.get(-1 + localArrayList.size())).a(localjso1);
    }
    if ((paramString != null) && (localjso1.i > 0))
    {
      long l1 = localjso1.g - localjso1.f;
      long l2 = localjso1.h;
      int i = localjso1.i;
      long l3 = localjso1.e;
      long l4 = localjso1.d;
      if (PicasaStoreFacade.a != null)
      {
        Context localContext = PicasaStoreFacade.a.b;
        Intent localIntent = new Intent();
        localIntent.setPackage(localContext.getPackageName());
        localIntent.setAction("com.google.android.picasastore.op_report");
        localIntent.putExtra("op_name", paramString);
        localIntent.putExtra("total_time", l1);
        localIntent.putExtra("net_duration", l2);
        localIntent.putExtra("transaction_count", i);
        localIntent.putExtra("sent_bytes", l3);
        localIntent.putExtra("received_bytes", l4);
        localContext.sendBroadcast(localIntent);
      }
    }
    localjso1.a();
  }
  
  public static void a(long paramLong)
  {
    ArrayList localArrayList = (ArrayList)b.get();
    int i = localArrayList.size();
    if (i > 0)
    {
      jso localjso = (jso)localArrayList.get(i - 1);
      localjso.h = (paramLong + localjso.h);
      localjso.i = (1 + localjso.i);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jsm
 * JD-Core Version:    0.7.0.1
 */