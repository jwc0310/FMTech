import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Field;

public final class kdg
{
  private static final la<Class<? extends qat>, Field> a = new la();
  
  static <RS extends qat> long a(RS paramRS)
  {
    try
    {
      mpw localmpw = (mpw)b(paramRS).get(paramRS);
      if (localmpw != null)
      {
        long l = localmpw.d.a.longValue();
        return l;
      }
      return 0L;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      String str = String.valueOf(paramRS);
      Log.e("PlusiUtils", 37 + String.valueOf(str).length() + "No API header found in the response:\n" + str, localNoSuchFieldException);
      return 0L;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      break label37;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      label37:
      break label37;
    }
  }
  
  public static kcp a(Context paramContext, int paramInt)
  {
    return new kcp(paramContext, new kcg(paramContext, paramInt), "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
  }
  
  public static kcp a(Context paramContext, kcg paramkcg)
  {
    return new kcp(paramContext, paramkcg, "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
  }
  
  /* Error */
  static <RS extends qat> void a(Context paramContext, RS paramRS)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 102
    //   3: invokestatic 107	mbb:b	(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;
    //   6: checkcast 102	hpy
    //   9: astore_2
    //   10: aload_2
    //   11: ifnonnull +4 -> 15
    //   14: return
    //   15: aload_1
    //   16: invokestatic 27	kdg:b	(Lqat;)Ljava/lang/reflect/Field;
    //   19: aload_1
    //   20: invokevirtual 33	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast 35	mpw
    //   26: astore 6
    //   28: aload 6
    //   30: ifnull +22 -> 52
    //   33: aload 6
    //   35: getfield 111	mpw:c	Lmgn;
    //   38: astore 7
    //   40: aload 7
    //   42: ifnull -28 -> 14
    //   45: aload_2
    //   46: aload 7
    //   48: invokevirtual 114	hpy:a	(Lmgn;)V
    //   51: return
    //   52: aconst_null
    //   53: astore 7
    //   55: goto -15 -> 40
    //   58: astore_3
    //   59: aload_1
    //   60: invokestatic 56	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   63: astore 4
    //   65: ldc 58
    //   67: new 60	java/lang/StringBuilder
    //   70: dup
    //   71: bipush 37
    //   73: aload 4
    //   75: invokestatic 56	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   78: invokevirtual 64	java/lang/String:length	()I
    //   81: iadd
    //   82: invokespecial 67	java/lang/StringBuilder:<init>	(I)V
    //   85: ldc 69
    //   87: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: aload 4
    //   92: invokevirtual 73	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   98: aload_3
    //   99: invokestatic 83	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   102: pop
    //   103: return
    //   104: astore_3
    //   105: goto -46 -> 59
    //   108: astore_3
    //   109: goto -50 -> 59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	112	0	paramContext	Context
    //   0	112	1	paramRS	RS
    //   9	37	2	localhpy	hpy
    //   58	41	3	localNoSuchFieldException	NoSuchFieldException
    //   104	1	3	localIllegalAccessException	IllegalAccessException
    //   108	1	3	localIllegalArgumentException	IllegalArgumentException
    //   63	28	4	str	String
    //   26	8	6	localmpw	mpw
    //   38	16	7	localmgn	mgn
    // Exception table:
    //   from	to	target	type
    //   15	28	58	java/lang/NoSuchFieldException
    //   33	40	58	java/lang/NoSuchFieldException
    //   15	28	104	java/lang/IllegalAccessException
    //   33	40	104	java/lang/IllegalAccessException
    //   15	28	108	java/lang/IllegalArgumentException
    //   33	40	108	java/lang/IllegalArgumentException
  }
  
  public static <RQ extends qat> void a(Context paramContext, RQ paramRQ, String paramString, boolean paramBoolean, int paramInt)
  {
    a(paramContext, paramRQ, paramString, false, paramInt, null);
  }
  
  public static <RQ extends qat> void a(Context paramContext, RQ paramRQ, String paramString, boolean paramBoolean, int paramInt, qok paramqok)
  {
    rjp localrjp = new rjp();
    rjt localrjt = new rjt();
    localrjt.a = Integer.valueOf(efj.F(paramContext));
    localrjt.b = Integer.valueOf(efj.G(paramContext));
    localrjt.c = Integer.valueOf(efj.H(paramContext));
    localrjp.b = Integer.valueOf(efj.E(paramContext));
    localrjp.f = localrjt;
    localrjp.a = paramString;
    if (paramqok != null)
    {
      localrjp.h = new qog();
      localrjp.h.a(qok.a, paramqok);
    }
    kcf localkcf = (kcf)mbb.b(paramContext, kcf.class);
    String str1;
    qof localqof;
    if (localkcf != null)
    {
      str1 = localkcf.f();
      if (!TextUtils.isEmpty(str1)) {
        localrjp.d = str1;
      }
      localqof = new qof();
      if (!paramBoolean) {
        break label283;
      }
      localqof.b = 100;
      label170:
      if (!efj.b(efj.K(paramContext))) {
        break label300;
      }
    }
    label283:
    label300:
    for (localqof.a = 3;; localqof.a = 2)
    {
      localqof.c = 2;
      localqof.d = paramInt;
      localrjp.e = localqof;
      try
      {
        Field localField = b(paramRQ);
        mpv localmpv = new mpv();
        localmpv.b = localrjp;
        String str2 = null;
        if (paramContext != null)
        {
          hpy localhpy = (hpy)mbb.b(paramContext, hpy.class);
          str2 = null;
          if (localhpy != null) {
            str2 = localhpy.a();
          }
        }
        localmpv.d = str2;
        localField.set(paramRQ, localmpv);
        return;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        Log.e("PlusiUtils", "Failed to find apiHeader field on an http request, this should not happen", localNoSuchFieldException);
        return;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        Log.e("PlusiUtils", "apiHeader field on http request was not accessible, this should not happen", localIllegalAccessException);
      }
      str1 = null;
      break;
      localqof.b = mbb.a(paramContext, "com.google.android.libraries.social.appid", 300);
      break label170;
    }
  }
  
  private static <M extends qat> Field b(M paramM)
  {
    Class localClass = paramM.getClass();
    synchronized (a)
    {
      Field localField = (Field)a.get(localClass);
      if (localField == null)
      {
        localField = localClass.getField("apiHeader");
        a.put(localClass, localField);
      }
      return localField;
    }
  }
  
  public static kcv b(Context paramContext, kcg paramkcg)
  {
    return new kcv(paramContext, paramkcg, "plusi", "oauth2:https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/plus.stream.read https://www.googleapis.com/auth/plus.stream.write https://www.googleapis.com/auth/plus.circles.write https://www.googleapis.com/auth/plus.circles.read https://www.googleapis.com/auth/plus.photos.readwrite https://www.googleapis.com/auth/plus.native");
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     kdg
 * JD-Core Version:    0.7.0.1
 */