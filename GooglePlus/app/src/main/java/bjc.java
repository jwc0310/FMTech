import android.content.Context;
import android.text.TextUtils;

public final class bjc
  extends cun<mrx, mry>
{
  private final String a;
  private final String b;
  
  public bjc(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, paramInt, "eventread", new mrx(), new mry());
    if (TextUtils.isEmpty(paramString1)) {
      throw new IllegalArgumentException("Event ID must not be empty");
    }
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public final void a(int paramInt, String paramString, Exception paramException)
  {
    if (paramInt == 404) {
      bqo.e(this.j, this.h, this.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bjc
 * JD-Core Version:    0.7.0.1
 */