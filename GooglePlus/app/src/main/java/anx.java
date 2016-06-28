import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class anx
  implements anw, mbo, mfd
{
  private final Activity a;
  private String b;
  private final int c;
  private aud d;
  
  public anx(Activity paramActivity, mek parammek, String paramString, int paramInt)
  {
    this.a = paramActivity;
    if (paramString != null) {}
    for (;;)
    {
      this.b = paramString;
      this.c = paramInt;
      parammek.a(this);
      return;
      paramString = "android.intent.action.GET_CONTENT";
    }
  }
  
  public final void a()
  {
    Intent localIntent = dbs.a(this.b, this.c, this.d.b, this.a);
    this.a.setResult(-1, localIntent);
    this.a.finish();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.d = ((aud)parammbb.a(aud.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     anx
 * JD-Core Version:    0.7.0.1
 */