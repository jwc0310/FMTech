import android.net.Uri;

final class auv
{
  final Uri a;
  final int b;
  
  public auv(Uri paramUri, int paramInt)
  {
    this.a = paramUri;
    this.b = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    auv localauv;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      localauv = (auv)paramObject;
      if (this.b != localauv.b) {
        return false;
      }
    } while (this.a.equals(localauv.a));
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * this.a.hashCode() + this.b;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     auv
 * JD-Core Version:    0.7.0.1
 */