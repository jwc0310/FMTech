import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.social.spaces.SpaceListItemView;
import java.util.ArrayList;

final class hni
  implements View.OnClickListener
{
  hni(hng paramhng, int paramInt, qpk paramqpk, hnp paramhnp, SpaceListItemView paramSpaceListItemView) {}
  
  public final void onClick(View paramView)
  {
    if (this.e.i.b()) {
      return;
    }
    this.e.j.a(this.a);
    this.e.h.add(this.b.a);
    if (this.c != null) {
      this.c.a(this.d);
    }
    gzj localgzj = this.e.c;
    int i = this.e.b.c();
    String[] arrayOfString = new String[1];
    arrayOfString[0] = this.b.a;
    localgzj.b(new hlo(i, arrayOfString));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hni
 * JD-Core Version:    0.7.0.1
 */