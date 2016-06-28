import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.preference.PreferenceManager;
import com.google.android.apps.photos.service.GooglePhotoDownsyncService;
import com.google.android.apps.plus.content.EsProvider;
import com.google.android.apps.plus.service.EsSyncAdapterService;
import com.google.android.libraries.social.autobackup.AutoBackupSyncService;
import java.util.List;

public class bra
  implements ilt, inj
{
  final Context a;
  private final giz b;
  
  public bra(Context paramContext)
  {
    this.a = paramContext;
    this.b = ((giz)mbb.a(paramContext, giz.class));
  }
  
  private final int a()
  {
    List localList = this.b.a();
    int i = localList.size();
    int j = 0;
    int k = 0;
    if (j < i) {
      if (!this.b.a(((Integer)localList.get(j)).intValue()).a()) {
        break label76;
      }
    }
    label76:
    for (int m = k + 1;; m = k)
    {
      j++;
      k = m;
      break;
      return k;
    }
  }
  
  private final void b(int paramInt)
  {
    gjb localgjb = this.b.a(paramInt);
    if (localgjb.a("database_status", 0) != 0) {
      return;
    }
    bqj localbqj = bqj.a(this.a, paramInt);
    localbqj.b();
    SQLiteDatabase localSQLiteDatabase = localbqj.getWritableDatabase();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("notification_poll_interval", Integer.valueOf(-1));
    localContentValues.put("last_stats_sync_time", Integer.valueOf(-1));
    localContentValues.put("last_contacted_time", Integer.valueOf(-1));
    localContentValues.put("wipeout_stats", Integer.valueOf(-1));
    localContentValues.put("circle_settings_sync_time", Integer.valueOf(-1));
    localContentValues.putNull("people_last_update_token");
    localContentValues.put("user_id", localgjb.b("gaia_id"));
    localSQLiteDatabase.update("account_status", localContentValues, null, null);
    brn.b(this.a, paramInt);
    this.b.b(paramInt).b("database_status", 1).d();
  }
  
  private final void c(int paramInt)
  {
    gjb localgjb = this.b.a(paramInt);
    String str = localgjb.b("account_name");
    EsSyncAdapterService.a(this.a, str);
    if ((!localgjb.c("sync_enabled")) && (!localgjb.c("sync_disabled")))
    {
      EsSyncAdapterService.a(this.a, str, true);
      this.b.b(paramInt).b("sync_enabled", true).d();
    }
  }
  
  public final void a(int paramInt)
  {
    gjb localgjb1 = this.b.a(paramInt);
    boolean bool4;
    if (localgjb1.c("logged_in"))
    {
      this.b.b(paramInt).b("logout_complete", false).d();
      gjb localgjb3 = this.b.a(paramInt);
      b(paramInt);
      c(paramInt);
      if ((!localgjb3.c("is_managed_account")) && (!hbj.b(this.a)))
      {
        Context localContext3 = this.a;
        gjb localgjb4 = this.b.a(paramInt);
        String str6 = localgjb4.b("account_name");
        String str7 = hbu.f(localContext3);
        ContentResolver.setIsSyncable(new Account(str6, "com.google"), str7, 1);
        if ((!localgjb4.c("auto_upload_sync_enabled")) && (!localgjb4.c("auto_upload_sync_disabled")))
        {
          String str9 = hbu.f(localContext3);
          Account localAccount = new Account(str6, "com.google");
          ContentResolver.setSyncAutomatically(localAccount, str9, true);
          AutoBackupSyncService.a(localContext3, localAccount);
          this.b.b(paramInt).b("auto_upload_sync_enabled", true).d();
        }
        Context localContext4 = this.a;
        gjb localgjb5 = this.b.a(paramInt);
        String str8 = localgjb5.b("account_name");
        GooglePhotoDownsyncService.c(localContext4, str8);
        if ((!localgjb5.c("photos_sync_enabled")) && (!localgjb5.c("photos_sync_disabled")))
        {
          GooglePhotoDownsyncService.a(localContext4, str8);
          this.b.b(paramInt).b("photos_sync_enabled", true).d();
        }
      }
      if (!this.b.a(paramInt).c("local_media_refresh_requested"))
      {
        if (a() != 1) {
          break label377;
        }
        bool4 = true;
        new Thread(new brc(this, bool4)).start();
        this.b.b(paramInt).b("local_media_refresh_requested", true).d();
      }
    }
    label377:
    gjb localgjb2;
    do
    {
      return;
      bool4 = false;
      break;
      if (!localgjb1.c("logged_out")) {
        break label996;
      }
      localgjb2 = this.b.a(paramInt);
    } while (localgjb2.c("logout_complete"));
    int i;
    boolean bool1;
    label501:
    String str3;
    label584:
    boolean bool2;
    label661:
    gjc localgjc3;
    if (!hbj.b(this.a))
    {
      i = 1;
      if (!localgjb2.c("is_managed_account"))
      {
        String str1 = this.b.a(paramInt).b("account_name");
        EsSyncAdapterService.b(this.a, str1);
        gjc localgjc1 = this.b.b(paramInt).b("sync_enabled", false);
        if (EsSyncAdapterService.c(this.a, str1)) {
          break label972;
        }
        bool1 = true;
        localgjc1.b("sync_disabled", bool1).d();
        if (i != 0)
        {
          Context localContext1 = this.a;
          String str2 = this.b.a(paramInt).b("account_name");
          giz localgiz = (giz)mbb.a(localContext1, giz.class);
          if (!localgiz.c(paramInt)) {
            break label978;
          }
          str3 = localgiz.a(paramInt).b("account_name");
          AutoBackupSyncService.a(localContext1, str3);
          hau localhau = (hau)mbb.b(localContext1, hau.class);
          if (localhau != null) {
            localhau.a(paramInt);
          }
          gjc localgjc2 = this.b.b(paramInt).b("auto_upload_sync_enabled", false);
          String str4 = hbu.f(localContext1);
          if (ContentResolver.getSyncAutomatically(new Account(str2, "com.google"), str4)) {
            break label984;
          }
          bool2 = true;
          localgjc2.b("auto_upload_sync_disabled", bool2).d();
          Context localContext2 = this.a;
          String str5 = this.b.a(paramInt).b("account_name");
          GooglePhotoDownsyncService.b(localContext2, str5);
          localgjc3 = this.b.b(paramInt).b("photos_sync_enabled", false);
          if (GooglePhotoDownsyncService.d(localContext2, str5)) {
            break label990;
          }
        }
      }
    }
    label972:
    label978:
    label984:
    label990:
    for (boolean bool3 = true;; bool3 = false)
    {
      localgjc3.b("photos_sync_disabled", bool3).d();
      if (i != 0) {
        hbj.c(this.a, paramInt);
      }
      if (((hba)mbb.a(this.a, hba.class)).c(paramInt).c("auto_backup_enabled")) {
        efj.a(this.a, paramInt, true);
      }
      PreferenceManager.getDefaultSharedPreferences(this.a).edit().putBoolean("iu.received_low_quota", false).putBoolean("iu.received_no_quota", false).commit();
      brg.e(this.a, paramInt);
      bqj.a(this.a, paramInt).a();
      bvf.b(this.a);
      dkh.a(this.a, paramInt);
      bvc.a(this.a).a();
      but.a(this.a).a();
      dml.a(this.a, paramInt);
      bua.a(this.a, paramInt);
      eaq.a(this.a);
      efj.e(this.a);
      brb localbrb = new brb(this);
      efj.m().post(localbrb);
      this.b.b(paramInt).b("logout_complete", true).b("tmp_notifications_prefetched", false).d();
      return;
      i = 0;
      break;
      bool1 = false;
      break label501;
      str3 = null;
      break label584;
      bool2 = false;
      break label661;
    }
    label996:
    if (localgjb1.c("gplus_no_mobile_tos"))
    {
      b(paramInt);
      c(paramInt);
      return;
    }
    c(paramInt);
  }
  
  public final void a(gje paramgje, mtu parammtu)
  {
    this.a.getContentResolver().notifyChange(EsProvider.c(this.a), null);
  }
  
  public final boolean a(gjb paramgjb, mtt parammtt)
  {
    parammtt.a.b = new qoh();
    parammtt.a.b.a = new qoi();
    parammtt.a.b.a.a = Boolean.valueOf(true);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bra
 * JD-Core Version:    0.7.0.1
 */