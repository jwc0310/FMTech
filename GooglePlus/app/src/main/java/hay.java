import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SyncResult;
import android.content.SyncStats;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public final class hay
  extends AbstractThreadedSyncAdapter
{
  private final giz a;
  private haz b;
  
  public hay(Context paramContext)
  {
    super(paramContext, false);
    this.a = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final void a(int paramInt, boolean paramBoolean, SyncResult paramSyncResult)
  {
    int i;
    if ((this.a.c(paramInt)) && (this.a.a(paramInt).a()))
    {
      i = 1;
      if (i != 0) {
        break label74;
      }
      if (Log.isLoggable("iu.SyncService", 4)) {
        new StringBuilder(43).append("====> Account is not signed in: ").append(paramInt);
      }
    }
    label74:
    do
    {
      hau localhau;
      do
      {
        return;
        i = 0;
        break;
        if ((Log.isLoggable("iu.SyncService", 4)) && (!paramBoolean)) {
          new StringBuilder(53).append("====> Manual or requested up sync account=").append(paramInt);
        }
        Iterator localIterator = mbb.c(getContext(), hat.class).iterator();
        while (localIterator.hasNext()) {
          ((hat)localIterator.next()).a();
        }
        if (paramInt == -1)
        {
          Log.e("iu.SyncService", "----> performUpSync account not found");
          return;
        }
        localhau = (hau)mbb.b(getContext(), hau.class);
      } while (localhau == null);
      try
      {
        ((hbn)mbb.a(getContext(), hbn.class)).a();
        try
        {
          if (Thread.currentThread().isInterrupted()) {
            return;
          }
        }
        finally {}
        SyncStats localSyncStats;
        this.b = new haz(paramInt, paramSyncResult);
      }
      catch (Exception localException)
      {
        Log.e("iu.SyncService", 50 + "----> performUpSync error for account: " + paramInt, localException);
        localSyncStats = paramSyncResult.stats;
        localSyncStats.numIoExceptions = (1L + localSyncStats.numIoExceptions);
        return;
      }
      if (Log.isLoggable("iu.SyncService", 4)) {
        new StringBuilder(44).append("----> Start up sync for account: ").append(paramInt);
      }
      localhau.a(this.b);
    } while (!Log.isLoggable("iu.SyncService", 4));
    boolean bool = this.b.b();
    new StringBuilder(65).append("----> Up sync finished for account: ").append(paramInt).append(", cancelled? ").append(bool);
  }
  
  public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
    int i = 1;
    ContentResolver localContentResolver;
    ContentValues localContentValues;
    Uri localUri;
    if (Build.VERSION.SDK_INT == 15)
    {
      localContentResolver = getContext().getContentResolver();
      localContentValues = new ContentValues();
      localUri = Uri.parse("content://com.google.android.gallery3d.GooglePhotoProvider/settings");
      localContentValues.put("auto_upload_enabled", Integer.valueOf(0));
    }
    try
    {
      localContentResolver.update(localUri, localContentValues, null, null);
      label59:
      boolean bool1;
      boolean bool2;
      if ((paramBundle != null) && (paramBundle.getBoolean("initialize", false)))
      {
        bool1 = i;
        if (!bool1) {
          break label211;
        }
        Account localAccount = new Account(paramAccount.name, "com.google");
        String str1 = hbu.f(getContext());
        Context localContext = getContext();
        String str2 = paramAccount.name;
        giz localgiz = (giz)mbb.a(localContext, giz.class);
        int j = localgiz.a(str2);
        if ((!localgiz.c(j)) || (!localgiz.a(j).a())) {
          break label199;
        }
        bool2 = i;
        label174:
        if (!bool2) {
          break label205;
        }
        int k = i;
        label183:
        ContentResolver.setIsSyncable(localAccount, str1, k);
      }
      label199:
      label205:
      label211:
      label372:
      for (;;)
      {
        return;
        bool1 = false;
        break;
        bool2 = false;
        break label174;
        int m = 0;
        break label183;
        Iterator localIterator;
        if ((paramBundle != null) && (paramBundle.getBoolean("sync_periodic", false))) {
          localIterator = this.a.a().iterator();
        }
        for (;;)
        {
          for (;;)
          {
            if (!localIterator.hasNext()) {
              break label372;
            }
            int n = ((Integer)localIterator.next()).intValue();
            try
            {
              String str3 = this.a.a(n).b("account_name");
              if ((str3 != null) && (str3.equals(paramAccount.name))) {
                a(n, i, paramSyncResult);
              }
            }
            catch (gjd localgjd)
            {
              if (Log.isLoggable("iu.SyncService", 6))
              {
                Log.e("iu.SyncService", "Account became invalid during sync", localgjd);
                continue;
                i = 0;
                break;
              }
            }
            catch (SecurityException localSecurityException) {}
          }
          if (Log.isLoggable("iu.SyncService", 6)) {
            Log.e("iu.SyncService", "Insufficient permissions for sync", localSecurityException);
          }
        }
      }
    }
    catch (Exception localException)
    {
      break label59;
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
 * Qualified Name:     hay
 * JD-Core Version:    0.7.0.1
 */