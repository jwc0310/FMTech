import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.service.EsSyncAdapterService;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class dmj
  implements Runnable
{
  dmj(dmi paramdmi, Account paramAccount, Bundle paramBundle, lrk paramlrk) {}
  
  public final void run()
  {
    dmi localdmi = this.d;
    Account localAccount1 = this.a;
    Bundle localBundle = this.b;
    lrk locallrk = this.c;
    if (Log.isLoggable("EsSyncAdapterService", 4))
    {
      long l = System.currentTimeMillis();
      new StringBuilder(65).append(l).append(" onPerformSync: ====> Starting onPerformSync ");
    }
    String str1 = localAccount1.name;
    int i;
    int k;
    label122:
    int m;
    label130:
    int n;
    if ((localBundle != null) && (localBundle.getBoolean("initialize", false)))
    {
      i = 1;
      if (i == 0) {
        break label541;
      }
      Account localAccount2 = new Account(str1, "com.google");
      String str2 = EsProvider.a(localdmi.a);
      if (localdmi.b(str1).isEmpty()) {
        break label298;
      }
      k = 1;
      if (k == 0) {
        break label388;
      }
      m = 1;
      ContentResolver.setIsSyncable(localAccount2, str2, m);
      if ((!ContentResolver.getMasterSyncAutomatically()) || (!ContentResolver.getSyncAutomatically(localAccount1, EsProvider.a(localdmi.a)))) {
        break label394;
      }
      n = 1;
      label162:
      int i1 = localdmi.b.a(localAccount1.name);
      if ((n == 0) || (!localdmi.b.c(i1))) {
        break label437;
      }
      if (!localdmi.b.a(i1).c("GCM_ENABLED")) {
        break label413;
      }
      if (Log.isLoggable("EsSyncAdapterService", 3))
      {
        String str5 = String.valueOf("https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications");
        if (str5.length() == 0) {
          break label400;
        }
        "  --> Unsubscribe feed: ".concat(str5);
      }
      label249:
      efj.a(localdmi.getContext().getContentResolver(), "https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications", localAccount1, EsProvider.a(localdmi.a));
    }
    for (;;)
    {
      if (!localdmi.a(localAccount1, "com.google.plus.events", "events")) {
        localdmi.b(localAccount1, "com.google.plus.events", "events");
      }
      return;
      i = 0;
      break;
      label298:
      int j = localdmi.b.a(str1);
      if (j != -1) {}
      for (boolean bool = localdmi.b.a(j).c("logged_out");; bool = false)
      {
        if (bool) {
          break label382;
        }
        int i2 = localdmi.b.a(str1);
        if ((i2 == -1) || (!localdmi.a(i2))) {
          break label382;
        }
        k = 1;
        break;
      }
      label382:
      k = 0;
      break label122;
      label388:
      m = 0;
      break label130;
      label394:
      n = 0;
      break label162;
      label400:
      new String("  --> Unsubscribe feed: ");
      break label249;
      label413:
      if (!localdmi.a(localAccount1, "https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications", "webupdates")) {
        localdmi.b(localAccount1, "https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications", "webupdates");
      }
    }
    label437:
    ContentResolver localContentResolver1 = localdmi.getContext().getContentResolver();
    String str3 = EsProvider.a(localdmi.a);
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("_sync_account=?");
    localStringBuilder1.append(" AND _sync_account_type=?");
    localStringBuilder1.append(" AND authority=?");
    Uri localUri1 = dnm.a;
    String str4 = localStringBuilder1.toString();
    String[] arrayOfString1 = new String[3];
    arrayOfString1[0] = localAccount1.name;
    arrayOfString1[1] = localAccount1.type;
    arrayOfString1[2] = str3;
    localContentResolver1.delete(localUri1, str4, arrayOfString1);
    return;
    label541:
    int i3;
    if ((ContentResolver.getMasterSyncAutomatically()) && (ContentResolver.getSyncAutomatically(localAccount1, EsProvider.a(localdmi.a))))
    {
      i3 = 1;
      label564:
      int i4 = localdmi.b.a(localAccount1.name);
      if ((i3 == 0) || (!localdmi.b.c(i4))) {
        break label968;
      }
      if (!localdmi.b.a(i4).c("GCM_ENABLED")) {
        break label944;
      }
      if (Log.isLoggable("EsSyncAdapterService", 3))
      {
        String str12 = String.valueOf("https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications");
        if (str12.length() == 0) {
          break label931;
        }
        "  --> Unsubscribe feed: ".concat(str12);
      }
      label651:
      efj.a(localdmi.getContext().getContentResolver(), "https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications", localAccount1, EsProvider.a(localdmi.a));
      label672:
      if (!localdmi.a(localAccount1, "com.google.plus.events", "events")) {
        localdmi.b(localAccount1, "com.google.plus.events", "events");
      }
    }
    for (;;)
    {
      try
      {
        localdmi.c.a(str1, EsSyncAdapterService.b);
        localList = localdmi.b(str1);
        if (localList.isEmpty()) {
          break;
        }
        if ((localBundle == null) || (!localBundle.containsKey("feed"))) {
          continue;
        }
        str8 = localBundle.getString("feed");
        if (Log.isLoggable("EsSyncAdapterService", 4))
        {
          String str11 = String.valueOf(str8);
          if (str11.length() == 0) {
            continue;
          }
          "  --> Sync specific feed: ".concat(str11);
        }
      }
      catch (IOException localIOException)
      {
        List localList;
        String str8;
        Iterator localIterator2;
        int i6;
        gxx localgxx2;
        gxw localgxw2;
        label931:
        label944:
        label968:
        ContentResolver localContentResolver2;
        String str6;
        StringBuilder localStringBuilder2;
        Uri localUri2;
        String str7;
        String[] arrayOfString2;
        locallrk.a.incrementAndGet();
        return;
        new String("  --> Sync specific feed: ");
        continue;
        localBundle.putInt("sync_what", 2);
        try
        {
          if (!Thread.currentThread().isInterrupted()) {
            continue;
          }
          return;
        }
        finally {}
        if (!"com.google.plus.events".equals(str8)) {
          continue;
        }
        localBundle.putInt("sync_what", 3);
        Iterator localIterator1 = localList.iterator();
        if (!localIterator1.hasNext()) {
          continue;
        }
        int i5 = ((Integer)localIterator1.next()).intValue();
        gxx localgxx1 = localdmi.d;
        gxw localgxw1 = new gxw(localdmi.a, i5);
        localgxw1.c = gxz.bq;
        localgxw1.d = gya.w;
        localgxx1.a(localgxw1);
        continue;
        continue;
        String str9 = String.valueOf(str8);
        if (str9.length() == 0) {
          continue;
        }
        String str10 = "Unexpected feed: ".concat(str9);
        Log.e("EsSyncAdapterService", str10);
        return;
        str10 = new String("Unexpected feed: ");
        continue;
        EsSyncAdapterService.f = dmi.a(str1);
        try
        {
          if (EsSyncAdapterService.f.a.b()) {
            continue;
          }
          localdmi.a(localList, localBundle, EsSyncAdapterService.f, locallrk);
          eaq.a(localdmi.a);
          return;
        }
        finally
        {
          EsSyncAdapterService.f = null;
        }
      }
      catch (ikm localikm) {}
      localBundle.putBoolean("sync_from_tickle", true);
      if (!"https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications".equals(str8)) {
        continue;
      }
      if (!EsSyncAdapterService.c(localdmi.a, localdmi.b.a(str1))) {
        continue;
      }
      localIterator2 = localList.iterator();
      if (!localIterator2.hasNext()) {
        continue;
      }
      i6 = ((Integer)localIterator2.next()).intValue();
      if (dun.b()) {
        ((jac)mbb.a(localdmi.a, jac.class)).a(i6);
      }
      localgxx2 = localdmi.d;
      localgxw2 = new gxw(localdmi.a, i6);
      localgxw2.c = gxz.bp;
      localgxw2.d = gya.w;
      localgxx2.a(localgxw2);
      continue;
      i3 = 0;
      break label564;
      new String("  --> Unsubscribe feed: ");
      break label651;
      if (localdmi.a(localAccount1, "https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications", "webupdates")) {
        break label672;
      }
      localdmi.b(localAccount1, "https://m.google.com/app/feed/notifications?authority=com.google.plus.notifications", "webupdates");
      break label672;
      localContentResolver2 = localdmi.getContext().getContentResolver();
      str6 = EsProvider.a(localdmi.a);
      localStringBuilder2 = new StringBuilder();
      localStringBuilder2.append("_sync_account=?");
      localStringBuilder2.append(" AND _sync_account_type=?");
      localStringBuilder2.append(" AND authority=?");
      localUri2 = dnm.a;
      str7 = localStringBuilder2.toString();
      arrayOfString2 = new String[3];
      arrayOfString2[0] = localAccount1.name;
      arrayOfString2[1] = localAccount1.type;
      arrayOfString2[2] = str6;
      localContentResolver2.delete(localUri2, str7, arrayOfString2);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmj
 * JD-Core Version:    0.7.0.1
 */