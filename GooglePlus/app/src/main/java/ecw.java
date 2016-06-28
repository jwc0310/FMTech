import android.text.TextUtils;

public class ecw
{
  public final edm b;
  public final String c;
  public edo d;
  
  protected ecw(String paramString1, String paramString2, String paramString3)
  {
    edd.a(paramString1);
    this.c = paramString1;
    this.b = new edm(paramString2);
    edm localedm;
    if (!TextUtils.isEmpty(paramString3))
    {
      localedm = this.b;
      if (!TextUtils.isEmpty(paramString3)) {
        break label56;
      }
    }
    label56:
    for (String str = null;; str = String.format("[%s] ", new Object[] { paramString3 }))
    {
      localedm.a = str;
      return;
    }
  }
  
  protected final void a(String paramString1, long paramLong, String paramString2)
  {
    new Object[] { paramString1, null };
    this.d.a(this.c, paramString1, paramLong);
  }
  
  public void b() {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ecw
 * JD-Core Version:    0.7.0.1
 */