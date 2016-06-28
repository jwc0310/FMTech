import android.text.TextUtils;

public final class eba
{
  public final int a;
  public final String b;
  public final String c;
  public final boolean d;
  
  public eba(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    eba localeba = (eba)paramObject;
    return (this.a == localeba.a) && (TextUtils.equals(this.b, localeba.b)) && (TextUtils.equals(this.c, localeba.c));
  }
  
  public final int hashCode()
  {
    int i = this.a;
    if (this.b != null) {
      i += this.b.hashCode();
    }
    if (this.c != null) {
      i += this.c.hashCode();
    }
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eba
 * JD-Core Version:    0.7.0.1
 */