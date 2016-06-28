import android.text.TextUtils;

final class bqs
{
  public int a;
  public String b;
  public long c;
  
  public final boolean equals(Object paramObject)
  {
    bqs localbqs = (bqs)paramObject;
    return (this.a == localbqs.a) && (TextUtils.equals(this.b, localbqs.b)) && (this.c == localbqs.c);
  }
  
  public final int hashCode()
  {
    int i = this.a;
    if (this.b == null) {}
    for (int j = 0;; j = this.b.hashCode()) {
      return (int)(j + i + this.c);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bqs
 * JD-Core Version:    0.7.0.1
 */