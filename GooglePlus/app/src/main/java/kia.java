import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public final class kia
{
  private static final int a = 2;
  private static final int b = 2;
  
  public static String a(Intent paramIntent, String paramString)
  {
    String str;
    if (!paramIntent.hasExtra(paramString)) {
      str = null;
    }
    CharSequence localCharSequence;
    do
    {
      do
      {
        return str;
        str = paramIntent.getStringExtra(paramString);
      } while (str != null);
      localCharSequence = paramIntent.getCharSequenceExtra(paramString);
    } while (localCharSequence == null);
    return localCharSequence.toString();
  }
  
  public static String a(Spannable paramSpannable)
  {
    int i = 0;
    URLSpan[] arrayOfURLSpan = (URLSpan[])paramSpannable.getSpans(0, paramSpannable.length(), URLSpan.class);
    ArrayList localArrayList1 = new ArrayList();
    int j = 0;
    if (j < arrayOfURLSpan.length)
    {
      int n = localArrayList1.size();
      label89:
      label127:
      for (int i1 = 0;; i1++)
      {
        if (i1 < n + 1)
        {
          if (!lxf.a(arrayOfURLSpan[j])) {
            continue;
          }
          if (n > i1) {
            break label89;
          }
          localArrayList1.add(arrayOfURLSpan[j]);
        }
        for (;;)
        {
          j++;
          break;
          if (paramSpannable.getSpanEnd(localArrayList1.get(i1)) <= paramSpannable.getSpanEnd(arrayOfURLSpan[j])) {
            break label127;
          }
          localArrayList1.add(i1, arrayOfURLSpan[j]);
        }
      }
    }
    int k = localArrayList1.size();
    ArrayList localArrayList2 = new ArrayList(k);
    int[] arrayOfInt1 = new int[k];
    int[] arrayOfInt2 = new int[k];
    if (i < k)
    {
      String str1 = ((URLSpan)localArrayList1.get(i)).getURL().substring(lxf.a.length());
      if (str1.startsWith("g:"))
      {
        String str8 = String.valueOf(lxf.a);
        String str9 = String.valueOf(str1.substring(a));
        if (str9.length() != 0) {}
        for (String str10 = str8.concat(str9);; str10 = new String(str8))
        {
          localArrayList2.add(str10);
          arrayOfInt1[i] = paramSpannable.getSpanStart(localArrayList1.get(i));
          arrayOfInt2[i] = paramSpannable.getSpanEnd(localArrayList1.get(i));
          i++;
          break;
        }
      }
      if (str1.startsWith("e:"))
      {
        String str5 = String.valueOf(lxf.a);
        String str6 = String.valueOf(str1.substring(b));
        if (str6.length() != 0) {}
        for (String str7 = str5.concat(str6);; str7 = new String(str5))
        {
          localArrayList2.add(str7);
          break;
        }
      }
      String str2 = String.valueOf(lxf.a);
      String str3 = String.valueOf(str1);
      if (str3.length() != 0) {}
      for (String str4 = str2.concat(str3);; str4 = new String(str2))
      {
        localArrayList2.add(str4);
        break;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder(paramSpannable);
    for (int m = k - 1; m >= 0; m--) {
      localStringBuilder.replace(arrayOfInt1[m], arrayOfInt2[m], (String)localArrayList2.get(m));
    }
    return localStringBuilder.toString();
  }
  
  public static String a(String paramString, PackageManager paramPackageManager)
  {
    for (;;)
    {
      try
      {
        localPackageInfo = paramPackageManager.getPackageInfo(paramString, 64);
        Signature[] arrayOfSignature = localPackageInfo.signatures;
        localObject = null;
        if (arrayOfSignature != null)
        {
          int i = localPackageInfo.signatures.length;
          localObject = null;
          if (i != 1) {}
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        PackageInfo localPackageInfo;
        byte[] arrayOfByte1;
        MessageDigest localMessageDigest;
        byte[] arrayOfByte2;
        String str;
        localObject = null;
        continue;
      }
      try
      {
        arrayOfByte1 = localPackageInfo.signatures[0].toByteArray();
        localMessageDigest = MessageDigest.getInstance("SHA1");
        localObject = null;
        if (localMessageDigest != null) {
          continue;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        localObject = null;
        continue;
      }
      if (localObject == null) {
        localObject = "0";
      }
      return localObject;
      arrayOfByte2 = localMessageDigest.digest(arrayOfByte1);
      localObject = null;
      if (arrayOfByte2 != null)
      {
        str = Base64.encodeToString(arrayOfByte2, 2);
        localObject = str;
      }
    }
  }
  
  public static kbo a(Context paramContext, String paramString1, String paramString2)
  {
    String str1 = mbb.a(paramContext, "rpc.client_id", null);
    PackageManager localPackageManager = paramContext.getPackageManager();
    kbo localkbo = new kbo(null, str1, paramString1, a(paramString1, localPackageManager), paramString2);
    String str2 = paramContext.getPackageName();
    return new kbo(null, str1, str2, a(str2, localPackageManager), "", localkbo);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kia
 * JD-Core Version:    0.7.0.1
 */