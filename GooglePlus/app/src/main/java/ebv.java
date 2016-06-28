import com.google.android.gms.cast.LaunchOptions;

class ebv
  extends efs
{
  ebv(ebp paramebp, efd paramefd, String paramString, LaunchOptions paramLaunchOptions)
  {
    this(paramefd);
  }
  
  public ebv(efd paramefd)
  {
    super(paramefd);
  }
  
  protected void a(ecx paramecx)
  {
    try
    {
      String str = this.a;
      LaunchOptions localLaunchOptions = this.b;
      paramecx.a(this);
      ((edg)paramecx.l()).a(str, localLaunchOptions);
      return;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      a(2001);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ebv
 * JD-Core Version:    0.7.0.1
 */