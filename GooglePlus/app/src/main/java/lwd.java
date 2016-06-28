import android.content.Context;
import android.content.res.Resources;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.Log;

public final class lwd
{
  private static final Time a = new Time();
  
  private static long a(long paramLong1, long paramLong2)
  {
    try
    {
      a.set(paramLong1);
      int i = Time.getJulianDay(paramLong1, a.gmtoff);
      a.set(paramLong2);
      int j = Math.abs(Time.getJulianDay(paramLong2, a.gmtoff) - i);
      long l = j;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
  
  public static CharSequence a(Context paramContext, long paramLong)
  {
    long l = System.currentTimeMillis();
    if (l - paramLong < 60000L) {
      return paramContext.getResources().getText(efj.aax);
    }
    try
    {
      String str2 = DateUtils.getRelativeTimeSpanString(paramLong, l, 60000L, 262144).toString();
      return str2;
    }
    catch (Exception localException)
    {
      if (Log.isLoggable("RelativeTimeUtils", 3))
      {
        String str1 = String.valueOf(localException.getMessage());
        new StringBuilder(108 + String.valueOf(str1).length()).append("DateUtils.getRelativeTimeSpanString threw an exception! time=").append(paramLong).append(", now=").append(l).append("\n").append(str1);
      }
    }
    return a(paramContext, paramLong, efj.aao, efj.aan, efj.aam);
  }
  
  private static CharSequence a(Context paramContext, long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    long l1 = System.currentTimeMillis();
    if (l1 - paramLong < 60000L) {
      return paramContext.getResources().getText(efj.aax);
    }
    long l2 = Math.abs(l1 - paramLong);
    long l3;
    if (l2 < 3600000L) {
      l3 = l2 / 60000L;
    }
    for (;;)
    {
      String str = paramContext.getResources().getQuantityString(paramInt1, (int)l3);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l3);
      return String.format(str, arrayOfObject);
      if (l2 < 86400000L)
      {
        l3 = l2 / 3600000L;
        paramInt1 = paramInt2;
      }
      else
      {
        if (l2 >= 604800000L) {
          break;
        }
        l3 = a(paramLong, l1);
        paramInt1 = paramInt3;
      }
    }
    return DateUtils.formatDateRange(paramContext, paramLong, paramLong, 262144);
  }
  
  public static String a(Long paramLong)
  {
    if (paramLong == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    while (paramLong.longValue() > 0L)
    {
      if (paramLong.longValue() >= 86400000L)
      {
        localStringBuilder.append(paramLong.longValue() / 86400000L);
        localStringBuilder.append('d');
        paramLong = Long.valueOf(paramLong.longValue() % 86400000L);
      }
      for (;;)
      {
        if (paramLong.longValue() <= 0L) {
          break label221;
        }
        localStringBuilder.append(' ');
        break;
        if (paramLong.longValue() >= 3600000L)
        {
          localStringBuilder.append(paramLong.longValue() / 3600000L);
          localStringBuilder.append('h');
          paramLong = Long.valueOf(paramLong.longValue() % 3600000L);
        }
        else if (paramLong.longValue() >= 60000L)
        {
          localStringBuilder.append(paramLong.longValue() / 60000L);
          localStringBuilder.append('m');
          paramLong = Long.valueOf(paramLong.longValue() % 60000L);
        }
        else
        {
          if (paramLong.longValue() < 1000L) {
            break label223;
          }
          localStringBuilder.append(paramLong.longValue() / 1000L);
          localStringBuilder.append('s');
          paramLong = Long.valueOf(paramLong.longValue() % 1000L);
        }
      }
      label221:
      continue;
      label223:
      localStringBuilder.append(paramLong);
      localStringBuilder.append("ms");
    }
    return localStringBuilder.toString();
  }
  
  public static CharSequence b(Context paramContext, long paramLong)
  {
    long l = System.currentTimeMillis();
    if (l - paramLong < 60000L) {
      return paramContext.getResources().getText(efj.aax);
    }
    try
    {
      String str2 = DateUtils.getRelativeTimeSpanString(paramLong, l, 60000L, 327680).toString();
      return str2;
    }
    catch (Exception localException)
    {
      if (Log.isLoggable("RelativeTimeUtils", 3))
      {
        String str1 = String.valueOf(localException.getMessage());
        new StringBuilder(108 + String.valueOf(str1).length()).append("DateUtils.getRelativeTimeSpanString threw an exception! time=").append(paramLong).append(", now=").append(l).append("\n").append(str1);
      }
    }
    return a(paramContext, paramLong, efj.aao, efj.aan, efj.aam);
  }
  
  public static CharSequence c(Context paramContext, long paramLong)
  {
    long l1 = System.currentTimeMillis();
    long l2 = l1 - paramLong;
    long l3;
    int i;
    if (l2 < 60000L)
    {
      l3 = Math.max(l2 / 1000L, 1L);
      i = efj.aav;
    }
    for (;;)
    {
      String str = paramContext.getResources().getQuantityString(i, (int)l3);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l3);
      return String.format(str, arrayOfObject);
      if (l2 < 3600000L)
      {
        l3 = l2 / 60000L;
        i = efj.aat;
      }
      else if (l2 < 86400000L)
      {
        l3 = l2 / 3600000L;
        i = efj.aar;
      }
      else
      {
        l3 = a(paramLong, l1);
        if (l2 < 604800000L)
        {
          i = efj.aap;
        }
        else
        {
          l3 /= 7L;
          i = efj.aaw;
        }
      }
    }
  }
  
  public static CharSequence d(Context paramContext, long paramLong)
  {
    return a(paramContext, paramLong, efj.aau, efj.aas, efj.aaq);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     lwd
 * JD-Core Version:    0.7.0.1
 */