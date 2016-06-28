import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public final class jcn
  implements jaa
{
  private static final String a = jdr.a(jcn.class);
  private final Context b;
  private final giz c;
  private final jco d;
  
  public jcn(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((giz)mbb.a(paramContext, giz.class));
    this.d = ((jco)mbb.a(paramContext, jco.class));
  }
  
  private static jal a(jal paramjal1, jal paramjal2)
  {
    if (paramjal2.a.compareTo(paramjal1.a) > 0) {
      return paramjal2;
    }
    return paramjal1;
  }
  
  private final void c(int paramInt)
  {
    this.c.b(paramInt).e("com.google.android.libraries.social.notifications.REGISTER_REQUEST_FINGERPRINT").d();
  }
  
  public final jal a(int paramInt)
  {
    for (;;)
    {
      kcg localkcg;
      String str;
      try
      {
        efj.l();
        if (!this.c.c(paramInt))
        {
          localjal = new jal(jam.c);
          return localjal;
        }
        this.d.a(paramInt, jak.e);
        ((izy)mbb.a(this.b, izy.class)).a(paramInt, false);
        localkcg = new kcg(this.b, paramInt);
        str = new jcm(this.b).a.getString("reg_id", null);
        if (str == null)
        {
          jdr.c(a, 74 + "Unregistration failed due to invalid gcm token for account ID: " + paramInt);
          localjal = new jal(jam.b);
          continue;
        }
        c(paramInt);
      }
      finally {}
      jcr localjcr = new jcr(this.b, localkcg, str);
      mbb.a(this.b, jdm.class);
      jdm.a(localjcr, this.b);
      if (localjcr.n())
      {
        jdr.c(a, 44 + "Failed to unregister account ID: " + paramInt);
        boolean bool = kbw.b(localjcr.q);
        if (!bool) {
          this.d.a(paramInt, jak.c);
        }
        if (bool) {}
        for (jam localjam = jam.b;; localjam = jam.c)
        {
          localjal = new jal(localjam, localjcr.q);
          break;
        }
      }
      jdr.a(a, 49 + "Successfully unregistered account ID: " + paramInt);
      this.d.a(paramInt, jak.a);
      jal localjal = new jal(jam.a);
    }
  }
  
  public final jal a(int paramInt, jaj paramjaj)
  {
    int i = 1;
    for (;;)
    {
      boolean bool1;
      try
      {
        efj.l();
        if (!this.c.c(paramInt))
        {
          localjal = new jal(jam.c);
          return localjal;
        }
        jcm localjcm = new jcm(this.b);
        bool1 = new jcm(this.b).a(false);
        if (bool1)
        {
          jdr.a(a, "Got new GCM token, updating registration status for all accounts.");
          this.d.a(jak.f, jak.d);
        }
        String str1 = localjcm.a.getString("reg_id", null);
        if (TextUtils.isEmpty(str1))
        {
          jdr.c(a, 72 + "Registration failed due to invalid gcm token for account ID: " + paramInt);
          localjal = new jal(jam.b);
          continue;
        }
        localqqu = jcp.a(this.b, str1, paramjaj);
      }
      finally {}
      qqu localqqu;
      int j = jcp.a(localqqu);
      if (!bool1)
      {
        int k = this.c.a(paramInt).a("com.google.android.libraries.social.notifications.REGISTER_REQUEST_FINGERPRINT", 0);
        String str2 = a;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(k);
        arrayOfObject1[1] = Integer.valueOf(j);
        jdr.a(str2, String.format("Checking register device request fingerprint, old [%d], new [%d]", arrayOfObject1));
        if (k == j) {
          break label661;
        }
        break;
      }
      String str3 = a;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      jdr.a(str3, String.format("Clearing out registration request fingerprint for accountId [%d].", arrayOfObject2));
      c(paramInt);
      this.d.a(paramInt, jak.d);
      ((izy)mbb.a(this.b, izy.class)).a(paramInt, false);
      kcg localkcg = new kcg(this.b, paramInt);
      jcp localjcp = new jcp(this.b, localkcg, localqqu);
      mbb.a(this.b, jdm.class);
      jdm.a(localjcp, this.b);
      String str4 = a;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      jdr.a(str4, String.format("Started registration op for accountId [%d].", arrayOfObject3));
      if (localjcp.n())
      {
        jdr.c(a, 42 + "Failed to register account ID: " + paramInt);
        boolean bool2 = kbw.b(localjcp.q);
        if (!bool2) {
          this.d.a(paramInt, jak.b);
        }
        if (bool2) {}
        for (jam localjam = jam.b;; localjam = jam.c)
        {
          localjal = new jal(localjam, localjcp.q);
          break;
        }
      }
      String str5 = a;
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = Integer.valueOf(paramInt);
      arrayOfObject4[1] = Integer.valueOf(j);
      jdr.a(str5, String.format("Registration successful, updating request fingerprint for accountId [%d] to [%d].", arrayOfObject4));
      this.c.b(paramInt).b("com.google.android.libraries.social.notifications.REGISTER_REQUEST_FINGERPRINT", j).d();
      label567:
      jdr.a(a, 47 + "Successfully registered account ID: " + paramInt);
      this.d.a(paramInt, jak.f);
      jal localjal = new jal(jam.a);
    }
    label661:
    label664:
    for (;;)
    {
      String str6 = a;
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = Integer.valueOf(paramInt);
      jdr.a(str6, String.format("Registration rpc dropped for accountId [%d], request fingerprint matches.", arrayOfObject5));
      break label567;
      for (;;)
      {
        if (i == 0) {
          break label664;
        }
        break;
        i = 0;
      }
    }
  }
  
  public final jal a(boolean paramBoolean, jaj paramjaj)
  {
    for (;;)
    {
      Object localObject2;
      try
      {
        String str = a;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Boolean.valueOf(paramBoolean);
        arrayOfObject[1] = paramjaj;
        jdr.a(str, String.format("Syncing registration status, force [%b], reason [%s]", arrayOfObject));
        efj.l();
        jcm localjcm = new jcm(this.b);
        localObject2 = new jal(jam.a);
        if (localjcm.a(paramBoolean))
        {
          jdr.a(a, "gcmManager register is success");
          this.d.a(jak.f, jak.d);
        }
        Iterator localIterator = this.c.a(new String[] { "logged_in" }).iterator();
        if (localIterator.hasNext())
        {
          int i = ((Integer)localIterator.next()).intValue();
          jak localjak = this.d.a(i);
          if (localjak == jak.d)
          {
            localObject2 = a(a(i, paramjaj), (jal)localObject2);
            continue;
          }
          if (localjak == jak.e)
          {
            jal localjal = a(a(i), (jal)localObject2);
            localObject3 = localjal;
            localObject2 = localObject3;
          }
        }
        else
        {
          return localObject2;
        }
      }
      finally {}
      Object localObject3 = localObject2;
    }
  }
  
  public final jak b(int paramInt)
  {
    try
    {
      jak localjak = this.d.a(paramInt);
      return localjak;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     jcn
 * JD-Core Version:    0.7.0.1
 */