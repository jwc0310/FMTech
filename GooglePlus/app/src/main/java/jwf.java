import android.view.View;
import android.view.View.OnClickListener;

final class jwf
  implements View.OnClickListener
{
  jwf(jwe paramjwe) {}
  
  public final void onClick(View paramView)
  {
    if (jwe.a(this.a)) {
      this.a.j.E_();
    }
    int i;
    jwe localjwe;
    do
    {
      do
      {
        return;
        i = ((jwu)this.a.c()).a(paramView);
      } while (i == -1);
      localjwe = this.a;
    } while ((localjwe.c.e()) || (localjwe.c.f()));
    localjwe.b(i);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwf
 * JD-Core Version:    0.7.0.1
 */