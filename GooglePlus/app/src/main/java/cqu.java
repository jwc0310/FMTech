import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

final class cqu
  implements View.OnClickListener
{
  cqu(cqm paramcqm, List paramList1, String paramString1, int paramInt, Intent paramIntent, String paramString2, List paramList2) {}
  
  public final void onClick(View paramView)
  {
    if ((this.a != null) && (!this.a.isEmpty()))
    {
      cqm.a(this.g, this.a, this.b, this.c, this.d, this.e);
      return;
    }
    cqm.a(this.g, this.f, this.b, this.c, this.d, this.e);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cqu
 * JD-Core Version:    0.7.0.1
 */