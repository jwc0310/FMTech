import android.content.Context;
import java.util.Arrays;
import java.util.List;

final class jbv
{
  private static final String a = jdr.a(jbv.class);
  
  static jal a(Context paramContext, int paramInt)
  {
    jdj.c(paramContext, paramInt);
    jbn localjbn = new jbn(paramContext, paramInt, jdj.b(paramContext, paramInt).longValue());
    mbb.a(paramContext, jdm.class);
    jdm.a(localjbn, paramContext);
    if (localjbn.n())
    {
      jdr.c(a, 65 + "Failed to mark all notifications as read, account ID: " + paramInt);
      if (kbw.b(localjbn.q)) {}
      for (jam localjam = jam.b;; localjam = jam.c) {
        return new jal(localjam, localjbn.q);
      }
    }
    return new jal(jam.a);
  }
  
  static jal a(Context paramContext, int paramInt1, String[] paramArrayOfString, int paramInt2)
  {
    if (jdj.a(paramContext, paramInt1, paramArrayOfString, paramInt2)) {
      return a(paramContext, paramInt1, paramArrayOfString, paramInt2, ((jaq)mbb.a(paramContext, jaq.class)).a());
    }
    return new jal(jam.c);
  }
  
  private static jal a(Context paramContext, int paramInt1, String[] paramArrayOfString, int paramInt2, String paramString)
  {
    if (paramArrayOfString.length > 0)
    {
      qqw localqqw = new qqw();
      localqqw.a = paramString;
      localqqw.b = jdj.a(paramContext, paramInt1, paramArrayOfString);
      localqqw.c = paramInt2;
      jbw localjbw = new jbw(paramContext, paramInt1, localqqw);
      mbb.a(paramContext, jdm.class);
      jdm.a(localjbw, paramContext);
      if (localjbw.n())
      {
        String str1 = a;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = paramString;
        jdr.c(str1, String.format("Failed to set read states, account ID [%d], view [%s]", arrayOfObject));
        String str2 = a;
        String str3 = String.valueOf(Arrays.toString(paramArrayOfString));
        String str4;
        if (str3.length() != 0)
        {
          str4 = "NotificationKeys: ".concat(str3);
          jdr.c(str2, str4);
          if (!kbw.b(localjbw.q)) {
            break label193;
          }
        }
        label193:
        for (jam localjam = jam.b;; localjam = jam.c)
        {
          return new jal(localjam, localjbw.q);
          str4 = new String("NotificationKeys: ");
          break;
        }
      }
    }
    return new jal(jam.a);
  }
  
  static void a(Context paramContext, int paramInt, jah[] paramArrayOfjah, jae paramjae)
  {
    List localList = mbb.c(paramContext, jaf.class);
    int i = localList.size();
    new jad(paramjae);
    if (paramArrayOfjah != null) {
      Arrays.asList(paramArrayOfjah);
    }
    for (int j = 0; j < i; j++) {
      localList.get(j);
    }
    if ((jay)mbb.b(paramContext, jay.class) != null) {}
  }
  
  static void a(Context paramContext, int paramInt, String[] paramArrayOfString, String paramString)
  {
    if (paramString.equals("AST")) {
      jdj.a(paramContext, paramInt, paramArrayOfString, false);
    }
    a(paramContext, paramInt, paramArrayOfString, 5, paramString);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jbv
 * JD-Core Version:    0.7.0.1
 */