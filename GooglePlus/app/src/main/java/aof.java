import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class aof
  implements anw, mbo, mfd
{
  private final Activity a;
  private aud b;
  
  public aof(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final void a()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("shareables", this.b.b.a(jpx.class));
    this.a.setResult(-1, localIntent);
    this.a.finish();
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((aud)parammbb.a(aud.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aof
 * JD-Core Version:    0.7.0.1
 */