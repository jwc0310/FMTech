import android.database.Cursor;
import java.util.ArrayList;

final class ljt
  implements ovz<ljf>
{
  ljt(ljs paramljs) {}
  
  private ljf b(owa paramowa)
  {
    String str1 = this.a.a;
    oxk localoxk = new oxk();
    localoxk.a.append("SELECT stream_view_id, continuation_token, timestamp FROM stream_views WHERE stream_id= ? ORDER BY stream_view_id DESC LIMIT ?");
    localoxk.b.add(str1);
    String str2 = String.valueOf(1);
    localoxk.b.add(str2);
    Cursor localCursor = paramowa.a(localoxk.a());
    try
    {
      if (localCursor.moveToFirst())
      {
        long l = localCursor.getLong(localCursor.getColumnIndexOrThrow("timestamp"));
        int i = localCursor.getInt(localCursor.getColumnIndexOrThrow("stream_view_id"));
        String str3 = localCursor.getString(localCursor.getColumnIndexOrThrow("continuation_token"));
        ljf localljf = new ljf(this.a.a, i, l, str3);
        return localljf;
      }
      return null;
    }
    finally
    {
      localCursor.close();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ljt
 * JD-Core Version:    0.7.0.1
 */