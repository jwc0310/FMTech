import android.content.Context;
import android.os.AsyncTask;
import java.io.File;

final class czi
  extends AsyncTask<Void, Void, Void>
{
  czi(czf paramczf) {}
  
  private Void a()
  {
    int i = bgp.a(this.a.a);
    str = 16 + "es" + i + ".db";
    hsp localhsp = (hsp)mbb.a(this.a.a, hsp.class);
    File localFile = this.a.a.getDatabasePath(str);
    if ((localFile.exists()) && (localFile.isFile())) {}
    for (l1 = localFile.length();; l1 = 0L) {
      try
      {
        localhsp.a(this.a.a, i, true);
        long l3 = this.a.a.getDatabasePath(str).length();
        return null;
      }
      finally
      {
        long l2 = this.a.a.getDatabasePath(str).length();
        new StringBuilder(80).append("Clean complete; orig size: ").append(l1).append(", copy size: ").append(l2);
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     czi
 * JD-Core Version:    0.7.0.1
 */