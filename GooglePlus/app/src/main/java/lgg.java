import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public final class lgg
  extends mby
{
  Context Z;
  int aa;
  Button ab;
  Button ac;
  
  public lgg()
  {
    new gxl(pjo.q).a(this.ae);
    new gxj(this.af, (byte)0);
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    this.aa = ((git)this.ae.a(git.class)).c();
    if (paramBundle == null)
    {
      lgk locallgk = new lgk(this.Z, this.aa, 3);
      ((gzj)mbb.a(this.Z, gzj.class)).b(locallgk);
    }
    View localView = LayoutInflater.from(this.Z).inflate(efj.Ye, null);
    TextView localTextView = (TextView)localView.findViewById(efj.Yd);
    String str = efj.a(this.ad, "plus_profile_tab", "https://support.google.com/plus/?hl=%locale%").toString();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(efj.y(this.ad.getString(fa.d, new Object[] { str })));
    lxw.a(localSpannableStringBuilder, null, false);
    localTextView.setText(localSpannableStringBuilder);
    localTextView.setMovementMethod(lxy.a());
    return new un(this.Z).a(localView).a(fa.L, new lgi(this)).b(fa.K, new lgh(this)).a();
  }
  
  public final void h(Bundle paramBundle)
  {
    super.h(paramBundle);
    this.Z = new ContextThemeWrapper(this.ad, efj.Yf);
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
 * Qualified Name:     lgg
 * JD-Core Version:    0.7.0.1
 */