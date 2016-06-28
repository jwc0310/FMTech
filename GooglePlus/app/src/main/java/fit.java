import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public class fit
{
  private static Context a;
  private static fgh b;
  
  public static fgh a(Context paramContext)
  {
    efj.a(paramContext);
    if (b != null) {
      return b;
    }
    int i = eer.a(paramContext);
    switch (i)
    {
    default: 
      throw new eep(i);
    }
    fit.class.getSimpleName();
    IBinder localIBinder = (IBinder)a(b(paramContext).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl");
    Object localObject;
    if (localIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      b = (fgh)localObject;
      try
      {
        b.a(new evc(b(paramContext).getResources()), eer.a);
        return b;
      }
      catch (RemoteException localRemoteException)
      {
        IInterface localIInterface;
        throw new bm(localRemoteException);
      }
      localIInterface = localIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
      if ((localIInterface != null) && ((localIInterface instanceof fgh))) {
        localObject = (fgh)localIInterface;
      } else {
        localObject = new fgj(localIBinder);
      }
    }
  }
  
  private static <T> T a(Class<?> paramClass)
  {
    try
    {
      Object localObject = paramClass.newInstance();
      return localObject;
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new IllegalStateException("Unable to instantiate the dynamic class " + paramClass.getName());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalStateException("Unable to call the default constructor of " + paramClass.getName());
    }
  }
  
  private static <T> T a(ClassLoader paramClassLoader, String paramString)
  {
    try
    {
      Object localObject = a(((ClassLoader)efj.a(paramClassLoader)).loadClass(paramString));
      return localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new IllegalStateException("Unable to find dynamic class " + paramString);
    }
  }
  
  private static Context b(Context paramContext)
  {
    if (a == null) {
      a = eer.d(paramContext);
    }
    return a;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     fit
 * JD-Core Version:    0.7.0.1
 */