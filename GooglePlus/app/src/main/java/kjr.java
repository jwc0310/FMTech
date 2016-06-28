import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;

public final class kjr
  implements mes, mfa, mfd
{
  kbo a;
  knw b;
  public String c;
  Bundle d;
  private final Activity e;
  
  public kjr(Activity paramActivity, mek parammek)
  {
    this.e = paramActivity;
    parammek.a(this);
  }
  
  public final void a(Bundle paramBundle)
  {
    if (paramBundle == null)
    {
      Intent localIntent = this.e.getIntent();
      String str1 = localIntent.getAction();
      String str3;
      String str4;
      kbo localkbo1;
      if (str1 != null)
      {
        if (!"com.google.android.apps.plus.SHARE_GOOGLE".equals(str1)) {
          break label271;
        }
        Activity localActivity2 = this.e;
        str3 = localIntent.getStringExtra("com.google.android.apps.plus.API_KEY");
        str4 = localIntent.getStringExtra("com.google.android.apps.plus.CLIENT_ID");
        String str5 = localIntent.getStringExtra("com.google.android.apps.plus.VERSION");
        String str6 = mbb.a(localActivity2, "rpc.client_id", null);
        PackageManager localPackageManager = localActivity2.getPackageManager();
        String str7 = localIntent.getStringExtra("calling_package");
        if (localPackageManager.checkSignatures(localActivity2.getPackageName(), str7) != 0) {
          break label242;
        }
        if ((!"com.android.vending".equals(str7)) && (!"com.google.android.music".equals(str7))) {
          break label213;
        }
        str6 = "659910861946.apps.googleusercontent.com";
        kbo localkbo2 = new kbo(str3, str4, str7, kia.a(str7, localPackageManager), str5);
        localkbo1 = new kbo(null, str6, str7, kia.a(str7, localPackageManager), str5, localkbo2);
      }
      for (;;)
      {
        this.a = localkbo1;
        this.b = knw.a(localIntent.getBundleExtra("com.google.android.apps.plus.CALL_TO_ACTION"));
        this.c = kia.a(localIntent, "com.google.android.apps.plus.CONTENT_DEEP_LINK_ID");
        this.d = localIntent.getBundleExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA");
        return;
        label213:
        boolean bool2 = TextUtils.isEmpty(str3);
        localkbo1 = null;
        if (!bool2)
        {
          if (!TextUtils.isEmpty(str4)) {
            break;
          }
          localkbo1 = null;
          continue;
          label242:
          boolean bool1 = TextUtils.isEmpty(str3);
          localkbo1 = null;
          if (!bool1)
          {
            if (!TextUtils.isEmpty(str4)) {
              break;
            }
            localkbo1 = null;
            continue;
            label271:
            Activity localActivity1 = this.e;
            String str2 = localIntent.getStringExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE");
            if (TextUtils.isEmpty(str2)) {
              str2 = localIntent.getStringExtra("calling_package");
            }
            if (TextUtils.isEmpty(str2))
            {
              ComponentName localComponentName = localActivity1.getCallingActivity();
              if (localComponentName != null) {
                str2 = localComponentName.getPackageName();
              }
            }
            if (TextUtils.isEmpty(str2)) {
              str2 = "com.google.android.apps.social";
            }
            localkbo1 = kia.a(localActivity1, str2, localIntent.getStringExtra("com.google.android.apps.plus.VERSION"));
          }
        }
      }
    }
    this.a = ((kbo)paramBundle.getSerializable("apiary_api_info"));
    this.b = ((knw)paramBundle.getParcelable("call_to_action"));
    this.c = paramBundle.getString("content_deep_link_id");
    this.d = paramBundle.getBundle("content_deep_link_metadata");
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle.putSerializable("apiary_api_info", this.a);
    paramBundle.putParcelable("call_to_action", this.b);
    paramBundle.putString("content_deep_link_id", this.c);
    paramBundle.putBundle("content_deep_link_metadata", this.d);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kjr
 * JD-Core Version:    0.7.0.1
 */