import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

public final class gph
  extends ci
{
  final List<Pair<String, bk>> b = new ArrayList();
  List<String> c;
  
  public gph(bw parambw)
  {
    super(parambw);
  }
  
  public final bk a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.b.size()))
    {
      int i = this.b.size();
      throw new IndexOutOfBoundsException(40 + "Requested " + paramInt + " out of " + i);
    }
    return (bk)((Pair)this.b.get(paramInt)).second;
  }
  
  public final int b()
  {
    return this.b.size();
  }
  
  public final CharSequence b(int paramInt)
  {
    return (CharSequence)this.c.get(paramInt);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     gph
 * JD-Core Version:    0.7.0.1
 */