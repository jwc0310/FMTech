import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.social.squares.impl.edit.ObservableScrollView;
import java.util.ArrayList;
import java.util.List;

public final class lbi
  extends mca
  implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, bx, cw<Cursor>, gzi, kye, lcj, luu
{
  private String Z;
  EditText a;
  private String aa;
  private String ab;
  private EditText ac;
  private EditText ad;
  private TextView ae;
  private Switch af;
  private int ag;
  private int ah;
  private TextView ai;
  private lbt aj;
  private TextView ak;
  private View al;
  private TextView am;
  private View an;
  private boolean ao;
  ObservableScrollView b;
  private git c;
  private String d;
  
  public lbi()
  {
    new gxl(new kuw(pjo.ar, this.d)).a(this.bo);
    new gxj(this.bp, (byte)0);
  }
  
  private final int w()
  {
    int i = 1;
    if ((this.ah == 0) && (!this.af.isChecked())) {
      i = 0;
    }
    while ((this.ah != i) || (this.af.isChecked())) {
      return i;
    }
    return 2;
  }
  
  private final void x()
  {
    ((lbm)this.bo.a(lbm.class)).a(this.d);
  }
  
  public final String N()
  {
    return this.d;
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.bn);
    if (paramBundle == null)
    {
      cl localcl = h().a();
      String str = this.d;
      lbt locallbt = new lbt();
      Bundle localBundle = new Bundle();
      localBundle.putString("square_id", str);
      locallbt.f(localBundle);
      this.aj = ((lbt)locallbt);
      localcl.a(dl.af, this.aj);
      localcl.b();
    }
    for (;;)
    {
      return localLayoutInflater.inflate(aw.eb, paramViewGroup, false);
      this.aj = ((lbt)h().a(dl.af));
    }
  }
  
  public final fu<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new kzo(this.bn, this.c.c(), this.d, kzq.c);
  }
  
  public final void a(int paramInt, Bundle paramBundle, String paramString) {}
  
  public final void a(int paramInt, boolean paramBoolean, Bundle paramBundle, String paramString) {}
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    d(true);
    this.d = this.m.getString("square_id");
    if ((paramBundle != null) && (paramBundle.getBoolean("first_load"))) {}
    for (boolean bool = true;; bool = false)
    {
      this.ao = bool;
      if (!this.ao) {
        break;
      }
      k().a(1, null, this);
      return;
    }
    lbj locallbj = new lbj(this, this.bn, this.c.c(), this.d);
    ((gzj)this.bo.a(gzj.class)).c(locallbj);
  }
  
  public final void a(Bundle paramBundle, String paramString)
  {
    if ("leave_edit_alert".equals(paramString))
    {
      mbf localmbf = this.bn;
      gxr localgxr = new gxr();
      gxq localgxq = new gxq(pjo.ai);
      localgxr.b.add(localgxq);
      new gwz(26, localgxr.a(this.bn)).b(localmbf);
      x();
    }
  }
  
  public final void a(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    super.a(paramMenu, paramMenuInflater);
    paramMenuInflater.inflate(efj.WW, paramMenu);
  }
  
  public final void a(View paramView, Bundle paramBundle)
  {
    super.a(paramView, paramBundle);
    this.b = ((ObservableScrollView)paramView.findViewById(dl.O));
    this.b.a = this;
    this.a = ((EditText)paramView.findViewById(dl.T));
    this.ac = ((EditText)paramView.findViewById(dl.S));
    this.ad = ((EditText)paramView.findViewById(dl.J));
    this.ak = ((TextView)paramView.findViewById(dl.L));
    TextView localTextView1 = (TextView)paramView.findViewById(dl.ak);
    TextView localTextView2 = (TextView)paramView.findViewById(dl.aj);
    this.a.addTextChangedListener(new lwc(this.a, localTextView2, 50));
    this.ac.addTextChangedListener(new lwc(this.ac, localTextView1, 140));
    this.al = paramView.findViewById(dl.K);
    this.an = paramView.findViewById(dl.H);
    this.ae = ((TextView)paramView.findViewById(dl.Q));
    this.af = ((Switch)paramView.findViewById(dl.P));
    this.ai = ((TextView)paramView.findViewById(dl.R));
    String str = efj.a(this.bn, "community_visibility", "https://support.google.com/plus/?hl=%locale%").toString();
    SpannableStringBuilder localSpannableStringBuilder = new SpannableStringBuilder(efj.y(this.bn.getString(ev.B, new Object[] { str })));
    lxw.a(localSpannableStringBuilder, null, false);
    this.ai.setText(localSpannableStringBuilder);
    this.ai.setMovementMethod(lxy.a());
    this.am = ((TextView)paramView.findViewById(dl.I));
    this.b.getViewTreeObserver().addOnGlobalLayoutListener(new lbk(this));
    gxn localgxn = new gxn(this);
    efj.a(this.al, new gxq(pjo.ao));
    this.al.setOnClickListener(localgxn);
    efj.a(this.an, new gxq(pjo.ac));
    this.an.setOnClickListener(localgxn);
    efj.a(this.ai, new gxq(pjo.as));
    this.ai.setOnClickListener(localgxn);
  }
  
  public final void a(fu<Cursor> paramfu) {}
  
  public final void a(String paramString, hae paramhae, haa paramhaa)
  {
    int i = 1;
    if ("EditSquareTask".equals(paramString)) {
      if (paramhae.b != 200) {
        if (i == 0) {
          x();
        }
      }
    }
    while (!"GetSquareTask".equals(paramString)) {
      for (;;)
      {
        return;
        i = 0;
      }
    }
    if (paramhae.b != 200) {}
    for (int j = i; j != 0; j = 0)
    {
      Toast.makeText(this.bn, ev.b, 0).show();
      x();
      return;
    }
    k().a(i, null, this);
  }
  
  public final boolean a_(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == dl.aa)
    {
      odp localodp = new odp();
      localodp.a = this.a.getText().toString();
      localodp.b = this.ac.getText().toString();
      localodp.e = this.ad.getText().toString();
      int i = w();
      if (TextUtils.isEmpty(localodp.a)) {
        if (this.a.getError() == null)
        {
          EditText localEditText = this.a;
          int k = ev.t;
          localEditText.setError(g().getString(k));
          this.a.addTextChangedListener(new lbl(this));
        }
      }
      for (int j = 0;; j = 1)
      {
        if (j != 0)
        {
          lby locallby = new lby(this.bn, this.c.c(), this.d, localodp);
          if (this.ag != i) {
            locallby.a = i;
          }
          ((gzj)this.bo.a(gzj.class)).c(locallby);
        }
        mbf localmbf = this.bn;
        gxr localgxr = new gxr();
        gxq localgxq = new gxq(pjo.aj);
        localgxr.b.add(localgxq);
        new gwz(4, localgxr.a(this.bn)).b(localmbf);
        return true;
      }
    }
    return super.a_(paramMenuItem);
  }
  
  public final void b(Bundle paramBundle, String paramString) {}
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.c = ((git)this.bo.a(git.class));
    ((gzj)this.bo.a(gzj.class)).a.add(this);
  }
  
  public final void c(Bundle paramBundle, String paramString) {}
  
  public final String d()
  {
    return this.Z;
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putBoolean("first_load", this.ao);
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    gxt localgxt;
    if (paramCompoundButton == this.af)
    {
      if (this.ah != 0) {
        break label62;
      }
      if (!paramBoolean) {
        break label55;
      }
      localgxt = pjo.ab;
    }
    for (;;)
    {
      efj.a(this.af, new gxq(localgxt));
      this.af.setOnClickListener(new gxn(this));
      return;
      label55:
      localgxt = pjo.aa;
      continue;
      label62:
      if (paramBoolean) {
        localgxt = pjo.au;
      } else {
        localgxt = pjo.at;
      }
    }
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.an) {
      a(((kya)this.bo.a(kya.class)).b(this.c.c(), this.d));
    }
    while (paramView != this.al) {
      return;
    }
    a(((kya)this.bo.a(kya.class)).c(this.c.c(), this.d));
  }
  
  public final void v()
  {
    if ((!TextUtils.equals(this.Z, this.a.getText())) || (!TextUtils.equals(this.aa, this.ac.getText())) || (!TextUtils.equals(this.ab, this.ad.getText())) || (this.ag != w())) {}
    for (int i = 1; i != 0; i = 0)
    {
      int j = ev.G;
      String str1 = g().getString(j);
      int k = ev.F;
      String str2 = g().getString(k);
      int m = ev.c;
      String str3 = g().getString(m);
      int n = ev.a;
      lut locallut = lut.a(str1, str2, str3, g().getString(n), 0, 0);
      locallut.n = this;
      locallut.p = 0;
      locallut.a(h(), "leave_edit_alert");
      return;
    }
    mbf localmbf = this.bn;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjo.ai);
    localgxr.b.add(localgxq);
    new gwz(26, localgxr.a(this.bn)).b(localmbf);
    x();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lbi
 * JD-Core Version:    0.7.0.1
 */