import android.database.Cursor;
import java.util.ArrayList;
import java.util.Map;

final class ljx
  implements ovz<Map<String, qzz>>
{
  ljx(ljw paramljw) {}
  
  private Map<String, qzz> b(owa paramowa)
  {
    oxk localoxk;
    if (this.a.a)
    {
      localoxk = new oxk();
      localoxk.a.append("SELECT card_id FROM streams WHERE stream_view_id= ? ORDER BY sort_key LIMIT ? OFFSET ?");
      String str1 = String.valueOf(this.a.b);
      localoxk.b.add(str1);
      String str2 = String.valueOf(this.a.c);
      localoxk.b.add(str2);
      String str3 = String.valueOf(this.a.d);
      localoxk.b.add(str3);
    }
    Cursor localCursor;
    Object localObject1;
    for (;;)
    {
      localCursor = paramowa.a(localoxk.a());
      localObject1 = new ArrayList();
      try
      {
        int i = localCursor.getColumnIndexOrThrow("card_id");
        while (localCursor.moveToNext()) {
          ((ArrayList)localObject1).add(localCursor.getString(i));
        }
        localoxk = new oxk();
      }
      finally
      {
        localCursor.close();
      }
      localoxk.a.append("SELECT card_id FROM streams WHERE stream_view_id= ? ORDER BY sort_key");
      String str4 = String.valueOf(this.a.b);
      localoxk.b.add(str4);
    }
    localCursor.close();
    kl localkl = new kl(((ArrayList)localObject1).size());
    pdc localpdc = pea.a("Parsing cards");
    try
    {
      while (!((ArrayList)localObject1).isEmpty())
      {
        ArrayList localArrayList = this.a.e.a(paramowa, (ArrayList)localObject1, localkl);
        localObject1 = localArrayList;
      }
      return localkl;
    }
    finally
    {
      localpdc.close();
      pea.b("Parsing cards");
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ljx
 * JD-Core Version:    0.7.0.1
 */