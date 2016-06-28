import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class iky
  implements giv, mbo, mfd
{
  public final List<Class<? extends ilh>> a = new ArrayList();
  public Context b;
  private git c;
  private ilb d;
  
  public iky(mek parammek)
  {
    this(parammek, (byte)0);
  }
  
  private iky(mek parammek, byte paramByte)
  {
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = paramContext;
    this.c = ((git)parammbb.a(git.class));
    this.d = ((ilb)parammbb.a(ilb.class));
    this.c.a(this);
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    int i = 0;
    int j = this.c.c();
    ilf localilf = new ilf();
    localilf.c = j;
    for (int k = 0; k < this.a.size(); k++)
    {
      Class localClass = (Class)this.a.get(k);
      localilf.u.add(localClass);
    }
    int m = this.c.c();
    if (!this.d.a(localilf, m))
    {
      StringBuilder localStringBuilder = new StringBuilder(59 + "Login requirements is not satisfied for account " + paramInt2);
      localStringBuilder.append(" Requirements: ");
      while (i < this.a.size())
      {
        localStringBuilder.append(((Class)this.a.get(i)).getSimpleName()).append(' ');
        i++;
      }
      String str = localStringBuilder.toString();
      if (Log.isLoggable("LoginAssert", 6)) {
        Log.e("LoginAssert", str);
      }
      throw new IllegalStateException(str);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iky
 * JD-Core Version:    0.7.0.1
 */