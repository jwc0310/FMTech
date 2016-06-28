import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.google.android.libraries.social.discovery.views.PeopleListRowView;

final class hvm
  implements ViewTreeObserver.OnPreDrawListener
{
  hvm(hvl paramhvl, ViewTreeObserver paramViewTreeObserver, int paramInt1, int paramInt2, PeopleListRowView[] paramArrayOfPeopleListRowView, View paramView) {}
  
  public final boolean onPreDraw()
  {
    this.a.removeOnPreDrawListener(this);
    for (int i = this.b; i < this.c; i++) {
      this.f.a(this.d[i], 0.0F, 0.0F, this.d[i].getHeight(), 0.0F, null);
    }
    hvp localhvp = (hvp)this.e;
    if (localhvp.c[0] != null) {
      localhvp.c[0].d = null;
    }
    if (localhvp.c[1] != null) {
      localhvp.c[1].d = null;
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hvm
 * JD-Core Version:    0.7.0.1
 */