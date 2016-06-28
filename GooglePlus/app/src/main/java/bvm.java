import android.text.TextUtils;

public final class bvm
  implements aip
{
  private final String a;
  
  public bvm(bvj parambvj, String paramString)
  {
    this.a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof bvm)) && (TextUtils.equals(((bvm)paramObject).a, this.a));
  }
  
  public final int hashCode()
  {
    if (this.a == null) {}
    for (int i = 0;; i = this.a.hashCode()) {
      return i + 527;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bvm
 * JD-Core Version:    0.7.0.1
 */