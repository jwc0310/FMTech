import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.photos.service.GooglePhotoDownsyncService;
import java.util.Iterator;
import java.util.List;

public final class auq
  extends AbstractThreadedSyncAdapter
{
  private giz a;
  private bup b;
  
  public auq(Context paramContext)
  {
    super(paramContext, false);
    this.a = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final void a(int paramInt, bup parambup, SyncResult paramSyncResult, boolean paramBoolean)
  {
    try
    {
      if (Log.isLoggable("PhotoSyncService", 4)) {
        new StringBuilder(66).append("----> Start highlights metadata down sync for account: ").append(paramInt);
      }
      bsn localbsn = bsn.e;
      bry.a(getContext(), paramInt, parambup, localbsn);
      bgp.a(getContext(), paramInt, dnn.b, System.currentTimeMillis());
      return;
    }
    catch (Exception localException)
    {
      do
      {
        if (Log.isLoggable("PhotoSyncService", 6)) {
          Log.e("PhotoSyncService", 65 + "----> doHighlightsMetadataDownSync error for account: " + paramInt);
        }
      } while (GooglePhotoDownsyncService.a(localException));
      SyncStats localSyncStats = paramSyncResult.stats;
      localSyncStats.numIoExceptions = (1L + localSyncStats.numIoExceptions);
    }
  }
  
  private final void a(List<Integer> paramList, bup parambup, SyncResult paramSyncResult)
  {
    hyi localhyi = (hyi)mbb.a(getContext(), hyi.class);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (localhyi.b(bwb.g, i))
      {
        try
        {
          a(i, parambup, paramSyncResult, false);
        }
        catch (Exception localException)
        {
          Log.e("PhotoSyncService", 83 + "----> performUnconditionalHighlightsMetadataDownSync error for account: " + i, localException);
        }
        if (!GooglePhotoDownsyncService.a(localException))
        {
          SyncStats localSyncStats = paramSyncResult.stats;
          localSyncStats.numIoExceptions = (1L + localSyncStats.numIoExceptions);
        }
      }
    }
  }
  
  private final void a(List<Integer> paramList, bup parambup, SyncResult paramSyncResult, boolean paramBoolean)
  {
    Context localContext = getContext();
    hyi localhyi = (hyi)mbb.a(localContext, hyi.class);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      if (localhyi.b(bwb.g, i))
      {
        long l2;
        long l3;
        for (;;)
        {
          try
          {
            long l1 = bgp.a(localContext, i, dnn.b);
            l2 = System.currentTimeMillis() - l1;
            if (!paramBoolean) {
              break label224;
            }
            l3 = dnn.b.f;
            if (l2 <= l3) {
              break label249;
            }
            if (Log.isLoggable("PhotoSyncService", 4)) {
              new StringBuilder(59).append("----> Highlights sync for account: ").append(i).append(" starting now");
            }
            a(i, parambup, paramSyncResult, false);
          }
          catch (Exception localException)
          {
            if (Log.isLoggable("PhotoSyncService", 6)) {
              Log.e("PhotoSyncService", 81 + "----> performConditionalHighlightsMetadataDownSync error for account: " + i, localException);
            }
          }
          if (GooglePhotoDownsyncService.a(localException)) {
            break;
          }
          SyncStats localSyncStats = paramSyncResult.stats;
          localSyncStats.numIoExceptions = (1L + localSyncStats.numIoExceptions);
          break;
          label224:
          l3 = Math.max(1000L * bsp.b(localContext, i), dnn.b.f);
        }
        label249:
        if (Log.isLoggable("PhotoSyncService", 4))
        {
          long l4 = (l3 - l2) / 1000L;
          new StringBuilder(83).append("----> Highlights sync for account: ").append(i).append(" is due in: ").append(l4).append(" secs");
        }
      }
    }
  }
  
  private final void a(List<Integer> paramList, bup parambup, SyncResult paramSyncResult, boolean paramBoolean1, boolean paramBoolean2)
  {
    gxz localgxz;
    if (paramBoolean2)
    {
      localgxz = gxz.dF;
      parambup.a("Photo down-sync", gya.M, localgxz);
    }
    for (;;)
    {
      try
      {
        Iterator localIterator = paramList.iterator();
        if (!localIterator.hasNext()) {
          break label250;
        }
        int k = ((Integer)localIterator.next()).intValue();
        try
        {
          if (Log.isLoggable("PhotoSyncService", 4)) {
            new StringBuilder(66).append("----> Start all photos metadata down sync for account: ").append(k);
          }
          if (!paramBoolean1) {
            break label238;
          }
          localObject2 = bsn.f;
          ((dka)mbb.a(getContext(), dka.class)).a(k, parambup, (bsn)localObject2);
        }
        catch (Exception localException)
        {
          if (Log.isLoggable("PhotoSyncService", 6)) {
            Log.e("PhotoSyncService", 64 + "----> doAllPhotosMetadataDownSync error for account: " + k, localException);
          }
        }
        if (GooglePhotoDownsyncService.a(localException)) {
          continue;
        }
        SyncStats localSyncStats = paramSyncResult.stats;
        localSyncStats.numIoExceptions = (1L + localSyncStats.numIoExceptions);
        continue;
        int i;
        if (!paramBoolean1) {
          break label230;
        }
      }
      finally
      {
        i = ((Integer)paramList.get(0)).intValue();
        parambup.a(getContext(), i);
      }
      localgxz = gxz.dE;
      break;
      label230:
      localgxz = gxz.dG;
      break;
      label238:
      bsn localbsn = bsn.e;
      Object localObject2 = localbsn;
    }
    label250:
    if ((!paramBoolean1) && (!paramBoolean2)) {
      a(paramList, parambup, paramSyncResult);
    }
    for (;;)
    {
      b(paramList, parambup, paramSyncResult);
      int j = ((Integer)paramList.get(0)).intValue();
      parambup.a(getContext(), j);
      return;
      a(paramList, parambup, paramSyncResult, paramBoolean1);
    }
  }
  
  private final void b(List<Integer> paramList, bup parambup, SyncResult paramSyncResult)
  {
    Context localContext = getContext();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      if (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        gjb localgjb = this.a.a(i);
        long l1 = bgp.a(localContext, i, dnn.d);
        long l2 = System.currentTimeMillis() - l1;
        long l3 = dnn.d.f;
        if (l2 < l3)
        {
          if (Log.isLoggable("PhotoSyncService", 4))
          {
            long l4 = (l3 - l2) / 1000L;
            new StringBuilder(78).append("----> Media sync for account: ").append(i).append(" is due in: ").append(l4).append(" secs");
          }
        }
        else
        {
          ivl localivl = (ivl)mbb.a(localContext, ivl.class);
          localivl.h();
          try
          {
            if (Log.isLoggable("PhotoSyncService", 4)) {
              new StringBuilder(52).append("----> Start media down sync for account: ").append(i);
            }
            btl.a(localContext).a(i, parambup, paramSyncResult);
            localivl.h();
            if (((iwb)mbb.a(localContext, iwb.class)).a(i)) {
              if (Log.isLoggable("PhotoSyncService", 4)) {
                new StringBuilder(42).append("----> Movie maker for account: ").append(i);
              }
            }
          }
          catch (Exception localException1)
          {
            try
            {
              localgjb.b("gaia_id");
              localivl.d();
              bua.c(localContext, i);
              bgp.a(localContext, i, dnn.d, System.currentTimeMillis());
              continue;
              localException1 = localException1;
              Log.e("PhotoSyncService", 57 + "----> performMediaDownSync error for account: " + i, localException1);
              SyncStats localSyncStats = paramSyncResult.stats;
              localSyncStats.numIoExceptions = (1L + localSyncStats.numIoExceptions);
            }
            catch (Exception localException2)
            {
              for (;;)
              {
                Log.e("PhotoSyncService", 69 + "----> performMediaDownSync movie maker error for account: " + i, localException2);
              }
            }
          }
        }
      }
    }
  }
  
  public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
    int i = 1;
    String str1 = paramAccount.name;
    int j;
    int m;
    if ((paramBundle != null) && (paramBundle.getBoolean("initialize", false)))
    {
      j = i;
      getContext();
      if (j == 0) {
        break label206;
      }
      Account localAccount = new Account(str1, "com.google");
      giz localgiz = (giz)mbb.a(getContext(), giz.class);
      int k = localgiz.a(str1);
      if ((!localgiz.c(k)) || (!localgiz.a(k).a())) {
        break label182;
      }
      m = i;
      label110:
      if (m == 0) {
        break label188;
      }
      label115:
      ContentResolver.setIsSyncable(localAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", i);
      efj.a(getContext(), paramAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", "googleplus_photos", "photossync");
      if (Log.isLoggable("PhotoSyncService", 3))
      {
        String str2 = String.valueOf(str1);
        if (str2.length() == 0) {
          break label194;
        }
        "====> Performing photos downsync initialization request for account: ".concat(str2);
      }
    }
    label182:
    label188:
    label194:
    label206:
    List localList;
    do
    {
      return;
      j = 0;
      break;
      m = 0;
      break label110;
      i = 0;
      break label115;
      new String("====> Performing photos downsync initialization request for account: ");
      return;
      localList = GooglePhotoDownsyncService.e(getContext(), paramAccount.name);
      if (!localList.isEmpty()) {
        break label275;
      }
    } while (!Log.isLoggable("PhotoSyncService", 3));
    String str8 = String.valueOf(str1);
    if (str8.length() != 0)
    {
      "====> Account is not signed in: ".concat(str8);
      return;
    }
    new String("====> Account is not signed in: ");
    return;
    label275:
    efj.a(getContext(), paramAccount, "com.google.android.apps.photos.GooglePhotoDownsyncProvider", "googleplus_photos", "photossync");
    if ((paramBundle != null) && (paramBundle.getBoolean("sync_periodic", false))) {}
    for (int n = i;; n = 0) {
      try
      {
        if (!Thread.currentThread().isInterrupted()) {
          break;
        }
        return;
      }
      finally {}
    }
    this.b = GooglePhotoDownsyncService.a(str1);
    this.b.a("Google+ Photos Sync");
    if (paramBundle != null) {
      for (;;)
      {
        try
        {
          if (!paramBundle.containsKey("feed")) {
            break;
          }
          str4 = paramBundle.getString("feed");
          if (Log.isLoggable("PhotoSyncService", 4))
          {
            String str7 = String.valueOf(str4);
            if (str7.length() == 0) {
              continue;
            }
            "====> Sync specific feed: ".concat(str7);
          }
          if (!"googleplus_photos".equals(str4)) {
            continue;
          }
          a(localList, this.b, paramSyncResult, true, false);
        }
        catch (gjd localgjd)
        {
          String str4;
          return;
          if (!Log.isLoggable("PhotoSyncService", 6)) {
            continue;
          }
          str5 = String.valueOf(str4);
          if (str5.length() == 0) {
            break label545;
          }
          str6 = "Unexpected feed: ".concat(str5);
          Log.e("PhotoSyncService", str6);
          continue;
        }
        finally
        {
          this.b.e();
          this.b = null;
        }
        this.b.e();
        this.b = null;
        return;
        new String("====> Sync specific feed: ");
        continue;
        for (;;)
        {
          String str5;
          label545:
          String str6 = new String("Unexpected feed: ");
        }
      }
    }
    if ((Log.isLoggable("PhotoSyncService", 3)) && (n == 0))
    {
      String str3 = String.valueOf(paramAccount.name);
      if (str3.length() == 0) {
        break label618;
      }
      "====> Manual or requested down sync account=".concat(str3);
    }
    for (;;)
    {
      a(localList, this.b, paramSyncResult, false, n);
      break;
      label618:
      new String("====> Manual or requested down sync account=");
    }
  }
  
  public final void onSyncCanceled()
  {
    try
    {
      super.onSyncCanceled();
      if (this.b != null) {
        this.b.a();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     auq
 * JD-Core Version:    0.7.0.1
 */