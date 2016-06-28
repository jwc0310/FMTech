import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;

public class dgd
  implements hdf
{
  private Context a;
  
  public dgd(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public void a(String paramString)
  {
    int i = ((git)mbb.a(this.a, git.class)).c();
    if (Build.VERSION.SDK_INT < 16)
    {
      this.a.startActivity(efj.a(this.a, i, paramString, null, false));
      return;
    }
    Bundle localBundle = ((gvj)mbb.a(this.a, gvj.class)).a();
    this.a.startActivity(efj.a(this.a, i, paramString, null, false), localBundle);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dgd
 * JD-Core Version:    0.7.0.1
 */