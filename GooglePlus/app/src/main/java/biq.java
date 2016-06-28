import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;

public final class biq
  extends cun<mrx, mry>
{
  private static final String[] A = { "polling_token", "resume_token" };
  private final String a;
  private String b;
  private String c;
  private String d;
  private final String e;
  private final boolean f;
  private final boolean g;
  private boolean z = false;
  
  public biq(Context paramContext, kcg paramkcg, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean)
  {
    super(paramContext, paramkcg, paramInt, "eventread", new mrx(), new mry());
    if (TextUtils.isEmpty(paramString1)) {
      throw new IllegalArgumentException("Event ID must not be empty");
    }
    this.a = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.b = paramString4;
    this.e = paramString5;
    this.f = paramBoolean;
    this.g = false;
  }
  
  public biq(Context paramContext, kcg paramkcg, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    super(paramContext, paramkcg, paramInt, "eventread", new mrx(), new mry());
    if (TextUtils.isEmpty(paramString1)) {
      throw new IllegalArgumentException("Event ID must not be empty");
    }
    this.a = paramString1;
    this.c = null;
    this.d = null;
    this.b = paramString2;
    this.e = null;
    this.f = paramBoolean;
    this.g = true;
  }
  
  public final void a(int paramInt, String paramString, IOException paramIOException)
  {
    if (this.z)
    {
      super.a(403, "INSUFFICIENT_PERMISSION", null);
      return;
    }
    super.a(paramInt, paramString, paramIOException);
  }
  
  public final void a(int paramInt, String paramString, Exception paramException)
  {
    if (paramInt == 404) {
      bqo.e(this.j, this.h, this.a);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     biq
 * JD-Core Version:    0.7.0.1
 */