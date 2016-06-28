import android.view.View;
import android.view.View.OnClickListener;

final class jwi
  implements View.OnClickListener
{
  jwi(jwe paramjwe) {}
  
  public final void onClick(View paramView)
  {
    if (jwe.a(this.a))
    {
      this.a.j.E_();
      return;
    }
    jwe localjwe = this.a;
    if (localjwe.e == null) {
      localjwe.e = new jtn(localjwe.b);
    }
    localjwe.e.a(this.a.d, this.a.c.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jwi
 * JD-Core Version:    0.7.0.1
 */