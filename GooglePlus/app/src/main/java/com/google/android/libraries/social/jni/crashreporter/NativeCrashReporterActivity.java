package com.google.android.libraries.social.jni.crashreporter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import efj;
import iib;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public final class NativeCrashReporterActivity
  extends Activity
{
  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str1 = getIntent().getStringExtra("runnableName");
    Serializable localSerializable = getIntent().getSerializableExtra("runnableArgs");
    if (localSerializable != null) {}
    for (HashMap localHashMap = (HashMap)localSerializable;; localHashMap = null)
    {
      if (str1 != null) {}
      String str2;
      try
      {
        ((Runnable)Class.forName(str1).getDeclaredConstructor(new Class[] { Map.class }).newInstance(new Object[] { localHashMap })).run();
        iib localiib = new iib(this, getIntent().getStringExtra("description"));
        efj.m().postDelayed(localiib, 3000L);
        return;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        String str6 = String.valueOf(str1);
        if (str6.length() != 0) {}
        for (String str7 = "Failed to find class: ".concat(str6);; str7 = new String("Failed to find class: "))
        {
          Log.e("NativeCrashReporterActivity", str7, localClassNotFoundException);
          break;
        }
      }
      catch (InstantiationException localInstantiationException)
      {
        String str4 = String.valueOf(str1);
        if (str4.length() != 0) {}
        for (String str5 = "Failed to instantiate class: ".concat(str4);; str5 = new String("Failed to instantiate class: "))
        {
          Log.e("NativeCrashReporterActivity", str5, localInstantiationException);
          break;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;)
        {
          Log.e("NativeCrashReporterActivity", "Failed to find constructor that takes a Map<String,String> as argument", localNoSuchMethodException);
        }
      }
      catch (Exception localException)
      {
        str2 = String.valueOf(str1);
        if (str2.length() == 0) {}
      }
      for (String str3 = "Failed to execute runnable: ".concat(str2);; str3 = new String("Failed to execute runnable: "))
      {
        Log.e("NativeCrashReporterActivity", str3, localException);
        break;
      }
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     com.google.android.libraries.social.jni.crashreporter.NativeCrashReporterActivity
 * JD-Core Version:    0.7.0.1
 */