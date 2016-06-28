import android.graphics.Bitmap.Config;

final class ibi
  implements Cloneable
{
  public boolean a;
  public Bitmap.Config b;
  public int c;
  
  public final ibi a()
  {
    try
    {
      ibi localibi = (ibi)super.clone();
      return localibi;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ibi)) {}
    ibi localibi;
    do
    {
      return false;
      localibi = (ibi)paramObject;
    } while ((this.a != localibi.a) || (this.b != localibi.b) || (this.c != localibi.c));
    return true;
  }
  
  public final int hashCode()
  {
    int i = this.b.hashCode() ^ this.c;
    if (this.a) {
      return i;
    }
    return -i;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ibi
 * JD-Core Version:    0.7.0.1
 */