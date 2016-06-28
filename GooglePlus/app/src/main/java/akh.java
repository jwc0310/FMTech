import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

final class akh
  implements View.OnClickListener
{
  akh(ake paramake) {}
  
  public final void onClick(View paramView)
  {
    mbf localmbf = this.a.bn;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjw.q);
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(this.a.bn)).b(localmbf);
    ake localake = this.a;
    if (localake.ae) {
      localake.h(true);
    }
    while ((localake.ae) || (localake.ad == null)) {
      return;
    }
    localake.i(true);
    ghm localghm = new ghm(localake.ad, true);
    localake.ad.a = Integer.valueOf(gia.a);
    localghm.a = Integer.valueOf(gia.a);
    Rect localRect = efj.e(localake.ag);
    localghm.b.set(localRect);
    ((alu)localake.f()).a(localghm);
    localake.P();
    localake.af = new gia();
    gia localgia = localake.af;
    bp localbp = localake.f();
    gib localgib = new gib(localake);
    List localList = localake.y();
    localgia.a(true);
    if ((localList == null) || (localList.isEmpty())) {}
    for (;;)
    {
      localake.ae = true;
      localake.a(true);
      return;
      localgia.b = new gic(localbp, localgib, localList);
      localgia.b.sendEmptyMessage(1);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akh
 * JD-Core Version:    0.7.0.1
 */