import android.text.style.URLSpan;
import android.view.View;
import java.util.Locale;

final class dgo
  extends URLSpan
{
  dgo(dgn paramdgn, String paramString)
  {
    super(paramString);
  }
  
  public final void onClick(View paramView)
  {
    String str = getURL().toLowerCase(Locale.US);
    gxq localgxq;
    if (str.contains("answer/1253377")) {
      localgxq = new gxq(pkb.b);
    }
    for (;;)
    {
      if (localgxq != null)
      {
        efj.a(paramView, localgxq);
        gwz.a(paramView, 4);
      }
      super.onClick(paramView);
      return;
      if (str.contains("answer/148666"))
      {
        localgxq = new gxq(pkb.c);
      }
      else if (str.contains("answer/2664992"))
      {
        localgxq = new gxq(pkb.g);
      }
      else
      {
        boolean bool = str.startsWith("tel:");
        localgxq = null;
        if (bool) {
          localgxq = new gxq(pkb.f);
        }
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgo
 * JD-Core Version:    0.7.0.1
 */