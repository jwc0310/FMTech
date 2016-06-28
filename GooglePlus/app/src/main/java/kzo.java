import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class kzo
  extends hqj
{
  public boolean r = true;
  private final int s;
  private final String t;
  
  public kzo(Context paramContext, int paramInt, String paramString, String[] paramArrayOfString)
  {
    super(paramContext, ((kyx)mbb.a(paramContext, kyx.class)).a(paramString));
    this.s = paramInt;
    this.t = paramString;
    this.e = paramArrayOfString;
  }
  
  private final Cursor a(SQLiteDatabase paramSQLiteDatabase)
  {
    String[] arrayOfString1 = this.e;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = this.t;
    return paramSQLiteDatabase.query("squares", arrayOfString1, "square_id=?", arrayOfString2, null, null, null);
  }
  
  public final Cursor o()
  {
    boolean bool1 = true;
    Context localContext = this.l;
    SQLiteDatabase localSQLiteDatabase = hsb.b(this.l, this.s);
    Cursor localCursor = a(localSQLiteDatabase);
    boolean bool2;
    boolean bool3;
    if (localCursor.getCount() == 0)
    {
      bool2 = bool1;
      if ((bool2) || (!localCursor.moveToFirst())) {
        break label221;
      }
      int i = localCursor.getColumnIndex("last_sync");
      if (i >= 0)
      {
        long l = localCursor.getLong(i);
        if (System.currentTimeMillis() - l > 1200000L) {
          bool2 = bool1;
        }
      }
      int j = localCursor.getColumnIndex("facepile");
      if (j < 0) {
        break label221;
      }
      bool3 = localCursor.isNull(j);
    }
    for (boolean bool4 = bool1;; bool4 = false)
    {
      if ((localCursor.getCount() == 0) || ((bool3) && (this.r)))
      {
        if (gzj.b(localContext, new kzg(localContext, this.s, this.t, bool4)).b != 200) {}
        for (;;)
        {
          if ((bool1) && (localCursor.getCount() == 0)) {
            break label218;
          }
          localCursor.close();
          return a(localSQLiteDatabase);
          bool2 = false;
          break;
          bool1 = false;
        }
      }
      label218:
      return localCursor;
      label221:
      bool3 = bool2;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kzo
 * JD-Core Version:    0.7.0.1
 */