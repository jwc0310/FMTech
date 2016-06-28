import com.google.android.libraries.social.login.ui.CurrentAccountBannerView;

public final class iow
  implements Runnable
{
  public iow(CurrentAccountBannerView paramCurrentAccountBannerView) {}
  
  public final void run()
  {
    if (this.a.c != null)
    {
      this.a.announceForAccessibility(this.a.c);
      this.a.c = null;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iow
 * JD-Core Version:    0.7.0.1
 */