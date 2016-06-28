import android.content.ContentResolver;
import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public class aut
{
  public aut(dka paramdka) {}
  
  public void a(int paramInt, boolean paramBoolean)
  {
    try
    {
      if ((this.a.a(paramInt).c("local_media_inserted")) && (paramBoolean)) {
        this.a.a.getContentResolver().notifyChange(jqx.a(paramInt), null);
      }
      return;
    }
    catch (gjd localgjd) {}
  }
  
  public void a(List<Integer> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      try
      {
        this.a.b(localInteger.intValue()).b("local_media_inserted", true).d();
        this.a.a.getContentResolver().notifyChange(jqx.a(localInteger.intValue()), null);
      }
      catch (gjd localgjd) {}
      if (Log.isLoggable("AllPhotosSyncManager", 3))
      {
        String str = String.valueOf(localInteger);
        new StringBuilder(19 + String.valueOf(str).length()).append("Account not found: ").append(str);
      }
    }
    dka.a(this.a.a, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aut
 * JD-Core Version:    0.7.0.1
 */