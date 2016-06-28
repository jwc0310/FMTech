import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class anz
  implements mes, mfd
{
  public Activity a;
  public String b = "Photos";
  public int c = 1;
  String d;
  public int e;
  
  public anz(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final Intent a(String paramString, boolean paramBoolean)
  {
    String str = ((giz)mbb.a(this.a, giz.class)).a(this.e).b("gaia_id");
    return efj.a(this.a, new ivg(str, paramString), this.c, this.b, this.e, paramBoolean);
  }
  
  public final void a(Bundle paramBundle)
  {
    Intent localIntent = this.a.getIntent();
    if (localIntent != null)
    {
      this.d = localIntent.getStringExtra("movie_maker_session_id");
      this.e = localIntent.getIntExtra("account_id", -1);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     anz
 * JD-Core Version:    0.7.0.1
 */