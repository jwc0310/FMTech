import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;

public final class hnq
  implements lny
{
  private final Context a;
  
  public hnq(Context paramContext)
  {
    this.a = paramContext;
  }
  
  private static qpp a(rcy paramrcy)
  {
    if (paramrcy == null) {
      return null;
    }
    return (qpp)paramrcy.b(qpp.a);
  }
  
  public final Integer a(int paramInt)
  {
    return Integer.valueOf(165);
  }
  
  public final String a(oqw paramoqw)
  {
    if ((paramoqw == null) || (paramoqw.b == null) || (TextUtils.isEmpty(paramoqw.b.b))) {
      return null;
    }
    return paramoqw.b.b;
  }
  
  public final loa a(Context paramContext, int paramInt)
  {
    return new hnr(paramContext);
  }
  
  public final byte[] a(int paramInt, rcy paramrcy)
  {
    int i = 0;
    qpp localqpp = a(paramrcy);
    if (localqpp == null) {
      return null;
    }
    SQLiteDatabase localSQLiteDatabase = hsb.a(this.a, paramInt);
    localSQLiteDatabase.beginTransaction();
    for (;;)
    {
      try
      {
        qpq[] arrayOfqpq = localqpp.b;
        int j = arrayOfqpq.length;
        if (i < j)
        {
          qpq localqpq = arrayOfqpq[i];
          if ((localqpq != null) && (localqpq.a != null) && (localqpq.a.a != null))
          {
            int k = efj.g(localqpq.a.e);
            String str = localqpq.a.a;
            ContentValues localContentValues = new ContentValues(1);
            localContentValues.put("follow_state", Integer.valueOf(k));
            localSQLiteDatabase.update("cxns", localContentValues, "cxn_id =?", new String[] { str });
          }
        }
        else
        {
          localSQLiteDatabase.setTransactionSuccessful();
          return qat.a(a(paramrcy));
        }
      }
      finally
      {
        localSQLiteDatabase.endTransaction();
      }
      i++;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hnq
 * JD-Core Version:    0.7.0.1
 */