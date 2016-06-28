import android.os.Handler;
import android.widget.Toast;
import com.google.android.libraries.social.sharekit.comments.MentionMultiAutoCompleteTextView;
import java.util.ArrayList;

final class bai
  extends dme
{
  bai(baa parambaa) {}
  
  public final void a(int paramInt, String paramString, boolean paramBoolean, dmx paramdmx)
  {
    if (paramdmx != null) {
      if (paramdmx.c == 200) {
        break label59;
      }
    }
    label59:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        azx localazx = this.a.ag;
        String str = jjf.c(paramString);
        localazx.a.add(str);
      }
      d(paramInt, paramdmx);
      return;
    }
  }
  
  public final void a_(int paramInt, dmx paramdmx)
  {
    if ((d(paramInt, paramdmx)) && (this.a.ae != null))
    {
      this.a.ae.setText(null);
      efj.m().postDelayed(new baj(this), 150L);
    }
  }
  
  public final void b(int paramInt, dmx paramdmx)
  {
    d(paramInt, paramdmx);
  }
  
  public final void c(int paramInt, dmx paramdmx)
  {
    d(paramInt, paramdmx);
  }
  
  final boolean d(int paramInt, dmx paramdmx)
  {
    if ((this.a.af == null) || (this.a.af.intValue() != paramInt)) {
      return false;
    }
    this.a.af = null;
    efj.a(this.a.x);
    if (paramdmx != null)
    {
      if (paramdmx.c != 200) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label101;
        }
        if (this.a.f() == null) {
          break;
        }
        Toast.makeText(this.a.f().getApplicationContext(), aau.mm, 0).show();
        return false;
      }
    }
    label101:
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bai
 * JD-Core Version:    0.7.0.1
 */