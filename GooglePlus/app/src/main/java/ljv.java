import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

final class ljv
  implements ovz<List<qzz>>
{
  ljv(lju paramlju) {}
  
  private List<qzz> b(owa paramowa)
  {
    oxk localoxk;
    if (this.a.a)
    {
      localoxk = new oxk();
      localoxk.a.append("SELECT card FROM streams JOIN stream_cards ON streams.card_id == stream_cards.card_id WHERE stream_view_id= ? ORDER BY sort_key LIMIT ? OFFSET ?");
      String str1 = String.valueOf(this.a.b);
      localoxk.b.add(str1);
      String str2 = String.valueOf(this.a.c);
      localoxk.b.add(str2);
      String str3 = String.valueOf(this.a.d);
      localoxk.b.add(str3);
    }
    Cursor localCursor;
    ArrayList localArrayList;
    for (;;)
    {
      localCursor = paramowa.a(localoxk.a());
      try
      {
        localArrayList = new ArrayList(localCursor.getCount());
        int i = localCursor.getColumnIndexOrThrow("card");
        while (localCursor.moveToNext())
        {
          byte[] arrayOfByte = localCursor.getBlob(i);
          pxz localpxz = this.a.e.c;
          localArrayList.add((qzz)((pzh)qzz.d.a(pym.h, null, null)).a(arrayOfByte, localpxz));
        }
        localoxk = new oxk();
      }
      finally
      {
        localCursor.close();
      }
      localoxk.a.append("SELECT card FROM streams JOIN stream_cards ON streams.card_id == stream_cards.card_id WHERE stream_view_id= ? ORDER BY sort_key");
      String str4 = String.valueOf(this.a.b);
      localoxk.b.add(str4);
    }
    localCursor.close();
    return localArrayList;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ljv
 * JD-Core Version:    0.7.0.1
 */