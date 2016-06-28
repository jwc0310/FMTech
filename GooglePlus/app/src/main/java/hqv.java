import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class hqv
{
  private static final mcq a = new mcq("debug.social.die_hard");
  
  public static <T extends qat> List<T> a(byte[] paramArrayOfByte, Class<T> paramClass)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return null;
    }
    try
    {
      qak localqak = new qak(paramArrayOfByte, 0, paramArrayOfByte.length);
      int i = localqak.i();
      ArrayList localArrayList = new ArrayList(i);
      for (int j = 0; j < i; j++)
      {
        qat localqat = (qat)paramClass.newInstance();
        localqak.a(localqat);
        localArrayList.add(localqat);
      }
      return localArrayList;
    }
    catch (InstantiationException localInstantiationException)
    {
      Log.e("MessageNanoUtils", "Failed to deserialize", localInstantiationException);
      return null;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label85;
    }
    catch (IOException localIOException)
    {
      label85:
      break label85;
    }
  }
  
  public static <T extends qat> T a(T paramT, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    qat localqat1;
    String str1;
    try
    {
      qat localqat2 = qat.b(paramT, paramArrayOfByte, 0, paramArrayOfByte.length);
      localqat1 = localqat2;
      return localqat1;
    }
    catch (qas localqas)
    {
      str1 = String.valueOf(localqas.getMessage());
      if (str1.length() == 0) {}
    }
    for (String str2 = "Invalid binary data: ".concat(str1);; str2 = new String("Invalid binary data: "))
    {
      Log.e("MessageNanoUtils", str2, localqas);
      localqat1 = null;
      break;
    }
  }
  
  public static <T extends qat> byte[] a(List<T> paramList)
  {
    int i = 0;
    if (paramList == null) {
      return null;
    }
    int k;
    int n;
    int m;
    for (;;)
    {
      try
      {
        int j = paramList.size();
        if (j < 0) {
          break;
        }
        k = qal.d(j);
      }
      catch (IOException localIOException)
      {
        qat localqat2;
        int i1;
        byte[] arrayOfByte;
        qal localqal;
        Log.e("MessageNanoUtils", "Failed to serialize", localIOException);
        return null;
      }
      if (n < paramList.size())
      {
        localqat2 = (qat)paramList.get(n);
        i1 = localqat2.a();
        localqat2.ak = i1;
        m += i1 + qal.d(i1);
        n++;
      }
      else
      {
        arrayOfByte = new byte[m];
        localqal = new qal(arrayOfByte, 0, arrayOfByte.length);
        localqal.a(paramList.size());
        while (i < paramList.size())
        {
          qat localqat1 = (qat)paramList.get(i);
          if (localqat1.ak < 0) {
            localqat1.ak = localqat1.a();
          }
          localqal.c(localqat1.ak);
          localqat1.a(localqal);
          i++;
        }
        return arrayOfByte;
      }
    }
    for (;;)
    {
      m = k + 0;
      n = 0;
      break;
      k = 10;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     hqv
 * JD-Core Version:    0.7.0.1
 */