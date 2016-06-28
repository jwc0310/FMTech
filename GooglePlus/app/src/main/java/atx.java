import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class atx
  implements jer<aud>, mbo, mfb, mfd
{
  private final Activity a;
  private ani b;
  private atu c;
  private Bundle d;
  private boolean e;
  
  public atx(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  private final void a(aud paramaud)
  {
    int i = 2147483647;
    int j = 1;
    int k;
    if (paramaud.b.b > 0)
    {
      k = j;
      if (k == 0) {
        break label239;
      }
      if (this.b.b == null) {
        break label66;
      }
      label33:
      if (j == 0) {
        break label71;
      }
      ani localani2 = this.b;
      if (localani2.d != null) {
        localani2.d.d();
      }
    }
    label66:
    label71:
    label239:
    int m;
    do
    {
      return;
      k = 0;
      break;
      j = 0;
      break label33;
      if (this.c.b == 2)
      {
        Bundle localBundle1 = this.d;
        String str2 = null;
        if (localBundle1 != null) {
          str2 = this.d.getString("button_title_res_id");
        }
        Bundle localBundle2 = this.d;
        int n = 0;
        if (localBundle2 != null) {
          n = this.d.getInt("min_selection_count", 0);
        }
        if (this.d != null) {
          i = this.d.getInt("max_selection_count", i);
        }
        Bundle localBundle3 = new Bundle();
        localBundle3.putString("custom_title", str2);
        localBundle3.putInt("min_selection", n);
        localBundle3.putInt("max_selection", i);
        this.b.a("com.google.android.apps.photos.actionbar.modes.multi_select_mode", localBundle3);
        return;
      }
      if (this.e)
      {
        this.b.a("com.google.android.apps.photos.actionbar.modes.multi_select_share_only", new Bundle());
        return;
      }
      this.b.a("com.google.android.apps.photos.actionbar.modes.contextual_multi_select_mode", new Bundle());
      return;
      String str1 = this.b.b;
      m = 0;
      if (str1 != null) {
        m = j;
      }
    } while (m == 0);
    ani localani1 = this.b;
    localani1.c();
    localani1.b = null;
    localani1.a = null;
  }
  
  public final void a()
  {
    this.d = this.a.getIntent().getExtras();
    if (this.d != null) {
      this.e = this.d.getBoolean("share_only");
    }
    a((aud)mbb.a(this.a, aud.class));
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((ani)parammbb.a(ani.class));
    this.c = ((atu)parammbb.a(atu.class));
    ((aud)parammbb.a(aud.class)).a.a(this, false);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     atx
 * JD-Core Version:    0.7.0.1
 */