import android.content.Context;
import java.util.List;

public final class bih
  extends cun<mqz, mra>
{
  public final int a;
  private final List<String> b;
  private final boolean c;
  private final Long[] d;
  private final hyi e;
  
  public bih(Context paramContext, int paramInt1, List<String> paramList, boolean paramBoolean, int paramInt2)
  {
    super(paramContext, paramInt1, "deletephotos", new mqz(), new mra());
    this.b = paramList;
    this.a = paramInt2;
    this.c = paramBoolean;
    this.d = null;
    this.e = ((hyi)mbb.a(paramContext, hyi.class));
  }
  
  public bih(Context paramContext, int paramInt1, Long[] paramArrayOfLong, boolean paramBoolean, int paramInt2)
  {
    super(paramContext, paramInt1, "deletephotos", new mqz(), new mra());
    this.d = paramArrayOfLong;
    this.a = paramInt2;
    this.c = false;
    this.b = null;
    this.e = ((hyi)mbb.a(paramContext, hyi.class));
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bih
 * JD-Core Version:    0.7.0.1
 */