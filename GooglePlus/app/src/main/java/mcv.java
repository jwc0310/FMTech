import android.app.Activity;

final class mcv
  implements mdm, mdn, mfd
{
  private final Activity a;
  
  public mcv(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final boolean a(int paramInt)
  {
    return paramInt == 82;
  }
  
  public final boolean b(int paramInt)
  {
    if (paramInt == 82)
    {
      this.a.openOptionsMenu();
      return true;
    }
    return false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mcv
 * JD-Core Version:    0.7.0.1
 */