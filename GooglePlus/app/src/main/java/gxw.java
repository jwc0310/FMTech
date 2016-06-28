import android.content.Context;
import android.os.Bundle;

public final class gxw
{
  public final Context a;
  public int b = -1;
  public gxz c;
  public gya d;
  public gya e;
  public Long f;
  public Long g;
  public Bundle h = new Bundle();
  
  public gxw(Context paramContext)
  {
    this.a = paramContext;
  }
  
  @Deprecated
  public gxw(Context paramContext, int paramInt)
  {
    this(paramContext);
    this.b = paramInt;
  }
  
  public final gxw a(Bundle paramBundle)
  {
    if ((paramBundle != null) && (!paramBundle.isEmpty())) {
      this.h.putBundle("extra_start_view_extras", paramBundle);
    }
    return this;
  }
  
  public final gxw b(Bundle paramBundle)
  {
    if ((paramBundle != null) && (!paramBundle.isEmpty())) {
      this.h.putBundle("extra_end_view_extras", paramBundle);
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gxw
 * JD-Core Version:    0.7.0.1
 */