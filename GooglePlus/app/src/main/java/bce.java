import android.os.Bundle;
import android.text.TextUtils;

public final class bce
  extends bch
{
  public final boolean v()
  {
    int i = this.m.getInt("account_id", -1);
    String str = this.m.getString("selection_cluster_id");
    boolean bool1 = false;
    if (i != -1)
    {
      boolean bool2 = TextUtils.isEmpty(str);
      bool1 = false;
      if (bool2)
      {
        k().a(0, this.m, new bcg(this));
        bool1 = true;
      }
    }
    k().a(1, this.m, new bcf(this));
    return bool1;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bce
 * JD-Core Version:    0.7.0.1
 */