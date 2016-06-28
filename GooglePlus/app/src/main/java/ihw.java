import android.annotation.TargetApi;
import java.text.DateFormat;
import java.util.Calendar;

@TargetApi(12)
public final class ihw
  implements Comparable<ihw>
{
  static Calendar f = ;
  public int a;
  public int b;
  public int c;
  long d;
  String e;
  
  public final int a(ihw paramihw)
  {
    int i = this.c - paramihw.c;
    if (i != 0) {}
    do
    {
      return i;
      i = this.a - paramihw.a;
    } while (i != 0);
    return this.b - paramihw.b;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    ihw localihw;
    do
    {
      return true;
      if (paramObject == null) {
        return false;
      }
      if (!(paramObject instanceof ihw)) {
        return false;
      }
      localihw = (ihw)paramObject;
      if (this.c != localihw.c) {
        return false;
      }
      if (this.a != localihw.a) {
        return false;
      }
    } while (this.b == localihw.b);
    return false;
  }
  
  public final int hashCode()
  {
    return 31 * (31 * (31 + this.b) + this.a) + this.c;
  }
  
  public final String toString()
  {
    if (this.e == null) {
      this.e = DateFormat.getDateInstance(3).format(Long.valueOf(this.d));
    }
    return this.e;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     ihw
 * JD-Core Version:    0.7.0.1
 */