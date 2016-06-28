import android.view.View;

final class ckj
  extends hwp
{
  ckj(ckf paramckf) {}
  
  public final void a()
  {
    if (this.a.K())
    {
      View localView = this.a.N.findViewById(aaw.gU);
      localView.setVisibility(0);
      localView.findViewById(aaw.jp).setOnClickListener(new ckk(this));
      int i = this.a.am.c();
      gxx localgxx = (gxx)this.a.bo.a(gxx.class);
      gxw localgxw = new gxw(this.a.bn, i);
      localgxw.c = gxz.bN;
      localgxx.a(localgxw);
    }
  }
  
  public final void c()
  {
    this.a.N.findViewById(aaw.gU).setVisibility(8);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ckj
 * JD-Core Version:    0.7.0.1
 */