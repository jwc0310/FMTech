import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.common.stats.ConnectionEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ejm
{
  private static final Object a = new Object();
  private static ejm b;
  private static final ComponentName g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
  private static Integer i;
  private final List<String> c;
  private final List<String> d;
  private final List<String> e;
  private final List<String> f;
  private ejq h;
  
  private ejm()
  {
    if (b() == 0)
    {
      this.c = Collections.EMPTY_LIST;
      this.d = Collections.EMPTY_LIST;
      this.e = Collections.EMPTY_LIST;
      this.f = Collections.EMPTY_LIST;
      return;
    }
    eyw localeyw1 = ejo.b;
    String str1 = (String)localeyw1.a(localeyw1.a);
    List localList1;
    String str2;
    List localList2;
    label98:
    String str3;
    List localList3;
    label134:
    String str4;
    if (str1 == null)
    {
      localList1 = Collections.EMPTY_LIST;
      this.c = localList1;
      eyw localeyw2 = ejo.c;
      str2 = (String)localeyw2.a(localeyw2.a);
      if (str2 != null) {
        break label225;
      }
      localList2 = Collections.EMPTY_LIST;
      this.d = localList2;
      eyw localeyw3 = ejo.d;
      str3 = (String)localeyw3.a(localeyw3.a);
      if (str3 != null) {
        break label240;
      }
      localList3 = Collections.EMPTY_LIST;
      this.e = localList3;
      eyw localeyw4 = ejo.e;
      str4 = (String)localeyw4.a(localeyw4.a);
      if (str4 != null) {
        break label255;
      }
    }
    label225:
    label240:
    label255:
    for (List localList4 = Collections.EMPTY_LIST;; localList4 = Arrays.asList(str4.split(",")))
    {
      this.f = localList4;
      eyw localeyw5 = ejo.f;
      this.h = new ejq(1024, ((Long)localeyw5.a(localeyw5.a)).longValue());
      return;
      localList1 = Arrays.asList(str1.split(","));
      break;
      localList2 = Arrays.asList(str2.split(","));
      break label98;
      localList3 = Arrays.asList(str3.split(","));
      break label134;
    }
  }
  
  public static ejm a()
  {
    synchronized (a)
    {
      if (b == null) {
        b = new ejm();
      }
      return b;
    }
  }
  
  public static boolean a(Context paramContext, Intent paramIntent)
  {
    ComponentName localComponentName = paramIntent.getComponent();
    if ((localComponentName == null) || ((ehy.a) && ("com.google.android.gms".equals(localComponentName.getPackageName())))) {
      return false;
    }
    return efj.c(paramContext, localComponentName.getPackageName());
  }
  
  private static int b()
  {
    if (i == null) {}
    for (;;)
    {
      try
      {
        if ((!ehy.a) || (!eyw.b()) || (eyw.a() != Process.myUid())) {
          continue;
        }
        j = 1;
        if (j == 0) {
          continue;
        }
        eyw localeyw = ejo.a;
        k = ((Integer)localeyw.a(localeyw.a)).intValue();
        i = Integer.valueOf(k);
      }
      catch (SecurityException localSecurityException)
      {
        int j;
        int k;
        i = Integer.valueOf(0);
        continue;
      }
      return i.intValue();
      j = 0;
      continue;
      k = 0;
    }
  }
  
  private static ServiceInfo b(Context paramContext, Intent paramIntent)
  {
    List localList = paramContext.getPackageManager().queryIntentServices(paramIntent, 128);
    if ((localList == null) || (localList.size() == 0))
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = paramIntent.toUri(0);
      arrayOfObject1[1] = efj.c(3, 20);
      String.format("There are no handler of this intent: %s\n Stack trace: %s", arrayOfObject1);
      return null;
    }
    if (localList.size() > 1)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = paramIntent.toUri(0);
      arrayOfObject2[1] = efj.c(3, 20);
      String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", arrayOfObject2);
      Iterator localIterator = localList.iterator();
      if (localIterator.hasNext()) {
        return null;
      }
    }
    return ((ResolveInfo)localList.get(0)).serviceInfo;
  }
  
  public final void a(Context paramContext, ServiceConnection paramServiceConnection, String paramString, Intent paramIntent, int paramInt)
  {
    if (!ehy.a) {
      return;
    }
    String str1 = String.valueOf(Process.myPid() << 32 | System.identityHashCode(paramServiceConnection));
    int j = b();
    int k;
    label43:
    long l1;
    String str2;
    long l2;
    if ((j == 0) || (this.h == null))
    {
      k = 0;
      if (k == 0) {
        break label359;
      }
      l1 = System.currentTimeMillis();
      int m = b() & ejp.b;
      str2 = null;
      if (m != 0) {
        str2 = efj.c(3, 5);
      }
      l2 = 0L;
      if ((b() & ejp.d) != 0) {
        l2 = Debug.getNativeHeapAllocatedSize();
      }
      if ((paramInt != 1) && (paramInt != 4)) {
        break label361;
      }
    }
    label359:
    label361:
    ServiceInfo localServiceInfo1;
    for (ConnectionEvent localConnectionEvent = new ConnectionEvent(l1, paramInt, null, null, null, null, str2, str1, SystemClock.elapsedRealtime(), l2);; localConnectionEvent = new ConnectionEvent(l1, paramInt, efj.f(paramContext), paramString, localServiceInfo1.processName, localServiceInfo1.name, str2, str1, SystemClock.elapsedRealtime(), l2))
    {
      paramContext.startService(new Intent().setComponent(g).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", localConnectionEvent));
      return;
      if ((paramInt == 4) || (paramInt == 1))
      {
        if (this.h.b(str1))
        {
          k = 1;
          break label43;
        }
        k = 0;
        break label43;
      }
      ServiceInfo localServiceInfo2 = b(paramContext, paramIntent);
      if (localServiceInfo2 == null)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = paramIntent.toUri(0);
        String.format("Client %s made an invalid request %s", arrayOfObject);
        k = 0;
        break label43;
      }
      String str3 = efj.f(paramContext);
      String str4 = localServiceInfo2.processName;
      String str5 = localServiceInfo2.name;
      if ((this.c.contains(str3)) || (this.d.contains(paramString)) || (this.e.contains(str4)) || (this.f.contains(str5)) || ((str4.equals(str3)) && ((j & ejp.c) != 0)))
      {
        k = 0;
        break label43;
      }
      this.h.a(str1);
      k = 1;
      break label43;
      break;
      localServiceInfo1 = b(paramContext, paramIntent);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ejm
 * JD-Core Version:    0.7.0.1
 */