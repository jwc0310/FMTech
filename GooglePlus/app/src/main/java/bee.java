import android.content.Context;
import android.view.View;
import com.google.android.apps.plus.service.SlideshowService;
import com.google.android.apps.plus.views.PhotoViewPager;

final class bee
  implements ayy
{
  bee(bdp parambdp) {}
  
  public final void a(boolean paramBoolean)
  {
    if (paramBoolean == this.a.ac) {}
    boolean bool;
    do
    {
      return;
      this.a.ac = paramBoolean;
      bool = ((jqb)this.a.bo.a(jqb.class)).b();
      if (!paramBoolean) {
        break;
      }
      this.a.a(true);
      mbf localmbf2 = this.a.bn;
      localmbf2.startService(SlideshowService.a(localmbf2, this.a.m, this.a.d));
    } while (bool);
    this.a.N.setKeepScreenOn(true);
    return;
    if (this.a.c.q != 0) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        this.a.a(false);
      }
      mbf localmbf1 = this.a.bn;
      localmbf1.startService(SlideshowService.a(localmbf1));
      this.a.N.setKeepScreenOn(false);
      return;
    }
  }
  
  public final boolean a()
  {
    return this.a.ab;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bee
 * JD-Core Version:    0.7.0.1
 */