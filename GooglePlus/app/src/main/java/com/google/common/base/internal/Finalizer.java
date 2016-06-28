package com.google.common.base.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finalizer
  implements Runnable
{
  private static final Logger a = Logger.getLogger(Finalizer.class.getName());
  private static final Field e = b();
  private final WeakReference<Class<?>> b;
  private final PhantomReference<Object> c;
  private final ReferenceQueue<Object> d;
  
  private Finalizer(Class<?> paramClass, ReferenceQueue<Object> paramReferenceQueue, PhantomReference<Object> paramPhantomReference)
  {
    this.d = paramReferenceQueue;
    this.b = new WeakReference(paramClass);
    this.c = paramPhantomReference;
  }
  
  private final Method a()
  {
    Class localClass = (Class)this.b.get();
    if (localClass == null) {
      return null;
    }
    try
    {
      Method localMethod = localClass.getMethod("finalizeReferent", new Class[0]);
      return localMethod;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new AssertionError(localNoSuchMethodException);
    }
  }
  
  private final boolean a(Reference<?> paramReference)
  {
    Method localMethod = a();
    if (localMethod == null) {
      return false;
    }
    for (;;)
    {
      paramReference.clear();
      if (paramReference == this.c) {
        break;
      }
      try
      {
        localMethod.invoke(paramReference, new Object[0]);
        paramReference = this.d.poll();
        if (paramReference != null) {
          continue;
        }
        return true;
      }
      catch (Throwable localThrowable)
      {
        for (;;)
        {
          a.log(Level.SEVERE, "Error cleaning up after reference.", localThrowable);
        }
      }
    }
  }
  
  private static Field b()
  {
    try
    {
      Field localField = Thread.class.getDeclaredField("inheritableThreadLocals");
      localField.setAccessible(true);
      return localField;
    }
    catch (Throwable localThrowable)
    {
      a.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
    }
    return null;
  }
  
  public static void startFinalizer(Class<?> paramClass, ReferenceQueue<Object> paramReferenceQueue, PhantomReference<Object> paramPhantomReference)
  {
    if (!paramClass.getName().equals("com.google.common.base.FinalizableReference")) {
      throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
    }
    Thread localThread = new Thread(new Finalizer(paramClass, paramReferenceQueue, paramPhantomReference));
    localThread.setName(Finalizer.class.getName());
    localThread.setDaemon(true);
    try
    {
      if (e != null) {
        e.set(localThread, null);
      }
      localThread.start();
      return;
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        a.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", localThrowable);
      }
    }
  }
  
  public void run()
  {
    for (;;)
    {
      try
      {
        boolean bool = a(this.d.remove());
        if (!bool) {
          return;
        }
      }
      catch (InterruptedException localInterruptedException) {}
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.common.base.internal.Finalizer
 * JD-Core Version:    0.7.0.1
 */