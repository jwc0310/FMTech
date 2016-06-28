import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;
import java.io.File;
import java.net.URI;

final class avy
  extends dme
{
  avy(avt paramavt) {}
  
  public final void a(int paramInt, File paramFile, boolean paramBoolean, String paramString1, String paramString2, dmx paramdmx)
  {
    if ((this.a.Z == null) || (this.a.Z.intValue() != paramInt)) {}
    int i;
    label98:
    avt localavt;
    do
    {
      return;
      this.a.Z = null;
      efj.a(this.a.x);
      if (paramdmx == null) {
        break label298;
      }
      if (paramdmx.c == 200) {
        break;
      }
      i = 1;
      if (i == 0) {
        break label298;
      }
      if (Log.isLoggable("PhotoDownloadFragment", 6))
      {
        if (paramdmx.d == null) {
          break label214;
        }
        Log.e("PhotoDownloadFragment", "Could not download image", paramdmx.d);
      }
      localavt = this.a;
    } while (!localavt.b.a());
    String str2;
    String str3;
    int i1;
    if (paramBoolean)
    {
      int m = aau.fm;
      str2 = localavt.g().getString(m);
      int n = aau.vS;
      str3 = localavt.g().getString(n);
      i1 = aau.ly;
    }
    label214:
    String str1;
    int k;
    for (lut locallut = lut.a(null, str2, str3, localavt.g().getString(i1), 0, 0);; locallut = lut.a(null, str1, null, localavt.g().getString(k), 0, 0))
    {
      locallut.n = localavt;
      locallut.p = 0;
      locallut.a(localavt.x, "download_failed");
      return;
      i = 0;
      break;
      int i2 = paramdmx.c;
      Log.e("PhotoDownloadFragment", 37 + "Could not download image: " + i2);
      break label98;
      int j = aau.fk;
      str1 = localavt.g().getString(j);
      k = aau.mf;
    }
    label298:
    mbf localmbf;
    if ((paramFile != null) && (paramFile.exists())) {
      localmbf = this.a.bn;
    }
    try
    {
      ((DownloadManager)localmbf.getSystemService("download")).addCompletedDownload(paramFile.getName(), paramString1, true, paramString2, paramFile.getAbsolutePath(), paramFile.length(), false);
      label350:
      Intent localIntent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
      localIntent.setData(Uri.parse(paramFile.toURI().toString()));
      localmbf.sendBroadcast(localIntent);
      Toast.makeText(this.a.bn, aau.fn, 1).show();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      break label350;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     avy
 * JD-Core Version:    0.7.0.1
 */