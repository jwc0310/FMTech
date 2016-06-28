import android.content.Intent;
import android.net.Uri;
import java.util.Map;

public final class jro
  implements fye
{
  public jro(jrn paramjrn, Uri paramUri, String paramString, jrt paramjrt) {}
  
  public final void a(int paramInt, Intent paramIntent)
  {
    Map localMap = this.d.b;
    String str1 = String.valueOf(this.a);
    String str2 = this.b;
    localMap.put(0 + String.valueOf(str1).length() + String.valueOf(str2).length() + str1 + str2, Integer.valueOf(paramInt));
    if (paramInt == 2) {
      jrp.a(this.d.a, jrr.b).a(this.a.toString());
    }
    for (;;)
    {
      this.c.b(paramInt);
      return;
      if (paramInt != 0) {
        jrp.a(this.d.a, jrr.a).a(this.a.toString());
      }
    }
  }
  
  public final void g()
  {
    this.c.n();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jro
 * JD-Core Version:    0.7.0.1
 */