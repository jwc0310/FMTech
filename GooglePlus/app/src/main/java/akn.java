import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

final class akn
  implements View.OnClickListener
{
  akn(akl paramakl) {}
  
  public final void onClick(View paramView)
  {
    mbf localmbf = this.a.bn;
    gxr localgxr = new gxr();
    gxq localgxq = new gxq(pjw.j);
    localgxr.b.add(localgxq);
    new gwz(4, localgxr.a(this.a.bn)).b(localmbf);
    if (this.a.a != null) {
      this.a.a.h_();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     akn
 * JD-Core Version:    0.7.0.1
 */