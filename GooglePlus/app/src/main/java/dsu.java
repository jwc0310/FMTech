import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public final class dsu
  extends mby
{
  Context Z;
  int aa;
  Button ab;
  Button ac;
  
  public dsu()
  {
    gxl localgxl = new gxl(pjo.o);
    this.ae.a(gxs.class, localgxl);
    new gxj(this.af, (byte)0);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    this.aa = ((git)this.ae.a(git.class)).c();
    if (paramBundle == null)
    {
      lgk locallgk = new lgk(this.Z, this.aa, 2);
      ((gzj)mbb.a(this.Z, gzj.class)).b(locallgk);
    }
    View localView = LayoutInflater.from(this.Z).inflate(aaw.nd, null);
    TextView localTextView = (TextView)localView.findViewById(eyg.F);
    String str1 = efj.a(this.ad, "plus_profile_tab", "https://support.google.com/plus/?hl=%locale%").toString();
    String str2 = this.ad.getString(efj.BF, new Object[] { str1 });
    if (efj.aaz == null) {
      efj.aaz = new lwi();
    }
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(str2, null, efj.aaz));
    lxw.a(localSpannableStringBuilder, null, false);
    localTextView.setText(localSpannableStringBuilder);
    localTextView.setMovementMethod(lxy.a());
    return new un(this.Z).a(localView).a(efj.BE, new dsw(this)).b(efj.BD, new dsv(this)).a();
  }
  
  public final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = new ContextThemeWrapper(this.ad, aau.xm);
  }
  
  public final void p_()
  {
    super.p_();
    um localum = (um)this.d;
    this.ab = localum.a(-1);
    efj.a(this.ab, new gxq(pjo.Y));
    this.ac = localum.a(-2);
    efj.a(this.ac, new gxq(pjo.X));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dsu
 * JD-Core Version:    0.7.0.1
 */