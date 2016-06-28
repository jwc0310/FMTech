import android.content.Context;

public final class kpw
  implements gwv
{
  public final byte[] a;
  private final String b;
  
  public kpw(String paramString, byte[] paramArrayOfByte)
  {
    this.b = paramString;
    this.a = ((byte[])efj.e(paramArrayOfByte, "delta must not be null."));
  }
  
  public final String a(Context paramContext, gwx paramgwx)
  {
    if (this.b != null) {
      return this.b;
    }
    return paramgwx.a(paramContext);
  }
  
  public final void a(Context paramContext) {}
  
  public final String toString()
  {
    return "CronetHistogramEvent";
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpw
 * JD-Core Version:    0.7.0.1
 */