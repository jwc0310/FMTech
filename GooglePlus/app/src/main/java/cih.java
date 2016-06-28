import android.content.ContentResolver;
import android.content.Context;
import android.os.ConditionVariable;
import com.google.android.apps.plus.content.EsProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class cih
  extends hqe<otf>
{
  private final int d;
  private final int e;
  private final String f;
  private final int h;
  private final jiw r;
  private final long s;
  private otf t;
  private fv u = new fv(this);
  
  public cih(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3, long paramLong)
  {
    super(paramContext);
    this.r = ((jiw)mbb.a(paramContext, jiw.class));
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramString;
    this.h = paramInt3;
    this.s = paramLong;
  }
  
  public static void a(Context paramContext, String paramString)
  {
    but.a(paramContext).a(1, paramString);
    but.a(paramContext).a(2, paramString);
    but.a(paramContext).a(3, paramString);
  }
  
  private otf r()
  {
    int i = this.d;
    int j;
    ConditionVariable localConditionVariable;
    byte[] arrayOfByte;
    switch (this.e)
    {
    default: 
      throw new IllegalStateException();
    case 9: 
      j = 1;
      localConditionVariable = new ConditionVariable();
      if (this.t == null)
      {
        arrayOfByte = but.a(this.l).a(j, this.f, this.s);
        if (arrayOfByte == null) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        otf localotf3 = (otf)qat.b(new otf(), arrayOfByte, 0, arrayOfByte.length);
        localotf2 = localotf3;
        if (localotf2 != null) {
          break label359;
        }
        switch (this.e)
        {
        default: 
          localObject2 = null;
          if (localObject2 == null) {
            break label348;
          }
          new Thread(new cii(this, (kbw)localObject2, localConditionVariable), "LookupPeopleForProfilesLoader").start();
          localObject1 = localotf2;
          HashMap localHashMap = s();
          localConditionVariable.block();
          if (localObject1 != null) {
            break label456;
          }
          localObject3 = null;
          if (localObject2 != null) {
            localObject3 = ((bjy)localObject2).a;
          }
          if (localObject3 != null)
          {
            if (localObject2 != null) {
              but.a(this.l).a(j, this.f, (qat)localObject3);
            }
            brn.a(((otf)localObject3).b, localHashMap);
          }
          return localObject3;
        }
      }
      catch (Exception localException) {}
      j = 2;
      break;
      j = 3;
      break;
      otf localotf2 = null;
      continue;
      Object localObject2 = new bjy(this.l, i, this.f, this.h);
      continue;
      localObject2 = new bjy(this.l, i, this.f, this.h, (byte)0);
      continue;
      localObject2 = new bjy(this.l, i, this.f, this.h, '\000');
      continue;
      label348:
      localConditionVariable.open();
      Object localObject1 = localotf2;
      continue;
      label359:
      localConditionVariable.open();
      localObject1 = localotf2;
      localObject2 = null;
      continue;
      otf localotf1 = new otf();
      localotf1.b = this.t.b;
      localotf1.a = this.t.a;
      localotf1.d = this.t.d;
      localotf1.e = this.t.e;
      localotf1.c = this.t.c;
      localConditionVariable.open();
      localObject1 = localotf1;
      localObject2 = null;
      continue;
      label456:
      Object localObject3 = localObject1;
    }
  }
  
  private final HashMap<String, String> s()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.r.a(this.d, 0, jjh.a).iterator();
    while (localIterator.hasNext())
    {
      jjg localjjg = (jjg)localIterator.next();
      localHashMap.put(localjjg.c(), localjjg.j());
    }
    return localHashMap;
  }
  
  protected final void i()
  {
    super.i();
    this.t = null;
  }
  
  protected final boolean o()
  {
    this.l.getContentResolver().registerContentObserver(EsProvider.e(this.l), false, this.u);
    return true;
  }
  
  protected final boolean p()
  {
    this.l.getContentResolver().unregisterContentObserver(this.u);
    return true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     cih
 * JD-Core Version:    0.7.0.1
 */