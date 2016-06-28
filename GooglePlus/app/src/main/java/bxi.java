import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class bxi
  implements View.OnClickListener
{
  bxi(bxg parambxg) {}
  
  public final void onClick(View paramView)
  {
    bxg localbxg1 = this.a;
    int i = aau.dH;
    lut locallut = lut.a(localbxg1.g().getString(i), this.a.d);
    Bundle localBundle = locallut.m;
    bxg localbxg2 = this.a;
    int j = aau.cM;
    localBundle.putString("negative", localbxg2.g().getString(j));
    locallut.n = this.a;
    locallut.p = 1;
    locallut.a(this.a.x, "velocity");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bxi
 * JD-Core Version:    0.7.0.1
 */