import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class jfb
{
  public final Context a;
  public String b;
  
  public jfb(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public Intent a()
  {
    if (!TextUtils.isEmpty(this.b)) {}
    for (boolean bool = true;; bool = false)
    {
      efj.d(bool, "Missing required field: personId.");
      git localgit = (git)mbb.a(this.a, git.class);
      return efj.b(this.a, localgit.c(), this.b, null, false);
    }
  }
  
  public jfb a(String paramString)
  {
    this.b = paramString;
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jfb
 * JD-Core Version:    0.7.0.1
 */