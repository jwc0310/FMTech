import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class lrw
  implements lrp
{
  public static final long a = TimeUnit.MINUTES.toMillis(15L);
  public final HashMap<String, lrl> b = new HashMap();
  public final HashMap<String, lrm> c = new HashMap();
  public final Context d;
  public final hgs e;
  final giz f;
  public final lro g;
  private final lrs h = new lrs();
  private final lri i;
  private final Set<Integer> j = new HashSet();
  
  lrw(Context paramContext, hgs paramhgs)
  {
    this.d = paramContext;
    this.e = paramhgs;
    this.f = ((giz)mbb.a(paramContext, giz.class));
    this.i = ((lri)mbb.b(paramContext, lri.class));
    this.g = ((lro)mbb.b(paramContext, lro.class));
    List localList = mbb.c(paramContext, lrl.class);
    int k = 0;
    if (k < localList.size())
    {
      lrl locallrl = (lrl)localList.get(k);
      lrm locallrm = locallrl.a();
      if (this.b.put(locallrm.a(), locallrl) == null) {}
      for (boolean bool = true;; bool = false)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = locallrm.a();
        efj.c(bool, "Two synclets with same name: %s", arrayOfObject);
        this.c.put(locallrm.a(), locallrm);
        k++;
        break;
      }
    }
  }
  
  public static boolean a(lrq paramlrq, long paramLong)
  {
    return paramLong > paramlrq.a.b();
  }
  
  /* Error */
  public final long a(int paramInt, lrm paramlrm)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 67	lrw:d	Landroid/content/Context;
    //   4: iload_1
    //   5: invokestatic 139	hsb:b	(Landroid/content/Context;I)Landroid/database/sqlite/SQLiteDatabase;
    //   8: astore_3
    //   9: iconst_1
    //   10: anewarray 141	java/lang/String
    //   13: dup
    //   14: iconst_0
    //   15: ldc 143
    //   17: aastore
    //   18: astore 4
    //   20: iconst_1
    //   21: anewarray 141	java/lang/String
    //   24: astore 5
    //   26: aload 5
    //   28: iconst_0
    //   29: aload_2
    //   30: invokeinterface 111 1 0
    //   35: aastore
    //   36: aload_3
    //   37: ldc 145
    //   39: aload 4
    //   41: ldc 147
    //   43: aload 5
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: invokevirtual 153	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   51: astore 6
    //   53: aload 6
    //   55: invokeinterface 159 1 0
    //   60: ifeq +27 -> 87
    //   63: aload 6
    //   65: iconst_0
    //   66: invokeinterface 163 2 0
    //   71: lstore 10
    //   73: lload 10
    //   75: lstore 8
    //   77: aload 6
    //   79: invokeinterface 166 1 0
    //   84: lload 8
    //   86: lreturn
    //   87: lconst_0
    //   88: lstore 8
    //   90: goto -13 -> 77
    //   93: astore 7
    //   95: aload 6
    //   97: invokeinterface 166 1 0
    //   102: aload 7
    //   104: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	lrw
    //   0	105	1	paramInt	int
    //   0	105	2	paramlrm	lrm
    //   8	29	3	localSQLiteDatabase	SQLiteDatabase
    //   18	22	4	arrayOfString1	String[]
    //   24	20	5	arrayOfString2	String[]
    //   51	45	6	localCursor	android.database.Cursor
    //   93	10	7	localObject	Object
    //   75	14	8	l1	long
    //   71	3	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   53	73	93	finally
  }
  
  public final void a(int paramInt)
  {
    synchronized (this.j)
    {
      if (this.j.contains(Integer.valueOf(paramInt)))
      {
        if (Log.isLoggable("SyncletManager", 3))
        {
          Locale localLocale3 = Locale.US;
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = Integer.valueOf(paramInt);
          String.format(localLocale3, "requestDelayedSync already scheduled accountId %d for a delayed sync.", arrayOfObject3);
        }
        return;
      }
      if (!this.f.c(paramInt))
      {
        if (Log.isLoggable("SyncletManager", 3))
        {
          Locale localLocale2 = Locale.US;
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(paramInt);
          String.format(localLocale2, "requestDelayedSync called with invalid account %d", arrayOfObject2);
        }
        return;
      }
    }
    if (Log.isLoggable("SyncletManager", 3))
    {
      Locale localLocale1 = Locale.US;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(paramInt);
      String.format(localLocale1, "requestDelayedSync called with account %d", arrayOfObject1);
    }
    long l1 = this.e.a();
    if (this.g == null) {}
    long l2;
    for (long l3 = lro.a;; l3 = l2)
    {
      long l4 = l1 + l3;
      Intent localIntent = new Intent(lrs.a(paramInt));
      localIntent.putExtra("account_id", paramInt);
      PendingIntent localPendingIntent = PendingIntent.getBroadcast(this.d, 0, localIntent, 1073741824);
      lrs locallrs = this.h;
      this.d.registerReceiver(locallrs, new IntentFilter(lrs.a(paramInt)));
      ((AlarmManager)this.d.getSystemService("alarm")).set(0, l4, localPendingIntent);
      this.j.add(Integer.valueOf(paramInt));
      return;
      l2 = this.g.a(paramInt);
    }
  }
  
  public final void a(String paramString, kck paramkck, int paramInt, lrh paramlrh)
  {
    str = b(paramInt);
    if (str == null) {
      return;
    }
    if ((this.i == null) || (this.i.a(paramInt))) {}
    for (k = 1;; k = 0) {
      for (;;)
      {
        lrm locallrm = (lrm)this.c.get(paramString);
        if (k != 0)
        {
          kqf localkqf1 = new kqf(locallrm.c());
          localkqf1.b = str;
          localkqf1.b(this.d);
        }
        try
        {
          ((lrl)this.b.get(paramString)).a(paramkck, paramInt, paramlrh);
          long l = this.e.a();
          SQLiteDatabase localSQLiteDatabase = hsb.a(this.d, paramInt);
          ContentValues localContentValues = new ContentValues();
          localContentValues.put("synclet_name", locallrm.a());
          localContentValues.put("last_sync", Long.valueOf(l));
          localSQLiteDatabase.insertWithOnConflict("synclet_status", null, localContentValues, 5);
          kqf localkqf3;
          return;
        }
        finally
        {
          if (k == 0) {
            break label258;
          }
          kqf localkqf2 = new kqf(locallrm.d());
          localkqf2.b = str;
          localkqf2.b(this.d);
        }
      }
    }
  }
  
  public final String b(int paramInt)
  {
    try
    {
      String str = this.f.a(paramInt).b("account_name");
      return str;
    }
    catch (gjd localgjd) {}
    return null;
  }
  
  final void c(int paramInt)
  {
    synchronized (this.j)
    {
      if (!this.j.contains(Integer.valueOf(paramInt))) {
        return;
      }
      this.j.remove(Integer.valueOf(paramInt));
      if (this.j.isEmpty()) {
        this.d.unregisterReceiver(this.h);
      }
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lrw
 * JD-Core Version:    0.7.0.1
 */