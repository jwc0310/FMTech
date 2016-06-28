import android.database.Cursor;
import java.util.ArrayList;

final class ljr
  implements ovz<ljf>
{
  ljr(ljq paramljq) {}
  
  private ljf b(owa paramowa)
  {
    int i = this.a.a;
    oxk localoxk = new oxk();
    localoxk.a.append("SELECT stream_id, continuation_token, timestamp FROM stream_views WHERE stream_view_id= ?");
    String str1 = String.valueOf(i);
    localoxk.b.add(str1);
    Cursor localCursor = paramowa.a(localoxk.a());
    try
    {
      if (localCursor.moveToFirst())
      {
        long l = localCursor.getLong(localCursor.getColumnIndexOrThrow("timestamp"));
        String str2 = localCursor.getString(localCursor.getColumnIndexOrThrow("stream_id"));
        String str3 = localCursor.getString(localCursor.getColumnIndexOrThrow("continuation_token"));
        ljf localljf = new ljf(str2, this.a.a, l, str3);
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
 * Qualified Name:     ljr
 * JD-Core Version:    0.7.0.1
 */