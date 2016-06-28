import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public final class byh
  extends cjx
{
  boolean Z;
  ckc a;
  int aa = 0;
  private TextView ab;
  private final cw<otf> at;
  private final cw<bru> au;
  int b;
  String c;
  int d;
  
  public byh()
  {
    new gzc(this, new byk(this));
    gxl localgxl = new gxl(pkf.t);
    this.bo.a(gxs.class, localgxl);
    this.at = new byi(this);
    this.au = new byj(this);
  }
  
  protected final void A()
  {
    this.ad = true;
    k().b(2, null, this.at);
  }
  
  public final Integer B()
  {
    return Integer.valueOf(104);
  }
  
  public final Integer C()
  {
    return Integer.valueOf(4);
  }
  
  public final int R_()
  {
    switch (this.b)
    {
    default: 
      return 0;
    case 9: 
      return 127;
    case 10: 
      return 14;
    }
    return 13;
  }
  
  final void S_()
  {
    int i = this.aa - this.a.getCount();
    if (i > 0)
    {
      TextView localTextView = this.ab;
      Resources localResources = g();
      int j = efj.xB;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      localTextView.setText(localResources.getQuantityString(j, i, arrayOfObject));
      this.ab.setVisibility(0);
      return;
    }
    this.ab.setVisibility(8);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView1 = super.a(paramLayoutInflater, paramViewGroup, paramBundle);
    View localView2 = paramLayoutInflater.inflate(efj.vq, this.al, false);
    this.ab = ((TextView)localView2.findViewById(aaw.ls));
    this.al.addFooterView(localView2, null, false);
    a(this.a);
    S_();
    return localView1;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.a = new cka(this);
    Bundle localBundle = new Bundle();
    localBundle.putString("person_id", jjf.b(this.c));
    k().a(100, localBundle, this.au);
  }
  
  public final gya r_()
  {
    return gya.q;
  }
  
  protected final int w()
  {
    return efj.vs;
  }
  
  protected final CharSequence x()
  {
    int i = aau.my;
    return g().getString(i);
  }
  
  protected final void z()
  {
    this.ad = true;
    k().a(2, null, this.at);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     byh
 * JD-Core Version:    0.7.0.1
 */