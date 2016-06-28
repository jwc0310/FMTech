import android.content.SharedPreferences.Editor;

public final class gkf
  implements gkd
{
  private long a;
  
  public gkf(long paramLong)
  {
    this.a = paramLong;
  }
  
  public final Object a(Object paramObject)
  {
    return Long.valueOf(this.a);
  }
  
  public final void a(SharedPreferences.Editor paramEditor, String paramString)
  {
    paramEditor.putLong(paramString, this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkf
 * JD-Core Version:    0.7.0.1
 */