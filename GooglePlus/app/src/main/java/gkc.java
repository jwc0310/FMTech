import android.content.SharedPreferences.Editor;

public final class gkc
  implements gkd
{
  private boolean a;
  
  public gkc(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public final Object a(Object paramObject)
  {
    return Boolean.valueOf(this.a);
  }
  
  public final void a(SharedPreferences.Editor paramEditor, String paramString)
  {
    paramEditor.putBoolean(paramString, this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gkc
 * JD-Core Version:    0.7.0.1
 */