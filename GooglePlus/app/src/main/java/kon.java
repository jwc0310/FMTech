import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.net.Uri.Builder;
import android.widget.Toast;
import com.google.android.libraries.social.sharekit.reshare.ReshareChooserActivity;

public final class kon
{
  public final ReshareChooserActivity a;
  public final pxz b;
  public koz c;
  public Intent d;
  
  kon(ReshareChooserActivity paramReshareChooserActivity, pxz parampxz)
  {
    this.a = paramReshareChooserActivity;
    this.b = parampxz;
  }
  
  final pej a(peg parampeg)
  {
    int i = parampeg.b;
    if (i == efj.Vp) {
      this.a.startActivity(this.d);
    }
    for (;;)
    {
      return pej.a;
      if (i == efj.Vo)
      {
        efj.a(this.a, this.c.c);
        String str2 = this.a.getResources().getString(efj.Vs);
        Toast.makeText(this.a, str2, 0).show();
      }
      else if (i == efj.Vq)
      {
        String str1 = Uri.parse(this.c.c).buildUpon().appendQueryParameter("_utm_source", "1-2-2").build().toString();
        ez localez = new ez(this.a);
        localez.a.setType("text/plain");
        localez.b = this.a.getResources().getString(efj.Vt);
        localez.a.putExtra("android.intent.extra.TEXT", str1);
        this.a.startActivity(localez.a());
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kon
 * JD-Core Version:    0.7.0.1
 */