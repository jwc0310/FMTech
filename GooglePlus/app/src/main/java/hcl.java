import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MatrixCursor.RowBuilder;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.social.autobackup.AutoBackupEnvironment;
import com.google.android.libraries.social.autobackup.MediaRecordEntry;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class hcl
{
  static hcl a;
  private static final Uri f = Uri.parse("content://media/external/fs_id");
  public final Context b;
  public final hci c;
  public final hcd d;
  public final Handler e;
  private final SharedPreferences g;
  private int h;
  private volatile boolean i = false;
  private long j = 15000L;
  
  private hcl(Context paramContext)
  {
    this.b = paramContext;
    mbb.a(this.b, giz.class);
    this.c = ((hci)mbb.a(paramContext, hci.class));
    this.g = PreferenceManager.getDefaultSharedPreferences(paramContext);
    this.d = hcd.a(paramContext);
    HandlerThread localHandlerThread = new HandlerThread("picasa-uploads-manager", 10);
    localHandlerThread.start();
    this.e = new hcn(localHandlerThread.getLooper());
    this.e.sendMessageDelayed(Message.obtain(this.e, 2), 50L);
    this.i = this.g.contains("external_storage_fsid");
    if (this.i) {
      this.h = this.g.getInt("external_storage_fsid", -1);
    }
    String str1 = this.g.getString("system_release", null);
    int k;
    if (!Build.VERSION.RELEASE.equals(str1))
    {
      this.g.edit().putString("system_release", Build.VERSION.RELEASE).commit();
      if (Log.isLoggable("iu.UploadsManager", 4))
      {
        String str2 = String.valueOf(Build.VERSION.RELEASE);
        new StringBuilder(24 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("System changed from ").append(str1).append(" to ").append(str2);
      }
      if (str1 != null) {
        k = 1;
      }
    }
    for (;;)
    {
      if (k != 0) {
        a();
      }
      paramContext.getContentResolver().registerContentObserver(f, false, new hcm(this, this.e));
      this.e.sendMessageDelayed(Message.obtain(this.e, 5), 50L);
      return;
      k = 0;
      continue;
      k = 0;
    }
  }
  
  public static hcl a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = new hcl(paramContext);
      }
      hcl localhcl = a;
      return localhcl;
    }
    finally {}
  }
  
  /* Error */
  private static int b(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 192	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   4: getstatic 36	hcl:f	Landroid/net/Uri;
    //   7: aconst_null
    //   8: aconst_null
    //   9: aconst_null
    //   10: aconst_null
    //   11: invokevirtual 215	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnull +28 -> 44
    //   19: aload_3
    //   20: invokeinterface 220 1 0
    //   25: ifeq +19 -> 44
    //   28: aload_3
    //   29: iconst_0
    //   30: invokeinterface 223 2 0
    //   35: istore 5
    //   37: aload_3
    //   38: invokestatic 228	iaw:a	(Landroid/database/Cursor;)V
    //   41: iload 5
    //   43: ireturn
    //   44: aload_3
    //   45: invokestatic 228	iaw:a	(Landroid/database/Cursor;)V
    //   48: goto +35 -> 83
    //   51: astore 4
    //   53: aload_3
    //   54: invokestatic 228	iaw:a	(Landroid/database/Cursor;)V
    //   57: aload 4
    //   59: athrow
    //   60: astore_1
    //   61: ldc 157
    //   63: bipush 6
    //   65: invokestatic 163	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   68: ifeq +15 -> 83
    //   71: ldc 157
    //   73: ldc 230
    //   75: aload_1
    //   76: invokestatic 233	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   79: pop
    //   80: goto +3 -> 83
    //   83: iconst_m1
    //   84: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	paramContext	Context
    //   60	16	1	localSecurityException	java.lang.SecurityException
    //   14	40	3	localCursor	Cursor
    //   51	7	4	localObject	Object
    //   35	7	5	k	int
    // Exception table:
    //   from	to	target	type
    //   19	37	51	finally
    //   0	15	60	java/lang/SecurityException
    //   37	41	60	java/lang/SecurityException
    //   44	48	60	java/lang/SecurityException
    //   53	60	60	java/lang/SecurityException
  }
  
  public final Cursor a(String paramString)
  {
    List localList = b(paramString);
    MatrixCursor localMatrixCursor = new MatrixCursor(new String[] { "upload_all_account_id", "upload_all_progress", "upload_all_count", "upload_all_state" });
    if (!localList.isEmpty())
    {
      Iterator localIterator = localList.iterator();
      if (localIterator.hasNext())
      {
        int k = ((Integer)localIterator.next()).intValue();
        int m = hbm.d(this.c, 40);
        int n = m - hbm.b(this.c, k, 40);
        if (Log.isLoggable("iu.UploadsManager", 3)) {
          if (m != n) {
            break label225;
          }
        }
        label225:
        for (boolean bool = true;; bool = false)
        {
          new StringBuilder(118).append("get upload-all status for accountId ").append(k).append(" allDone? ").append(bool).append(" current:").append(n).append(" total:").append(m).append(" state=0");
          localMatrixCursor.newRow().add(Integer.valueOf(k)).add(Integer.valueOf(n)).add(Integer.valueOf(m)).add(Integer.valueOf(0));
          break;
        }
      }
    }
    else
    {
      localMatrixCursor.newRow().add(null).add(null).add(null).add(Integer.valueOf(0));
    }
    return localMatrixCursor;
  }
  
  final void a()
  {
    try
    {
      Iterator localIterator1 = ((hba)mbb.a(this.b, hba.class)).e().iterator();
      while (localIterator1.hasNext())
      {
        int m = ((Integer)localIterator1.next()).intValue();
        Message.obtain(this.e, 1, Integer.valueOf(m)).sendToTarget();
      }
      try
      {
        localhci = this.c;
        localhci.getWritableDatabase().delete(MediaRecordEntry.a.a, null, null);
        ((hbn)mbb.a(localhci.a, hbn.class)).a(localhci.a);
        localhbe = (hbe)mbb.a(localhci.a, hbe.class);
        localIterator2 = localhbe.c.a(new String[] { "logged_in" }).iterator();
        while (localIterator2.hasNext())
        {
          k = ((Integer)localIterator2.next()).intValue();
          hcb.a(localhbe.a, k, false);
          continue;
          this.d.a(null);
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        this.e.sendEmptyMessageDelayed(6, this.j);
        this.j <<= 1;
      }
    }
    finally {}
    for (;;)
    {
      hci localhci;
      hbe localhbe;
      Iterator localIterator2;
      int k;
      return;
      this.j = 15000L;
    }
  }
  
  final void a(int paramInt)
  {
    for (;;)
    {
      hau localhau;
      try
      {
        localhau = (hau)mbb.b(this.b, hau.class);
        if (localhau == null) {
          return;
        }
        if (Log.isLoggable("iu.UploadsManager", 3)) {
          new StringBuilder(45).append("enable existing photos upload for ").append(paramInt);
        }
        hbm.c(this.c, paramInt, 40);
        c();
        if (hbm.b(this.c, paramInt, 40) == 0)
        {
          ContentValues localContentValues1 = new ContentValues(1);
          localContentValues1.put("upload_all_state", Integer.valueOf(0));
          this.b.getContentResolver().update(hbu.b(this.b), localContentValues1, null, null);
          b(paramInt);
          continue;
        }
        if (AutoBackupEnvironment.a()) {
          break label193;
        }
      }
      finally {}
      ContentValues localContentValues2 = new ContentValues(1);
      localContentValues2.put("upload_all_state", Integer.valueOf(12));
      this.b.getContentResolver().update(hbu.b(this.b), localContentValues2, null, null);
      b(paramInt);
      continue;
      label193:
      localhau.c.sendEmptyMessageDelayed(1, 500L);
    }
  }
  
  final List<Integer> b(String paramString)
  {
    if (hbu.a.equals(paramString)) {
      return ((hba)mbb.a(this.b, hba.class)).e();
    }
    if (!TextUtils.isEmpty(paramString)) {
      return Collections.singletonList(Integer.valueOf(Integer.parseInt(paramString)));
    }
    return Collections.emptyList();
  }
  
  final void b()
  {
    int k = 1;
    for (;;)
    {
      int m;
      try
      {
        boolean bool = AutoBackupEnvironment.a();
        if (!bool) {
          return;
        }
        m = b(this.b);
        if (Log.isLoggable("iu.UploadsManager", 4))
        {
          int i1 = this.h;
          new StringBuilder(51).append("storage changed; old: ").append(i1).append(", new: ").append(m);
        }
        if (!this.i)
        {
          if (Log.isLoggable("iu.UploadsManager", 3)) {
            new StringBuilder(20).append("set fsid=").append(m);
          }
          this.i = true;
          this.h = m;
          this.g.edit().putInt("external_storage_fsid", m).commit();
          if (k == 0) {
            continue;
          }
          hau localhau = (hau)mbb.b(this.b, hau.class);
          if (localhau == null) {
            continue;
          }
          localhau.c.sendEmptyMessageDelayed(1, 500L);
          continue;
        }
        if (this.h != m) {
          break label208;
        }
      }
      finally {}
      if (m == -1)
      {
        k = 0;
        continue;
        label208:
        if (Log.isLoggable("iu.UploadsManager", 3))
        {
          int n = this.h;
          new StringBuilder(44).append("fsid changed from ").append(n).append(" to ").append(m);
        }
        this.h = m;
        this.g.edit().putInt("external_storage_fsid", m).commit();
        a();
      }
    }
  }
  
  final void b(int paramInt)
  {
    label176:
    for (;;)
    {
      try
      {
        Cursor localCursor2 = this.b.getContentResolver().query(hbu.b(this.b), new String[] { "upload_all_state" }, null, null, null);
        Cursor localCursor1 = localCursor2;
        if (localCursor1 != null) {}
        int i1;
        int m;
        int n;
        Intent localIntent;
        int k = -1;
      }
      finally
      {
        try
        {
          if (!localCursor1.moveToNext()) {
            break label176;
          }
          i1 = localCursor1.getInt(0);
          k = i1;
          if (localCursor1 != null) {
            localCursor1.close();
          }
          m = hbm.d(this.c, 40);
          n = hbm.b(this.c, paramInt, 40);
          localIntent = new Intent("com.google.android.libraries.social.autobackup.upload_all_progress");
          localIntent.putExtra("upload_all_account_id", paramInt);
          localIntent.putExtra("upload_all_progress", m - n);
          localIntent.putExtra("upload_all_count", m);
          localIntent.putExtra("upload_all_state", k);
          this.b.sendBroadcast(localIntent);
          return;
        }
        finally {}
        localObject1 = finally;
        localCursor1 = null;
        if (localCursor1 != null) {
          localCursor1.close();
        }
      }
    }
  }
  
  public final Cursor c(String paramString)
  {
    List localList = b(paramString);
    MatrixCursor localMatrixCursor = new MatrixCursor(new String[] { "iu_pending_count" });
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      int k = ((Integer)localIterator.next()).intValue();
      int m = hbm.b(this.c, k, 30);
      localMatrixCursor.newRow().add(Integer.valueOf(m));
      if (Log.isLoggable("iu.UploadsManager", 3)) {
        new StringBuilder(48).append("get iu pending count for ").append(k).append(":").append(m);
      }
    }
    return localMatrixCursor;
  }
  
  public final void c()
  {
    this.b.getContentResolver().notifyChange(hbu.b, null);
    hcw.e(this.b);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcl
 * JD-Core Version:    0.7.0.1
 */