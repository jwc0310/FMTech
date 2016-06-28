import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

public final class fne
{
  public static final String[] a;
  public static final Pattern b;
  public static final ThreadLocal<String[]> c;
  
  static
  {
    new fnf();
    new fmh();
    new Handler(Looper.getMainLooper());
    a = new String[0];
    b = Pattern.compile("\\,");
    Pattern.compile("[     ᠎             　\t\013\f\034\035\036\037\n\r]+");
    Pattern.compile(Pattern.quote("\001"));
    Pattern.compile(Pattern.quote("\002"));
    new SecureRandom();
    new fng();
    new fnh();
    c = new fni();
    new fnj();
    new fnk();
    new fnl();
  }
  
  public static String a(Bundle paramBundle)
  {
    return a(paramBundle, "", new StringBuilder()).toString();
  }
  
  public static String a(String paramString)
  {
    efj.a(paramString);
    return "g:" + paramString;
  }
  
  private static StringBuilder a(Object paramObject, String paramString, StringBuilder paramStringBuilder)
  {
    if (paramObject == null)
    {
      paramStringBuilder.append("[null]\n");
      return paramStringBuilder;
    }
    String str1 = paramString + "  ";
    paramStringBuilder.append("(").append(paramObject.getClass().getSimpleName()).append(") ");
    if ((paramObject instanceof Bundle))
    {
      Bundle localBundle = (Bundle)paramObject;
      if (localBundle.isEmpty())
      {
        paramStringBuilder.append("{ }\n");
        return paramStringBuilder;
      }
      paramStringBuilder.append("{\n");
      Iterator localIterator = localBundle.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str2 = (String)localIterator.next();
        paramStringBuilder.append(str1).append(str2).append(" : ");
        a(localBundle.get(str2), str1, paramStringBuilder);
      }
      paramStringBuilder.append(paramString).append("}\n");
      return paramStringBuilder;
    }
    if ((paramObject instanceof DataHolder))
    {
      DataHolder localDataHolder = (DataHolder)paramObject;
      paramStringBuilder.append(" [");
      if (localDataHolder.b()) {
        paramStringBuilder.append("CLOSED");
      }
      for (;;)
      {
        paramStringBuilder.append("] ").append(paramObject).append("\n");
        return paramStringBuilder;
        paramStringBuilder.append(localDataHolder.g);
      }
    }
    if ((paramObject instanceof ArrayList))
    {
      ArrayList localArrayList = (ArrayList)paramObject;
      if (localArrayList.isEmpty())
      {
        paramStringBuilder.append("[ ]\n");
        return paramStringBuilder;
      }
      paramStringBuilder.append("[\n");
      for (int k = 0; k < localArrayList.size(); k++)
      {
        paramStringBuilder.append(str1).append(k).append(" : ");
        a(localArrayList.get(k), str1, paramStringBuilder);
      }
      paramStringBuilder.append(paramString).append("]\n");
      return paramStringBuilder;
    }
    if ((paramObject instanceof byte[]))
    {
      int j = ((byte[])paramObject).length;
      paramStringBuilder.append(" [").append(j).append("] ");
      byte[] arrayOfByte = new byte[Math.min(j, 56)];
      System.arraycopy(paramObject, 0, arrayOfByte, 0, arrayOfByte.length);
      paramStringBuilder.append(Base64.encodeToString(arrayOfByte, 0));
      return paramStringBuilder;
    }
    if ((paramObject instanceof char[]))
    {
      paramStringBuilder.append("\"").append(new String((char[])paramObject)).append("\"\n");
      return paramStringBuilder;
    }
    if (paramObject.getClass().isArray())
    {
      if (Array.getLength(paramObject) == 0)
      {
        paramStringBuilder.append("[ ]\n");
        return paramStringBuilder;
      }
      paramStringBuilder.append("[ ");
      paramStringBuilder.append(Array.get(paramObject, 0));
      for (int i = 1; i < Array.getLength(paramObject); i++) {
        paramStringBuilder.append(", ").append(Array.get(paramObject, i));
      }
      paramStringBuilder.append(" ]\n");
      return paramStringBuilder;
    }
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append("\"").append(paramObject).append("\"\n");
      return paramStringBuilder;
    }
    paramStringBuilder.append(paramObject).append("\n");
    return paramStringBuilder;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fne
 * JD-Core Version:    0.7.0.1
 */