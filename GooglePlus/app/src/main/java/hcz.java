import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

public final class hcz
  extends AsyncTask<Void, Void, Void>
{
  private final hcy a;
  private Context b;
  private File c;
  private List<hdd> d;
  private Uri e;
  private int f;
  
  public hcz(Context paramContext, hcy paramhcy, File paramFile, List<hdd> paramList, int paramInt)
  {
    this.b = paramContext;
    this.c = paramFile;
    this.a = paramhcy;
    this.d = paramList;
    this.f = paramInt;
  }
  
  private Void a()
  {
    for (;;)
    {
      try
      {
        List localList = hcx.a(this.b.getContentResolver(), this.d);
        if ((localList != null) && (!localList.isEmpty()))
        {
          String str = irc.a(new FileInputStream(this.c));
          if (str != null)
          {
            i = -1 + localList.size();
            if (i >= 0)
            {
              Uri localUri = (Uri)localList.get(i);
              if (!str.equals(irc.a(this.b.getContentResolver().openInputStream(localUri)))) {
                continue;
              }
              this.e = localUri;
            }
          }
        }
      }
      catch (Exception localException)
      {
        int i;
        continue;
      }
      return null;
      i--;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hcz
 * JD-Core Version:    0.7.0.1
 */