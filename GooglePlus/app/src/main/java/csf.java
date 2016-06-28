import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class csf<T>
{
  private static Object c = new Object();
  private static Object d = new Object();
  private static final Charset e = Charset.forName("UTF-8");
  final Class<T> a;
  csg[] b;
  private final Object[] f;
  
  protected csf()
  {
    this.a = null;
    this.f = null;
  }
  
  protected csf(Class<T> paramClass, Object... paramVarArgs)
  {
    this.a = paramClass;
    this.f = paramVarArgs;
  }
  
  public static <E> csf<E> a(Class<E> paramClass)
  {
    return new csh(paramClass);
  }
  
  public static <E> csf<E> a(Class<E> paramClass, Object... paramVarArgs)
  {
    return new csh(paramClass, paramVarArgs);
  }
  
  private T a(JsonReader paramJsonReader, x paramx)
  {
    if (this.b == null)
    {
      if (this.a == null) {
        throw new UnsupportedOperationException("A JSON class must either configure the automatic parser or override read(JsonReader)");
      }
      a();
    }
    Object localObject1 = b();
    paramJsonReader.beginObject();
    int j;
    label61:
    csg localcsg2;
    if (paramJsonReader.hasNext())
    {
      String str1 = paramJsonReader.nextName();
      int i = str1.charAt(0);
      j = 0;
      if (j >= this.b.length) {
        break label999;
      }
      localcsg2 = this.b[j];
      if ((localcsg2.a != i) || (!localcsg2.b.equals(str1))) {}
    }
    label997:
    label999:
    for (csg localcsg1 = localcsg2;; localcsg1 = null)
    {
      if (localcsg1 != null)
      {
        Object localObject2;
        switch (localcsg1.d)
        {
        case 9: 
        case 10: 
        case 11: 
        case 12: 
        case 13: 
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 18: 
        case 19: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 25: 
        case 26: 
        case 27: 
        case 28: 
        case 29: 
        case 30: 
        case 31: 
        default: 
          paramJsonReader.skipValue();
          localObject2 = null;
        }
        for (;;)
        {
          try
          {
            localcsg1.c.set(localObject1, localObject2);
          }
          catch (Exception localException)
          {
            String str2 = String.valueOf(localcsg1.c);
            String str3 = String.valueOf(localObject2);
            String str4 = String.valueOf(localException.getMessage());
            throw new IOException(29 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + "Cannot assign field value: " + str2 + " " + str3 + " " + str4);
          }
          j++;
          break label61;
          localObject2 = paramJsonReader.nextString();
          continue;
          localObject2 = Integer.valueOf(paramJsonReader.nextInt());
          continue;
          localObject2 = Integer.decode(paramJsonReader.nextString());
          continue;
          localObject2 = Long.valueOf(paramJsonReader.nextLong());
          continue;
          localObject2 = Long.decode(paramJsonReader.nextString());
          continue;
          localObject2 = Float.valueOf((float)paramJsonReader.nextDouble());
          continue;
          localObject2 = Float.valueOf(paramJsonReader.nextString());
          continue;
          localObject2 = Double.valueOf(paramJsonReader.nextDouble());
          continue;
          localObject2 = Double.valueOf(paramJsonReader.nextString());
          continue;
          localObject2 = Boolean.valueOf(paramJsonReader.nextBoolean());
          continue;
          localObject2 = Boolean.valueOf(paramJsonReader.nextString());
          continue;
          localObject2 = new BigInteger(paramJsonReader.nextString());
          continue;
          localObject2 = localcsg1.f.a(paramJsonReader, paramx);
          continue;
          ArrayList localArrayList = new ArrayList();
          paramJsonReader.beginArray();
          while (paramJsonReader.hasNext()) {
            switch (localcsg1.e)
            {
            default: 
              break;
            case 0: 
            case 32: 
              localArrayList.add(paramJsonReader.nextString());
              break;
            case 1: 
              localArrayList.add(Integer.valueOf(paramJsonReader.nextInt()));
              break;
            case 33: 
              localArrayList.add(Integer.decode(paramJsonReader.nextString()));
              break;
            case 2: 
              localArrayList.add(Long.valueOf(paramJsonReader.nextLong()));
              break;
            case 34: 
              localArrayList.add(Long.decode(paramJsonReader.nextString()));
              break;
            case 3: 
              localArrayList.add(Float.valueOf((float)paramJsonReader.nextDouble()));
              break;
            case 35: 
              localArrayList.add(Float.valueOf(paramJsonReader.nextString()));
              break;
            case 4: 
              localArrayList.add(Double.valueOf(paramJsonReader.nextDouble()));
              break;
            case 36: 
              localArrayList.add(Double.valueOf(paramJsonReader.nextString()));
              break;
            case 5: 
              localArrayList.add(Boolean.valueOf(paramJsonReader.nextBoolean()));
              break;
            case 37: 
              localArrayList.add(Boolean.valueOf(paramJsonReader.nextString()));
              break;
            case 6: 
            case 38: 
              localArrayList.add(new BigInteger(paramJsonReader.nextString()));
              break;
            case 8: 
              localArrayList.add(localcsg1.f.a(paramJsonReader, null));
            }
          }
          paramJsonReader.endArray();
          localObject2 = localArrayList;
        }
      }
      if (paramx != null) {}
      for (boolean bool = paramx.c();; bool = false)
      {
        if (bool) {
          break label997;
        }
        paramJsonReader.skipValue();
        break;
        paramJsonReader.endObject();
        return localObject1;
      }
      break;
    }
  }
  
  private final void a()
  {
    for (;;)
    {
      ArrayList localArrayList;
      int i;
      csg localcsg;
      int j;
      int k;
      boolean bool;
      String str1;
      Field localField;
      try
      {
        localArrayList = new ArrayList();
        i = 0;
        if (i >= this.f.length) {
          break label452;
        }
        localcsg = new csg();
        Object[] arrayOfObject1 = this.f;
        j = i + 1;
        localObject2 = arrayOfObject1[i];
        if (localObject2 == d)
        {
          Object[] arrayOfObject6 = this.f;
          int n = j + 1;
          localcsg.b = ((String)arrayOfObject6[j]);
          Object[] arrayOfObject7 = this.f;
          j = n + 1;
          localObject2 = arrayOfObject7[n];
        }
        if (localObject2 != c) {
          break label482;
        }
        Object[] arrayOfObject5 = this.f;
        k = j + 1;
        Object localObject3 = arrayOfObject5[j];
        bool = true;
        localObject2 = localObject3;
        if (!(localObject2 instanceof csf)) {
          break label492;
        }
        localcsg.f = ((csf)localObject2);
        Object[] arrayOfObject4 = this.f;
        m = k + 1;
        localObject2 = arrayOfObject4[k];
        str1 = (String)localObject2;
        if (localcsg.b == null) {
          localcsg.b = str1;
        }
        localcsg.a = localcsg.b.charAt(0);
      }
      finally {}
      try
      {
        localField = this.a.getField(str1);
        a(localcsg, localField, bool);
        localArrayList.add(localcsg);
        i = m;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        String str2 = String.valueOf(this.a);
        throw new IllegalStateException(16 + String.valueOf(str2).length() + String.valueOf(str1).length() + "No such field: " + str2 + "." + str1);
      }
      Object[] arrayOfObject2 = this.f;
      int m = k + 1;
      Object localObject2 = arrayOfObject2[k];
      continue;
      if ((localObject2 instanceof Class))
      {
        Class localClass = (Class)localObject2;
        try
        {
          localcsg.f = ((csf)localClass.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
          Object[] arrayOfObject3 = this.f;
          m = k + 1;
          localObject2 = arrayOfObject3[k];
        }
        catch (Exception localException)
        {
          String str3 = String.valueOf(localClass);
          throw new IllegalStateException(22 + String.valueOf(str3).length() + "Invalid EsJson class: " + str3, localException);
        }
        label452:
        this.b = new csg[localArrayList.size()];
        localArrayList.toArray(this.b);
      }
      else
      {
        m = k;
        continue;
        label482:
        k = j;
        bool = false;
        continue;
        label492:
        if ((Integer.class != localObject2) && (Long.class != localObject2) && (Float.class != localObject2) && (Double.class != localObject2) && (Boolean.class != localObject2)) {
          if (BigInteger.class != localObject2) {}
        }
      }
    }
  }
  
  private final void a(JsonWriter paramJsonWriter, Object paramObject)
  {
    if (this.b == null)
    {
      if (this.a == null) {
        throw new UnsupportedOperationException("A JSON class must either configure the automatic parser or override read(Jsonwriter)");
      }
      a();
    }
    paramJsonWriter.beginObject();
    Object[] arrayOfObject = b(paramObject);
    int i = 0;
    if (i < arrayOfObject.length)
    {
      Object localObject1;
      csg localcsg;
      if (arrayOfObject[i] != null)
      {
        localObject1 = arrayOfObject[i];
        localcsg = this.b[i];
        paramJsonWriter.name(localcsg.b);
        switch (localcsg.d)
        {
        }
      }
      for (;;)
      {
        i++;
        break;
        paramJsonWriter.value((String)localObject1);
        continue;
        paramJsonWriter.value((Number)localObject1);
        continue;
        paramJsonWriter.value((Float)localObject1);
        continue;
        paramJsonWriter.value((Double)localObject1);
        continue;
        paramJsonWriter.value(((Boolean)localObject1).booleanValue());
        continue;
        paramJsonWriter.value(localObject1.toString());
        continue;
        localcsg.f.a(paramJsonWriter, localObject1);
        continue;
        List localList = (List)localObject1;
        paramJsonWriter.beginArray();
        int j = localList.size();
        int k = 0;
        if (k < j)
        {
          Object localObject2 = localList.get(k);
          switch (localcsg.e)
          {
          }
          for (;;)
          {
            k++;
            break;
            paramJsonWriter.value((String)localObject2);
            continue;
            paramJsonWriter.value((Number)localObject2);
            continue;
            paramJsonWriter.value((Float)localObject2);
            continue;
            paramJsonWriter.value((Double)localObject2);
            continue;
            paramJsonWriter.value(((Boolean)localObject2).booleanValue());
            continue;
            paramJsonWriter.value(localObject2.toString());
            continue;
            localcsg.f.a(paramJsonWriter, localObject2);
          }
        }
        paramJsonWriter.endArray();
      }
    }
    paramJsonWriter.endObject();
  }
  
  static void a(csg paramcsg, Field paramField, boolean paramBoolean)
  {
    paramcsg.c = paramField;
    Class localClass1 = paramField.getType();
    if (localClass1 == String.class) {
      paramcsg.d = 0;
    }
    for (;;)
    {
      if (paramBoolean) {
        paramcsg.d = (0x20 | paramcsg.d);
      }
      return;
      if ((localClass1 == Integer.class) || (localClass1 == Integer.TYPE))
      {
        paramcsg.d = 1;
      }
      else if ((localClass1 == Long.class) || (localClass1 == Long.TYPE))
      {
        paramcsg.d = 2;
      }
      else if ((localClass1 == Float.class) || (localClass1 == Float.TYPE))
      {
        paramcsg.d = 3;
      }
      else if ((localClass1 == Double.class) || (localClass1 == Double.TYPE))
      {
        paramcsg.d = 4;
      }
      else if ((localClass1 == Boolean.class) || (localClass1 == Boolean.TYPE))
      {
        paramcsg.d = 5;
      }
      else if (localClass1 == BigInteger.class)
      {
        paramcsg.d = 6;
      }
      else if (List.class.isAssignableFrom(localClass1))
      {
        Class localClass2 = (Class)((java.lang.reflect.ParameterizedType)paramField.getGenericType()).getActualTypeArguments()[0];
        paramcsg.d = 7;
        if (localClass2 == String.class) {
          paramcsg.e = 0;
        }
        for (;;)
        {
          if (!paramBoolean) {
            break label322;
          }
          paramcsg.e = (0x20 | paramcsg.e);
          paramBoolean = false;
          break;
          if (localClass2 == Integer.class) {
            paramcsg.e = 1;
          } else if (localClass2 == Long.class) {
            paramcsg.e = 2;
          } else if (localClass2 == Float.class) {
            paramcsg.e = 3;
          } else if (localClass2 == Double.class) {
            paramcsg.e = 4;
          } else if (localClass2 == Boolean.class) {
            paramcsg.e = 5;
          } else if (localClass2 == BigInteger.class) {
            paramcsg.e = 6;
          } else {
            paramcsg.e = 8;
          }
        }
      }
      else
      {
        label322:
        paramcsg.d = 8;
      }
    }
  }
  
  private T b()
  {
    try
    {
      Object localObject = this.a.newInstance();
      return localObject;
    }
    catch (Exception localException)
    {
      throw new RuntimeException("Cannot create new instance", localException);
    }
  }
  
  private Object[] b(T paramT)
  {
    Object[] arrayOfObject = new Object[this.b.length];
    int i = 0;
    while (i < this.b.length) {
      try
      {
        arrayOfObject[i] = this.b[i].c.get(paramT);
        i++;
      }
      catch (Exception localException)
      {
        String str = String.valueOf(this.b[i].c);
        throw new RuntimeException(27 + String.valueOf(str).length() + "Cannot obtain field value: " + str, localException);
      }
    }
    return arrayOfObject;
  }
  
  public final T a(byte[] paramArrayOfByte)
  {
    String str1;
    try
    {
      JsonReader localJsonReader = new JsonReader(new InputStreamReader(new ByteArrayInputStream(paramArrayOfByte), e));
      Object localObject = a(localJsonReader, null);
      localJsonReader.close();
      return localObject;
    }
    catch (IOException localIOException)
    {
      str1 = String.valueOf(getClass().getSimpleName());
      if (str1.length() == 0) {}
    }
    for (String str2 = "Cannot parse JSON using ".concat(str1);; str2 = new String("Cannot parse JSON using ")) {
      throw new RuntimeException(str2, localIOException);
    }
  }
  
  public final byte[] a(T paramT)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    String str1;
    try
    {
      JsonWriter localJsonWriter = new JsonWriter(new BufferedWriter(new OutputStreamWriter(localByteArrayOutputStream, e), 8192));
      a(localJsonWriter, paramT);
      localJsonWriter.flush();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException localIOException)
    {
      str1 = String.valueOf(getClass().getSimpleName());
      if (str1.length() == 0) {}
    }
    for (String str2 = "Cannot generate JSON using ".concat(str1);; str2 = new String("Cannot generate JSON using ")) {
      throw new RuntimeException(str2, localIOException);
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     csf
 * JD-Core Version:    0.7.0.1
 */