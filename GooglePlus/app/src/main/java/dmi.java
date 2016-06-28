import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.service.EsSyncAdapterService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class dmi
  extends AbstractThreadedSyncAdapter
{
  final Context a;
  final giz b;
  final ilb c;
  final gxx d;
  private final hba e;
  
  public dmi(Context paramContext)
  {
    super(paramContext, false);
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
    this.c = ((ilb)mbb.a(paramContext, ilb.class));
    this.d = ((gxx)mbb.a(paramContext, gxx.class));
    this.e = ((hba)mbb.a(paramContext, hba.class));
  }
  
  static dmg a(String paramString)
  {
    synchronized (EsSyncAdapterService.e)
    {
      dmg localdmg = (dmg)EsSyncAdapterService.e.get(paramString);
      if (localdmg == null)
      {
        localdmg = new dmg();
        EsSyncAdapterService.e.put(paramString, localdmg);
      }
      return localdmg;
    }
  }
  
  private final void a(int paramInt, kck paramkck, lrh paramlrh, brm parambrm)
  {
    if ((this.b.a(paramInt).c("is_google_plus")) && (EsSyncAdapterService.c(this.a, paramInt)) && (!bgp.f(this.a, paramInt)))
    {
      blg localblg = new blg(this.a, new kcg(this.a, paramInt, paramkck), paramInt);
      localblg.i();
      localblg.d("EsSyncAdapterService");
    }
    String str1 = this.b.a(paramInt).b("account_name");
    if (EsSyncAdapterService.c(this.a, paramInt))
    {
      EsSyncAdapterService.a(this.a, str1, 41);
      long l5 = bgp.a(this.a, paramInt, dnn.a);
      long l6 = brg.f(this.a, paramInt);
      if (l6 <= 0L) {
        l6 = dnn.a.f;
      }
      if (System.currentTimeMillis() - l5 > l6) {
        brg.a(this.a, paramInt, paramkck, paramlrh, parambrm, 1, 4, null, false);
      }
      EsSyncAdapterService.a(this.a, str1, 42);
    }
    bjw localbjw;
    lrw locallrw;
    boolean bool1;
    label454:
    kqn localkqn;
    label470:
    label485:
    lrm locallrm;
    int i;
    if (this.b.a(paramInt).c("is_google_plus"))
    {
      EsSyncAdapterService.a(this.a, str1, 49);
      long l3 = bgp.a(this.a, paramInt, dnn.c);
      long l4 = bgp.m(this.a, paramInt);
      if (l4 <= 0L) {
        l4 = dnn.c.f;
      }
      if (System.currentTimeMillis() - l3 > l4)
      {
        Context localContext2 = this.a;
        localbjw = new bjw(localContext2, new kcg(localContext2, paramInt, true, null), paramInt);
        localbjw.i();
        if (localbjw.n()) {
          break label552;
        }
        int m = bgp.k(localContext2, paramInt);
        ArrayList localArrayList = localbjw.a;
        int n = localArrayList.size();
        bgp.a(localContext2, paramInt, localArrayList, localbjw.b, true);
        localContext2.getContentResolver().notifyChange(EsProvider.a(EsProvider.c(localContext2), paramInt), null);
        if (n > m)
        {
          bgq localbgq = new bgq(localContext2, paramInt);
          efj.m().post(localbgq);
        }
      }
      EsSyncAdapterService.a(this.a, str1, 50);
    }
    else
    {
      locallrw = (lrw)mbb.a(this.a, lrw.class);
      String str2 = locallrw.b(paramInt);
      if (str2 == null) {
        break label992;
      }
      if (locallrw.g != null) {
        break label563;
      }
      bool1 = false;
      if (!bool1) {
        break label579;
      }
      localkqn = new kqn(str2);
      Iterator localIterator1 = locallrw.c.values().iterator();
      if (!localIterator1.hasNext()) {
        break label949;
      }
      locallrm = (lrm)localIterator1.next();
      if (!paramkck.b()) {
        break label585;
      }
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        locallrw.a(locallrm.a(), paramkck, paramInt, paramlrh);
      }
      break label485;
      label552:
      localbjw.c("EsAccountsData");
      break;
      label563:
      bool1 = locallrw.g.c(paramInt);
      break label454;
      label579:
      localkqn = null;
      break label470;
      label585:
      Long localLong = locallrm.a(paramInt);
      if (localLong == null)
      {
        i = 0;
      }
      else
      {
        long l1 = locallrw.a(paramInt, locallrm);
        long l2 = locallrw.e.a() - l1;
        if (l2 <= localLong.longValue() - lrw.a)
        {
          i = 0;
        }
        else
        {
          int j = locallrm.b();
          if ((localkqn != null) && (j != 0)) {
            localkqn.b.put(j, Long.valueOf(l2));
          }
          if (locallrw.g == null) {}
          for (boolean bool2 = false;; bool2 = locallrw.g.b(paramInt))
          {
            if (bool2) {
              break label736;
            }
            i = 1;
            break;
          }
          label736:
          Iterator localIterator2 = locallrm.f().iterator();
          for (;;)
          {
            if (localIterator2.hasNext())
            {
              lrq locallrq = (lrq)localIterator2.next();
              if (lrw.a(locallrq, l2))
              {
                if ((localkqn != null) && (j != 0))
                {
                  int k = locallrq.a.a();
                  if (localkqn.a.indexOfKey(j) < 0) {
                    localkqn.a.put(j, new SparseIntArray());
                  }
                  ((SparseIntArray)localkqn.a.get(j)).put(k, 2);
                }
              }
              else if (!locallrq.a.a(paramInt))
              {
                if (localkqn != null)
                {
                  if (localkqn.b.indexOfKey(j) >= 0) {
                    localkqn.b.remove(j);
                  }
                  if (localkqn.a.indexOfKey(j) >= 0) {
                    localkqn.a.remove(j);
                  }
                }
                i = 0;
                break;
              }
            }
          }
          i = 1;
        }
      }
    }
    label949:
    if (localkqn != null)
    {
      Context localContext1 = locallrw.d;
      if (localkqn.b.size() > 0) {
        ((gww)mbb.a(localContext1, gww.class)).a(localContext1, localkqn);
      }
    }
    label992:
    EsProvider.a(this.a, paramInt);
  }
  
  private final void a(int paramInt, lrh paramlrh)
  {
    lrw locallrw = (lrw)mbb.a(this.a, lrw.class);
    kck localkck = new kck();
    localkck.n = false;
    localkck.a("Mandatory sync");
    try
    {
      String str = this.b.a(paramInt).b("account_name");
      locallrw.a("experiments", localkck, paramInt, paramlrh);
      if (!a(paramInt))
      {
        this.c.a(str, ilb.a);
        return;
      }
      Iterator localIterator = locallrw.c.values().iterator();
      while (localIterator.hasNext())
      {
        lrm locallrm = (lrm)localIterator.next();
        if (locallrm.e()) {
          locallrw.a(locallrm.a(), localkck, paramInt, paramlrh);
        }
      }
      ((hsp)mbb.a(this.a, hsp.class)).a(this.a, paramInt, false);
    }
    finally
    {
      localkck.e();
    }
    Context localContext1 = this.a;
    biv localbiv = new biv(localContext1, new kcg(localContext1, paramInt, localkck), paramInt);
    localkck.b("App upgrade status");
    localbiv.i();
    localkck.d();
    localbiv.d("EsAccountsData");
    dml.a(this.a, paramInt);
    nmv localnmv;
    nig localnig;
    boolean bool;
    int i;
    label363:
    int j;
    if (this.b.a(paramInt).c("is_google_plus"))
    {
      localnmv = new nmv();
      hcd localhcd = hcd.a(this.a);
      localnig = new nig();
      if (localhcd.e()) {
        break label657;
      }
      bool = true;
      localnig.f = Boolean.valueOf(bool);
      localnig.a = Boolean.valueOf(this.e.c(paramInt).c("auto_backup_enabled"));
      if (!localhcd.b()) {
        break label663;
      }
      i = 1;
      localnig.c = i;
      if (!localhcd.f()) {
        break label669;
      }
      j = 1;
      label383:
      localnig.b = j;
      localnig.e = Boolean.valueOf(localhcd.d());
      if (!localhcd.c()) {
        break label675;
      }
    }
    label657:
    label663:
    label669:
    label675:
    for (int k = 1;; k = 2)
    {
      localnig.d = k;
      localnmv.b = localnig;
      nly localnly = new nly();
      localnly.c = Boolean.valueOf(cux.b(this.a, paramInt));
      localnly.a = Boolean.valueOf(cux.a(this.a, paramInt));
      localnly.b = Boolean.valueOf(cux.d(this.a, paramInt));
      localnmv.a = localnly;
      Context localContext2 = this.a;
      njl localnjl = new njl();
      localnjl.a = Boolean.valueOf(bgp.g(localContext2, paramInt));
      localnjl.b = Boolean.valueOf(bgp.h(localContext2, paramInt));
      localnmv.c = localnjl;
      Bundle localBundle = new Bundle();
      localBundle.putByteArray("extra_user_settings_state", qat.a(localnmv));
      gxx localgxx = this.d;
      gxw localgxw = new gxw(this.a, paramInt);
      localgxw.c = gxz.t;
      localgxw.d = gya.n;
      if (localBundle != null) {
        localgxw.h.putAll(localBundle);
      }
      localgxx.a(localgxw);
      ((hum)mbb.a(this.a, hum.class)).a(this.a, paramInt);
      localkck.e();
      return;
      bool = false;
      break;
      i = 2;
      break label363;
      j = 2;
      break label383;
    }
  }
  
  private static boolean a(Bundle paramBundle, dmg paramdmg)
  {
    synchronized (paramdmg.b)
    {
      boolean bool = ???.isEmpty();
      if (paramBundle == null) {
        paramBundle = new Bundle();
      }
      if (Log.isLoggable("EsSyncAdapterService", 4))
      {
        String str = String.valueOf(paramBundle.toString());
        if (str.length() != 0)
        {
          ">>>>>>>> Adding bundle".concat(str);
          ???.contains(paramBundle);
        }
      }
      else
      {
        ???.offer(paramBundle);
        return bool;
      }
      new String(">>>>>>>> Adding bundle");
    }
  }
  
  private final void b(int paramInt)
  {
    kck localkck = new kck();
    localkck.n = false;
    localkck.a("CheckAndEngage sync");
    try
    {
      boolean bool = a(paramInt);
      if (!bool) {
        return;
      }
      Context localContext = this.a;
      if (((hyi)mbb.a(localContext, hyi.class)).b(bwb.p, paramInt))
      {
        bhw localbhw = new bhw(localContext, paramInt);
        localbhw.i();
        if (localbhw.n()) {
          localbhw.c("CloseTiesNotifications");
        }
      }
      return;
    }
    finally
    {
      localkck.e();
    }
  }
  
  final void a(List<Integer> paramList, Bundle paramBundle, dmg paramdmg, lrk paramlrk)
  {
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    if (a(paramBundle, paramdmg)) {}
    for (;;)
    {
      Bundle localBundle;
      int i;
      synchronized (paramdmg.b)
      {
        localBundle = (Bundle)paramdmg.b.poll();
        if (localBundle != null)
        {
          Iterator localIterator = paramList.iterator();
          if (!localIterator.hasNext()) {
            continue;
          }
          i = ((Integer)localIterator.next()).intValue();
          if (this.b.a(i).c("logged_out")) {
            continue;
          }
        }
      }
      try
      {
        kck localkck = paramdmg.a;
        lrh locallrh = new lrh(paramlrk);
        int j;
        int k;
        int m;
        Object localObject2;
        Object localObject3;
        if (localBundle != null) {
          if (localBundle.getInt("sync_what", 0) == 2)
          {
            j = 41;
            k = 42;
            m = 2;
            localObject2 = null;
            localObject3 = "notifications";
          }
        }
        for (;;)
        {
          label158:
          boolean bool = localBundle.getBoolean("sync_from_tickle", false);
          if (bool) {
            localObject3 = String.valueOf(localObject3).concat(", from tickle");
          }
          label220:
          brm localbrm;
          if (Log.isLoggable("EsSyncAdapterService", 4))
          {
            String str2 = String.valueOf(localObject3);
            if (str2.length() != 0) {
              "onPerformSync: ====> Starting sync: ".concat(str2);
            }
          }
          else
          {
            localkck.a(10 + String.valueOf(localObject3).length() + "G+ sync (" + (String)localObject3 + ")");
            if (!bool) {
              break label712;
            }
            localbrm = brm.a;
          }
          gjb localgjb;
          String str1;
          for (;;)
          {
            try
            {
              localgjb = this.b.a(i);
              str1 = localgjb.b("account_name");
            }
            catch (gjd localgjd)
            {
              int n;
              String str3;
              lrw locallrw;
              lrm locallrm;
              lrl locallrl;
              label712:
              throw new dmh(localgjd);
            }
            try
            {
              EsSyncAdapterService.a(this.a, str1, j);
              switch (m)
              {
              default: 
                Log.e("EsSyncAdapterService", "Ignoring unsolicited sync request");
              }
            }
            catch (IOException localIOException1)
            {
              long l;
              i1 = 1;
              if (i1 == 0) {
                break label1223;
              }
              paramlrk.a.incrementAndGet();
              if (this.b.c(i)) {
                break label843;
              }
              paramlrk.a.set(0);
              localkck.e();
              EsSyncAdapterService.a(this.a, str1, k);
              new kqg(4).b(this.a);
              continue;
              if (localgjb.c("GCM_ENABLED")) {
                continue;
              }
              ((izy)mbb.a(this.a, izy.class)).a(i, izx.a, jan.c);
              continue;
            }
            catch (Exception localException)
            {
              paramlrk.b.incrementAndGet();
              if (this.b.c(i)) {
                break label954;
              }
              paramlrk.a.set(0);
              localkck.e();
              EsSyncAdapterService.a(this.a, str1, k);
              new kqg(4).b(this.a);
              continue;
              if (!this.b.a(i).c("is_google_plus")) {
                continue;
              }
              bqo.a(this.a, i, localkck, locallrh);
              continue;
            }
            finally
            {
              if (this.b.c(i)) {
                break label1050;
              }
              paramlrk.a.set(0);
              localkck.e();
              EsSyncAdapterService.a(this.a, str1, k);
              new kqg(4).b(this.a);
            }
            if (!this.b.c(i)) {
              paramlrk.a.set(0);
            }
            localkck.e();
            EsSyncAdapterService.a(this.a, str1, k);
            new kqg(4).b(this.a);
            if ((!Log.isLoggable("EsSyncAdapterService", 3)) || (paramlrk.a.get() > 0) || (paramlrk.b.get() > 0)) {
              break;
            }
            n = paramlrk.c.get();
            if (n <= 0) {
              break;
            }
            break;
            localObject1 = finally;
            throw localObject1;
            if (localBundle.getInt("sync_what", 0) == 3)
            {
              j = 31;
              k = 32;
              m = 3;
              localObject3 = "events";
              localObject2 = null;
              break label158;
            }
            if (localBundle.getBoolean("sync_mandatory"))
            {
              j = 39;
              k = 40;
              m = 4;
              localObject3 = "mandatory";
              localObject2 = null;
              break label158;
            }
            if (localBundle.getBoolean("sync_periodic"))
            {
              j = 43;
              k = 44;
              m = 1;
              localObject3 = "full, periodic";
              localObject2 = null;
              break label158;
            }
            if (localBundle.getBoolean("sync_check_and_engage"))
            {
              j = 23;
              k = 24;
              m = 5;
              localObject3 = "check and engage";
              localObject2 = null;
              break label158;
            }
            str3 = localBundle.getString("synclet_name");
            if (str3 == null) {
              break label1236;
            }
            locallrw = (lrw)mbb.a(this.a, lrw.class);
            locallrm = (lrm)locallrw.c.get(str3);
            locallrl = (lrl)locallrw.b.get(str3);
            j = locallrm.c();
            k = locallrm.d();
            m = 6;
            localObject2 = locallrl;
            localObject3 = str3;
            break label158;
            new String("onPerformSync: ====> Starting sync: ");
            break label220;
            localbrm = brm.b;
            continue;
            if (!EsSyncAdapterService.c(this.a, i)) {
              break label877;
            }
            if (Log.isLoggable("EsSyncAdapterService", 4))
            {
              l = System.currentTimeMillis();
              new StringBuilder(80).append(l).append(" doFullSync: ====> Starting EsNotification.syncNotifications");
            }
            brg.a(this.a, i, localkck, locallrh, localbrm, 1, 4, null, false);
          }
          for (;;)
          {
            for (;;)
            {
              int i1;
              label843:
              label877:
              a(i, locallrh);
              label954:
              break;
              label1050:
              b(i);
              break;
              bqj.a(this.a, i).getWritableDatabase().delete("sync_status", null, null);
              hsb.a(((lrw)mbb.a(this.a, lrw.class)).d, i).delete("synclet_status", null, null);
              a(i, localkck, locallrh, localbrm);
              break;
              try
              {
                localkck.n = false;
                a(i, localkck, locallrh, localbrm);
                paramlrk.a.set(0);
              }
              catch (IOException localIOException2)
              {
                i1 = 0;
              }
            }
            continue;
            localObject2.a(localkck, i, locallrh);
            break;
            label1223:
            paramlrk.a.set(0);
          }
          return;
          label1236:
          k = 38;
          localObject3 = "full, explicit";
          j = 37;
          localObject2 = null;
          m = 0;
        }
      }
      catch (dmh localdmh) {}
    }
  }
  
  final boolean a(int paramInt)
  {
    try
    {
      gjb localgjb = this.b.a(paramInt);
      boolean bool1;
      if (!localgjb.c("is_google_plus"))
      {
        boolean bool2 = localgjb.c("gplus_no_mobile_tos");
        bool1 = false;
        if (!bool2) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    catch (gjd localgjd) {}
    return false;
  }
  
  final boolean a(Account paramAccount, String paramString1, String paramString2)
  {
    String[] arrayOfString = new String[5];
    arrayOfString[0] = EsProvider.a(this.a);
    arrayOfString[1] = paramString1;
    arrayOfString[2] = paramAccount.name;
    arrayOfString[3] = paramAccount.type;
    arrayOfString[4] = paramString2;
    Cursor localCursor = getContext().getContentResolver().query(dnm.a, new String[] { "_id" }, "authority = ? AND feed = ? AND _sync_account = ? AND _sync_account_type = ? AND service = ?", arrayOfString, null);
    if (localCursor == null) {
      return false;
    }
    try
    {
      boolean bool = localCursor.moveToFirst();
      return bool;
    }
    finally
    {
      localCursor.close();
    }
  }
  
  final List<Integer> b(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = this.b.a(paramString);
    if (i != -1)
    {
      localArrayList.add(Integer.valueOf(i));
      Iterator localIterator = this.b.a(new String[] { "logged_in", "is_managed_account" }).iterator();
      while (localIterator.hasNext())
      {
        int j = ((Integer)localIterator.next()).intValue();
        if (TextUtils.equals(this.b.a(j).b("account_name"), paramString)) {
          localArrayList.add(Integer.valueOf(j));
        }
      }
    }
    return localArrayList;
  }
  
  final void b(Account paramAccount, String paramString1, String paramString2)
  {
    if (Log.isLoggable("EsSyncAdapterService", 3))
    {
      String str = String.valueOf(paramString1);
      if (str.length() == 0) {
        break label54;
      }
      "  --> Subscribe feed: ".concat(str);
    }
    for (;;)
    {
      efj.a(getContext().getContentResolver(), paramString1, paramAccount, EsProvider.a(this.a), paramString2);
      return;
      label54:
      new String("  --> Subscribe feed: ");
    }
  }
  
  /* Error */
  public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, android.content.ContentProviderClient paramContentProviderClient, android.content.SyncResult paramSyncResult)
  {
    // Byte code:
    //   0: iconst_1
    //   1: invokestatic 852	java/util/concurrent/Executors:newFixedThreadPool	(I)Ljava/util/concurrent/ExecutorService;
    //   4: astore 6
    //   6: new 649	lrk
    //   9: dup
    //   10: invokespecial 853	lrk:<init>	()V
    //   13: astore 7
    //   15: aload 6
    //   17: new 855	dmj
    //   20: dup
    //   21: aload_0
    //   22: aload_1
    //   23: aload_2
    //   24: aload 7
    //   26: invokespecial 858	dmj:<init>	(Ldmi;Landroid/accounts/Account;Landroid/os/Bundle;Llrk;)V
    //   29: invokeinterface 864 2 0
    //   34: astore 8
    //   36: aload_0
    //   37: getfield 21	dmi:a	Landroid/content/Context;
    //   40: invokevirtual 173	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   43: ldc_w 866
    //   46: sipush 300
    //   49: invokestatic 871	fpf:a	(Landroid/content/ContentResolver;Ljava/lang/String;I)I
    //   52: i2l
    //   53: lstore 9
    //   55: aload 8
    //   57: lload 9
    //   59: getstatic 877	java/util/concurrent/TimeUnit:SECONDS	Ljava/util/concurrent/TimeUnit;
    //   62: invokeinterface 882 4 0
    //   67: pop
    //   68: aload 6
    //   70: invokeinterface 885 1 0
    //   75: pop
    //   76: aload 5
    //   78: getfield 891	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   81: aload 7
    //   83: getfield 652	lrk:a	Ljava/util/concurrent/atomic/AtomicInteger;
    //   86: invokevirtual 664	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   89: i2l
    //   90: putfield 896	android/content/SyncStats:numIoExceptions	J
    //   93: aload 5
    //   95: getfield 891	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   98: aload 7
    //   100: getfield 666	lrk:b	Ljava/util/concurrent/atomic/AtomicInteger;
    //   103: invokevirtual 664	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   106: i2l
    //   107: putfield 899	android/content/SyncStats:numParseExceptions	J
    //   110: aload 5
    //   112: getfield 891	android/content/SyncResult:stats	Landroid/content/SyncStats;
    //   115: aload 7
    //   117: getfield 668	lrk:c	Ljava/util/concurrent/atomic/AtomicInteger;
    //   120: invokevirtual 664	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   123: i2l
    //   124: putfield 902	android/content/SyncStats:numAuthExceptions	J
    //   127: return
    //   128: astore 20
    //   130: aload 20
    //   132: invokevirtual 906	java/util/concurrent/ExecutionException:getCause	()Ljava/lang/Throwable;
    //   135: astore 21
    //   137: aload 21
    //   139: instanceof 908
    //   142: ifeq +22 -> 164
    //   145: aload 21
    //   147: checkcast 908	java/lang/RuntimeException
    //   150: athrow
    //   151: astore 15
    //   153: aload 6
    //   155: invokeinterface 885 1 0
    //   160: pop
    //   161: aload 15
    //   163: athrow
    //   164: aload 21
    //   166: instanceof 910
    //   169: ifeq +9 -> 178
    //   172: aload 21
    //   174: checkcast 910	java/lang/Error
    //   177: athrow
    //   178: new 908	java/lang/RuntimeException
    //   181: dup
    //   182: aload 21
    //   184: invokespecial 911	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   187: athrow
    //   188: astore 17
    //   190: aload 8
    //   192: iconst_1
    //   193: invokeinterface 915 2 0
    //   198: pop
    //   199: aload 6
    //   201: invokeinterface 885 1 0
    //   206: pop
    //   207: return
    //   208: astore 11
    //   210: aload 8
    //   212: iconst_1
    //   213: invokeinterface 915 2 0
    //   218: pop
    //   219: ldc 97
    //   221: ldc_w 917
    //   224: invokestatic 646	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   227: pop
    //   228: aload 6
    //   230: invokeinterface 885 1 0
    //   235: pop
    //   236: goto -160 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	239	0	this	dmi
    //   0	239	1	paramAccount	Account
    //   0	239	2	paramBundle	Bundle
    //   0	239	3	paramString	String
    //   0	239	4	paramContentProviderClient	android.content.ContentProviderClient
    //   0	239	5	paramSyncResult	android.content.SyncResult
    //   4	225	6	localExecutorService	java.util.concurrent.ExecutorService
    //   13	103	7	locallrk	lrk
    //   34	177	8	localFuture	java.util.concurrent.Future
    //   53	5	9	l	long
    //   208	1	11	localTimeoutException	java.util.concurrent.TimeoutException
    //   151	11	15	localObject	Object
    //   188	1	17	localInterruptedException	java.lang.InterruptedException
    //   128	3	20	localExecutionException	java.util.concurrent.ExecutionException
    //   135	48	21	localThrowable	java.lang.Throwable
    // Exception table:
    //   from	to	target	type
    //   55	68	128	java/util/concurrent/ExecutionException
    //   55	68	151	finally
    //   130	151	151	finally
    //   164	178	151	finally
    //   178	188	151	finally
    //   190	199	151	finally
    //   210	228	151	finally
    //   55	68	188	java/lang/InterruptedException
    //   55	68	208	java/util/concurrent/TimeoutException
  }
  
  public final void onSyncCanceled()
  {
    super.onSyncCanceled();
    if (EsSyncAdapterService.f != null) {
      EsSyncAdapterService.f.a.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmi
 * JD-Core Version:    0.7.0.1
 */