import android.text.TextUtils;

public final class ear
{
  public final int a;
  public final String b;
  public final String c;
  
  public ear(int paramInt, String paramString1, String paramString2)
  {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    ear localear = (ear)paramObject;
    return (this.a == localear.a) && (TextUtils.equals(this.b, localear.b));
  }
  
  public final int hashCode()
  {
    int i = this.a;
    if (this.b != null) {
      i += this.b.hashCode();
    }
    return i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ear
 * JD-Core Version:    0.7.0.1
 */