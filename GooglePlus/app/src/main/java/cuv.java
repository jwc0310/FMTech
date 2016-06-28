import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class cuv
  implements mbo, mes, mez, mfa, mfd
{
  private final Activity a;
  private git b;
  private String c;
  
  cuv(Activity paramActivity, mek parammek)
  {
    this.a = paramActivity;
    parammek.a(this);
  }
  
  public final void a(Context paramContext, mbb parammbb, Bundle paramBundle)
  {
    this.b = ((git)parammbb.b(git.class));
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      this.c = this.a.getIntent().getStringExtra("com.google.android.libraries.social.notifications.notif_id");
      return;
    }
    this.c = paramBundle.getString("notification_id");
  }
  
  public final void b()
  {
    Intent localIntent;
    String str1;
    String str3;
    Object localObject;
    if ((this.c != null) && (this.b != null) && (this.b.e()))
    {
      localIntent = this.a.getIntent();
      jaq localjaq = (jaq)mbb.a(this.a, jaq.class);
      this.b.c();
      if (!localjaq.d()) {
        break label171;
      }
      if (!localIntent.getBooleanExtra("com.google.android.libraries.social.notification_mark_as_read", false)) {
        break label226;
      }
      str1 = String.valueOf("mark_as_read_");
      String str2 = String.valueOf(this.c);
      if (str2.length() == 0) {
        break label157;
      }
      str3 = str1.concat(str2);
      localObject = new jed(this.a, str3, this.b.c(), this.c);
    }
    for (;;)
    {
      if (localObject != null)
      {
        gzj.a(this.a, (gzf)localObject);
        this.c = null;
      }
      return;
      label157:
      str3 = new String(str1);
      break;
      label171:
      long l = localIntent.getLongExtra("com.google.android.libraries.social.notifications.updated_version", 0L);
      boolean bool = localIntent.getBooleanExtra("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION", false);
      localObject = new bnn(this.a, this.b.c(), this.c, l, false, true, bool, "GPLUS_APP_V3");
      continue;
      label226:
      localObject = null;
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putString("notification_id", this.c);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cuv
 * JD-Core Version:    0.7.0.1
 */