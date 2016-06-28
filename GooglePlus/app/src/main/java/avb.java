import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

final class avb
  implements ava
{
  final Set<String> a;
  private final String[] b;
  private final String c;
  
  public avb(auz paramauz, String[] paramArrayOfString, String paramString)
  {
    this.b = paramArrayOfString;
    this.c = paramString;
    this.a = new HashSet();
  }
  
  public final Cursor a(int paramInt1, int paramInt2)
  {
    ContentResolver localContentResolver = this.d.f;
    Uri localUri = this.d.d;
    String[] arrayOfString = this.b;
    String str = this.c;
    return localContentResolver.query(localUri, arrayOfString, null, null, 43 + String.valueOf(str).length() + str + " DESC  LIMIT " + paramInt1 + " OFFSET " + paramInt2);
  }
  
  public final void a(Cursor paramCursor)
  {
    boolean bool1 = false;
    while ((paramCursor.moveToNext()) && (!this.d.j))
    {
      String str1 = paramCursor.getString(2);
      boolean bool2 = efj.n(str1);
      ContentValues localContentValues = this.d.h;
      Uri localUri = this.d.d;
      localContentValues.clear();
      long l1 = paramCursor.getLong(0);
      String str2 = paramCursor.getString(1);
      String str3 = paramCursor.getString(2);
      long l2 = paramCursor.getLong(3);
      int i = paramCursor.getInt(4);
      long l3 = paramCursor.getLong(5);
      String str4 = ContentUris.withAppendedId(localUri, l1).toString();
      String str5 = efj.a(str3, i, l2);
      localContentValues.put("local_content_uri", str4);
      localContentValues.put("timestamp", Long.valueOf(l3));
      localContentValues.put("local_file_path", str2);
      localContentValues.put("signature", str5);
      long l4 = paramCursor.getLong(0);
      if ((!bool2) || (l4 < 0L))
      {
        if (Log.isLoggable("MediaUriSync", 3))
        {
          String str6 = String.valueOf("non media mime type or invalid id; media: ");
          new StringBuilder(34 + String.valueOf(str6).length() + String.valueOf(str4).length() + String.valueOf(str1).length()).append(str6).append(str4).append(", type: ").append(str1).append(", id: ").append(l4);
        }
      }
      else
      {
        hco localhco = this.d.e;
        String str7 = null;
        if (localhco != null) {
          str7 = this.d.e.a(str4);
        }
        bool1 |= jqx.a(this.d.b, this.d.g, this.d.h, str4, str7);
        this.a.add(str4);
        if (this.a.size() % 10 == 0)
        {
          this.d.g.yieldIfContendedSafely();
          this.d.i.a(this.d.c, bool1);
          bool1 = false;
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     avb
 * JD-Core Version:    0.7.0.1
 */