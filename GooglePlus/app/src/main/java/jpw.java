import android.text.TextUtils;

public final class jpw
  implements aip
{
  private ipf a;
  
  public jpw(ipf paramipf)
  {
    this.a = paramipf;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof jpw))
    {
      ipf localipf = ((jpw)paramObject).a;
      if (this.a.a != null) {
        return TextUtils.equals(this.a.a, localipf.a);
      }
      return this.a.equals(localipf);
    }
    return false;
  }
  
  public final int hashCode()
  {
    if (this.a.a != null) {
      return this.a.a.hashCode();
    }
    return this.a.hashCode();
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jpw
 * JD-Core Version:    0.7.0.1
 */