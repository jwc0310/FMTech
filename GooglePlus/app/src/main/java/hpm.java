import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public final class hpm
  extends mca
  implements View.OnClickListener
{
  private git a;
  private hpo b;
  private View c;
  private View d;
  
  public hpm()
  {
    new gxl(pju.z).a(this.bo);
    new gxj(this.bp, (byte)0);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(efj.Ke, paramViewGroup, false);
    this.c = localView.findViewById(efj.Kb);
    this.c.setOnClickListener(new gxn(this));
    efj.a(this.c, new gxq(pju.A));
    this.d = localView.findViewById(efj.Kc);
    this.d.setOnClickListener(new gxn(this));
    efj.a(this.d, new gxq(pju.x));
    return localView;
  }
  
  protected final void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.a = ((git)this.bo.a(git.class));
    this.b = ((hpo)this.bo.a(hpo.class));
  }
  
  public final void onClick(View paramView)
  {
    if (paramView == this.c) {
      a(this.b.b(this.a.c()));
    }
    for (;;)
    {
      f().finish();
      return;
      if (paramView == this.d) {
        a(this.b.a(this.a.c()));
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hpm
 * JD-Core Version:    0.7.0.1
 */