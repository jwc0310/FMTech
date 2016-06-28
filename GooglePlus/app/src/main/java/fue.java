import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

class fue
  implements ftz
{
  private evr a;
  
  protected fue(Context paramContext)
  {
    this.a = evr.a(paramContext);
  }
  
  fue(Context paramContext, byte paramByte)
  {
    this(paramContext);
  }
  
  public final String a(String paramString)
  {
    return this.a.a(new String[] { paramString });
  }
  
  public final void a()
  {
    evr localevr = this.a;
    evr.a = null;
    localevr.b();
  }
  
  public final boolean a(Intent paramIntent)
  {
    return "gcm".equals(evr.a(paramIntent));
  }
  
  public final void b()
  {
    this.a.a();
  }
  
  public final boolean b(Intent paramIntent)
  {
    return "send_error".equals(evr.a(paramIntent));
  }
  
  public final boolean c(Intent paramIntent)
  {
    return "deleted_messages".equals(evr.a(paramIntent));
  }
  
  public final boolean d(Intent paramIntent)
  {
    return TextUtils.isEmpty(evr.a(paramIntent));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fue
 * JD-Core Version:    0.7.0.1
 */