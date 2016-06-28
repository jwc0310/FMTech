import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.List;

public final class bwo
  extends cos
  implements CompoundButton.OnCheckedChangeListener
{
  boolean a;
  boolean b = true;
  RadioButton c;
  RadioButton d;
  private final coq h;
  private bk i;
  
  public bwo(Context paramContext, int paramInt, cow paramcow, bk parambk)
  {
    this(paramContext, paramInt, paramcow, parambk, coq.d);
  }
  
  private bwo(Context paramContext, int paramInt, cow paramcow, bk parambk, coq paramcoq)
  {
    super(paramContext, paramInt, paramcow, false);
    this.i = parambk;
    this.h = paramcoq;
  }
  
  public final void a()
  {
    new bws(this.i, this.f, "dialog_sync_disabled", this.a, this.b, new bwp(this)).a();
  }
  
  protected final void a(View paramView)
  {
    a(paramView, this.g.getString(aau.rF));
    int j = aau.ml;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = efj.a(this.g, "auto_backup", "https://support.google.com/plus/?hl=%locale%").toString();
    a(paramView, j, arrayOfObject);
    paramView.findViewById(aaw.am);
    int k;
    int m;
    if (!((ixf)mbb.a(this.g, ixf.class)).d())
    {
      k = 1;
      if ((k != 0) || (!((hyi)mbb.a(this.g, hyi.class)).b(bwb.s, this.f))) {
        break label366;
      }
      m = 1;
      label113:
      this.c = ((RadioButton)paramView.findViewById(aaw.ao));
      this.d = ((RadioButton)paramView.findViewById(aaw.ap));
      if ((k != 0) || (m != 0))
      {
        this.c.setVisibility(8);
        this.d.setVisibility(8);
      }
      if ((k != 0) || (m == 0)) {
        ((TextView)paramView.findViewById(aaw.aq)).setText(aau.rD);
      }
      if ((m != 0) || ((k == 0) && (!this.a))) {
        break label372;
      }
      this.c.setChecked(true);
    }
    for (;;)
    {
      this.c.setOnCheckedChangeListener(new bwq(this));
      this.d.setOnCheckedChangeListener(new bwr(this));
      CheckBox localCheckBox = (CheckBox)paramView.findViewById(aaw.al);
      localCheckBox.setOnCheckedChangeListener(this);
      localCheckBox.setChecked(this.b);
      paramView.findViewById(aaw.ao).setOnClickListener(this);
      paramView.findViewById(aaw.ap).setOnClickListener(this);
      if (Build.VERSION.SDK_INT >= 17)
      {
        int n = this.g.getResources().getDimensionPixelSize(efj.ne);
        localCheckBox.setPadding(n, 0, n, 0);
        this.c.setPadding(n, 0, n, 0);
        this.d.setPadding(n, 0, n, 0);
      }
      return;
      k = 0;
      break;
      label366:
      m = 0;
      break label113;
      label372:
      this.d.setChecked(true);
    }
  }
  
  final void a(gxt paramgxt)
  {
    Context localContext = this.g;
    gxr localgxr = new gxr();
    gxq localgxq1 = new gxq(paramgxt);
    localgxr.b.add(localgxq1);
    gxq localgxq2 = new gxq(pjm.e);
    localgxr.b.add(localgxq2);
    gxq localgxq3 = new gxq(pjx.a);
    localgxr.b.add(localgxq3);
    new gwz(4, localgxr).b(localContext);
  }
  
  public final boolean a(ojj paramojj)
  {
    if ((!hbj.a(this.g)) && (super.a(paramojj)))
    {
      boolean bool = ((giz)mbb.a(this.g, giz.class)).a(this.f).c("is_plus_page");
      hba localhba = (hba)mbb.a(this.g, hba.class);
      if ((bool) || (localhba.c())) {}
      for (int j = 1; j == 0; j = 0) {
        return true;
      }
    }
    return false;
  }
  
  public final void b()
  {
    f();
    a(pjm.c);
  }
  
  public final int d()
  {
    return efj.sO;
  }
  
  public final coq e()
  {
    return this.h;
  }
  
  protected final void f()
  {
    long l = System.currentTimeMillis() - hcw.a();
    hcw.a(this.g, l);
    super.f();
  }
  
  public final void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public final void onClick(View paramView)
  {
    if (paramView.getId() == aaw.ap)
    {
      if (!this.d.isChecked()) {}
      for (boolean bool = true;; bool = false)
      {
        this.a = bool;
        return;
      }
    }
    if (paramView.getId() == aaw.ao)
    {
      this.a = this.c.isChecked();
      return;
    }
    super.onClick(paramView);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bwo
 * JD-Core Version:    0.7.0.1
 */