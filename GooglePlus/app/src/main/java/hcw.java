import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.libraries.social.autobackup.AutoBackupStalledReceiver;
import com.google.android.libraries.social.autobackup.FolderAutoBackupReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class hcw
{
  private static final long a = TimeUnit.DAYS.toMillis(2L);
  private static final long b = TimeUnit.DAYS.toMillis(1L);
  private static final Uri c = Uri.parse("https://support.google.com/mobile/?p=google_settings_auto_backup");
  private static final mcs d = new mcs("debug.plus.ab_setup_notif", (byte)0);
  private static final mcs e = new mcs("debug.plus.ab_migrate_notif", (byte)0);
  
  public static long a()
  {
    return TimeUnit.DAYS.toMillis(90L) / 2L;
  }
  
  public static void a(Context paramContext)
  {
    ((NotificationManager)paramContext.getSystemService("notification")).cancel(String.valueOf(paramContext.getPackageName()).concat(":notifications:setup_backup"), efj.Fo);
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    ((NotificationManager)paramContext.getSystemService("notification")).cancel(f(paramContext, paramInt), efj.Fn);
  }
  
  public static void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (hbj.b(paramContext)) {
      return;
    }
    Intent localIntent = ((hcv)mbb.a(paramContext, hcv.class)).a(paramContext, paramInt1);
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.addFlags(335544320);
    PendingIntent localPendingIntent = PendingIntent.getActivity(paramContext, (int)System.currentTimeMillis(), localIntent, 0);
    String str1 = b(paramContext, Math.max(paramInt3 - paramInt2, 0));
    if (paramBoolean) {}
    for (int i = efj.Fx;; i = efj.Fv)
    {
      int j = efj.Fj;
      dk localdk = new dk(paramContext);
      localdk.x.icon = j;
      localdk.a(16, true);
      localdk.b = dk.a(paramContext.getString(efj.FA));
      String str2 = paramContext.getString(i, new Object[] { str1 });
      localdk.x.tickerText = dk.a(str2);
      localdk.c = dk.a(paramContext.getString(i, new Object[] { str1 }));
      localdk.d = localPendingIntent;
      ((NotificationManager)paramContext.getSystemService("notification")).notify(f(paramContext, paramInt1), efj.Fn, localdk.a());
      return;
    }
  }
  
  public static void a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    if (hbj.b(paramContext)) {}
    fe localfe;
    do
    {
      return;
      Intent localIntent = ((hcv)mbb.a(paramContext, hcv.class)).b(paramContext, paramInt);
      localfe = new fe(paramContext);
      localfe.a(localIntent);
    } while (hbj.a(paramContext));
    dk localdk1 = new dk(paramContext);
    PendingIntent localPendingIntent1 = localfe.a((int)System.currentTimeMillis(), 134217728, null);
    String str = paramContext.getString(efj.FE);
    localdk1.b = dk.a(paramContext.getString(efj.FF));
    localdk1.c = dk.a(String.format(str, new Object[] { paramString1 }));
    int i = efj.Ff;
    localdk1.x.icon = i;
    localdk1.d = localPendingIntent1;
    int j = efj.Fg;
    CharSequence localCharSequence1 = paramContext.getText(efj.FC);
    int k = FolderAutoBackupReceiver.b;
    FolderAutoBackupReceiver.b = k + 1;
    PendingIntent localPendingIntent2 = FolderAutoBackupReceiver.a(paramContext, "com.google.android.libraries.social.autobackup.ACTION_SKIP_FOLDER_BACKUP", paramString2, k);
    if (Log.isLoggable("FolderABReceiver", 3))
    {
      int i2 = FolderAutoBackupReceiver.b;
      new StringBuilder(62).append("created skip folder PendingIntent with requestCode=").append(i2);
    }
    dk localdk2 = localdk1.a(j, localCharSequence1, localPendingIntent2);
    int m = efj.Fh;
    CharSequence localCharSequence2 = paramContext.getText(efj.FD);
    int n = FolderAutoBackupReceiver.a;
    FolderAutoBackupReceiver.a = n + 1;
    PendingIntent localPendingIntent3 = FolderAutoBackupReceiver.a(paramContext, "com.google.android.libraries.social.autobackup.ACTION_ENABLE_FOLDER_BACKUP", paramString2, n);
    if (Log.isLoggable("FolderABReceiver", 3))
    {
      int i1 = FolderAutoBackupReceiver.a;
      new StringBuilder(64).append("created enable folder PendingIntent with requestCode=").append(i1);
    }
    localdk2.a(m, localCharSequence2, localPendingIntent3).a(16, true);
    ((NotificationManager)paramContext.getSystemService("notification")).notify(efj.Fm, localdk1.b());
  }
  
  public static void a(Context paramContext, long paramLong)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
    localEditor.putLong("iu.auto_backup_notification_timestamp", paramLong);
    try
    {
      localEditor.putInt("iu.auto_backup_notification_version_code", paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode);
      localEditor.apply();
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        Log.e("ABNotifications", "Cannot get package version", localNameNotFoundException);
      }
    }
  }
  
  public static void a(Context paramContext, long paramLong, boolean paramBoolean)
  {
    long l1 = System.currentTimeMillis();
    AlarmManager localAlarmManager;
    PendingIntent localPendingIntent;
    if (AutoBackupStalledReceiver.a(paramContext, false, paramLong) == null)
    {
      localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
      localPendingIntent = AutoBackupStalledReceiver.a(paramContext, true, paramLong);
      if (!paramBoolean) {
        break label57;
      }
    }
    label57:
    for (long l2 = b;; l2 = a)
    {
      localAlarmManager.set(0, l2 + l1, localPendingIntent);
      return;
    }
  }
  
  public static String b(Context paramContext, int paramInt)
  {
    if (paramInt < 900)
    {
      int k = efj.Fw;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      return paramContext.getString(k, arrayOfObject3);
    }
    if (paramInt < 921600)
    {
      int j = efj.Fu;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Double.valueOf(Math.max(paramInt / 1024.0D, 1.0D));
      return paramContext.getString(j, arrayOfObject2);
    }
    int i = efj.Fy;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Double.valueOf(Math.max(paramInt / 1048576.0D, 1.0D));
    return paramContext.getString(i, arrayOfObject1);
  }
  
  public static void b(Context paramContext)
  {
    PendingIntent localPendingIntent = AutoBackupStalledReceiver.a(paramContext, false, 0L);
    if (localPendingIntent != null) {
      ((AlarmManager)paramContext.getSystemService("alarm")).cancel(localPendingIntent);
    }
    ((NotificationManager)paramContext.getSystemService("notification")).cancel(String.valueOf(paramContext.getPackageName()).concat(":notifications:backup_stalled"), efj.Fo);
  }
  
  public static void c(Context paramContext) {}
  
  public static void c(Context paramContext, int paramInt)
  {
    hcv localhcv = (hcv)mbb.b(paramContext, hcv.class);
    if (localhcv == null) {}
    while (hbj.a(paramContext)) {
      return;
    }
    Intent localIntent = localhcv.d(paramContext, paramInt);
    fe localfe = new fe(paramContext);
    localfe.a(localIntent);
    dk localdk = new dk(paramContext);
    PendingIntent localPendingIntent = localfe.a((int)System.currentTimeMillis(), 134217728, null);
    String str = paramContext.getString(efj.Fr);
    localdk.b = dk.a(paramContext.getString(efj.Fq));
    localdk.c = dk.a(str);
    int i = efj.Ff;
    localdk.x.icon = i;
    localdk.d = localPendingIntent;
    localdk.h = 2;
    localdk.a(2, true);
    ((NotificationManager)paramContext.getSystemService("notification")).notify(efj.Fk, localdk.b());
    ((hal)mbb.a(paramContext, hal.class)).e(paramContext, paramInt);
  }
  
  public static void d(Context paramContext)
  {
    if (((hba)mbb.a(paramContext, hba.class)).c()) {}
    ArrayList localArrayList;
    do
    {
      do
      {
        return;
      } while ((hbj.d(paramContext)) || (hbj.a(paramContext)) || (System.currentTimeMillis() - f(paramContext) < TimeUnit.DAYS.toMillis(90L)));
      Account[] arrayOfAccount = AccountManager.get(paramContext).getAccountsByType("com.google");
      localArrayList = new ArrayList(arrayOfAccount.length);
      int i = arrayOfAccount.length;
      for (int j = 0; j < i; j++)
      {
        Account localAccount = arrayOfAccount[j];
        if (!localAccount.name.toLowerCase(Locale.getDefault()).endsWith("@youtube.com")) {
          localArrayList.add(localAccount);
        }
      }
    } while ((Collections.unmodifiableList(localArrayList).isEmpty()) || (hbj.b(paramContext)));
    mbb.a(paramContext, hcv.class);
  }
  
  public static void d(Context paramContext, int paramInt)
  {
    hcv localhcv = (hcv)mbb.b(paramContext, hcv.class);
    if (localhcv == null) {}
    while (hbj.a(paramContext)) {
      return;
    }
    Intent localIntent = localhcv.e(paramContext, paramInt);
    fe localfe = new fe(paramContext);
    localfe.a(localIntent);
    dk localdk = new dk(paramContext);
    PendingIntent localPendingIntent = localfe.a((int)System.currentTimeMillis(), 134217728, null);
    String str = paramContext.getString(efj.Ft);
    localdk.b = dk.a(paramContext.getString(efj.Fs));
    localdk.c = dk.a(str);
    int i = efj.Ff;
    localdk.x.icon = i;
    localdk.d = localPendingIntent;
    localdk.h = 0;
    ((NotificationManager)paramContext.getSystemService("notification")).notify(efj.Fl, localdk.b());
    ((hal)mbb.a(paramContext, hal.class)).d(paramContext, paramInt);
  }
  
  public static void e(Context paramContext)
  {
    if (!hbj.e(paramContext)) {
      b(paramContext);
    }
  }
  
  public static void e(Context paramContext, int paramInt)
  {
    b(paramContext);
    a(paramContext, paramInt);
  }
  
  private static long f(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    if (!localSharedPreferences.contains("iu.auto_backup_notification_timestamp"))
    {
      long l = paramContext.getSharedPreferences("accounts", 0).getLong("ab_notification_timestamp", 0L);
      if (l > 0L)
      {
        a(paramContext, l);
        return l;
      }
    }
    return localSharedPreferences.getLong("iu.auto_backup_notification_timestamp", 0L);
  }
  
  private static String f(Context paramContext, int paramInt)
  {
    String str1 = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("gaia_id");
    if (paramInt == -1) {
      return null;
    }
    String str2 = String.valueOf(paramContext.getPackageName());
    return 22 + String.valueOf(str2).length() + String.valueOf(str1).length() + str2 + ":notifications:gaiaid:" + str1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcw
 * JD-Core Version:    0.7.0.1
 */