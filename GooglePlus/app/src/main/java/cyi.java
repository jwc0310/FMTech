import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.plus.service.EsService;
import java.util.Collections;

public final class cyi
  extends mca
  implements View.OnClickListener, gxs
{
  private git Z;
  CheckBox a;
  private jev aa;
  private jov ab;
  private jpd ac;
  private final jpe ad = new cyj(this);
  CheckBox b;
  private View c;
  private TextView d;
  
  public cyi()
  {
    new gxj(this.bp, (byte)0);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.bn);
    bp localbp = f();
    View localView = localLayoutInflater.inflate(efj.ti, null);
    if (localView == null) {
      return null;
    }
    this.c = localView.findViewById(aaw.bS);
    this.c.setVisibility(0);
    this.a = ((CheckBox)localView.findViewById(aaw.bQ));
    this.a.setChecked(true);
    this.a.setOnCheckedChangeListener(new gxm(new gxq(pju.g), new gxq(pju.h), new cyk(this)));
    this.b = ((CheckBox)localView.findViewById(aaw.bL));
    this.b.setChecked(true);
    this.b.setOnCheckedChangeListener(new gxm(new gxq(pju.q), new gxq(pju.r), new cyl(this)));
    this.d = ((TextView)localView.findViewById(aaw.bP));
    this.d.setOnClickListener(new gxn(this));
    efj.a(this.d, new gxq(pju.i));
    ((LinearLayout)localView.findViewById(aaw.bR)).setOnClickListener(new cym(this));
    TextView localTextView1 = (TextView)localView.findViewById(aaw.bN);
    if (dtz.b(localbp)) {}
    for (int i = aau.eq;; i = aau.es)
    {
      localTextView1.setText(g().getString(i));
      ((LinearLayout)localView.findViewById(aaw.bM)).setOnClickListener(new cyn(this));
      TextView localTextView2 = (TextView)localView.findViewById(aaw.bO);
      localTextView2.setClickable(true);
      localTextView2.setMovementMethod(LinkMovementMethod.getInstance());
      localTextView2.setOnClickListener(new gxn(new cyo(this, localbp)));
      efj.a(localTextView2, new gxq(pju.s));
      return localView;
    }
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.ab.a(aaw.iG, this.ad);
  }
  
  final void a(boolean paramBoolean)
  {
    bp localbp;
    int i;
    if (i())
    {
      localbp = f();
      i = this.Z.c();
      if ((!this.a.isChecked()) || (!paramBoolean)) {
        break label56;
      }
    }
    label56:
    for (boolean bool = true;; bool = false)
    {
      bgp.d(localbp, i, bool);
      this.aa.f();
      return;
    }
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxs.class, this);
    this.Z = ((git)this.bo.a(git.class));
    this.aa = ((jev)this.bo.a(jev.class));
    this.ab = ((jov)this.bo.a(jov.class));
    this.ac = ((jpd)this.bo.a(jpd.class));
  }
  
  public final void onClick(View paramView)
  {
    bp localbp;
    int i;
    if (paramView == this.d) {
      if (i())
      {
        localbp = f();
        i = this.Z.c();
        boolean bool = this.b.isChecked();
        bgp.e(localbp, i, bool);
        efj.a(localbp, i, bool, gya.a);
        if (!bool) {
          break label100;
        }
        EsService.f(localbp, i);
      }
    }
    while (this.a.isChecked())
    {
      this.ab.a(this.ac, aaw.iG, Collections.singletonList("android.permission.READ_CONTACTS"));
      return;
      label100:
      EsService.e(localbp, i);
    }
    a(false);
  }
  
  public final gxq v()
  {
    return new gxq(pju.j);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cyi
 * JD-Core Version:    0.7.0.1
 */