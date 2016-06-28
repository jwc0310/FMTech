import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public final class cvf
  implements jtk
{
  private Context a;
  
  public cvf(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, mlu parammlu)
  {
    if ((parammlu.c == null) || (parammlu.c.a == null) || (TextUtils.isEmpty(parammlu.c.a.a))) {
      return null;
    }
    String str = parammlu.c.a.a;
    return efj.a(this.a, paramInt, str, null, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvf
 * JD-Core Version:    0.7.0.1
 */