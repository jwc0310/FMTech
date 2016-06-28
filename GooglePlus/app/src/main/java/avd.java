import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import java.util.Set;

final class avd
  implements ava
{
  int a;
  private final Set<String> b;
  
  public avd(Set<String> paramSet)
  {
    Object localObject;
    this.b = localObject;
    this.a = 0;
  }
  
  public final Cursor a(int paramInt1, int paramInt2)
  {
    SQLiteDatabase localSQLiteDatabase = this.c.g;
    String[] arrayOfString1 = auz.a;
    String[] arrayOfString2 = new String[1];
    arrayOfString2[0] = String.valueOf(this.c.d.toString()).concat("%");
    return localSQLiteDatabase.query("all_photos", arrayOfString1, "local_content_uri LIKE ?", arrayOfString2, null, null, null, 24 + paramInt2 + ", " + paramInt1);
  }
  
  public final void a(Cursor paramCursor)
  {
    while ((paramCursor.moveToNext()) && (!this.c.j))
    {
      String str = paramCursor.getString(0);
      if (!this.b.contains(str))
      {
        jqx.a(this.c.g, str);
        this.a = (1 + this.a);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     avd
 * JD-Core Version:    0.7.0.1
 */