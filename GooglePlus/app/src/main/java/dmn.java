import android.net.Uri;
import java.util.Iterator;
import java.util.List;

public final class dmn
{
  public final int a;
  public final List<Uri> b;
  
  public dmn(int paramInt, List<Uri> paramList)
  {
    this.a = paramInt;
    this.b = paramList;
  }
  
  public final String toString()
  {
    mfz localmfz = (mfz)mfx.a.get();
    localmfz.b = (1 + localmfz.b);
    if (localmfz.b == 1) {}
    for (StringBuilder localStringBuilder = localmfz.a;; localStringBuilder = new StringBuilder(256))
    {
      localStringBuilder.append('[').append(this.a).append(']').append(": {");
      if (this.b.isEmpty()) {
        break label146;
      }
      Iterator localIterator = this.b.iterator();
      while (localIterator.hasNext()) {
        localStringBuilder.append(((Uri)localIterator.next()).toString()).append(", ");
      }
    }
    localStringBuilder.delete(-2 + localStringBuilder.length(), localStringBuilder.length());
    label146:
    localStringBuilder.append('}');
    return mfx.b(localStringBuilder);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dmn
 * JD-Core Version:    0.7.0.1
 */