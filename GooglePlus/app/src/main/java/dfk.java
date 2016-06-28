import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.google.android.apps.plus.phone.AddProfilePhotoSpringboardActivity;

public final class dfk
  implements giv, mbo, mes, mew, mez, mfa, mfd
{
  public int a = 0;
  public String b;
  public long c;
  private final Activity d;
  private git e;
  private boolean f;
  
  public dfk(Activity paramActivity, mek parammek)
  {
    this.d = paramActivity;
    parammek.a(this);
  }
  
  private final void a()
  {
    int i = this.e.c();
    Activity localActivity1;
    int j;
    if ((this.f) && (this.e.d()) && ((this.b == null) || (this.d.getIntent().getBooleanExtra(this.b, false))))
    {
      localActivity1 = this.d;
      if (this.c != 0L) {
        break label236;
      }
      j = 1;
      if (j != 0)
      {
        Activity localActivity2 = this.d;
        giz localgiz = (giz)mbb.a(localActivity2, giz.class);
        if (!localgiz.c(i)) {
          break label391;
        }
        gjb localgjb = localgiz.a(i);
        if ((!localgjb.a()) || (!localgjb.c("is_google_plus")) || (localgjb.b("profile_photo_url") != null) || (!AddProfilePhotoSpringboardActivity.a(localActivity2, i))) {
          break label391;
        }
      }
    }
    label391:
    for (int k = 1;; k = 0)
    {
      if (k != 0)
      {
        Activity localActivity3 = this.d;
        Activity localActivity4 = this.d;
        int m = this.e.c();
        int n = this.a;
        Intent localIntent = new Intent(localActivity4, AddProfilePhotoSpringboardActivity.class);
        localIntent.putExtra("account_id", m);
        localIntent.putExtra("springboard_launcher", n);
        localActivity3.startActivity(localIntent);
      }
      return;
      label236:
      SharedPreferences localSharedPreferences = localActivity1.getSharedPreferences("com.google.android.plus.NOTIFICATIONS", 0);
      long l1 = System.currentTimeMillis();
      String str1 = String.valueOf("add_profile_photo_prompt_launcher_timestamp");
      long l2 = localSharedPreferences.getLong(11 + String.valueOf(str1).length() + i + str1, l1);
      if (l2 == l1)
      {
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        String str2 = String.valueOf("add_profile_photo_prompt_launcher_timestamp");
        localEditor.putLong(11 + String.valueOf(str2).length() + i + str2, l1);
        localEditor.apply();
      }
      if (l1 - l2 > this.c)
      {
        j = 1;
        break;
      }
      j = 0;
      break;
    }
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.e = ((git)parammbb.a(git.class));
    this.e.a(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      this.a = paramBundle.getInt("springboard_type");
      this.b = paramBundle.getString("intent_trigger");
      this.c = paramBundle.getLong("launch_delay");
    }
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    a();
  }
  
  public final void b()
  {
    this.f = true;
    a();
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putInt("springboard_type", this.a);
    paramBundle.putString("intent_trigger", this.b);
    paramBundle.putLong("launch_delay", this.c);
  }
  
  public final void c()
  {
    this.f = false;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     dfk
 * JD-Core Version:    0.7.0.1
 */