import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

final class gyh
{
  private static SparseArray<ConcurrentLinkedQueue<gyk>> a = new SparseArray();
  
  private static int a(SQLiteDatabase paramSQLiteDatabase, long paramLong)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = Long.toString(paramLong);
    return paramSQLiteDatabase.delete("analytics_events", "rowid=?", arrayOfString);
  }
  
  static List<gyk> a(Context paramContext, int paramInt1, int paramInt2)
  {
    ConcurrentLinkedQueue localConcurrentLinkedQueue = b(paramContext, paramInt1);
    if (!localConcurrentLinkedQueue.isEmpty())
    {
      LinkedList localLinkedList = new LinkedList();
      for (gyk localgyk = (gyk)localConcurrentLinkedQueue.poll(); localgyk != null; localgyk = (gyk)localConcurrentLinkedQueue.poll())
      {
        localLinkedList.add(localgyk);
        if (localLinkedList.size() >= paramInt2) {
          break;
        }
      }
      return localLinkedList;
    }
    return null;
  }
  
  public static kbw a(Context paramContext, int paramInt)
  {
    if (paramInt != -1)
    {
      kcg localkcg = new kcg(paramContext, paramInt);
      List localList = a(paramContext, paramInt, 150000);
      if ((localList != null) && (!localList.isEmpty()))
      {
        int i = localList.size();
        if (Log.isLoggable("LogEventQueue", 3)) {
          new StringBuilder(31).append("Log Events flushed: ").append(i);
        }
        if (i > 15000)
        {
          kcp localkcp = kdg.a(paramContext, localkcg);
          for (int j = 0; j < i; j += 15000)
          {
            int k = j + 15000;
            if (k > i) {
              k = i;
            }
            localkcp.a(new gyj(paramContext, localkcg, localList.subList(j, k)));
          }
          ((kbu)mbb.a(paramContext, kbu.class)).a(localkcp);
          return localkcp;
        }
        gyj localgyj = new gyj(paramContext, localkcg, localList);
        ((kbu)mbb.a(paramContext, kbu.class)).a(localgyj);
        return localgyj;
      }
    }
    return null;
  }
  
  public static void a(Context paramContext, int paramInt, njh paramnjh)
  {
    if ((paramInt != -1) && (paramnjh != null)) {
      new Thread(new gyi(paramContext, paramInt, paramnjh)).start();
    }
    while (!Log.isLoggable("LogEventQueue", 6)) {
      return;
    }
    Log.e("LogEventQueue", "Dropped a log record; unknown user account.");
  }
  
  static void a(Context paramContext, String paramString, List<gyk> paramList)
  {
    int i = 0;
    int j = ((giz)mbb.a(paramContext, giz.class)).a(paramString);
    SQLiteDatabase localSQLiteDatabase = d(paramContext, j);
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.beginTransaction();
    }
    for (;;)
    {
      int k;
      try
      {
        ContentValues localContentValues = new ContentValues();
        k = 0;
        if (k < paramList.size())
        {
          gyk localgyk = (gyk)paramList.get(k);
          if (localgyk.a != -1L) {
            break label312;
          }
          localContentValues.put("event_data", qat.a(localgyk.b));
          long l = localSQLiteDatabase.insert("analytics_events", null, localContentValues);
          paramList.remove(k);
          paramList.add(new gyk(l, localgyk.b));
          break label312;
        }
        localSQLiteDatabase.setTransactionSuccessful();
        if (Log.isLoggable("LogEventQueue", 3))
        {
          int m = paramList.size();
          new StringBuilder(39).append("ClientOzEvents re-inserted: ").append(m);
        }
        localSQLiteDatabase.endTransaction();
        ConcurrentLinkedQueue localConcurrentLinkedQueue = b(paramContext, j);
        if (i >= paramList.size()) {
          break label311;
        }
        if ((!localConcurrentLinkedQueue.add(paramList.get(i))) && (((gyk)paramList.get(i)).a == -1L) && (Log.isLoggable("LogEventQueue", 6))) {
          Log.e("LogEventQueue", "Dropped a log record; unable to insert into queue, not backed by db.");
        }
        i++;
        continue;
        if (!Log.isLoggable("LogEventQueue", 3)) {
          continue;
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      new StringBuilder(52).append("Unable to obtain database for accountId: ").append(j);
      continue;
      label311:
      return;
      label312:
      k++;
    }
  }
  
  private static ConcurrentLinkedQueue<gyk> b(Context paramContext, int paramInt)
  {
    ConcurrentLinkedQueue localConcurrentLinkedQueue1 = (ConcurrentLinkedQueue)a.get(paramInt);
    if (localConcurrentLinkedQueue1 == null) {
      synchronized (a)
      {
        ConcurrentLinkedQueue localConcurrentLinkedQueue2 = (ConcurrentLinkedQueue)a.get(paramInt);
        if (localConcurrentLinkedQueue2 == null)
        {
          localConcurrentLinkedQueue2 = new ConcurrentLinkedQueue();
          localConcurrentLinkedQueue2.addAll(c(paramContext, paramInt));
          a.put(paramInt, localConcurrentLinkedQueue2);
        }
        return localConcurrentLinkedQueue2;
      }
    }
    return localConcurrentLinkedQueue1;
  }
  
  static void b(Context paramContext, int paramInt, njh paramnjh)
  {
    SQLiteDatabase localSQLiteDatabase = d(paramContext, paramInt);
    ContentValues localContentValues;
    if (localSQLiteDatabase != null)
    {
      byte[] arrayOfByte = qat.a(paramnjh);
      localContentValues = new ContentValues();
      localContentValues.put("event_data", arrayOfByte);
    }
    for (gyk localgyk = new gyk(localSQLiteDatabase.insert("analytics_events", null, localContentValues), paramnjh);; localgyk = new gyk(-1L, paramnjh))
    {
      if ((!b(paramContext, paramInt).add(localgyk)) && (Log.isLoggable("LogEventQueue", 6))) {
        Log.e("LogEventQueue", "Dropped a log record; unable to insert.");
      }
      return;
      if (Log.isLoggable("LogEventQueue", 3)) {
        new StringBuilder(55).append("Unable to obtain database for accountIndex: ").append(paramInt);
      }
    }
  }
  
  static void b(Context paramContext, String paramString, List<gyk> paramList)
  {
    int i = 0;
    SQLiteDatabase localSQLiteDatabase;
    int k;
    if (!paramList.isEmpty())
    {
      localSQLiteDatabase = d(paramContext, ((giz)mbb.a(paramContext, giz.class)).a(paramString));
      if (localSQLiteDatabase == null) {
        break label165;
      }
      localSQLiteDatabase.beginTransaction();
      k = 0;
    }
    for (;;)
    {
      int n;
      try
      {
        if (k < paramList.size())
        {
          gyk localgyk = (gyk)paramList.get(k);
          if (localgyk.a == -1L) {
            break label212;
          }
          n = i + a(localSQLiteDatabase, localgyk.a);
          break label215;
        }
        localSQLiteDatabase.setTransactionSuccessful();
        if (Log.isLoggable("LogEventQueue", 3))
        {
          int m = paramList.size();
          new StringBuilder(51).append("Total rows deleted: ").append(i).append(" out of: ").append(m);
        }
        return;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      label165:
      if (Log.isLoggable("LogEventQueue", 3))
      {
        int j = ((giz)mbb.a(paramContext, giz.class)).a(paramString);
        new StringBuilder(52).append("Unable to obtain database for accountId: ").append(j);
        return;
        label212:
        n = i;
        label215:
        k++;
        i = n;
      }
    }
  }
  
  private static ArrayList<gyk> c(Context paramContext, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    SQLiteDatabase localSQLiteDatabase = d(paramContext, paramInt);
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.beginTransaction();
    }
    for (;;)
    {
      int k;
      int i1;
      try
      {
        Cursor localCursor = localSQLiteDatabase.query("analytics_events", new String[] { "rowid", "event_data" }, null, null, null, null, null);
        if (localCursor != null) {}
        try
        {
          int i = localCursor.getColumnIndexOrThrow("rowid");
          int j = localCursor.getColumnIndexOrThrow("event_data");
          k = 0;
          m = 0;
          if (localCursor.moveToPosition(k))
          {
            long l = localCursor.getLong(i);
            byte[] arrayOfByte = localCursor.getBlob(j);
            if (arrayOfByte != null) {
              try
              {
                njh localnjh = (njh)qat.b(new njh(), arrayOfByte, 0, arrayOfByte.length);
                if (localnjh != null)
                {
                  localArrayList.add(new gyk(l, localnjh));
                  i1 = m;
                }
                else
                {
                  int i2 = a(localSQLiteDatabase, l);
                  i1 = i2 + m;
                }
              }
              catch (qas localqas) {}
            }
            i1 = m + a(localSQLiteDatabase, l);
            break label338;
          }
          if (Log.isLoggable("LogEventQueue", 3))
          {
            int n = localArrayList.size();
            new StringBuilder(56).append("Rows loaded into cache: ").append(n).append(" deleted: ").append(m);
          }
          localCursor.close();
          localSQLiteDatabase.setTransactionSuccessful();
          return localArrayList;
        }
        finally
        {
          localCursor.close();
        }
        if (!Log.isLoggable("LogEventQueue", 3)) {
          continue;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        Log.e("LogEventQueue", "Error when retrieving analytics events.", localSQLiteException);
        return localArrayList;
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      new StringBuilder(52).append("Unable to obtain database for accountId: ").append(paramInt);
      return localArrayList;
      label338:
      k++;
      int m = i1;
    }
  }
  
  private static SQLiteDatabase d(Context paramContext, int paramInt)
  {
    try
    {
      hrz localhrz = (hrz)mbb.b(paramContext, hrz.class);
      if (localhrz != null)
      {
        SQLiteDatabase localSQLiteDatabase = localhrz.b(paramContext, paramInt).getWritableDatabase();
        return localSQLiteDatabase;
      }
      return null;
    }
    catch (Exception localException)
    {
      if (Log.isLoggable("LogEventQueue", 3)) {
        new StringBuilder(50).append("Unable to obtain database for account: ").append(paramInt);
      }
    }
    return null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gyh
 * JD-Core Version:    0.7.0.1
 */