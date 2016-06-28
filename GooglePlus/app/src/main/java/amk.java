import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

final class amk
  implements View.OnClickListener
{
  amk(ami paramami) {}
  
  public final void onClick(View paramView)
  {
    ghr localghr = (ghr)this.a.ai;
    if (localghr == null)
    {
      Log.e("StraightenFragment", "Rotate left failed: straighten view is not ready!");
      return;
    }
    ami.a(this.a, (270.0F + localghr.e) % 360.0F);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     amk
 * JD-Core Version:    0.7.0.1
 */