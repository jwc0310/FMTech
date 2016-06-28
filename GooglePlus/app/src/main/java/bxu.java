import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import java.util.List;
import java.util.Locale;

public final class bxu
  extends cjx
  implements cwq, jhy
{
  cxg Z;
  git a;
  jjr aa;
  String ab;
  private jiw at;
  gzj b;
  bxz c;
  cxf d;
  
  public bxu()
  {
    gxl localgxl = new gxl(pkf.n);
    this.bo.a(gxs.class, localgxl);
  }
  
  protected final void A() {}
  
  public final void Q_()
  {
    if (jid.a()) {
      jid.a("CirclesWithFollowingFragment", "getTopPeopleInCircles updated.");
    }
    this.c.a(this.aa);
    J();
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    a(this.c);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ab = this.a.f().b("following_circle_id");
    this.c = new bxz(this);
    hwq localhwq = this.ar;
    int i = aau.jn;
    localhwq.f = null;
    localhwq.e = i;
    localhwq.e();
    this.ar.a(new bxy(this));
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool1 = true;
    if (TextUtils.isEmpty(paramString2)) {
      return;
    }
    String str = paramString2.trim();
    List localList = this.c.a;
    int k;
    if (localList != null)
    {
      int j = localList.size();
      k = 0;
      if (k < j) {
        if (!str.equalsIgnoreCase(((jgw)((Pair)localList.get(k)).first).c())) {}
      }
    }
    for (boolean bool2 = bool1;; bool2 = false)
    {
      if (bool2)
      {
        Toast.makeText(this.bn, aau.uP, 0).show();
        return;
        k++;
        break;
      }
      if (jid.a()) {
        jid.a("CirclesWithFollowingFragment", "Starting addCircleTask.");
      }
      mbf localmbf = this.bn;
      int i = this.a.c();
      if (!paramBoolean) {}
      for (;;)
      {
        jjt localjjt = new jjt(localmbf, i, str, null, bool1);
        gzj localgzj = this.b;
        localgzj.d.a(localjjt, false);
        localgzj.b(localjjt);
        return;
        bool1 = false;
      }
    }
  }
  
  public final void a(jjr paramjjr)
  {
    if (jid.a()) {
      jid.a("CirclesWithFollowingFragment", "getTopPeopleInCircles completed.");
    }
    this.aa = paramjjr;
    this.c.a(paramjjr);
    this.ad = false;
    J();
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
    this.at = ((jiw)this.bo.a(jiw.class));
    this.d = ((cxf)this.bo.a(cxf.class));
    this.Z = ((cxg)this.bo.a(cxg.class));
    this.b = ((gzj)this.bo.a(gzj.class));
    this.b.a("AddCircleTask", new bxv(this));
    this.b.a(this.Z.a(), new bxw(this));
    this.b.a("GetFollCircleIdTask", new bxx(this));
  }
  
  public final void p_()
  {
    super.p_();
    this.ad = true;
    J();
    jid.a("CirclesWithFollowingFragment", "Initial getTopPeopleInCircles.");
    this.at.a(this, this.a.c(), 4, jgx.c);
    cxd localcxd = new cxd(this.bn, this.a.c());
    this.b.b(localcxd);
  }
  
  public final void q_()
  {
    super.q_();
    if (this.aa != null) {
      this.aa.b();
    }
  }
  
  protected final int w()
  {
    return efj.vs;
  }
  
  protected final CharSequence x()
  {
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i = aau.dT;
    localSpannableStringBuilder.append(g().getString(i)).append('\n');
    int j = localSpannableStringBuilder.length();
    int k = aau.dS;
    localSpannableStringBuilder.append(g().getString(k).toUpperCase(Locale.getDefault()));
    localSpannableStringBuilder.setSpan(new URLSpan(""), j, localSpannableStringBuilder.length(), 18);
    return localSpannableStringBuilder;
  }
  
  public final void y()
  {
    cwm localcwm = new cwm();
    localcwm.n = this;
    localcwm.p = 0;
    localcwm.a(this.x, "new_circle_input");
  }
  
  protected final void z() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxu
 * JD-Core Version:    0.7.0.1
 */