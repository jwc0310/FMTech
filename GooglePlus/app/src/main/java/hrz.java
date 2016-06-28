import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.SparseArray;

public abstract class hrz
{
  private SparseArray<SQLiteOpenHelper> a = new SparseArray();
  
  public abstract SQLiteOpenHelper a(Context paramContext, int paramInt);
  
  public final SQLiteOpenHelper b(Context paramContext, int paramInt)
  {
    try
    {
      SQLiteOpenHelper localSQLiteOpenHelper = (SQLiteOpenHelper)this.a.get(paramInt);
      if (localSQLiteOpenHelper == null)
      {
        localSQLiteOpenHelper = a(paramContext, paramInt);
        this.a.put(paramInt, localSQLiteOpenHelper);
      }
      return localSQLiteOpenHelper;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hrz
 * JD-Core Version:    0.7.0.1
 */