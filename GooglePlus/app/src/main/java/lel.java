import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

final class lel
  implements View.OnClickListener
{
  lel(lej paramlej, kuw paramkuw, boolean paramBoolean, kuo paramkuo, led paramled, String paramString1, String paramString2) {}
  
  public final void onClick(View paramView)
  {
    gxr localgxr1 = new gxr();
    kuw localkuw = this.a;
    localgxr1.b.add(localkuw);
    if (this.b)
    {
      kuo localkuo = this.c;
      localgxr1.b.add(localkuo);
    }
    Context localContext = this.g.b;
    if (paramView.getParent() == null) {}
    for (gxr localgxr2 = localgxr1.a(this.g.b);; localgxr2 = localgxr1.a((View)paramView.getParent()))
    {
      new gwz(4, localgxr2).b(localContext);
      ((gvj)mbb.a(paramView.getContext(), gvj.class)).b(paramView);
      this.d.a(this.e, this.f);
      return;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lel
 * JD-Core Version:    0.7.0.1
 */