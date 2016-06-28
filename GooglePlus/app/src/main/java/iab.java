import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public final class iab
{
  private final Context a;
  private final String b;
  private final long c;
  private final long d;
  private final float e;
  private final float f;
  private final iae g;
  private File h;
  private String i;
  private long j;
  
  public iab(Context paramContext, String paramString, long paramLong1, long paramLong2, float paramFloat1, float paramFloat2) {}
  
  private iab(Context paramContext, String paramString, long paramLong1, long paramLong2, float paramFloat1, float paramFloat2, iae paramiae)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = paramLong1;
    this.d = paramLong2;
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.g = paramiae;
  }
  
  private final long a(File paramFile)
  {
    long l1 = 0L;
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int k = 0;
      if (k < arrayOfFile.length)
      {
        File localFile = arrayOfFile[k];
        if (localFile.isDirectory()) {}
        for (long l2 = a(localFile);; l2 = localFile.length())
        {
          l1 += l2;
          k++;
          break;
        }
      }
    }
    return l1;
  }
  
  private final String f()
  {
    if (this.i == null) {
      this.i = a().getPath();
    }
    return this.i;
  }
  
  public final File a()
  {
    if (this.h == null) {
      this.h = new File(this.a.getCacheDir(), this.b);
    }
    return this.h;
  }
  
  public final File a(String paramString)
  {
    File localFile = new File(b(paramString));
    if (localFile.exists()) {
      return localFile;
    }
    return null;
  }
  
  public final void a(File paramFile, ArrayList<File> paramArrayList)
  {
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int k = 0;
      if (k < arrayOfFile.length)
      {
        File localFile = arrayOfFile[k];
        if (localFile.isDirectory()) {
          a(localFile, paramArrayList);
        }
        for (;;)
        {
          k++;
          break;
          paramArrayList.add(localFile);
        }
      }
    }
  }
  
  public final void a(String paramString, ByteBuffer paramByteBuffer)
  {
    String str1 = b(paramString);
    label193:
    String str2;
    try
    {
      efj.a(paramByteBuffer, str1);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      File localFile = new File(str1).getParentFile();
      if (!localFile.exists()) {}
      for (;;)
      {
        try
        {
          localFile.mkdirs();
          String str6;
          try
          {
            efj.a(paramByteBuffer, str1);
            return;
          }
          catch (IOException localIOException2)
          {
            str6 = String.valueOf(str1);
            if (str6.length() == 0) {
              break label193;
            }
          }
          str7 = "Cannot write file to cache: ".concat(str6);
          Log.e("FileCache", str7, localFileNotFoundException);
          return;
        }
        catch (Exception localException)
        {
          String str8 = String.valueOf(localFile);
          Log.e("FileCache", 31 + String.valueOf(str8).length() + "Cannot create cache directory: " + str8, localException);
          throw new RuntimeException("Cannot create cache directory", localException);
        }
        String str4 = String.valueOf(str1);
        if (str4.length() != 0) {}
        for (String str5 = "Cannot write file to cache: ".concat(str4);; str5 = new String("Cannot write file to cache: "))
        {
          Log.e("FileCache", str5, localFileNotFoundException);
          break;
        }
        String str7 = new String("Cannot write file to cache: ");
      }
    }
    catch (IOException localIOException1)
    {
      str2 = String.valueOf(str1);
      if (str2.length() == 0) {}
    }
    for (String str3 = "Cannot write file to cache: ".concat(str2);; str3 = new String("Cannot write file to cache: "))
    {
      Log.e("FileCache", str3, localIOException1);
      return;
    }
  }
  
  public final int b()
  {
    int k = 0;
    long l1 = System.currentTimeMillis();
    if (!a().exists()) {}
    ArrayList localArrayList2;
    long l2;
    long l4;
    do
    {
      ArrayList localArrayList1;
      do
      {
        return 0;
        localArrayList1 = new ArrayList();
        a(a(), localArrayList1);
      } while (localArrayList1.isEmpty());
      localArrayList2 = new ArrayList();
      Iterator localIterator = localArrayList1.iterator();
      l2 = 0L;
      if (localIterator.hasNext())
      {
        iac localiac1 = new iac((File)localIterator.next());
        if (l1 - localiac1.b < 1800000L) {}
        for (boolean bool = true;; bool = false)
        {
          localiac1.d = bool;
          long l3 = l2 + localiac1.c;
          localArrayList2.add(localiac1);
          l2 = l3;
          break;
        }
      }
      l4 = c();
    } while (l2 <= l4);
    Collections.sort(localArrayList2);
    int m = localArrayList2.size();
    int n = 0;
    if ((k < m) && (l2 > l4))
    {
      iac localiac2 = (iac)localArrayList2.get(k);
      if (!localiac2.a.delete()) {
        break label242;
      }
      l2 -= localiac2.c;
    }
    label242:
    for (int i1 = n + 1;; i1 = n)
    {
      k++;
      n = i1;
      break;
      return n;
    }
  }
  
  public final String b(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(3 + (f().length() + paramString.length()));
    localStringBuilder.append(f());
    localStringBuilder.append(File.separatorChar);
    localStringBuilder.append(paramString.charAt(0));
    localStringBuilder.append(File.separatorChar);
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  public final long c()
  {
    try
    {
      if (this.j == 0L) {
        this.j = d();
      }
      long l = this.j;
      return l;
    }
    finally {}
  }
  
  public final long d()
  {
    long l1 = this.d;
    long l2 = this.g.a();
    if ((float)l1 > (float)l2 * this.e) {
      l1 = ((float)l2 * this.e);
    }
    if (l1 < this.c) {
      l1 = this.c;
    }
    long l3 = this.g.b();
    if ((float)l1 < (float)l3 * this.f) {
      return l1;
    }
    return ((float)(l3 + e()) * this.f);
  }
  
  public final long e()
  {
    if (a().exists()) {
      return a(a());
    }
    return 0L;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     iab
 * JD-Core Version:    0.7.0.1
 */