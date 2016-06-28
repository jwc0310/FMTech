import android.view.View;
import android.view.View.OnClickListener;

final class kwv
  implements View.OnClickListener
{
  kwv(kwt paramkwt) {}
  
  public final void onClick(View paramView)
  {
    int i = paramView.getId();
    if (i == eyg.by)
    {
      this.a.b.o();
      return;
    }
    if (i == eyg.bt)
    {
      this.a.b.p();
      return;
    }
    if (i == eyg.bw)
    {
      if (this.a.b.c())
      {
        this.a.b.r();
        return;
      }
      this.a.b.q();
      return;
    }
    if (i == eyg.bp)
    {
      if (this.a.b.g())
      {
        this.a.b.t();
        return;
      }
      this.a.b.s();
      return;
    }
    throw new AssertionError("Callback for unknown button.");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kwv
 * JD-Core Version:    0.7.0.1
 */