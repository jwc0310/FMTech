import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public final class hsn
{
  public String a;
  public String[] b;
  public String c;
  public String[] d;
  public String e;
  public String f;
  private final SQLiteDatabase g;
  
  public hsn(SQLiteDatabase paramSQLiteDatabase)
  {
    this.g = paramSQLiteDatabase;
  }
  
  public final Cursor a()
  {
    return this.g.query(false, this.a, this.b, this.c, this.d, this.e, null, null, this.f);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hsn
 * JD-Core Version:    0.7.0.1
 */