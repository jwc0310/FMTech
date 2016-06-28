import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;

public final class def
  extends jqw
  implements dfx<Cursor>
{
  private static String[] r = { "_id", "tile_id", "image_url", "view_order", "media_attr", "photo_id", "title", "content_url" };
  private String w;
  private String x;
  private final String y;
  
  public def(Context paramContext, int paramInt1, String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, int paramInt2) {}
  
  public static ipf a(Context paramContext, Cursor paramCursor)
  {
    long l = paramCursor.getLong(4);
    ipm localipm = jrf.a(l);
    if ((l & 0x40000) != 0L) {
      return ipf.a(paramContext, Uri.parse(paramCursor.getString(2)), localipm);
    }
    return ipf.a(paramContext, paramCursor.getString(1), paramCursor.getString(2), localipm);
  }
  
  public final void a(ipf paramipf)
  {
    int i = 1;
    int j;
    if (paramipf.a != null)
    {
      j = i;
      if (j == 0) {
        break label29;
      }
      this.w = paramipf.a;
    }
    for (;;)
    {
      return;
      j = 0;
      break;
      label29:
      if (paramipf.b.a != 0L) {}
      while (i != 0)
      {
        this.x = Long.toString(paramipf.b.a);
        return;
        i = 0;
      }
    }
  }
  
  public final Cursor o()
  {
    Cursor localCursor = super.o();
    if (localCursor == null) {
      localCursor = null;
    }
    label181:
    label185:
    for (;;)
    {
      return localCursor;
      SQLiteDatabase localSQLiteDatabase = bqj.a(this.l, this.t).getReadableDatabase();
      String str;
      String[] arrayOfString2;
      if ((this.w != null) || (this.x == null))
      {
        str = this.w;
        if (str == null) {
          break label181;
        }
        String[] arrayOfString1 = this.v;
        arrayOfString2 = (String[])Arrays.copyOf(arrayOfString1, 2 + arrayOfString1.length);
        arrayOfString2[arrayOfString1.length] = this.s;
        arrayOfString2[(1 + arrayOfString1.length)] = str;
      }
      for (int i = (int)DatabaseUtils.longForQuery(localSQLiteDatabase, this.y, arrayOfString2);; i = 0)
      {
        if (!(localCursor instanceof hqd)) {
          break label185;
        }
        hqd localhqd = (hqd)localCursor;
        Bundle localBundle = localhqd.getExtras();
        if ((localBundle == Bundle.EMPTY) || (localBundle == null)) {
          localBundle = new Bundle();
        }
        localBundle.putInt("start_position", i);
        localhqd.setExtras(localBundle);
        return localCursor;
        str = a(localSQLiteDatabase, this.x);
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     def
 * JD-Core Version:    0.7.0.1
 */