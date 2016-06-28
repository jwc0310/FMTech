import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

public final class kpb
{
  public final Context a;
  
  public kpb(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static void a(Context paramContext, Throwable paramThrowable, String paramString)
  {
    Intent localIntent = b(paramContext, paramThrowable, paramString);
    if (localIntent != null) {
      paramContext.startService(localIntent);
    }
  }
  
  @TargetApi(19)
  private static void a(Throwable paramThrowable, StringBuilder paramStringBuilder, Set<Throwable> paramSet, String paramString)
  {
    while ((paramThrowable != null) && (!paramSet.contains(paramThrowable)))
    {
      paramSet.add(paramThrowable);
      if (paramString != null) {
        paramStringBuilder.append(paramString);
      }
      paramStringBuilder.append(paramThrowable.getClass().getName());
      paramStringBuilder.append(':');
      for (StackTraceElement localStackTraceElement : paramThrowable.getStackTrace())
      {
        paramStringBuilder.append("\n\tat ");
        paramStringBuilder.append(localStackTraceElement);
      }
      if (Build.VERSION.SDK_INT >= 19)
      {
        Throwable[] arrayOfThrowable = paramThrowable.getSuppressed();
        int k = arrayOfThrowable.length;
        for (int m = 0; m < k; m++) {
          a(arrayOfThrowable[m], paramStringBuilder, paramSet, "\nSuppressed: ");
        }
      }
      if (paramThrowable.getCause() == null) {
        break;
      }
      paramThrowable = paramThrowable.getCause();
      paramString = "\nCaused by: ";
    }
  }
  
  private static Intent b(Context paramContext, Throwable paramThrowable, String paramString)
  {
    StackTraceElement[] arrayOfStackTraceElement = paramThrowable.getStackTrace();
    if (paramThrowable.getStackTrace().length == 0) {
      return null;
    }
    try
    {
      PackageInfo localPackageInfo2 = paramContext.getPackageManager().getPackageInfo(paramContext.getApplicationContext().getPackageName(), 4);
      localPackageInfo1 = localPackageInfo2;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      String str1;
      for (;;)
      {
        ServiceInfo[] arrayOfServiceInfo;
        int i;
        int j;
        Log.e("SilentFeedback", "Could not find our own package. This should never happen. Not sending crash info.", localNameNotFoundException);
        PackageInfo localPackageInfo1 = null;
      }
      if (str1 != null) {
        break label125;
      }
      Log.e("SilentFeedback", "Could not find SilentFeedbackService, not sending crash info.");
      localIntent = new Intent();
      localIntent.setComponent(new ComponentName(paramContext.getApplicationContext(), str1));
      localIntent.setPackage(paramContext.getApplicationContext().getPackageName());
      localStringBuilder = new StringBuilder();
      a(paramThrowable, localStringBuilder, new HashSet(), null);
      localStackTraceElement = arrayOfStackTraceElement[0];
      if (localStackTraceElement.getFileName() == null) {
        break label302;
      }
    }
    arrayOfServiceInfo = localPackageInfo1.services;
    i = arrayOfServiceInfo.length;
    j = 0;
    str1 = null;
    while (j < i)
    {
      ServiceInfo localServiceInfo = arrayOfServiceInfo[j];
      if (localServiceInfo.name.matches("com\\.google\\.android\\.libraries\\.social\\.silentfeedback\\.\\w*\\.SilentFeedbackService")) {
        str1 = localServiceInfo.name;
      }
      j++;
    }
    label125:
    Intent localIntent;
    StringBuilder localStringBuilder;
    StackTraceElement localStackTraceElement;
    label302:
    for (String str2 = localStackTraceElement.getFileName();; str2 = "Unknown Source")
    {
      localIntent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.exceptionClass", paramThrowable.getClass().getName());
      localIntent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.stackTrace", localStringBuilder.toString());
      localIntent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingClass", localStackTraceElement.getClassName());
      localIntent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingFile", str2);
      localIntent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingLine", localStackTraceElement.getLineNumber());
      localIntent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.throwingMethod", localStackTraceElement.getMethodName());
      if (paramString != null) {
        localIntent.putExtra("com.google.android.libraries.social.silentfeedback.SilentFeedbackService.categoryTag", paramString);
      }
      return localIntent;
    }
  }
  
  public final void a(Throwable paramThrowable, String paramString)
  {
    a(this.a, paramThrowable, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kpb
 * JD-Core Version:    0.7.0.1
 */