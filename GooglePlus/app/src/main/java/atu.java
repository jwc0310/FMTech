import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Set;

public class atu
  implements jen<atu>, jer<aud>, mbo, mes, meu, mfa, mfd
{
  private static final Set<String> d = new atv();
  public final jem<atu> a = new jem(this);
  public int b;
  public boolean c;
  private aud e;
  private final Bundle f;
  private Activity g;
  
  public atu(Activity paramActivity, mek parammek)
  {
    this.g = paramActivity;
    Bundle localBundle1 = paramActivity.getIntent().getExtras();
    int j;
    Bundle localBundle2;
    if (d.contains(paramActivity.getIntent().getAction()))
    {
      Intent localIntent = paramActivity.getIntent();
      int i;
      if (!localIntent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false))
      {
        boolean bool = "android.intent.action.SEND_MULTIPLE".equalsIgnoreCase(localIntent.getAction());
        i = 0;
        if (!bool) {}
      }
      else
      {
        i = 1;
      }
      if (i != 0)
      {
        j = 2;
        if (localBundle1 == null) {
          break label137;
        }
        localBundle2 = new Bundle(localBundle1);
        label109:
        localBundle2.putInt("photo_picker_mode", j);
      }
    }
    for (;;)
    {
      this.f = localBundle2;
      parammek.a(this);
      return;
      j = 1;
      break;
      label137:
      localBundle2 = new Bundle();
      break label109;
      localBundle2 = localBundle1;
    }
  }
  
  public final void a(int paramInt)
  {
    this.b = paramInt;
    if (!c()) {
      this.c = false;
    }
    this.g.invalidateOptionsMenu();
    jem localjem = this.a;
    localjem.a.a(localjem.b);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = ((aud)parammbb.a(aud.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.b = paramBundle.getInt("com.google.android.apps.photos.selection.PickerModeModel.PickerMode", 0);
      this.c = paramBundle.getBoolean("com.google.android.apps.photos.selection.PickerModeModel.StartedInMultiSelect", false);
    }
    for (;;)
    {
      this.e.a.a(this, false);
      return;
      if (this.f != null)
      {
        this.b = this.f.getInt("photo_picker_mode");
        if ((this.b == 4) || (this.b == 2) || (this.b == 3)) {}
        for (boolean bool = true;; bool = false)
        {
          this.c = bool;
          break;
        }
      }
      this.b = 0;
    }
  }
  
  public final jeo<atu> b()
  {
    return this.a;
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putInt("com.google.android.apps.photos.selection.PickerModeModel.PickerMode", this.b);
    paramBundle.putBoolean("com.google.android.apps.photos.selection.PickerModeModel.StartedInMultiSelect", this.c);
  }
  
  public final boolean c()
  {
    return (this.b != 5) && (this.b != 0);
  }
  
  public final boolean d()
  {
    return (this.b == 4) || (this.b == 2);
  }
  
  public final void m_()
  {
    this.e.a.a(this);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     atu
 * JD-Core Version:    0.7.0.1
 */