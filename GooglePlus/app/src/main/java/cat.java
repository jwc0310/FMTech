import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.TextView;
import java.util.ArrayList;

public final class cat
  extends mca
  implements View.OnClickListener, bwh
{
  boolean Z;
  String a;
  git aa;
  CheckedTextView ab;
  CheckedTextView ac;
  private String ad;
  private gnb ae;
  private gnb af;
  private View ag;
  private TextView ah;
  private TextView ai;
  private Button aj;
  private Button ak;
  private gzj al = new gzj(this, this.bp);
  private gzi am = new cau(this);
  private cw<Cursor> an = new cav(this);
  String b;
  long c;
  boolean d;
  
  private final void a(boolean paramBoolean)
  {
    if (!this.al.a("UpdateCollectionShareLinkTask"))
    {
      bon localbon = new bon(f(), this.aa.c(), this.a, this.ad, paramBoolean);
      gzj localgzj = this.al;
      localgzj.d.a(localbon, false);
      localgzj.b(localbon);
    }
  }
  
  private static boolean a(gnb paramgnb)
  {
    jgs[] arrayOfjgs = paramgnb.c;
    int i = arrayOfjgs.length;
    for (int j = 0;; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (arrayOfjgs[j].c == 9) {
          bool = true;
        }
      }
      else {
        return bool;
      }
    }
  }
  
  public final void U_()
  {
    a(false);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.sD, paramViewGroup, false);
    this.ag = localView.findViewById(aaw.jR);
    this.ag.setOnClickListener(this);
    this.ah = ((TextView)localView.findViewById(aaw.jS));
    this.ab = ((CheckedTextView)localView.findViewById(aaw.cA));
    this.ab.setOnClickListener(this);
    this.ac = ((CheckedTextView)localView.findViewById(aaw.jX));
    this.ac.setOnClickListener(this);
    this.ai = ((TextView)localView.findViewById(aaw.bY));
    this.ai.setOnClickListener(this);
    this.aj = ((Button)localView.findViewById(aaw.gD));
    this.aj.setOnClickListener(this);
    this.ak = ((Button)localView.findViewById(aaw.aU));
    this.ak.setOnClickListener(this);
    k().a(0, null, this.an);
    if (paramBundle != null)
    {
      this.ab.setChecked(paramBundle.getBoolean("disable_reshares", false));
      this.ac.setChecked(paramBundle.getBoolean("show_location_data", false));
    }
    return localView;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (paramInt1)
    {
    default: 
      super.a(paramInt1, paramInt2, paramIntent);
      return;
    }
    if (paramInt2 == -1)
    {
      this.af = gnb.a((gnb)paramIntent.getParcelableExtra("extra_acl"));
      v();
    }
    f().overridePendingTransition(efj.iF, efj.iJ);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.af = ((gnb)paramBundle.getParcelable("new_audience"));
      this.d = paramBundle.getBoolean("first_load_finished");
    }
    Bundle localBundle = this.m;
    this.a = localBundle.getString("cluster_id");
    this.ad = localBundle.getString("auth_key");
    this.ae = ((gnb)localBundle.getParcelable("extra_acl"));
    if (this.af == null) {
      this.af = ((gnb)this.ae.clone());
    }
    this.aa = ((git)this.bo.a(git.class));
  }
  
  final boolean a(long paramLong)
  {
    return (paramLong & this.c) != 0L;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    gzj localgzj = this.al;
    gzi localgzi = this.am;
    localgzj.a.add(localgzi);
    this.al.a(new hak(f(), this.x));
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putParcelable("new_audience", this.af);
    paramBundle.putBoolean("first_load_finished", this.d);
    paramBundle.putBoolean("disable_reshares", this.ab.isChecked());
    paramBundle.putBoolean("show_location_data", this.ac.isChecked());
  }
  
  public final void m()
  {
    super.m();
    f().getWindow().setSoftInputMode(2);
  }
  
  public final void onClick(View paramView)
  {
    int i = 1;
    if ((paramView instanceof CheckedTextView)) {
      ((CheckedTextView)paramView).toggle();
    }
    int j = paramView.getId();
    if (j == aaw.cA)
    {
      TextView localTextView = this.ai;
      if (!this.ab.isChecked()) {
        localTextView.setEnabled(i);
      }
    }
    label320:
    do
    {
      do
      {
        return;
        i = 0;
        break;
        if (j == aaw.bY)
        {
          if (!TextUtils.isEmpty(this.b))
          {
            w();
            return;
          }
          a(i);
          return;
        }
        if (j == aaw.jR)
        {
          bp localbp = f();
          int k = this.aa.c();
          int m = aau.ca;
          g().getString(m);
          gnb localgnb3 = this.af;
          boolean bool3 = this.Z;
          a(efj.a(localbp, k, localgnb3, 5, i, false, i, bool3, false, 2), i);
          f().overridePendingTransition(efj.iK, efj.iF);
          return;
        }
        if (j != aaw.gD) {
          break label320;
        }
      } while (this.al.a("UpdateCollectionTask"));
      boolean bool1 = this.ab.isChecked();
      boolean bool2 = this.ac.isChecked();
      if (a(this.af)) {
        bool1 = false;
      }
      boo localboo = new boo(f().getApplicationContext(), this.aa.c(), this.a, this.ad, bool1, bool2);
      gnb localgnb1 = this.ae;
      gnb localgnb2 = this.af;
      localboo.b = gnb.b(localgnb1, localgnb2);
      localboo.a = gnb.b(localgnb2, localgnb1);
      gzj localgzj = this.al;
      localgzj.d.a(localboo, false);
      localgzj.b(localboo);
      return;
    } while (j != aaw.aU);
    f().finish();
  }
  
  final void v()
  {
    this.ag.setEnabled(a(4096L));
    TextView localTextView1 = this.ah;
    gnb localgnb = this.af;
    String str;
    label75:
    TextView localTextView2;
    if (localgnb == null)
    {
      int j = aau.bU;
      str = g().getString(j);
      localTextView1.setText(str);
      if (!a(this.af)) {
        break label174;
      }
      this.ab.setVisibility(8);
      this.ab.setChecked(false);
      this.ab.setEnabled(a(32768L));
      this.ac.setEnabled(a(65536L));
      localTextView2 = this.ai;
      if ((!a(32768L)) && (TextUtils.isEmpty(this.b))) {
        break label185;
      }
    }
    label174:
    label185:
    for (boolean bool = true;; bool = false)
    {
      localTextView2.setEnabled(bool);
      return;
      str = localgnb.b(f());
      if (!TextUtils.isEmpty(str)) {
        break;
      }
      int i = aau.bU;
      str = g().getString(i);
      break;
      this.ab.setVisibility(0);
      break label75;
    }
  }
  
  final void w()
  {
    if ((a(this.af)) || (a(this.ae))) {}
    for (boolean bool = true;; bool = false)
    {
      String str = this.b;
      Bundle localBundle = new Bundle();
      localBundle.putString("album_url", str);
      localBundle.putBoolean("is_public", bool);
      bwf localbwf = new bwf();
      localbwf.f(localBundle);
      localbwf.n = this;
      localbwf.p = 0;
      localbwf.a(this.x, "share_via_link");
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cat
 * JD-Core Version:    0.7.0.1
 */