import android.os.Bundle;

final class meo
  implements mep
{
  meo(mek parammek, Bundle paramBundle) {}
  
  public final void a(mfd parammfd)
  {
    if ((parammfd instanceof mfa))
    {
      Bundle localBundle = new Bundle();
      ((mfa)parammfd).b(localBundle);
      String str1 = mek.b(parammfd);
      if (str1 == null) {
        throw new NullPointerException();
      }
      String str2 = (String)str1;
      this.a.putBundle(str2, localBundle);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     meo
 * JD-Core Version:    0.7.0.1
 */