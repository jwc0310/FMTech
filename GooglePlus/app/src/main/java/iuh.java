import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;

public final class iuh
{
  static iuj a = null;
  public static final ThreadLocal<ArrayList<iuj>> b = new iui();
  private static final long c = mga.a("picasasync.metrics.time", 100L);
  
  public static int a(String paramString)
  {
    ArrayList localArrayList = (ArrayList)b.get();
    localArrayList.add(iuj.a(paramString));
    return localArrayList.size();
  }
  
  public static void a(int paramInt)
  {
    a(null, paramInt, null);
  }
  
  public static void a(long paramLong)
  {
    ArrayList localArrayList = (ArrayList)b.get();
    int i = localArrayList.size();
    if (i > 0)
    {
      iuj localiuj = (iuj)localArrayList.get(i - 1);
      localiuj.h = (paramLong + localiuj.h);
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString)
  {
    ArrayList localArrayList = (ArrayList)b.get();
    if ((paramInt > localArrayList.size()) || (paramInt <= 0))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localArrayList.size());
      arrayOfObject[1] = Integer.valueOf(paramInt);
      throw new IllegalArgumentException(String.format("size: %s, id: %s", arrayOfObject));
    }
    while (paramInt < localArrayList.size())
    {
      iuj localiuj2 = (iuj)localArrayList.remove(-1 + localArrayList.size());
      if (Log.isLoggable("MetricsUtils", 5))
      {
        String str = String.valueOf(localiuj2);
        new StringBuilder(27 + String.valueOf(str).length()).append("WARNING: unclosed metrics: ").append(str);
      }
      if (!localArrayList.isEmpty()) {
        ((iuj)localArrayList.get(-1 + localArrayList.size())).a(localiuj2);
      }
      localiuj2.a();
    }
    iuj localiuj1 = (iuj)localArrayList.remove(-1 + localArrayList.size());
    localiuj1.g = SystemClock.elapsedRealtime();
    if ((c >= 0L) && (localiuj1.g - localiuj1.f >= c) && (Log.isLoggable("MetricsUtils", 3)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append('[').append(localiuj1.a);
      if (localiuj1.b != 0) {
        localStringBuilder.append(" query-result:").append(localiuj1.b);
      }
      if (localiuj1.c != 0) {
        localStringBuilder.append(" update:").append(localiuj1.c);
      }
      if (localiuj1.d != 0L) {
        localStringBuilder.append(" in:").append(localiuj1.d);
      }
      if (localiuj1.e != 0L) {
        localStringBuilder.append(" out:").append(localiuj1.e);
      }
      if (localiuj1.h > 0L) {
        localStringBuilder.append(" net-time:").append(localiuj1.h);
      }
      if (localiuj1.i > 1) {
        localStringBuilder.append(" net-op:").append(localiuj1.i);
      }
      long l5 = localiuj1.g - localiuj1.f;
      if (l5 > 0L) {
        localStringBuilder.append(" time:").append(l5);
      }
      if (paramString != null) {
        localStringBuilder.append(" report:").append(paramString);
      }
      localStringBuilder.append(']');
    }
    if (!localArrayList.isEmpty()) {
      ((iuj)localArrayList.get(-1 + localArrayList.size())).a(localiuj1);
    }
    if ((paramContext != null) && (paramString != null) && (localiuj1.i > 0))
    {
      long l1 = localiuj1.g - localiuj1.f;
      long l2 = localiuj1.h;
      int i = localiuj1.i;
      long l3 = localiuj1.e;
      long l4 = localiuj1.d;
      Intent localIntent = new Intent();
      localIntent.setPackage(paramContext.getPackageName());
      localIntent.setAction("com.google.android.picasasync.op_report");
      localIntent.putExtra("op_name", paramString);
      localIntent.putExtra("total_time", l1);
      localIntent.putExtra("net_duration", l2);
      localIntent.putExtra("transaction_count", i);
      localIntent.putExtra("sent_bytes", l3);
      localIntent.putExtra("received_bytes", l4);
      paramContext.sendBroadcast(localIntent);
    }
    localiuj1.a();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iuh
 * JD-Core Version:    0.7.0.1
 */