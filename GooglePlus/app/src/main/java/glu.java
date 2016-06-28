import com.google.android.libraries.social.accountswitcher.AccountSwitcherView;

public final class glu
  implements Runnable
{
  public glu(AccountSwitcherView paramAccountSwitcherView, int paramInt, Runnable paramRunnable) {}
  
  public final void run()
  {
    if (this.a == this.c.g)
    {
      AccountSwitcherView localAccountSwitcherView = this.c;
      localAccountSwitcherView.g = (1 + localAccountSwitcherView.g);
      this.c.a(true);
      this.b.run();
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     glu
 * JD-Core Version:    0.7.0.1
 */