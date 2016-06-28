import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.libraries.social.autobackup.AutoBackupProvider;

@Deprecated
public class hbl
{
  private static hbl c;
  boolean a;
  String b;
  private final Context d;
  private final giz e;
  
  private hbl(Context paramContext)
  {
    this.d = paramContext;
    this.e = ((giz)mbb.a(paramContext, giz.class));
  }
  
  public static hbl a(Context paramContext)
  {
    try
    {
      if (c == null)
      {
        hbl localhbl1 = new hbl(paramContext);
        c = localhbl1;
        localhbl1.a();
      }
      hbl localhbl2 = c;
      return localhbl2;
    }
    finally {}
  }
  
  public final void a()
  {
    boolean bool1 = false;
    boolean bool2;
    int i;
    Object localObject;
    label50:
    StringBuilder localStringBuilder;
    if (Integer.parseInt(AutoBackupProvider.a(this.d, null, "auto_upload_enabled")) != 0)
    {
      bool2 = true;
      i = Integer.parseInt(AutoBackupProvider.a(this.d, null, "auto_upload_account_id"));
      if (this.e.c(i)) {
        break label165;
      }
      localObject = null;
      if (Log.isLoggable("iu.LegacyUploadSettings", 4))
      {
        localStringBuilder = new StringBuilder().append("#reloadSettings(); account: ").append(iaw.b(localObject)).append("; IU: ");
        if (!bool1) {
          break label193;
        }
      }
    }
    label165:
    label193:
    for (String str2 = "enabled";; str2 = "disabled")
    {
      localStringBuilder.append(str2);
      if (Log.isLoggable("iu.LegacyUploadSettings", 3))
      {
        if (bool1 != this.a) {
          new StringBuilder(31).append("   auto upload changed to ").append(bool1);
        }
        TextUtils.equals(localObject, this.b);
      }
      this.a = bool1;
      this.b = localObject;
      return;
      bool2 = false;
      break;
      String str1 = this.e.a(i).b("account_name");
      bool1 = bool2;
      localObject = str1;
      break label50;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hbl
 * JD-Core Version:    0.7.0.1
 */