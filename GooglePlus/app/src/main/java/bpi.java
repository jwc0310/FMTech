import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;

public final class bpi
  implements lpo
{
  private final Context a;
  
  public bpi(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public final ArrayList<Integer> a()
  {
    return new ArrayList(Collections.singletonList(Integer.valueOf(413)));
  }
  
  public final kx<byte[], Long> a(qbe paramqbe)
  {
    qda localqda = (qda)paramqbe.b(qda.a);
    if (localqda != null) {
      return new kx(hmw.a(new hmw(localqda, this.a)), Long.valueOf(4194304L));
    }
    return null;
  }
  
  public final lpi a(Context paramContext)
  {
    return new bov(paramContext);
  }
  
  public final boolean a(long paramLong)
  {
    return (0x400000 & paramLong) != 0L;
  }
  
  public final ArrayList<Integer> b(int paramInt)
  {
    return new ArrayList(Collections.singletonList(Integer.valueOf(2)));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bpi
 * JD-Core Version:    0.7.0.1
 */