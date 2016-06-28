import android.accounts.AuthenticatorException;
import android.content.Context;
import android.text.TextUtils;

public class kcn
{
  final String a;
  final fpu b;
  final la<String, Long> c = new la();
  final la<String, String> d = new la();
  
  kcn(String paramString, fpu paramfpu)
  {
    this.a = paramString;
    this.b = paramfpu;
  }
  
  public String a(Context paramContext, String paramString)
  {
    String str1 = ((kcf)mbb.a(paramContext, kcf.class)).b();
    if (!TextUtils.isEmpty(str1)) {
      return str1;
    }
    String str2;
    for (;;)
    {
      try
      {
        str2 = (String)this.d.get(paramString);
        if (str2 == null) {
          break label138;
        }
        Long localLong1 = (Long)this.c.get(str2);
        if (localLong1 != null)
        {
          bool1 = true;
          efj.d(bool1, "Missing auth time for auth token");
          if (System.currentTimeMillis() - localLong1.longValue() > kco.a) {
            break;
          }
          return str2;
        }
      }
      finally {}
      boolean bool1 = false;
    }
    this.d.remove(paramString);
    this.c.remove(str2);
    this.b.a(paramContext, str2);
    label138:
    Long localLong2 = Long.valueOf(System.currentTimeMillis());
    boolean bool2 = mbb.a(paramContext, "token_with_notification", true);
    String str3 = a(paramContext, paramString, this.a, bool2);
    if (str3 != null) {
      try
      {
        String str4 = (String)this.d.remove(paramString);
        if (str4 != null) {
          this.c.remove(str4);
        }
        this.d.put(paramString, str3);
        this.c.put(str3, localLong2);
      }
      finally {}
    }
    return str3;
  }
  
  public String a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    fpw localfpw = (fpw)mbb.a(paramContext, fpw.class);
    if (paramBoolean) {
      return this.b.a(paramContext, paramString1, paramString2);
    }
    try
    {
      String str = localfpw.a(paramString1, paramString2);
      return str;
    }
    catch (fpv localfpv)
    {
      throw new AuthenticatorException("Recoverable error", localfpv);
    }
  }
  
  public void b(Context paramContext, String paramString)
  {
    if (!TextUtils.isEmpty(((kcf)mbb.a(paramContext, kcf.class)).b())) {
      return;
    }
    try
    {
      String str1 = (String)this.d.remove(paramString);
      if (str1 != null)
      {
        this.c.remove(str1);
        this.b.a(paramContext, str1);
        return;
      }
    }
    finally {}
    String str2 = this.b.a(paramContext, paramString, this.a);
    this.b.a(paramContext, str2);
  }
  
  public Long c(Context paramContext, String paramString)
  {
    if (!TextUtils.isEmpty(((kcf)mbb.a(paramContext, kcf.class)).b())) {
      return Long.valueOf(System.currentTimeMillis());
    }
    try
    {
      Long localLong = (Long)this.c.get(paramString);
      return localLong;
    }
    finally {}
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kcn
 * JD-Core Version:    0.7.0.1
 */