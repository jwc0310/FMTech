import android.content.SharedPreferences.Editor;

public final class gke
  implements gkd
{
  private int a;
  
  public gke(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final Object a(Object paramObject)
  {
    return Integer.valueOf(this.a);
  }
  
  public final void a(SharedPreferences.Editor paramEditor, String paramString)
  {
    paramEditor.putInt(paramString, this.a);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gke
 * JD-Core Version:    0.7.0.1
 */