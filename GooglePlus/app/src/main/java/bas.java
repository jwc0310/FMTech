import android.os.Bundle;
import android.os.Handler;

public class bas
  implements lot
{
  bas(baa parambaa) {}
  
  public void G_()
  {
    if (!this.a.v()) {
      return;
    }
    bdk localbdk = this.a.ab;
    localbdk.e = false;
    localbdk.a.a();
    efj.m().postDelayed(new bak(this), 150L);
  }
  
  public void a()
  {
    this.a.d.a(bfi.b);
  }
  
  public void a(Bundle paramBundle)
  {
    this.a.d.a(bfi.a);
  }
  
  public void a(String paramString, int paramInt)
  {
    cly localcly = new cly();
    Bundle localBundle = new Bundle();
    localBundle.putInt("account_id", this.a.b.c());
    localBundle.putString("plus_one_id", paramString);
    localBundle.putInt("total_plus_ones", paramInt);
    localcly.f(localBundle);
    localcly.a(this.a.x, "comments_dialog_plus_ones");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bas
 * JD-Core Version:    0.7.0.1
 */