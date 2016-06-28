import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Base64;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public final class exu
{
  public static eyc a;
  public static exx b;
  public static String d;
  private static Map<String, exu> e = new HashMap();
  public String c = "";
  private KeyPair f;
  private long g;
  
  private exu(Context paramContext, String paramString)
  {
    paramContext.getApplicationContext();
    this.c = paramString;
  }
  
  static int a(Context paramContext)
  {
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      new StringBuilder("Never happens: can't find own package ").append(localNameNotFoundException);
    }
    return 0;
  }
  
  public static exu a(Context paramContext, Bundle paramBundle)
  {
    Object localObject2;
    if (paramBundle == null) {
      localObject2 = "";
    }
    for (;;)
    {
      try
      {
        Context localContext = paramContext.getApplicationContext();
        if (a == null)
        {
          a = new eyc(localContext);
          b = new exx(localContext);
        }
        d = Integer.toString(a(localContext));
        exu localexu = (exu)e.get(localObject3);
        if (localexu == null)
        {
          localexu = new exu(localContext, (String)localObject3);
          e.put(localObject3, localexu);
        }
        return localexu;
      }
      finally {}
      String str = paramBundle.getString("subtype");
      localObject2 = str;
      while (localObject2 != null)
      {
        localObject3 = localObject2;
        break;
      }
      Object localObject3 = "";
    }
  }
  
  static String a(KeyPair paramKeyPair)
  {
    byte[] arrayOfByte1 = paramKeyPair.getPublic().getEncoded();
    try
    {
      byte[] arrayOfByte2 = MessageDigest.getInstance("SHA1").digest(arrayOfByte1);
      arrayOfByte2[0] = ((byte)(112 + (0xF & arrayOfByte2[0])));
      String str = Base64.encodeToString(arrayOfByte2, 0, 8, 11);
      return str;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return null;
  }
  
  static String a(byte[] paramArrayOfByte)
  {
    return Base64.encodeToString(paramArrayOfByte, 11);
  }
  
  public static exu b(Context paramContext)
  {
    return a(paramContext, null);
  }
  
  public final String a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (paramString2 != null) {
      paramBundle.putString("scope", paramString2);
    }
    paramBundle.putString("sender", paramString1);
    if ("".equals(this.c)) {}
    for (String str = paramString1;; str = this.c)
    {
      if (!paramBundle.containsKey("legacy.register"))
      {
        paramBundle.putString("subscription", paramString1);
        paramBundle.putString("subtype", str);
        paramBundle.putString("X-subscription", paramString1);
        paramBundle.putString("X-subtype", str);
      }
      return exx.a(b.a(paramBundle, a()));
    }
  }
  
  public final KeyPair a()
  {
    if (this.f == null) {
      this.f = a.d(this.c);
    }
    if (this.f == null)
    {
      this.g = System.currentTimeMillis();
      this.f = a.a(this.c, this.g);
    }
    return this.f;
  }
  
  public final void b()
  {
    this.g = 0L;
    eyc localeyc = a;
    String str = this.c;
    localeyc.b(str + "|");
    this.f = null;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     exu
 * JD-Core Version:    0.7.0.1
 */