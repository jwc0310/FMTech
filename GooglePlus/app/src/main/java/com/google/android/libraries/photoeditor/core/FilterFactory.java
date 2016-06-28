package com.google.android.libraries.photoeditor.core;

import android.util.Base64;
import android.util.SparseArray;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.libraries.photoeditor.filterparameters.FilterParameter;
import efj;
import gel;
import gem;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

@UsedByNative
public final class FilterFactory
{
  public static final SparseArray<Class<? extends FilterParameter>> a = new SparseArray();
  private static final SparseArray<int[]> b;
  
  static
  {
    SparseArray localSparseArray = new SparseArray();
    b = localSparseArray;
    localSparseArray.put(7, new int[] { 3 });
    b.put(9, new int[] { 3 });
    b.put(116, new int[] { 3 });
    b.put(100, new int[] { 3 });
    b.put(208, new int[] { 800 });
    b.put(105, new int[] { 3 });
    b.put(207, new int[] { 800 });
  }
  
  private static FilterParameter a(Reader paramReader)
  {
    int i;
    do
    {
      i = paramReader.read();
    } while (Character.isSpaceChar(i));
    if (i != 123) {
      throw new IOException("Invalid JSON object start marker.");
    }
    StringBuilder localStringBuilder = new StringBuilder(1024);
    localStringBuilder.append((char)i);
    int j = 1;
    for (;;)
    {
      int k = paramReader.read();
      if (k == -1) {
        throw new EOFException("Unexpected end of reader reached.");
      }
      localStringBuilder.append((char)k);
      switch (k)
      {
      }
      while (j <= 0)
      {
        return a(new JSONObject(localStringBuilder.toString()));
        j++;
        continue;
        j--;
      }
    }
  }
  
  public static FilterParameter a(String paramString)
  {
    try
    {
      FilterParameter localFilterParameter = a(new StringReader(paramString));
      return localFilterParameter;
    }
    catch (Exception localException) {}
    return null;
  }
  
  private static FilterParameter a(JSONObject paramJSONObject)
  {
    int i = Integer.parseInt(paramJSONObject.getString("filterName"));
    FilterParameter localFilterParameter = efj.Cv.a(i);
    if (paramJSONObject.has("filterParams"))
    {
      JSONObject localJSONObject = paramJSONObject.getJSONObject("filterParams");
      List localList = localFilterParameter.d();
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext()) {
          a(localJSONObject, ((Integer)localIterator.next()).intValue(), localFilterParameter);
        }
      }
      for (int n : localFilterParameter.getParameterKeys()) {
        if ((localList == null) || (!localList.contains(Integer.valueOf(n)))) {
          a(localJSONObject, n, localFilterParameter);
        }
      }
    }
    if ((localFilterParameter.getSubParameters() != null) && (paramJSONObject.has("subFilters")))
    {
      JSONArray localJSONArray = paramJSONObject.getJSONArray("subFilters");
      for (int j = 0; j < localJSONArray.length(); j++) {
        localFilterParameter.addSubParameters(a(localJSONArray.getJSONObject(j)));
      }
    }
    return localFilterParameter;
  }
  
  public static String a(FilterParameter paramFilterParameter)
  {
    StringWriter localStringWriter = new StringWriter(1024);
    try
    {
      a(paramFilterParameter, localStringWriter);
      String str = localStringWriter.toString();
      return str;
    }
    catch (IOException localIOException) {}
    return null;
  }
  
  private static void a(FilterParameter paramFilterParameter, Writer paramWriter)
  {
    paramWriter.append("{\"").append("filterName").append("\":\"");
    paramWriter.append(Integer.toString(paramFilterParameter.getFilterType()));
    paramWriter.append("\"");
    int[] arrayOfInt = paramFilterParameter.getParameterKeys();
    if ((arrayOfInt != null) && (arrayOfInt.length > 0))
    {
      paramWriter.append(",\"").append("filterParams").append("\":{");
      int j = 0;
      if (j < arrayOfInt.length)
      {
        String str1;
        label94:
        Object localObject;
        String str4;
        if (j > 0)
        {
          str1 = ",\"";
          paramWriter.append(str1);
          paramWriter.append(Integer.toString(arrayOfInt[j]));
          paramWriter.append("\":\"");
          localObject = paramFilterParameter.getParameterValue(arrayOfInt[j]);
          if (!(localObject instanceof Number)) {
            break label266;
          }
          if (!(localObject instanceof Integer)) {
            break label220;
          }
          Locale localLocale2 = Locale.US;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = "int:";
          arrayOfObject2[1] = Integer.valueOf(((Number)localObject).intValue());
          str4 = String.format(localLocale2, "%s%d", arrayOfObject2);
        }
        for (;;)
        {
          paramWriter.append(str4);
          paramWriter.append("\"");
          j++;
          break;
          str1 = "\"";
          break label94;
          label220:
          Locale localLocale1 = Locale.US;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = "float:";
          arrayOfObject1[1] = Float.valueOf(((Number)localObject).floatValue());
          str4 = String.format(localLocale1, "%s%.5f", arrayOfObject1);
          continue;
          label266:
          if ((localObject instanceof String))
          {
            String str5 = (String)localObject;
            if (str5 == null) {
              throw new NullPointerException();
            }
            String str6 = str5.replace("\\", "\\\\").replace("\"", "\\\"");
            String str7 = String.valueOf("string:");
            String str8 = String.valueOf(str6);
            if (str8.length() != 0) {
              str4 = str7.concat(str8);
            } else {
              str4 = new String(str7);
            }
          }
          else
          {
            if (!(localObject instanceof byte[])) {
              break label448;
            }
            byte[] arrayOfByte = (byte[])localObject;
            if (arrayOfByte == null) {
              throw new NullPointerException();
            }
            String str2 = String.valueOf("byte-array:");
            String str3 = String.valueOf(new String(Base64.encode(arrayOfByte, 2)));
            if (str3.length() != 0) {
              str4 = str2.concat(str3);
            } else {
              str4 = new String(str2);
            }
          }
        }
        label448:
        throw new IllegalStateException("Not implemented!");
      }
      paramWriter.append("}");
    }
    List localList = paramFilterParameter.getSubParameters();
    if ((localList != null) && (localList.size() > 0))
    {
      paramWriter.append(",\"").append("subFilters").append("\":[");
      Iterator localIterator = localList.iterator();
      int i = 1;
      if (localIterator.hasNext())
      {
        FilterParameter localFilterParameter = (FilterParameter)localIterator.next();
        if (i != 0) {
          i = 0;
        }
        for (;;)
        {
          a(localFilterParameter, paramWriter);
          break;
          paramWriter.append(",");
        }
      }
      paramWriter.append("]");
    }
    paramWriter.append("}");
  }
  
  public static void a(gel paramgel)
  {
    if (a.size() > 0) {
      return;
    }
    String[] arrayOfString = paramgel.a();
    int i = arrayOfString.length;
    int j = 0;
    while (j < i)
    {
      String str = arrayOfString[j];
      try
      {
        Class.forName(str);
        label38:
        j++;
      }
      catch (Exception localException)
      {
        break label38;
      }
    }
  }
  
  private static void a(JSONObject paramJSONObject, int paramInt, FilterParameter paramFilterParameter)
  {
    String str1 = Integer.toString(paramInt);
    String str2;
    Object localObject;
    if (paramJSONObject.has(str1))
    {
      str2 = paramJSONObject.getString(str1);
      if (!str2.startsWith("int:")) {
        break label55;
      }
      localObject = Integer.valueOf(Integer.parseInt(str2.substring(4)));
    }
    for (;;)
    {
      paramFilterParameter.a(paramInt, localObject);
      return;
      label55:
      if (str2.startsWith("float:"))
      {
        localObject = Float.valueOf(Float.parseFloat(str2.substring(6)));
      }
      else if (str2.startsWith("string:"))
      {
        localObject = null;
        if (str2 != null) {
          localObject = str2.substring(7).replace("\\\"", "\"").replace("\\\\", "\\");
        }
      }
      else
      {
        if (!str2.startsWith("byte-array:")) {
          break;
        }
        localObject = null;
        if (str2 != null) {
          localObject = Base64.decode(str2.substring(11), 0);
        }
      }
    }
    throw new IllegalStateException("Not implemented!");
  }
  
  @UsedByNative
  public static FilterParameter createFilterParameter(int paramInt)
  {
    if (a.get(paramInt) != null) {}
    try
    {
      FilterParameter localFilterParameter = (FilterParameter)((Class)a.get(paramInt)).newInstance();
      return localFilterParameter;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new IllegalStateException(localInstantiationException);
      return NativeFilterParameter.a(paramInt, (int[])b.get(paramInt));
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      label30:
      break label30;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.photoeditor.core.FilterFactory
 * JD-Core Version:    0.7.0.1
 */