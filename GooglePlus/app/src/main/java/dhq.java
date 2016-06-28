import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class dhq
  implements View.OnClickListener
{
  dhq(dhj paramdhj) {}
  
  public final void onClick(View paramView)
  {
    if (this.a.Z)
    {
      if ((!this.a.ai) || (this.a.b.e()))
      {
        if (this.a.d)
        {
          dic localdic = new dic(this.a.bn);
          int i = this.a.c;
          localdic.a.putExtra("account_id", i);
          String str = this.a.aD;
          localdic.a.putExtra("gaia_id", str);
          Intent localIntent = localdic.a;
          this.a.a(localIntent, 1002);
        }
        return;
      }
      this.a.ah.a();
      return;
    }
    if (this.a.N())
    {
      dhj.a(this.a, false);
      return;
    }
    dhj.a(this.a, true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dhq
 * JD-Core Version:    0.7.0.1
 */