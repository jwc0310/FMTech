import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class bve
{
  final SQLiteDatabase a;
  private final Context b;
  
  public bve(Context paramContext, SQLiteDatabase paramSQLiteDatabase)
  {
    this.b = paramContext;
    this.a = paramSQLiteDatabase;
  }
  
  final void a(SQLiteDatabase paramSQLiteDatabase)
  {
    Cursor localCursor = null;
    giz localgiz = (giz)mbb.a(this.b, giz.class);
    paramSQLiteDatabase.execSQL("ALTER TABLE photos ADD COLUMN account_id INTEGER NOT NULL DEFAULT -1");
    HashSet localHashSet = new HashSet();
    try
    {
      localCursor = paramSQLiteDatabase.rawQuery("SELECT DISTINCT account_name FROM photos", null);
      while (localCursor.moveToNext()) {
        if (!localCursor.isNull(0)) {
          localHashSet.add(localCursor.getString(0));
        }
      }
      if (localCursor == null) {
        break label100;
      }
    }
    finally
    {
      if (localCursor != null) {
        localCursor.close();
      }
    }
    localCursor.close();
    label100:
    Iterator localIterator = localHashSet.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      int i = localgiz.a(str);
      if (i == -1)
      {
        paramSQLiteDatabase.execSQL("DELETE FROM photos WHERE account_name = ?", new Object[] { str });
      }
      else
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(i);
        arrayOfObject[1] = str;
        paramSQLiteDatabase.execSQL("UPDATE photos SET account_id = ? where account_name = ?", arrayOfObject);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bve
 * JD-Core Version:    0.7.0.1
 */