import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class bxh
  implements View.OnClickListener
{
  bxh(bxg parambxg) {}
  
  public final void onClick(View paramView)
  {
    this.a.f();
    String str1 = this.a.c.a;
    String str2 = this.a.c.b;
    hgm localhgm = new hgm();
    Bundle localBundle = new Bundle();
    localBundle.putString("circle_id", str1);
    localBundle.putString("name", str2);
    localhgm.f(localBundle);
    localhgm.n = this.a;
    localhgm.p = 0;
    localhgm.a(this.a.x, "name");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxh
 * JD-Core Version:    0.7.0.1
 */