import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.io.IOException;

public class jcm
{
  private static final String b = jdr.a(jcm.class);
  final SharedPreferences a;
  private final String c;
  private final ftz d;
  
  public jcm(Context paramContext)
  {
    this.d = ((ftz)mbb.a(paramContext, ftz.class));
    this.a = paramContext.getSharedPreferences("com.google.android.libraries.social.notifications.GCM", 0);
    this.c = ((jaq)mbb.a(paramContext, jaq.class)).c();
  }
  
  public final boolean a(boolean paramBoolean)
  {
    String str1 = this.a.getString("reg_id", null);
    long l = this.a.getLong("reg_timestamp", 0L);
    int i;
    String str4;
    label72:
    boolean bool2;
    if (!paramBoolean)
    {
      if ((!TextUtils.isEmpty(str1)) && (System.currentTimeMillis() - l <= 86400000L)) {
        break label224;
      }
      i = 1;
      String str3 = b;
      Object[] arrayOfObject = new Object[1];
      if (i == 0) {
        break label230;
      }
      str4 = "stale";
      arrayOfObject[0] = str4;
      jdr.a(str3, String.format("GCM Registration is %s.", arrayOfObject));
      bool2 = false;
      if (i == 0) {}
    }
    else
    {
      jdr.a(b, 39 + "Try to register with GCM, force = " + paramBoolean);
    }
    for (;;)
    {
      try
      {
        str2 = this.d.a(this.c);
        if (str1 != null)
        {
          boolean bool1 = str2.equals(str1);
          if (bool1) {
            break label293;
          }
        }
        bool2 = true;
        this.d.a();
        if (!TextUtils.isEmpty(str2))
        {
          SharedPreferences.Editor localEditor = this.a.edit();
          localEditor.putString("reg_id", str2);
          localEditor.putLong("reg_timestamp", System.currentTimeMillis());
          localEditor.commit();
        }
        return bool2;
      }
      catch (IOException localIOException)
      {
        label224:
        label230:
        jdr.a(b, 49 + "Exception during register with GCM, force = " + paramBoolean, localIOException);
        return false;
      }
      finally
      {
        this.d.a();
      }
      i = 0;
      break;
      str4 = "not-stale";
      break label72;
      label293:
      String str2 = str1;
      bool2 = false;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcm
 * JD-Core Version:    0.7.0.1
 */