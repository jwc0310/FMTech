import android.os.Bundle;

final class bcm
  implements cw<String>
{
  bcm(bcj parambcj) {}
  
  public final fu<String> a(int paramInt, Bundle paramBundle)
  {
    String str1 = Long.toString(paramBundle.getLong("photo_id"));
    String str2 = paramBundle.getString("view_id");
    String str3 = paramBundle.getString("tile_id");
    int i = paramBundle.getInt("account_id", -1);
    return new buo(this.a.f(), str1, str2, str3, i);
  }
  
  public final void a(fu<String> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bcm
 * JD-Core Version:    0.7.0.1
 */