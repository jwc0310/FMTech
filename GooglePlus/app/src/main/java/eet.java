import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.util.Set;

public final class eet
{
  static final eet a = new eet();
  
  static ejx a(PackageInfo paramPackageInfo, ejx... paramVarArgs)
  {
    if (paramPackageInfo.signatures.length != 1) {
      return null;
    }
    emy localemy = new emy(paramPackageInfo.signatures[0].toByteArray());
    for (int i = 0; i < paramVarArgs.length; i++) {
      if (paramVarArgs[i].equals(localemy)) {
        return paramVarArgs[i];
      }
    }
    if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
      new StringBuilder("Signature not valid.  Found: \n").append(Base64.encodeToString(localemy.a(), 0));
    }
    return null;
  }
  
  private static boolean a(PackageInfo paramPackageInfo, boolean paramBoolean)
  {
    if (paramPackageInfo.signatures.length != 1) {
      return false;
    }
    emy localemy = new emy(paramPackageInfo.signatures[0].toByteArray());
    if (paramBoolean) {
      if (ejw.c == null) {
        ejw.c = ejw.a(ejw.b);
      }
    }
    for (Set localSet = ejw.c; localSet.contains(localemy); localSet = ejw.d)
    {
      return true;
      if (ejw.d == null) {
        ejw.d = ejw.a(ejw.a);
      }
    }
    if (Log.isLoggable("GoogleSignatureVerifier", 2)) {
      new StringBuilder("Signature not valid.  Found: \n").append(Base64.encodeToString(localemy.a(), 0));
    }
    return false;
  }
  
  public final boolean a(PackageManager paramPackageManager, String paramString)
  {
    PackageInfo localPackageInfo;
    boolean bool2;
    label58:
    do
    {
      try
      {
        localPackageInfo = paramPackageManager.getPackageInfo(paramString, 64);
        bool2 = false;
        if (localPackageInfo != null) {
          break label58;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        boolean bool1;
        do
        {
          bool1 = Log.isLoggable("GoogleSignatureVerifier", 3);
          bool2 = false;
        } while (!bool1);
        new StringBuilder("Package manager can't find package ").append(paramString).append(", defaulting to false");
        return false;
      }
      return bool2;
      if (eer.a(paramPackageManager)) {
        return a(localPackageInfo, true);
      }
      bool2 = a(localPackageInfo, false);
    } while (bool2);
    a(localPackageInfo, true);
    return bool2;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     eet
 * JD-Core Version:    0.7.0.1
 */