import android.view.View;
import android.view.View.OnClickListener;

final class bbm
  implements View.OnClickListener
{
  bbm(bbf parambbf) {}
  
  public final void onClick(View paramView)
  {
    long l = ((Long)paramView.getTag(aaw.lj)).longValue();
    this.a.ah.b(l, true);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bbm
 * JD-Core Version:    0.7.0.1
 */