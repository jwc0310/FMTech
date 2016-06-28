import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;

final class bc
  implements ViewTreeObserver.OnPreDrawListener
{
  bc(bb parambb, View paramView, Object paramObject, ArrayList paramArrayList, rhn paramrhn, boolean paramBoolean, bk parambk1, bk parambk2) {}
  
  public final boolean onPreDraw()
  {
    this.a.getViewTreeObserver().removeOnPreDrawListener(this);
    if (this.b != null)
    {
      efj.a(this.b, this.c);
      this.c.clear();
      kl localkl = bb.a(this.h, this.d, this.e, this.f);
      efj.a(this.b, this.d.e, localkl, this.c);
      bb.a(this.h, localkl, this.d);
      bb.a(this.h, this.d, this.f, this.g, this.e, localkl);
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bc
 * JD-Core Version:    0.7.0.1
 */