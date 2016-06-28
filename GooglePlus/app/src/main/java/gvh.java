import android.os.Bundle;

public class gvh
  implements mes, mfa, mfd
{
  public int a;
  
  public gvh(mek parammek)
  {
    parammek.a(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      this.a = 16383;
      return;
    }
    this.a = paramBundle.getInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode");
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode", this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gvh
 * JD-Core Version:    0.7.0.1
 */