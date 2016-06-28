import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

public final class hak
  extends hai
{
  public hak(Context paramContext, bw parambw)
  {
    super(paramContext, parambw);
  }
  
  public final boolean a(Context paramContext, hae paramhae, int paramInt)
  {
    boolean bool1 = false;
    if (paramhae != null)
    {
      boolean bool2 = TextUtils.isEmpty(paramhae.d);
      bool1 = false;
      if (!bool2)
      {
        this.c = false;
        efj.a(paramContext, paramhae.d, 0).show();
        bool1 = true;
      }
    }
    return bool1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hak
 * JD-Core Version:    0.7.0.1
 */