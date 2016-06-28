import android.content.Context;
import java.nio.ByteBuffer;
import java.util.List;

final class hzo
  extends kde<mtr, mts>
{
  private final List<String> a;
  private final hzn b;
  
  public hzo(Context paramContext, kcg paramkcg, List<String> paramList, hzn paramhzn)
  {
    super(paramContext, paramkcg, "getmobileexperiments", new mtr(), new mts());
    this.a = paramList;
    this.b = paramhzn;
  }
  
  public final void a(int paramInt, String paramString, Exception paramException)
  {
    if (!n()) {
      efj.a(this.j, this.k.a, ((mts)this.w).a);
    }
    this.b.b(this.k.a);
  }
  
  public final void b(ByteBuffer paramByteBuffer, String paramString)
  {
    this.b.c(this.k.a);
    super.b(paramByteBuffer, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hzo
 * JD-Core Version:    0.7.0.1
 */