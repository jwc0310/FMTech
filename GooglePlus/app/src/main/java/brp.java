import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.apps.plus.content.EsProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public final class brp
  extends AsyncTask<fzl, Void, Void>
{
  public brp(jib paramjib, long paramLong) {}
  
  private Void a(fzl... paramVarArgs)
  {
    fzl localfzl = paramVarArgs[0];
    Context localContext = this.b.d;
    int i = this.b.e;
    long l = this.a;
    HashMap localHashMap = new HashMap();
    int j = localfzl.b();
    for (int k = 0; k < j; k++) {
      localHashMap.put(efj.a((fzk)localfzl.a(k)), Integer.valueOf(k));
    }
    SQLiteDatabase localSQLiteDatabase = bqj.a(localContext, i).getWritableDatabase();
    localSQLiteDatabase.beginTransaction();
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    Cursor localCursor;
    int m;
    int n;
    int i5;
    label516:
    label520:
    for (;;)
    {
      label174:
      String str5;
      Integer localInteger;
      try
      {
        localArrayList1 = new ArrayList();
        localArrayList2 = new ArrayList();
        localCursor = localSQLiteDatabase.query("circles", brn.a, null, null, null, null, null);
        m = 0;
        n = 0;
        try
        {
          if (!localCursor.moveToNext()) {
            break;
          }
          i5 = localCursor.getInt(2);
          if (i5 != -1) {
            break label1199;
          }
          n = 1;
          continue;
          str5 = localCursor.getString(0);
          localInteger = (Integer)localHashMap.get(str5);
          if (localInteger == null)
          {
            localArrayList2.add(str5);
            continue;
            localObject1 = finally;
          }
        }
        finally
        {
          localCursor.close();
        }
        localHashMap.remove(str5);
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      String str6 = localCursor.getString(1);
      int i6 = localCursor.getInt(3);
      int i7 = localCursor.getInt(4);
      int i8 = localCursor.getInt(6);
      fzk localfzk2 = (fzk)localfzl.a(localInteger.intValue());
      int i9 = efj.b(localfzk2);
      Object localObject3;
      label322:
      String str7;
      int i10;
      int i11;
      if (i9 == 9)
      {
        localObject3 = localContext.getString(aau.mz);
        str7 = localfzk2.d();
        i10 = localfzk2.f();
        i11 = brn.a(i9);
        if (!localfzk2.h()) {
          break label516;
        }
      }
      for (int i12 = 1;; i12 = 0)
      {
        if ((i9 == i5) && (TextUtils.equals((CharSequence)localObject3, str6)) && (i10 == i6) && (i11 == i7) && (i12 == i8)) {
          break label520;
        }
        ContentValues localContentValues5 = new ContentValues();
        localContentValues5.put("circle_id", str5);
        localContentValues5.put("circle_name", (String)localObject3);
        localContentValues5.put("sort_key", str7);
        localContentValues5.put("type", Integer.valueOf(i9));
        localContentValues5.put("contact_count", Integer.valueOf(i10));
        localContentValues5.put("semantic_hints", Integer.valueOf(i11));
        localContentValues5.put("show_order", Integer.valueOf(brn.b(i9)));
        localContentValues5.put("for_sharing", Integer.valueOf(i12));
        localArrayList1.add(localContentValues5);
        break;
        String str8 = localfzk2.c();
        localObject3 = str8;
        break label322;
      }
    }
    localCursor.close();
    if (!localArrayList2.isEmpty())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      ArrayList localArrayList3 = new ArrayList(localArrayList2.size());
      localStringBuilder.append("circle_id IN (");
      Iterator localIterator1 = localArrayList2.iterator();
      while (localIterator1.hasNext())
      {
        String str4 = (String)localIterator1.next();
        localStringBuilder.append("?,");
        localArrayList3.add(str4);
      }
      localStringBuilder.setLength(-1 + localStringBuilder.length());
      localStringBuilder.append(')');
      localSQLiteDatabase.delete("circles", localStringBuilder.toString(), (String[])localArrayList3.toArray(new String[localArrayList3.size()]));
    }
    if (!localArrayList1.isEmpty())
    {
      Iterator localIterator3 = localArrayList1.iterator();
      while (localIterator3.hasNext())
      {
        ContentValues localContentValues4 = (ContentValues)localIterator3.next();
        String[] arrayOfString = new String[1];
        arrayOfString[0] = localContentValues4.getAsString("circle_id");
        localSQLiteDatabase.update("circles", localContentValues4, "circle_id=?", arrayOfString);
      }
    }
    ContentValues localContentValues1;
    label765:
    fzk localfzk1;
    String str1;
    int i1;
    String str2;
    label829:
    String str3;
    int i2;
    int i3;
    if (!localHashMap.isEmpty())
    {
      localContentValues1 = new ContentValues();
      Iterator localIterator2 = localHashMap.values().iterator();
      if (localIterator2.hasNext())
      {
        localfzk1 = (fzk)localfzl.a(((Integer)localIterator2.next()).intValue());
        str1 = efj.a(localfzk1);
        i1 = efj.b(localfzk1);
        if (i1 == 9)
        {
          str2 = localContext.getString(aau.mz);
          str3 = localfzk1.d();
          i2 = localfzk1.f();
          i3 = brn.a(i1);
          if (!localfzk1.h()) {
            break label1212;
          }
        }
      }
    }
    label1199:
    label1212:
    for (int i4 = 1;; i4 = 0)
    {
      localContentValues1.clear();
      localContentValues1.put("circle_id", str1);
      localContentValues1.put("circle_name", str2);
      localContentValues1.put("sort_key", str3);
      localContentValues1.put("type", Integer.valueOf(i1));
      localContentValues1.put("contact_count", Integer.valueOf(i2));
      localContentValues1.put("semantic_hints", Integer.valueOf(i3));
      localContentValues1.put("show_order", Integer.valueOf(brn.b(i1)));
      localContentValues1.put("for_sharing", Integer.valueOf(i4));
      localSQLiteDatabase.insert("circles", null, localContentValues1);
      break label765;
      str2 = localfzk1.c();
      break label829;
      if (n == 0) {
        EsProvider.a(localContext, localSQLiteDatabase);
      }
      if (m == 0)
      {
        ContentValues localContentValues2 = new ContentValues();
        localContentValues2.clear();
        localContentValues2.put("circle_id", "15");
        localContentValues2.put("circle_name", localContext.getString(aau.cH));
        localContentValues2.put("sort_key", "BLOCKED");
        localContentValues2.put("type", Integer.valueOf(10));
        localContentValues2.put("semantic_hints", Integer.valueOf(24));
        localContentValues2.put("show_order", Integer.valueOf(brn.b(10)));
        localContentValues2.put("show_order", Integer.valueOf(brn.b(10)));
        localSQLiteDatabase.insert("circles", null, localContentValues2);
      }
      ContentValues localContentValues3 = new ContentValues();
      localContentValues3.put("circle_fingerprint", Long.valueOf(l));
      localSQLiteDatabase.update("account_status", localContentValues3, null, null);
      localSQLiteDatabase.setTransactionSuccessful();
      localSQLiteDatabase.endTransaction();
      localContext.getContentResolver().notifyChange(EsProvider.e(localContext), null);
      if (jid.a()) {
        jid.a("EsPeopleData#loadCircles", "Updated circles list in local database");
      }
      localfzl.a();
      this.b.b.open();
      return null;
      if (i5 != 10) {
        break label174;
      }
      m = 1;
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     brp
 * JD-Core Version:    0.7.0.1
 */