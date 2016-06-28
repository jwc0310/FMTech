import android.text.Html;
import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Random;

public final class mfx
{
  public static final ThreadLocal<mfz> a = new mfy();
  private static final Random b = new Random();
  private static final char[] c = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  
  private static int a(String paramString, int paramInt)
  {
    if ((paramInt > 0) && (paramInt < paramString.length()) && (Character.isHighSurrogate(paramString.charAt(paramInt - 1))) && (Character.isLowSurrogate(paramString.charAt(paramInt)))) {
      paramInt--;
    }
    return paramInt;
  }
  
  public static int a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) && (paramString2 == null)) {
      return 0;
    }
    if (paramString2 == null) {
      return -1;
    }
    if (paramString1 == null) {
      return 1;
    }
    return paramString1.compareTo(paramString2);
  }
  
  public static String a(int paramInt)
  {
    char[] arrayOfChar = new char[32];
    for (int i = 0; i < 32; i++) {
      arrayOfChar[i] = c[b.nextInt(71)];
    }
    return new String(arrayOfChar);
  }
  
  public static String a(long paramLong)
  {
    if (paramLong < 1024L) {
      return 22 + paramLong + " B";
    }
    int i = (int)(Math.log(paramLong) / Math.log(1024.0D));
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Double.valueOf(paramLong / Math.pow(1024.0D, i));
    arrayOfObject[1] = Character.valueOf("KMGTPE".charAt(i - 1));
    return String.format("%.1f %sB", arrayOfObject);
  }
  
  /* Error */
  private static String a(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: new 119	java/io/BufferedReader
    //   3: dup
    //   4: new 121	java/io/InputStreamReader
    //   7: dup
    //   8: aload_0
    //   9: invokespecial 124	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   12: invokespecial 127	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   15: invokevirtual 130	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   18: astore_2
    //   19: aload_2
    //   20: astore_3
    //   21: aload_3
    //   22: ifnull +9 -> 31
    //   25: aload_0
    //   26: invokevirtual 135	java/io/InputStream:close	()V
    //   29: aload_3
    //   30: areturn
    //   31: ldc 137
    //   33: astore_3
    //   34: goto -9 -> 25
    //   37: astore_1
    //   38: aload_0
    //   39: invokevirtual 135	java/io/InputStream:close	()V
    //   42: aload_1
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	paramInputStream	java.io.InputStream
    //   37	6	1	localObject	Object
    //   18	2	2	str1	String
    //   20	14	3	str2	String
    // Exception table:
    //   from	to	target	type
    //   0	19	37	finally
  }
  
  public static String a(String paramString)
  {
    if (paramString == null) {
      return paramString;
    }
    return Html.fromHtml(paramString).toString();
  }
  
  public static String a(String paramString, int paramInt1, int paramInt2)
  {
    return paramString.substring(a(paramString, 0), a(paramString, paramInt2));
  }
  
  public static ArrayList<String> a(String paramString, char paramChar)
  {
    ArrayList localArrayList = new ArrayList();
    if (TextUtils.isEmpty(paramString)) {
      return localArrayList;
    }
    int j;
    for (int i = 0; i < paramString.length(); i = j + 1)
    {
      j = paramString.indexOf('|', i);
      if (j == -1) {
        j = paramString.length();
      }
      localArrayList.add(paramString.substring(i, j));
    }
    return localArrayList;
  }
  
  public static void a(StringBuilder paramStringBuilder)
  {
    mfz localmfz = (mfz)a.get();
    if (localmfz.b <= 0) {
      throw new IllegalStateException("Cannot release more StringBuilders than have been acquired");
    }
    if ((localmfz.b == 1) && (paramStringBuilder != localmfz.a)) {
      throw new IllegalArgumentException("Tried to release wrong StringBuilder instance");
    }
    paramStringBuilder.setLength(0);
    localmfz.b = (-1 + localmfz.b);
  }
  
  public static boolean a(CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    return (TextUtils.equals(paramCharSequence1, paramCharSequence2)) || ((TextUtils.isEmpty(paramCharSequence1)) && (TextUtils.isEmpty(paramCharSequence2)));
  }
  
  public static String b(String paramString)
  {
    return a(new FileInputStream(paramString));
  }
  
  public static String b(StringBuilder paramStringBuilder)
  {
    String str = paramStringBuilder.toString();
    a(paramStringBuilder);
    return str;
  }
  
  public static void b(String paramString1, String paramString2)
  {
    try
    {
      localFileOutputStream = new FileOutputStream(paramString1);
      localBufferedWriter = new BufferedWriter(new OutputStreamWriter(localFileOutputStream));
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      for (;;)
      {
        try
        {
          localBufferedWriter.write(paramString2);
          localBufferedWriter.close();
          return;
        }
        finally
        {
          FileOutputStream localFileOutputStream;
          BufferedWriter localBufferedWriter;
          File localFile;
          localBufferedWriter.close();
        }
        localFileNotFoundException = localFileNotFoundException;
        localFile = new File(paramString1).getParentFile();
        if ((localFile == null) || (localFile.exists())) {
          continue;
        }
        localFile.mkdirs();
        localFileOutputStream = new FileOutputStream(paramString1);
      }
      throw localFileNotFoundException;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     mfx
 * JD-Core Version:    0.7.0.1
 */