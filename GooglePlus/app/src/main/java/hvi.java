import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class hvi
{
  private static final Object a = new Object();
  private static final String[] b = { "action_type", "person_id", "suggestion_id", "suggestion_ui", "timestamp", "action_source", "ROWID" };
  
  private static String a(List<String> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramList == null) {
      localStringBuilder.append("null");
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append('{');
      for (int i = 0; i < paramList.size(); i++)
      {
        localStringBuilder.append((String)paramList.get(i));
        if (i < -1 + paramList.size()) {
          localStringBuilder.append(", ");
        }
      }
      localStringBuilder.append('}');
    }
  }
  
  private static String a(List<hus> paramList, Map<hus, String> paramMap)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ROWID IN(");
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      String str = (String)paramMap.get((hus)paramList.get(j));
      if (!TextUtils.isEmpty(str))
      {
        if (j > 0) {
          localStringBuilder.append(',');
        }
        localStringBuilder.append(str);
      }
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public final void a(Context paramContext, int paramInt)
  {
    if (!((ixf)mbb.a(paramContext, ixf.class)).a()) {
      return;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(paramContext, paramInt);
    ArrayList localArrayList1;
    Cursor localCursor;
    kl localkl;
    synchronized (a)
    {
      localArrayList1 = new ArrayList();
      localCursor = localSQLiteDatabase.query("suggestion_events", b, null, null, null, null, "timestamp");
      localkl = new kl();
      try
      {
        while (localCursor.moveToNext())
        {
          byte[] arrayOfByte1 = localCursor.getBlob(1);
          byte[] arrayOfByte2 = localCursor.getBlob(2);
          if ((arrayOfByte1 != null) && (arrayOfByte2 != null))
          {
            ArrayList localArrayList3 = (ArrayList)mab.d(arrayOfByte1);
            ArrayList localArrayList4 = (ArrayList)mab.d(arrayOfByte2);
            int k = localCursor.getInt(0);
            int m = localCursor.getInt(3);
            long l = localCursor.getLong(4);
            int n = localCursor.getInt(5);
            hus localhus = new hus(k, localArrayList3, localArrayList4, m, l, n);
            localArrayList1.add(localhus);
            localkl.put(localhus, localCursor.getString(6));
            if (Log.isLoggable("EsSuggestionEvent", 3))
            {
              String str1 = String.valueOf(a(localArrayList3));
              String str2 = String.valueOf(a(localArrayList4));
              new StringBuilder(151 + String.valueOf(str1).length() + String.valueOf(str2).length()).append("> Remove event actionType: ").append(k).append(" personIds: ").append(str1).append(" suggestionIds: ").append(str2).append(" suggestionUi: ").append(m).append(" timestamp: ").append(l).append(" action_source: ").append(n);
              continue;
              localObject2 = finally;
            }
          }
        }
      }
      finally
      {
        localCursor.close();
      }
    }
    localCursor.close();
    int j;
    for (int i = 0; !localArrayList1.isEmpty(); i = j)
    {
      j = i + 1;
      if (i >= 5) {
        break;
      }
      kcp localkcp = new kcp(paramContext, paramInt, localArrayList1);
      localkcp.i();
      ArrayList localArrayList2 = localkcp.h();
      if ((localArrayList2 != null) && (!localArrayList2.isEmpty()))
      {
        localSQLiteDatabase.delete("suggestion_events", a(localArrayList2, localkl), null);
        localArrayList1.removeAll(localArrayList2);
      }
      localkcp.q();
    }
  }
  
  public final void a(Context paramContext, int paramInt, hus paramhus)
  {
    int i;
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int j;
    long l1;
    int k;
    SQLiteDatabase localSQLiteDatabase;
    long l2;
    ContentValues localContentValues;
    if (paramhus != null)
    {
      i = paramhus.a;
      localArrayList1 = paramhus.b;
      localArrayList2 = paramhus.c;
      j = paramhus.d;
      l1 = paramhus.e;
      k = paramhus.f;
      if (Log.isLoggable("EsSuggestionEvent", 3))
      {
        String str2 = String.valueOf(a(localArrayList1));
        String str3 = String.valueOf(a(localArrayList2));
        new StringBuilder(169 + String.valueOf(str2).length() + String.valueOf(str3).length()).append("Insert PeopleSuggestionEventData actionType: ").append(i).append(" personIds: ").append(str2).append(" suggestionIds: ").append(str3).append(" suggestionUi: ").append(j).append(" timestamp: ").append(l1).append(" action_source: ").append(k);
      }
      localSQLiteDatabase = hsb.a(paramContext, paramInt);
      l2 = DatabaseUtils.longForQuery(localSQLiteDatabase, "SELECT COUNT(*) FROM suggestion_events", null);
      localContentValues = new ContentValues();
    }
    try
    {
      localContentValues.put("person_id", mab.b(localArrayList1));
      localContentValues.put("suggestion_id", mab.b(localArrayList2));
      localContentValues.put("action_type", Integer.valueOf(i));
      localContentValues.put("suggestion_ui", Integer.valueOf(j));
      localContentValues.put("timestamp", Long.valueOf(l1));
      localContentValues.put("action_source", Integer.valueOf(k));
      localSQLiteDatabase.insert("suggestion_events", null, localContentValues);
      if (l2 >= 500L) {
        localSQLiteDatabase.execSQL("DELETE FROM suggestion_events WHERE ROWID IN (SELECT ROWID from suggestion_events ORDER BY timestamp ASC LIMIT 10 )");
      }
      return;
    }
    catch (IOException localIOException)
    {
      String str1 = String.valueOf(localIOException);
      Log.e("EsSuggestionEvent", 49 + String.valueOf(str1).length() + "Failed to serialize the people suggestion event. " + str1);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvi
 * JD-Core Version:    0.7.0.1
 */