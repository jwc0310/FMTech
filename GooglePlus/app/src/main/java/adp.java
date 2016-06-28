import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class adp
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  adp(adn paramadn) {}
  
  public final void onGlobalLayout()
  {
    adn localadn = this.a;
    adk localadk = this.a.d;
    if ((nj.a.z(localadk)) && (localadk.getGlobalVisibleRect(localadn.c))) {}
    for (int i = 1; i == 0; i = 0)
    {
      this.a.c();
      return;
    }
    this.a.a();
    adn.a(this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     adp
 * JD-Core Version:    0.7.0.1
 */