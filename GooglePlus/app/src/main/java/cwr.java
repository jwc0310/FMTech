import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
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

public final class cwr
  extends mca
  implements cwq, jhy
{
  private jiw Z;
  git a;
  private cww aa;
  private jjr ab;
  private final hwq ac;
  gzj b;
  cxf c;
  cxg d;
  
  public cwr()
  {
    gxl localgxl = new gxl(pkf.n);
    this.bo.a(gxs.class, localgxl);
    this.ac = new hwq(this.bp);
  }
  
  private final void w()
  {
    hwq localhwq = this.ac;
    if (this.aa.a() > 0) {}
    for (hwt localhwt = hwt.b; localhwt == null; localhwt = hwt.c) {
      throw new NullPointerException();
    }
    localhwq.g = ((hwt)localhwt);
    localhwq.a();
  }
  
  public final void Q_()
  {
    if (jid.a()) {
      jid.a("CirclesFragment", "topPeopleInCircles updated.");
    }
    this.aa.a(this.ab);
    w();
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(aau.wP, paramViewGroup, false);
    RecyclerView localRecyclerView = (RecyclerView)localView.findViewById(efj.AC);
    localRecyclerView.a(new aew(this.bn));
    localRecyclerView.a(this.aa);
    return localView;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.aa = new cww(this);
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder();
    int i = eyg.e;
    localSpannableStringBuilder.append(g().getString(i)).append('\n');
    int j = localSpannableStringBuilder.length();
    int k = eyg.c;
    localSpannableStringBuilder.append(g().getString(k).toUpperCase(Locale.getDefault()));
    localSpannableStringBuilder.setSpan(new URLSpan(""), j, localSpannableStringBuilder.length(), 18);
    hwq localhwq1 = this.ac;
    localhwq1.d = localSpannableStringBuilder;
    localhwq1.c = 0;
    localhwq1.e();
    hwq localhwq2 = this.ac;
    int m = eyg.f;
    localhwq2.f = null;
    localhwq2.e = m;
    localhwq2.e();
    this.ac.a(new cwu(this));
  }
  
  public final void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    boolean bool1 = true;
    if (TextUtils.isEmpty(paramString2)) {
      return;
    }
    String str = paramString2.trim();
    List localList = this.aa.c;
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
        Toast.makeText(this.bn, eyg.k, 0).show();
        return;
        k++;
        break;
      }
      if (jid.a()) {
        jid.a("CirclesFragment", "Starting addCircleTask.");
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
      jid.a("CirclesFragment", "getTopPeopleInCircles completed.");
    }
    this.ab = paramjjr;
    this.aa.a(paramjjr);
    w();
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
    this.Z = ((jiw)this.bo.a(jiw.class));
    this.c = ((cxf)this.bo.a(cxf.class));
    this.d = ((cxg)this.bo.a(cxg.class));
    this.b = ((gzj)this.bo.a(gzj.class));
    this.b.a("AddCircleTask", new cws(this));
    this.b.a(this.d.a(), new cwt(this));
  }
  
  public final void p_()
  {
    super.p_();
    hwq localhwq = this.ac;
    hwt localhwt = hwt.a;
    if (localhwt == null) {
      throw new NullPointerException();
    }
    localhwq.g = ((hwt)localhwt);
    localhwq.a();
    if (jid.a()) {
      jid.a("CirclesFragment", "Initial getTopPeopleInCircles.");
    }
    this.Z.a(this, this.a.c(), 4, jgx.c);
  }
  
  public final void q_()
  {
    super.q_();
    if (this.ab != null) {
      this.ab.b();
    }
  }
  
  public final void v()
  {
    cwm localcwm = new cwm();
    localcwm.n = this;
    localcwm.p = 0;
    localcwm.a(this.x, "new_circle_input");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cwr
 * JD-Core Version:    0.7.0.1
 */