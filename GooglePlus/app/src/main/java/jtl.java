import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public final class jtl
  implements jtk
{
  private final Context a;
  
  public jtl(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final Intent a(int paramInt, mlu parammlu)
  {
    if ((parammlu.b == null) || (parammlu.b.a == null) || (TextUtils.isEmpty(parammlu.b.a.a))) {
      return null;
    }
    String str = parammlu.b.a.a;
    return ((kyp)mbb.a(this.a, kyp.class)).a(paramInt, str, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jtl
 * JD-Core Version:    0.7.0.1
 */