import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;

public final class knc
  extends bj
{
  long Z;
  private int aa;
  
  public static knc a(int paramInt, long paramLong)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("account_id", paramInt);
    localBundle.putLong("extra_draft_id", paramLong);
    knc localknc = new knc();
    localknc.b(false);
    localknc.f(localBundle);
    return localknc;
  }
  
  public final Dialog c(Bundle paramBundle)
  {
    this.aa = this.m.getInt("account_id");
    this.Z = this.m.getLong("extra_draft_id");
    bp localbp = f();
    return new AlertDialog.Builder(localbp).setTitle(localbp.getString(efj.Vk)).setPositiveButton(localbp.getString(efj.Vl), new kne(this)).setNegativeButton(localbp.getString(efj.Vj), new knd(this)).create();
  }
  
  public final void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    paramBundle.putInt("account_id", this.aa);
    paramBundle.putLong("extra_draft_id", this.Z);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     knc
 * JD-Core Version:    0.7.0.1
 */