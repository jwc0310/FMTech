import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.provider.ContactsContract.RawContacts;
import android.util.Log;
import com.google.android.apps.plus.content.EsProvider;
import java.util.ArrayList;
import java.util.List;

public final class dkq
{
  @SuppressLint({"InlinedApi"})
  private static final String[] a = { "times_contacted", "last_time_contacted", "sourceid", "data_set" };
  private static final String[] b = { "times_contacted", "last_time_contacted", "sourceid" };
  private final Context c;
  private final int d;
  private final String e;
  private final List<ore> f;
  private long g = -1L;
  private boolean h;
  private final kck i;
  
  private dkq(Context paramContext, int paramInt, kck paramkck)
  {
    this.c = paramContext;
    this.d = paramInt;
    this.e = ((giz)mbb.a(paramContext, giz.class)).a(paramInt).b("account_name");
    this.f = new ArrayList();
    this.i = paramkck;
  }
  
  private final void a()
  {
    for (;;)
    {
      if (!this.f.isEmpty())
      {
        this.g = -1L;
        ArrayList localArrayList = new ArrayList();
        while ((!this.f.isEmpty()) && (localArrayList.size() < 20))
        {
          ore localore = (ore)this.f.remove(0);
          localArrayList.add(localore);
          if (this.g < localore.b.b.longValue()) {
            this.g = localore.b.b.longValue();
          }
        }
        ore[] arrayOfore = (ore[])localArrayList.toArray(new ore[localArrayList.size()]);
        this.i.b("ContactsStatsSync:PartialUpload");
        bmd localbmd = new bmd(this.c, new kcg(this.c, this.d, this.i), this.d, String.valueOf(dtz.a(this.c)), arrayOfore, 1);
        localbmd.i();
        this.i.d();
        if (localbmd.n()) {
          localbmd.c("ContactsStatsSync");
        }
      }
      else
      {
        return;
      }
      int j = this.d;
      Context localContext = this.c;
      SQLiteDatabase localSQLiteDatabase = bqj.a(localContext, j).getWritableDatabase();
      ContentValues localContentValues = new ContentValues();
      localContentValues.put("last_stats_sync_time", Long.valueOf(System.currentTimeMillis()));
      localSQLiteDatabase.update("account_status", localContentValues, null, null);
      localContext.getContentResolver().notifyChange(EsProvider.c(localContext), null);
      if ((bgp.d(this.c, j) < this.g) && ((!this.h) || (this.f.isEmpty()))) {
        bgp.a(this.c, j, this.g);
      }
    }
  }
  
  public static void a(Context paramContext, int paramInt)
  {
    kch localkch = new kch().a(paramContext, paramInt);
    localkch.e = true;
    new bmd(paramContext, localkch.a(), paramInt, String.valueOf(dtz.a(paramContext)), null, 4).i();
  }
  
  public static void a(Context paramContext, int paramInt, kck paramkck)
  {
    if (paramkck.b()) {
      return;
    }
    dkq localdkq = new dkq(paramContext, paramInt, paramkck);
    Uri localUri = ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("account_name", localdkq.e).appendQueryParameter("account_type", "com.google").build();
    long l1 = bgp.d(localdkq.c, localdkq.d);
    boolean bool;
    String[] arrayOfString;
    if (l1 <= 0L)
    {
      bool = true;
      localdkq.h = bool;
      if (Build.VERSION.SDK_INT >= 14) {
        break label344;
      }
      arrayOfString = b;
    }
    for (;;)
    {
      Cursor localCursor;
      ore localore;
      String str2;
      int j;
      try
      {
        localCursor = localdkq.c.getContentResolver().query(localUri, arrayOfString, "times_contacted > 0", null, "last_time_contacted");
        long l2 = System.currentTimeMillis();
        if (localdkq.h) {
          l2 -= SystemClock.elapsedRealtime() / 2L;
        }
        try
        {
          if (!localCursor.moveToNext()) {
            break label437;
          }
          localore = new ore();
          localore.a = new orm();
          localore.b = new orf();
          localore.b.a = Integer.valueOf(localCursor.getInt(0));
          localore.b.b = Long.valueOf(localCursor.getLong(1));
          if (localore.b.b.longValue() > 0L) {
            break label404;
          }
          localore.b.b = Long.valueOf(l2);
          str2 = localCursor.getString(2);
          if ((localCursor.getColumnCount() <= 3) || (localCursor.isNull(3)) || (!"plus".equals(localCursor.getString(3)))) {
            break label447;
          }
          j = 1;
          if (j == 0) {
            break label424;
          }
          localore.a.c = str2;
          localdkq.f.add(localore);
          continue;
          bool = false;
        }
        finally
        {
          localCursor.close();
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        label344:
        String str1 = String.valueOf(localRuntimeException);
        Log.e("ContactsStatsSync", 29 + String.valueOf(str1).length() + "Query on RawContacts failed. " + str1);
        localdkq.a();
        return;
      }
      arrayOfString = a;
      continue;
      label404:
      if (localore.b.b.longValue() > l1)
      {
        continue;
        label424:
        localore.a.b = str2;
        continue;
        label437:
        localCursor.close();
      }
      else
      {
        continue;
        label447:
        j = 0;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkq
 * JD-Core Version:    0.7.0.1
 */