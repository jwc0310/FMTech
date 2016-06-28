import android.content.Context;
import android.os.Bundle;

public final class bdd
  extends bcw
{
  public String a;
  
  public final bcp a()
  {
    this.y = true;
    this.x = true;
    return new bdb(this);
  }
  
  public final bcw a(Context paramContext, Bundle paramBundle)
  {
    super.a(paramContext, paramBundle);
    if (this.a == null) {
      this.a = paramBundle.getString("selection_cluster_id");
    }
    return this;
  }
  
  public final bcw a(bcp parambcp)
  {
    super.a(parambcp);
    if ((parambcp instanceof bdb)) {
      this.a = ((bdb)parambcp).a;
    }
    return this;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bdd
 * JD-Core Version:    0.7.0.1
 */