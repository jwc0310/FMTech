import android.content.ContentResolver;
import android.content.Context;
import android.os.ConditionVariable;
import com.google.android.apps.plus.content.EsProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public final class cal
  extends hqe<otd>
{
  final jiw d;
  final int e;
  final int f;
  private final can h;
  private final cao r;
  private final long s;
  private otd t;
  private fv u = new fv(this);
  
  public cal(Context paramContext, int paramInt1, int paramInt2, long paramLong)
  {
    this(paramContext, paramInt1, paramInt2, 2147483647L, null, null);
  }
  
  private cal(Context paramContext, int paramInt1, int paramInt2, long paramLong, cao paramcao, can paramcan)
  {
    super(paramContext);
    this.d = ((jiw)mbb.a(paramContext, jiw.class));
    this.e = paramInt1;
    this.f = paramInt2;
    this.s = paramLong;
    this.r = new cao(this);
    this.h = new can(this);
  }
  
  private otd r()
  {
    ConditionVariable localConditionVariable = new ConditionVariable();
    byte[] arrayOfByte;
    if (this.t == null)
    {
      arrayOfByte = bvc.a(this.l).a(bvc.a(this.f), this.s);
      if (arrayOfByte == null) {}
    }
    for (;;)
    {
      otd localotd3;
      HashMap localHashMap;
      try
      {
        otd localotd4 = (otd)qat.b(new otd(), arrayOfByte, 0, arrayOfByte.length);
        localotd3 = localotd4;
        if (localotd3 != null) {
          break label216;
        }
        biy localbiy2 = this.r.a();
        new Thread(new cam(this, localbiy2, localConditionVariable), "GetCelebritySuggestionsLoader").start();
        localbiy1 = localbiy2;
        localotd1 = localotd3;
        localHashMap = this.h.a();
        localConditionVariable.block(120000L);
        if (localotd1 != null) {
          break label390;
        }
        localotd2 = localbiy1.a;
        if (localotd2 == null) {
          break label381;
        }
        if (localbiy1 != null) {
          bvc.a(this.l).a(bvc.a(this.f), localotd2);
        }
        osm[] arrayOfosm = localotd2.a;
        if (arrayOfosm == null) {
          break label267;
        }
        int i = 0;
        if (i >= arrayOfosm.length) {
          break label267;
        }
        brn.a(arrayOfosm[i].c, localHashMap);
        i++;
        continue;
        localotd3 = null;
      }
      catch (Exception localException) {}
      continue;
      label216:
      localConditionVariable.open();
      otd localotd1 = localotd3;
      biy localbiy1 = null;
      continue;
      localotd1 = new otd();
      localotd1.a = this.t.a;
      localotd1.b = this.t.b;
      localConditionVariable.open();
      localbiy1 = null;
      continue;
      label267:
      ArrayList localArrayList = new ArrayList(Arrays.asList(localotd2.b));
      Iterator localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        oso localoso = (oso)localIterator.next();
        brn.a(localoso.a, localHashMap);
        if ((localbiy1 != null) && (localoso.a.c != null) && (localoso.a.c.length > 0)) {
          localIterator.remove();
        }
      }
      localotd2.b = ((oso[])localArrayList.toArray(new oso[localArrayList.size()]));
      label381:
      this.t = localotd2;
      return localotd2;
      label390:
      otd localotd2 = localotd1;
    }
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
 * Qualified Name:     cal
 * JD-Core Version:    0.7.0.1
 */