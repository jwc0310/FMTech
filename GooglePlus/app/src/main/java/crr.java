import android.text.style.ClickableSpan;
import android.view.View;

final class crr
  extends ClickableSpan
{
  private crs a;
  
  public crr(crs paramcrs)
  {
    this.a = paramcrs;
  }
  
  public final void onClick(View paramView)
  {
    if (this.a != null) {
      this.a.a();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     crr
 * JD-Core Version:    0.7.0.1
 */