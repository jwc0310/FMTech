import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public final class cvd
  implements jtk
{
  private Context a;
  
  public cvd(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, mlu parammlu)
  {
    if ((parammlu.d == null) || (parammlu.d.a == null) || (TextUtils.isEmpty(parammlu.d.a.a))) {
      return null;
    }
    String str = parammlu.d.a.a;
    return efj.a(this.a, paramInt, str, null, 0, null, -2147483648, null, false, 1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cvd
 * JD-Core Version:    0.7.0.1
 */