import android.content.Context;
import android.os.Bundle;

public final class bct
  extends bcw
{
  public long a;
  public int b;
  public int c;
  
  public final bcp a()
  {
    this.y = true;
    this.x = true;
    return new bcq(this);
  }
  
  public final bcw a(Context paramContext, Bundle paramBundle)
  {
    super.a(paramContext, paramBundle);
    this.a = paramBundle.getLong("all_photos_row_id");
    return this;
  }
  
  public final bcw a(bcp parambcp)
  {
    super.a(parambcp);
    if ((parambcp instanceof bcq))
    {
      bcq localbcq = (bcq)parambcp;
      this.a = localbcq.a;
      this.b = localbcq.b;
      this.c = localbcq.c;
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bct
 * JD-Core Version:    0.7.0.1
 */