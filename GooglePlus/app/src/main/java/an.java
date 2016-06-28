import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class an
{
  public static final Set<String> a = new HashSet();
  public static final boolean b = a(System.getProperty("java.vm.version"));
  
  public static Field a(Object paramObject, String paramString)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null) {
      try
      {
        Field localField = localClass.getDeclaredField(paramString);
        if (!localField.isAccessible()) {
          localField.setAccessible(true);
        }
        return localField;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localClass = localClass.getSuperclass();
      }
    }
    throw new NoSuchFieldException("Field " + paramString + " not found in " + paramObject.getClass());
  }
  
  public static Method a(Object paramObject, String paramString, Class<?>... paramVarArgs)
  {
    Class localClass = paramObject.getClass();
    while (localClass != null) {
      try
      {
        Method localMethod = localClass.getDeclaredMethod(paramString, paramVarArgs);
        if (!localMethod.isAccessible()) {
          localMethod.setAccessible(true);
        }
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localClass = localClass.getSuperclass();
      }
    }
    throw new NoSuchMethodException("Method " + paramString + " with parameters " + Arrays.asList(paramVarArgs) + " not found in " + paramObject.getClass());
  }
  
  public static void a(ClassLoader paramClassLoader, File paramFile, List<File> paramList)
  {
    ArrayList localArrayList2;
    Field localField3;
    IOException[] arrayOfIOException1;
    if (!paramList.isEmpty())
    {
      if (Build.VERSION.SDK_INT < 19) {
        break label313;
      }
      Object localObject2 = a(paramClassLoader, "pathList").get(paramClassLoader);
      localArrayList2 = new ArrayList();
      ArrayList localArrayList3 = new ArrayList(paramList);
      Object[] arrayOfObject4 = (Object[])a(localObject2, "makeDexElements", new Class[] { ArrayList.class, File.class, ArrayList.class }).invoke(localObject2, new Object[] { localArrayList3, paramFile, localArrayList2 });
      Field localField2 = a(localObject2, "dexElements");
      Object[] arrayOfObject5 = (Object[])localField2.get(localObject2);
      Object[] arrayOfObject6 = (Object[])Array.newInstance(arrayOfObject5.getClass().getComponentType(), arrayOfObject5.length + arrayOfObject4.length);
      System.arraycopy(arrayOfObject5, 0, arrayOfObject6, 0, arrayOfObject5.length);
      System.arraycopy(arrayOfObject4, 0, arrayOfObject6, arrayOfObject5.length, arrayOfObject4.length);
      localField2.set(localObject2, arrayOfObject6);
      if (localArrayList2.size() > 0)
      {
        Iterator localIterator = localArrayList2.iterator();
        while (localIterator.hasNext()) {
          localIterator.next();
        }
        localField3 = a(paramClassLoader, "dexElementsSuppressedExceptions");
        arrayOfIOException1 = (IOException[])localField3.get(paramClassLoader);
        if (arrayOfIOException1 != null) {
          break label268;
        }
      }
    }
    label268:
    IOException[] arrayOfIOException2;
    for (Object localObject3 = (IOException[])localArrayList2.toArray(new IOException[localArrayList2.size()]);; localObject3 = arrayOfIOException2)
    {
      localField3.set(paramClassLoader, localObject3);
      return;
      arrayOfIOException2 = new IOException[localArrayList2.size() + arrayOfIOException1.length];
      localArrayList2.toArray(arrayOfIOException2);
      System.arraycopy(arrayOfIOException1, 0, arrayOfIOException2, localArrayList2.size(), arrayOfIOException1.length);
    }
    label313:
    if (Build.VERSION.SDK_INT >= 14)
    {
      Object localObject1 = a(paramClassLoader, "pathList").get(paramClassLoader);
      ArrayList localArrayList1 = new ArrayList(paramList);
      Object[] arrayOfObject1 = (Object[])a(localObject1, "makeDexElements", new Class[] { ArrayList.class, File.class }).invoke(localObject1, new Object[] { localArrayList1, paramFile });
      Field localField1 = a(localObject1, "dexElements");
      Object[] arrayOfObject2 = (Object[])localField1.get(localObject1);
      Object[] arrayOfObject3 = (Object[])Array.newInstance(arrayOfObject2.getClass().getComponentType(), arrayOfObject2.length + arrayOfObject1.length);
      System.arraycopy(arrayOfObject2, 0, arrayOfObject3, 0, arrayOfObject2.length);
      System.arraycopy(arrayOfObject1, 0, arrayOfObject3, arrayOfObject2.length, arrayOfObject1.length);
      localField1.set(localObject1, arrayOfObject3);
      return;
    }
    efj.a(paramClassLoader, paramList);
  }
  
  private static boolean a(String paramString)
  {
    bool1 = false;
    Matcher localMatcher;
    if (paramString != null)
    {
      localMatcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(paramString);
      boolean bool2 = localMatcher.matches();
      bool1 = false;
      if (!bool2) {}
    }
    try
    {
      int i = Integer.parseInt(localMatcher.group(1));
      int j = Integer.parseInt(localMatcher.group(2));
      if (i <= 2)
      {
        bool1 = false;
        if (i == 2)
        {
          bool1 = false;
          if (j <= 0) {}
        }
      }
      else
      {
        bool1 = true;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        StringBuilder localStringBuilder;
        String str;
        bool1 = false;
      }
    }
    localStringBuilder = new StringBuilder("VM with version ").append(paramString);
    if (bool1) {}
    for (str = " has multidex support";; str = " does not have multidex support")
    {
      localStringBuilder.append(str);
      return bool1;
    }
  }
  
  public static boolean a(List<File> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext()) {
      if (!ao.a((File)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     an
 * JD-Core Version:    0.7.0.1
 */