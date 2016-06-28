import android.app.AlarmManager;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.social.networkqueue.impl.NetworkQueueAlarmReceiver;
import com.google.android.libraries.social.networkqueue.impl.NetworkQueueService;
import com.google.android.libraries.social.networkqueue.impl.PendingItemsActivity;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class ize
  implements iyk
{
  private static final long a = TimeUnit.HOURS.toMillis(1L);
  private static final long b = TimeUnit.MINUTES.toMillis(2L);
  private static final long c = TimeUnit.MINUTES.toMillis(1L);
  private final Context d;
  private final int e;
  private final String f;
  private final List<iyv> g = new LinkedList();
  private final iyt h;
  private final fy i;
  private final iyw j;
  private final boolean k;
  private final izk l;
  private la<String, iyn<iyq>> m;
  private final Object n = new Object();
  private final Object o = new Object();
  private long p;
  private boolean q;
  
  ize(Context paramContext, int paramInt, boolean paramBoolean)
  {
    this(paramContext, paramInt, paramBoolean, new iyt(paramContext), fy.a(paramContext), new iyw(paramContext), b);
  }
  
  private ize(Context paramContext, int paramInt, boolean paramBoolean, iyt paramiyt, fy paramfy, iyw paramiyw, long paramLong)
  {
    this.d = paramContext;
    this.e = paramInt;
    this.k = paramBoolean;
    this.h = paramiyt;
    this.i = paramfy;
    this.j = paramiyw;
    this.p = paramLong;
    this.f = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    this.l = ((izk)mbb.a(paramContext, izk.class));
    f();
  }
  
  private final int a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    for (;;)
    {
      int i2;
      synchronized (this.n)
      {
        int i1 = this.g.size();
        i2 = 0;
        i3 = 0;
        if (i2 < i1)
        {
          iyv localiyv = (iyv)this.g.get(i2);
          if ((paramBoolean1) && (b(localiyv))) {
            i3++;
          }
          if ((paramBoolean2) && (c(localiyv))) {
            i3++;
          }
          if ((paramBoolean3) && (d(localiyv)))
          {
            i4 = i3 + 1;
            break label118;
          }
        }
        else
        {
          return i3;
        }
      }
      int i4 = i3;
      label118:
      i2++;
      int i3 = i4;
    }
  }
  
  private long a(iyv paramiyv)
  {
    if (!this.h.a(this.e)) {
      return -1L;
    }
    synchronized (this.n)
    {
      f(paramiyv);
      if (paramiyv.e == -1L) {
        return -1L;
      }
    }
    this.g.add(paramiyv);
    j();
    i();
    return paramiyv.e;
  }
  
  static String a(Context paramContext, int paramInt)
  {
    giz localgiz = (giz)mbb.a(paramContext, giz.class);
    String str2;
    if (!localgiz.c(paramInt)) {
      str2 = "";
    }
    String str1;
    do
    {
      return str2;
      gjb localgjb = localgiz.a(paramInt);
      str1 = localgjb.b("display_name");
      str2 = localgjb.b("account_name");
    } while (TextUtils.isEmpty(str1));
    if (TextUtils.isEmpty(str2)) {
      return str1;
    }
    return 3 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + " - " + str2;
  }
  
  private static void a(iys paramiys1, iys paramiys2)
  {
    paramiys2.c += paramiys1.c;
    paramiys2.d += paramiys1.d;
    paramiys2.a += paramiys1.a;
    paramiys2.b += paramiys1.b;
    paramiys2.e += paramiys1.e;
  }
  
  private final void a(iyv paramiyv, iyp paramiyp)
  {
    iyq localiyq;
    iys localiys;
    iyr localiyr;
    long l1;
    int i4;
    synchronized (this.n)
    {
      int i1 = paramiyv.f;
      int i2 = 0;
      if (i1 != 3)
      {
        paramiyv.f = 2;
        i2 = 1;
      }
      if (i2 != 0) {
        j();
      }
      localiyq = paramiyv.a;
      if (Log.isLoggable("NetworkQueue", 4))
      {
        String str2 = String.valueOf(localiyq.a());
        if (str2.length() != 0) {
          "Processing request with handle: ".concat(str2);
        }
      }
      else
      {
        localiys = paramiyv.c;
        localiys.e = (1 + localiys.e);
        localiyr = paramiyv.d;
        l1 = System.currentTimeMillis();
        int i3 = paramiyv.f;
        i4 = 0;
        if (i3 == 2)
        {
          long l5 = paramiyv.e;
          long l6 = a;
          Context localContext2 = this.d;
          int i9 = this.e;
          long l7 = Math.max(5000L, l6);
          if (Log.isLoggable("NetworkQueueAlarm", 4)) {
            new StringBuilder(77).append("Setting timeout alarm in ").append(l7).append("ms for item ").append(l5);
          }
          AlarmManager localAlarmManager = (AlarmManager)localContext2.getSystemService("alarm");
          PendingIntent localPendingIntent = NetworkQueueAlarmReceiver.b(localContext2, i9, l5);
          localAlarmManager.cancel(localPendingIntent);
          localAlarmManager.set(2, l7 + SystemClock.elapsedRealtime(), localPendingIntent);
          i4 = 1;
        }
      }
    }
    for (;;)
    {
      int i5;
      try
      {
        int i8 = localiyq.a(localiys, localiyr);
        i5 = i8;
        if (i4 != 0)
        {
          long l4 = paramiyv.e;
          Context localContext1 = this.d;
          int i7 = this.e;
          if (Log.isLoggable("NetworkQueueAlarm", 4)) {
            new StringBuilder(54).append("Cancelling timeout alarm for item ").append(l4);
          }
          ((AlarmManager)localContext1.getSystemService("alarm")).cancel(NetworkQueueAlarmReceiver.b(localContext1, i7, l4));
        }
        if (i5 == 4)
        {
          localiys.f = (1 + localiys.f);
          if (localiys.f != 10) {
            break label589;
          }
          i6 = 5;
          paramiyp.a = 0;
          l2 = System.currentTimeMillis();
        }
      }
      catch (Exception localException)
      {
        synchronized (this.n)
        {
          long l2;
          paramiyv.f = i6;
          if (localiyr.b)
          {
            paramiyp.a = (1 + paramiyp.a);
            if (Log.isLoggable("NetworkQueue", 4))
            {
              long l3 = l2 - l1;
              new StringBuilder(43).append("Processing duration: ").append(l3).append("ms");
              new StringBuilder(34).append("Current request state: ").append(i6);
            }
            return;
            localObject2 = finally;
            throw localObject2;
            new String("Processing request with handle: ");
            break;
            localException = localException;
            if (Log.isLoggable("NetworkQueue", 4))
            {
              String str1 = String.valueOf(localException.getCause());
              new StringBuilder(20 + String.valueOf(str1).length()).append("Caught an exception ").append(str1);
            }
            i5 = 5;
            continue;
            localiys.f = 0;
          }
        }
      }
      paramiyp.a = 0;
      continue;
      label589:
      int i6 = i5;
    }
  }
  
  private static boolean b(iyv paramiyv)
  {
    if (paramiyv == null) {
      return false;
    }
    switch (paramiyv.f)
    {
    default: 
      return false;
    }
    return true;
  }
  
  private static boolean c(iyv paramiyv)
  {
    if (paramiyv == null) {
      return false;
    }
    switch (paramiyv.f)
    {
    default: 
      return false;
    }
    return true;
  }
  
  private final iyv d(long paramLong)
  {
    for (;;)
    {
      int i2;
      synchronized (this.n)
      {
        int i1 = this.g.size();
        i2 = 0;
        if (i2 < i1)
        {
          iyv localiyv = (iyv)this.g.get(i2);
          if (localiyv.e == paramLong) {
            return localiyv;
          }
        }
        else
        {
          return null;
        }
      }
      i2++;
    }
  }
  
  private static boolean d(iyv paramiyv)
  {
    return (paramiyv != null) && (paramiyv.f == 5);
  }
  
  private final void e(long paramLong)
  {
    if (Log.isLoggable("NetworkQueue", 4))
    {
      long l1 = paramLong / 1000L;
      new StringBuilder(51).append("Scheduling process in ").append(l1).append(" seconds.");
    }
    NetworkQueueAlarmReceiver.a(this.d, this.e, paramLong);
  }
  
  private final void e(iyv paramiyv)
  {
    synchronized (this.n)
    {
      switch (paramiyv.f)
      {
      default: 
        int i1 = paramiyv.f;
        throw new IllegalStateException(85 + "Processed request is in an unknown state: " + i1 + ". Keeping request in this queue.");
      }
    }
    this.l.a(this.e, paramiyv);
    this.g.remove(paramiyv);
    for (;;)
    {
      return;
      f(paramiyv);
      continue;
      f(paramiyv);
    }
    throw new IllegalStateException("Processed request is in a pending state, which is invalid. Marking this request as permanently failed and keeping request in this queue.");
  }
  
  private final void f(iyv paramiyv)
  {
    iyn localiyn;
    synchronized (this.n)
    {
      String str = paramiyv.a.a();
      localiyn = (iyn)this.m.get(str);
      if (localiyn == null) {
        throw new IllegalStateException("Attempting to serialize a request in this network queue whose serializer cannot be found.");
      }
    }
    paramiyv.e = this.l.a(this.e, paramiyv, localiyn);
  }
  
  private final iyv h()
  {
    for (;;)
    {
      int i2;
      synchronized (this.n)
      {
        int i1 = this.g.size();
        i2 = 0;
        if (i2 < i1)
        {
          iyv localiyv = (iyv)this.g.get(i2);
          if ((b(localiyv)) || (localiyv.f == 3)) {
            return localiyv;
          }
        }
        else
        {
          return null;
        }
      }
      i2++;
    }
  }
  
  private final void i()
  {
    Intent localIntent = new Intent(this.d, NetworkQueueService.class);
    localIntent.putExtra("network_queue_scheduler", 1);
    localIntent.putExtra("account_id", this.e);
    this.d.startService(localIntent);
  }
  
  private final void j()
  {
    Intent localIntent1 = new Intent();
    localIntent1.setAction("com.google.android.apps.plus.networkqueue_change");
    localIntent1.putExtras(e());
    this.i.a(localIntent1);
    iyw localiyw;
    int i1;
    int i2;
    String str1;
    String str2;
    PendingIntent localPendingIntent;
    int i6;
    label175:
    Notification.Builder localBuilder1;
    if (this.k)
    {
      if (g() <= 0) {
        break label507;
      }
      localiyw = this.j;
      i1 = this.e;
      i2 = a(true, true, false);
      int i3 = a(false, false, true);
      Resources localResources1 = localiyw.a.getResources();
      if (i3 <= 0) {
        break label370;
      }
      str1 = localResources1.getString(efj.Qh);
      str2 = a(localiyw.a, i1);
      int i5 = (int)System.currentTimeMillis();
      Intent localIntent2 = new Intent(localiyw.a, PendingItemsActivity.class);
      localIntent2.putExtra("account_id", i1);
      localPendingIntent = PendingIntent.getActivity(localiyw.a, i5, localIntent2, 0);
      if (Build.VERSION.SDK_INT < 21) {
        break label416;
      }
      i6 = 1;
      if (i6 == 0) {
        break label428;
      }
      localBuilder1 = new Notification.Builder(localiyw.a);
      localBuilder1.setContentTitle(str1);
      localBuilder1.setContentText(str2);
      localBuilder1.setSmallIcon(aau.As);
      localBuilder1.setContentIntent(localPendingIntent);
      localBuilder1.setOngoing(true);
      Notification.Builder localBuilder2 = localBuilder1.setVisibility(0);
      Context localContext = localiyw.a;
      Notification.Builder localBuilder3 = new Notification.Builder(localContext);
      localBuilder3.setContentTitle(str1);
      localBuilder3.setSmallIcon(aau.As);
      localBuilder3.setOngoing(true);
      localBuilder3.setColor(localContext.getResources().getColor(aau.Aq));
      localBuilder2.setPublicVersion(localBuilder3.build()).setCategory("social");
      if (Build.VERSION.SDK_INT < 21) {
        break label422;
      }
    }
    label416:
    label422:
    for (int i7 = 1;; i7 = 0)
    {
      if (i7 != 0) {
        localBuilder1.setColor(localiyw.a.getResources().getColor(aau.Aq));
      }
      localiyw.a(localBuilder1.build(), ":notifications:share_queue", i1);
      return;
      label370:
      Resources localResources2 = localiyw.a.getResources();
      int i4 = efj.Qg;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i2);
      str1 = localResources2.getQuantityString(i4, i2, arrayOfObject);
      break;
      i6 = 0;
      break label175;
    }
    label428:
    dk localdk = new dk(localiyw.a);
    localdk.b = dk.a(str1);
    localdk.c = dk.a(str2);
    int i8 = aau.As;
    localdk.x.icon = i8;
    localdk.d = localPendingIntent;
    localdk.a(2, true);
    localiyw.a(localdk.b(), ":notifications:share_queue", i1);
    return;
    label507:
    this.j.a(this.e);
  }
  
  private ArrayList<izc> k()
  {
    synchronized (this.n)
    {
      int i1 = this.g.size();
      ArrayList localArrayList = new ArrayList(i1);
      for (int i2 = 0; i2 < i1; i2++)
      {
        iyv localiyv = (iyv)this.g.get(i2);
        iyq localiyq = localiyv.a;
        localArrayList.add(new izc(this.d, this.e, localiyv.b.getTime(), 0, localiyq.b(), localiyq.c(), localiyv.f, localiyv.e));
      }
      return localArrayList;
    }
  }
  
  public final int a()
  {
    return a(true, true, false);
  }
  
  public final long a(iyq paramiyq)
  {
    return a(new iyv(paramiyq));
  }
  
  public final void a(iyp paramiyp)
  {
    long l1 = System.currentTimeMillis();
    la localla = new la();
    long l2 = System.currentTimeMillis();
    for (;;)
    {
      iyv localiyv2;
      izf localizf2;
      long l5;
      synchronized (this.o)
      {
        if (!this.g.isEmpty())
        {
          long l4 = System.currentTimeMillis() - l2;
          if (this.p - l4 <= 0L) {
            e(c);
          }
        }
        else
        {
          int i1 = localla.size();
          int i2 = 0;
          if (i2 >= i1) {
            break label628;
          }
          String str1 = (String)localla.b[(i2 << 1)];
          izf localizf1 = (izf)localla.get(str1);
          int i3 = str1.hashCode();
          if (localizf1.a > 0)
          {
            kqj localkqj = new kqj(this.f, i3, localizf1.a, localizf1.b, localizf1.c.e, localizf1.c.c, localizf1.c.d, localizf1.c.a, localizf1.c.b);
            Context localContext1 = this.d;
            ((gww)mbb.a(localContext1, gww.class)).a(localContext1, localkqj);
          }
          if (localizf1.d > 0)
          {
            kqi localkqi = new kqi(this.f, i3, false, localizf1.d, localizf1.e, localizf1.f.e, localizf1.f.c, localizf1.f.d, localizf1.f.a, localizf1.f.b);
            Context localContext2 = this.d;
            ((gww)mbb.a(localContext2, gww.class)).a(localContext2, localkqi);
          }
          i2++;
          continue;
        }
        localiyv2 = h();
        if (localiyv2 == null)
        {
          if (!Log.isLoggable("NetworkQueue", 4)) {
            continue;
          }
          continue;
        }
        String str2 = localiyv2.a.a();
        localizf2 = (izf)localla.get(str2);
        if (localizf2 != null) {
          break label706;
        }
        izf localizf3 = new izf();
        localla.put(str2, localizf3);
        localizf4 = localizf3;
        a(localiyv2, paramiyp);
        e(localiyv2);
        j();
        l5 = System.currentTimeMillis();
        if (!this.g.contains(localiyv2)) {
          break label713;
        }
        if ((localiyv2 != null) && (localiyv2.f == 1))
        {
          i4 = 1;
          if (i4 != 0) {
            break label713;
          }
          if (!d(localiyv2)) {
            break label570;
          }
          break label713;
          if (i5 == 0) {
            continue;
          }
          switch (localiyv2.f)
          {
          case 1: 
            localizf4.a = (1 + localizf4.a);
            localizf4.b = ((int)(localizf4.b + (l5 - localiyv2.b.getTime())));
            a(localiyv2.c, localizf4.c);
          }
        }
      }
      int i4 = 0;
      continue;
      label570:
      int i5 = 0;
      continue;
      localizf4.d = (1 + localizf4.d);
      localizf4.e = ((int)(localizf4.e + (l5 - localiyv2.b.getTime())));
      a(localiyv2.c, localizf4.f);
      continue;
      label628:
      iyv localiyv1 = h();
      if ((c(localiyv1)) && (localiyv1.a.e())) {
        e(c);
      }
      if (Log.isLoggable("NetworkQueue", 4))
      {
        long l3 = System.currentTimeMillis() - l1;
        new StringBuilder(59).append("Queue processing operation duration: ").append(l3).append("ms");
      }
      return;
      label706:
      izf localizf4 = localizf2;
      continue;
      label713:
      i5 = 1;
    }
  }
  
  public final boolean a(long paramLong)
  {
    iyv localiyv;
    synchronized (this.n)
    {
      localiyv = d(paramLong);
      if (localiyv == null) {
        return false;
      }
      if (localiyv.f == 2) {
        return false;
      }
    }
    this.l.a(this.e, localiyv);
    localiyv.a.d();
    this.g.remove(localiyv);
    j();
    if (a(true, true, false) > 0) {
      i();
    }
    for (;;)
    {
      return true;
      NetworkQueueAlarmReceiver.a(this.d, this.e);
    }
  }
  
  public final int b()
  {
    return this.e;
  }
  
  public final iys b(long paramLong)
  {
    iyv localiyv = d(paramLong);
    if (localiyv == null) {
      return null;
    }
    return localiyv.c;
  }
  
  public final iyr c(long paramLong)
  {
    iyv localiyv = d(paramLong);
    if (localiyv == null) {
      return null;
    }
    return localiyv.d;
  }
  
  final void c()
  {
    synchronized (this.n)
    {
      if (this.q) {
        return;
      }
      this.q = true;
      if (!this.g.isEmpty()) {
        throw new IllegalStateException("Attempting to restore to non-empty in-memory network queue.");
      }
    }
    try
    {
      this.g.addAll(this.l.a(this.e, this.m));
      if (!this.g.isEmpty())
      {
        j();
        i();
      }
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      if (!Log.isLoggable("NetworkQueue", 6)) {
        break label153;
      }
    }
    String str1 = String.valueOf("An exception occurred when attempting to deserialize all requests in this network queue:");
    String str2 = String.valueOf(localRuntimeException.getMessage());
    if (str2.length() != 0) {}
    for (String str3 = str1.concat(str2);; str3 = new String(str1))
    {
      Log.e("NetworkQueue", str3);
      label153:
      d();
      break;
    }
  }
  
  public final void d()
  {
    synchronized (this.n)
    {
      int i1 = this.g.size();
      for (int i2 = 0; i2 < i1; i2++) {
        ((iyv)this.g.get(i2)).a.d();
      }
      this.l.a(this.e);
      this.g.clear();
      j();
      return;
    }
  }
  
  final Bundle e()
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("account_id", this.e);
    localBundle.putParcelableArrayList("networkqueue_change_displayitems", k());
    return localBundle;
  }
  
  final void f()
  {
    List localList = ((iyo)mbb.a(this.d, iyo.class)).a(this.d, this.e);
    this.m = new la(localList.size());
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      iyn localiyn = (iyn)localIterator.next();
      this.m.put(localiyn.a(), localiyn);
    }
  }
  
  final int g()
  {
    synchronized (this.n)
    {
      int i1 = this.g.size();
      return i1;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ize
 * JD-Core Version:    0.7.0.1
 */