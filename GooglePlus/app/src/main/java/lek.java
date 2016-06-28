import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

final class lek
  implements View.OnClickListener
{
  lek(lej paramlej, kxg paramkxg, String paramString, kuw paramkuw, boolean paramBoolean, kuo paramkuo, led paramled, int paramInt) {}
  
  public final void onClick(View paramView)
  {
    kxg localkxg = this.a;
    String str = this.b;
    Object localObject;
    gxr localgxr1;
    Context localContext;
    switch (lem.a[localkxg.ordinal()])
    {
    default: 
      localObject = null;
      if (localObject != null)
      {
        localgxr1 = new gxr();
        localgxr1.b.add(localObject);
        kuw localkuw = this.c;
        localgxr1.b.add(localkuw);
        if (this.d)
        {
          kuo localkuo = this.e;
          localgxr1.b.add(localkuo);
        }
        localContext = this.h.b;
        if (paramView.getParent() != null) {
          break label287;
        }
      }
      break;
    }
    label287:
    for (gxr localgxr2 = localgxr1.a(this.h.b);; localgxr2 = localgxr1.a((View)paramView.getParent()))
    {
      new gwz(4, localgxr2).b(localContext);
      this.f.a(this.a, this.b, this.g);
      return;
      localObject = new kuw(pjo.ay, str);
      break;
      localObject = new kuw(pjo.f, str);
      break;
      localObject = new kuw(pjo.i, str);
      break;
      localObject = new kuw(pjo.aw, str);
      break;
      localObject = new kuw(pjo.aC, str);
      break;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lek
 * JD-Core Version:    0.7.0.1
 */