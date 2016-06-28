import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

final class jef
  implements giv, ica
{
  private Activity a;
  private ibw b;
  private ikt c;
  
  public final void a()
  {
    String str = this.a.getIntent().getStringExtra("notification_tag");
    Object localObject;
    if (str == null) {
      localObject = null;
    }
    while (localObject != null)
    {
      ikt localikt = this.c;
      ilf localilf = new ilf();
      localilf.q = localObject;
      localilf.p = null;
      localikt.a(localilf);
      return;
      String[] arrayOfString = str.split(":");
      if (arrayOfString.length != 4) {
        localObject = null;
      } else if (!TextUtils.equals("notifications", arrayOfString[1])) {
        localObject = null;
      } else if (!TextUtils.equals("gaiaid", arrayOfString[2])) {
        localObject = null;
      } else {
        localObject = arrayOfString[3];
      }
    }
    this.c.a(new ilf().a(ilm.class));
  }
  
  public final void a(Activity paramActivity, mek parammek, ibw paramibw, ikt paramikt)
  {
    this.a = paramActivity;
    this.b = paramibw;
    this.c = ((ikt)paramikt.a(this));
  }
  
  public final void a(boolean paramBoolean, giu paramgiu1, giu paramgiu2, int paramInt1, int paramInt2)
  {
    Intent localIntent1 = this.a.getIntent();
    Intent localIntent2 = new Intent();
    localIntent2.setPackage(this.a.getPackageName());
    localIntent2.setAction("com.google.android.libraries.social.settings.NOTIFICATION_SETTINGS");
    Bundle localBundle = localIntent1.getExtras();
    giz localgiz = (giz)mbb.a(this.a, giz.class);
    if (localBundle != null) {
      localIntent2.putExtras(localBundle);
    }
    String str1 = localIntent1.getStringExtra("notification_tag");
    String str2;
    if (str1 == null)
    {
      str2 = null;
      if (str2 != null) {
        paramInt2 = localgiz.b(str2);
      }
      if (paramInt2 != -1) {
        break label199;
      }
    }
    for (Intent localIntent3 = null;; localIntent3 = localIntent2)
    {
      if (localIntent3 == null) {
        break label216;
      }
      this.b.a(localIntent3);
      return;
      String[] arrayOfString = str1.split(":");
      if (arrayOfString.length != 4)
      {
        str2 = null;
        break;
      }
      if (!TextUtils.equals("notifications", arrayOfString[1]))
      {
        str2 = null;
        break;
      }
      if (!TextUtils.equals("gaiaid", arrayOfString[2]))
      {
        str2 = null;
        break;
      }
      str2 = arrayOfString[3];
      break;
      label199:
      localIntent2.putExtra("account_id", paramInt2);
    }
    label216:
    this.b.a(1);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jef
 * JD-Core Version:    0.7.0.1
 */