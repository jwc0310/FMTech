import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class qao<M extends qan<M>, T>
{
  public final Class<T> a;
  public final int b;
  public final boolean c;
  private int d;
  
  public qao(int paramInt1, Class<T> paramClass, int paramInt2, boolean paramBoolean)
  {
    this.d = paramInt1;
    this.a = paramClass;
    this.b = paramInt2;
    this.c = false;
  }
  
  protected final int a(Object paramObject)
  {
    int i = this.b >>> 3;
    switch (this.d)
    {
    default: 
      int j = this.d;
      throw new IllegalArgumentException(24 + "Unknown type " + j);
    case 10: 
      return qal.b(i, (qat)paramObject);
    }
    return qal.c(i, (qat)paramObject);
  }
  
  final T a(List<qaw> paramList)
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramList.size(); j++)
    {
      qaw localqaw = (qaw)paramList.get(j);
      if (localqaw.b.length != 0) {
        localArrayList.add(a(qak.a(localqaw.b)));
      }
    }
    int k = localArrayList.size();
    Object localObject;
    if (k == 0) {
      localObject = null;
    }
    for (;;)
    {
      return localObject;
      localObject = this.a.cast(Array.newInstance(this.a.getComponentType(), k));
      while (i < k)
      {
        Array.set(localObject, i, localArrayList.get(i));
        i++;
      }
    }
  }
  
  protected final Object a(qak paramqak)
  {
    Class localClass;
    if (this.c) {
      localClass = this.a.getComponentType();
    }
    try
    {
      switch (this.d)
      {
      default: 
        int i = this.d;
        throw new IllegalArgumentException(24 + "Unknown type " + i);
      }
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;)
      {
        String str2 = String.valueOf(localClass);
        throw new IllegalArgumentException(33 + String.valueOf(str2).length() + "Error creating instance of class " + str2, localInstantiationException);
        localClass = this.a;
      }
      qat localqat2 = (qat)localClass.newInstance();
      paramqak.a(localqat2, this.b >>> 3);
      return localqat2;
      qat localqat1 = (qat)localClass.newInstance();
      paramqak.a(localqat1);
      return localqat1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      String str1 = String.valueOf(localClass);
      throw new IllegalArgumentException(33 + String.valueOf(str1).length() + "Error creating instance of class " + str1, localIllegalAccessException);
    }
    catch (IOException localIOException)
    {
      throw new IllegalArgumentException("Error reading extension field", localIOException);
    }
  }
  
  protected final void a(Object paramObject, qal paramqal)
  {
    try
    {
      paramqal.c(this.b);
      switch (this.d)
      {
      default: 
        int j = this.d;
        throw new IllegalArgumentException(24 + "Unknown type " + j);
      }
    }
    catch (IOException localIOException)
    {
      throw new IllegalStateException(localIOException);
    }
    qat localqat = (qat)paramObject;
    int i = this.b >>> 3;
    localqat.a(paramqal);
    paramqal.c(0x4 | i << 3);
    return;
    paramqal.a((qat)paramObject);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     qao
 * JD-Core Version:    0.7.0.1
 */