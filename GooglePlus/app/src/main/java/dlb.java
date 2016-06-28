import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.os.Handler;
import com.google.android.apps.plus.content.EsProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class dlb
  implements hgg
{
  private static int a = -1;
  private static ConcurrentHashMap<String, Boolean> b = new ConcurrentHashMap();
  private static boolean c;
  private static Set<String> d = Collections.newSetFromMap(new ConcurrentHashMap());
  private static Set<String> e = Collections.newSetFromMap(new ConcurrentHashMap());
  private static boolean f = false;
  
  private static void a(int paramInt)
  {
    if (a != paramInt)
    {
      b.clear();
      a = paramInt;
    }
  }
  
  public final void a(Context paramContext, int paramInt, String paramString)
  {
    String str = jjf.c(paramString);
    if ((str != null) && (e.remove(str)))
    {
      ArrayList localArrayList = new ArrayList(e.size());
      localArrayList.addAll(e);
      bgp.a(paramContext, paramInt, localArrayList, -1L, false);
    }
  }
  
  public final void a(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    a(paramInt);
    Boolean localBoolean = (Boolean)b.remove(paramString1);
    if (localBoolean == null) {}
    StringBuilder localStringBuilder;
    for (boolean bool = false;; bool = localBoolean.booleanValue())
    {
      d.add(paramString1);
      if (!paramBoolean) {
        break label333;
      }
      a(paramContext, paramInt, paramString1);
      if ((!bool) || (c) || (b.size() > 0) || (d.isEmpty())) {
        break label308;
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("in_my_circles!= 0").append(" AND person_id").append(" IN (");
      Iterator localIterator = d.iterator();
      while (localIterator.hasNext())
      {
        DatabaseUtils.appendEscapedSQLString(localStringBuilder, (String)localIterator.next());
        localStringBuilder.append(',');
      }
    }
    d.clear();
    localStringBuilder.setLength(-1 + localStringBuilder.length());
    localStringBuilder.append(')');
    Cursor localCursor = paramContext.getContentResolver().query(EsProvider.a(EsProvider.f(paramContext), paramInt), new String[] { "person_id" }, localStringBuilder.toString(), null, null);
    if (localCursor != null) {}
    for (;;)
    {
      int i;
      try
      {
        int k = localCursor.getCount();
        i = k;
        localCursor.close();
        if (i != 0)
        {
          Resources localResources = paramContext.getResources();
          int j = efj.xb;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Integer.valueOf(i);
          dlc localdlc = new dlc(this, paramContext, localResources.getQuantityString(j, i, arrayOfObject));
          efj.m().post(localdlc);
        }
        label308:
        paramContext.getContentResolver().notifyChange(EsProvider.f(paramContext), null);
        return;
      }
      finally
      {
        localCursor.close();
      }
      label333:
      if ((bool) && (!c))
      {
        Intent localIntent = efj.b(paramContext, paramInt, paramString1, null, true);
        localIntent.setPackage(paramContext.getPackageName());
        localIntent.addFlags(335544320);
        PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, dmr.a(), localIntent, 0);
        dk localdk = new dk(paramContext);
        localdk.x.icon = 17301543;
        localdk.a(16, true);
        localdk.b = dk.a(paramContext.getString(aau.cP));
        localdk.c = dk.a(paramContext.getString(aau.cO, new Object[] { paramString2 }));
        localdk.d = localPendingIntent;
        NotificationManager localNotificationManager = (NotificationManager)paramContext.getSystemService("notification");
        String str = String.valueOf(paramContext.getPackageName());
        localNotificationManager.notify(19 + String.valueOf(str).length() + String.valueOf(paramString1).length() + str + ":notifications:add:" + paramString1, aaw.gf, localdk.a());
        continue;
        i = 0;
      }
    }
  }
  
  public final void a(Context paramContext, int paramInt, String paramString, boolean paramBoolean)
  {
    a(paramInt);
    b.put(paramString, Boolean.valueOf(paramBoolean));
    paramContext.getContentResolver().notifyChange(EsProvider.f(paramContext), null);
  }
  
  public final void a(List<String> paramList)
  {
    e.clear();
    if (paramList != null) {
      e.addAll(paramList);
    }
    f = true;
  }
  
  public final void a(boolean paramBoolean)
  {
    if (c != paramBoolean)
    {
      c = paramBoolean;
      if (paramBoolean) {
        d.clear();
      }
    }
  }
  
  public final boolean a()
  {
    return f;
  }
  
  public final boolean a(String paramString)
  {
    return b.containsKey(paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dlb
 * JD-Core Version:    0.7.0.1
 */