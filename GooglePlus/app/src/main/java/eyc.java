import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class eyc
{
  SharedPreferences a;
  private Context b;
  
  public eyc(Context paramContext)
  {
    this(paramContext, "com.google.android.gms.gcm.appid");
  }
  
  private eyc(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.a = paramContext.getSharedPreferences(paramString, 4);
    String str = paramString + "-no-backup";
    new fo();
    Context localContext = this.b;
    File localFile1;
    if (Build.VERSION.SDK_INT >= 21) {
      localFile1 = localContext.getNoBackupFilesDir();
    }
    for (;;)
    {
      File localFile2 = new File(localFile1, str);
      if (!localFile2.exists()) {}
      try
      {
        if ((localFile2.createNewFile()) && (!this.a.getAll().isEmpty())) {
          exv.a(this.b, this);
        }
        return;
        localFile1 = fo.a(new File(localContext.getApplicationInfo().dataDir, "no_backup"));
      }
      catch (IOException localIOException)
      {
        while (!Log.isLoggable("InstanceID/Store", 3)) {}
        new StringBuilder("Error creating file in no backup dir: ").append(localIOException.getMessage());
      }
    }
  }
  
  private String a(String paramString1, String paramString2)
  {
    try
    {
      String str = this.a.getString(paramString1 + "|S|" + paramString2, null);
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private void a(SharedPreferences.Editor paramEditor, String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramEditor.putString(paramString1 + "|S|" + paramString2, paramString3);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  private static String c(String paramString1, String paramString2, String paramString3)
  {
    return paramString1 + "|T|" + paramString2 + "|" + paramString3;
  }
  
  public final String a(String paramString)
  {
    try
    {
      String str = this.a.getString(paramString, null);
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final String a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      String str1 = c(paramString1, paramString2, paramString3);
      String str2 = this.a.getString(str1, null);
      return str2;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  final KeyPair a(String paramString, long paramLong)
  {
    try
    {
      KeyPair localKeyPair = efj.b();
      SharedPreferences.Editor localEditor = this.a.edit();
      a(localEditor, paramString, "|P|", exu.a(localKeyPair.getPublic().getEncoded()));
      a(localEditor, paramString, "|K|", exu.a(localKeyPair.getPrivate().getEncoded()));
      a(localEditor, paramString, "cre", Long.toString(paramLong));
      localEditor.commit();
      return localKeyPair;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a()
  {
    try
    {
      this.a.edit().clear().commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      String str = c(paramString1, paramString2, paramString3);
      SharedPreferences.Editor localEditor = this.a.edit();
      localEditor.putString(str, paramString4);
      localEditor.putString("appVersion", paramString5);
      localEditor.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000L));
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void b(String paramString)
  {
    try
    {
      SharedPreferences.Editor localEditor = this.a.edit();
      Iterator localIterator = this.a.getAll().keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (str.startsWith(paramString)) {
          localEditor.remove(str);
        }
      }
      localEditor.commit();
    }
    finally {}
  }
  
  public final void b(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      String str = c(paramString1, paramString2, paramString3);
      SharedPreferences.Editor localEditor = this.a.edit();
      localEditor.remove(str);
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public final void c(String paramString)
  {
    b(paramString + "|T|");
  }
  
  final KeyPair d(String paramString)
  {
    String str1 = a(paramString, "|P|");
    String str2 = a(paramString, "|K|");
    if (str2 == null) {
      return null;
    }
    try
    {
      byte[] arrayOfByte1 = Base64.decode(str1, 8);
      byte[] arrayOfByte2 = Base64.decode(str2, 8);
      KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
      KeyPair localKeyPair = new KeyPair(localKeyFactory.generatePublic(new X509EncodedKeySpec(arrayOfByte1)), localKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(arrayOfByte2)));
      return localKeyPair;
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      new StringBuilder("Invalid key stored ").append(localInvalidKeySpecException);
      exv.a(this.b, this);
      return null;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      label87:
      break label87;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eyc
 * JD-Core Version:    0.7.0.1
 */