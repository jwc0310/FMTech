import android.util.Log;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class dkb
  implements Runnable
{
  public dkb(dka paramdka) {}
  
  public final void run()
  {
    Iterator localIterator = this.a.b.a().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      gjb localgjb = this.a.b.a(i);
      if ((localgjb.a()) && (localgjb.c("is_google_plus")) && (bry.b(this.a.a, i)))
      {
        try
        {
          this.a.a(i, null, bsn.e);
        }
        catch (IOException localIOException) {}
        if (Log.isLoggable("AllPhotosSyncManager", 6))
        {
          if (localgjb.c("is_plus_page")) {}
          for (String str = 19 + ", page: " + i;; str = "")
          {
            Log.e("AllPhotosSyncManager", 64 + String.valueOf(str).length() + "----> doAllPhotosMetadataDownSync error for account: " + i + str, localIOException);
            break;
          }
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dkb
 * JD-Core Version:    0.7.0.1
 */