import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class buv
  implements cw<ArrayList<cop>>
{
  private Context a;
  private cv b;
  private int c = 2;
  private cow d;
  private final int e;
  private final int f;
  
  public buv(Context paramContext, cow paramcow, cv paramcv, int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = paramcow;
    this.a = paramContext;
    this.b = paramcv;
    this.e = paramInt2;
    this.f = paramInt3;
  }
  
  public static cop[] a(Context paramContext, int paramInt, cow paramcow, cff paramcff)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new bwo(paramContext, paramInt, paramcow, paramcff));
    localArrayList.add(new bxa(paramContext, paramInt, paramcow));
    localArrayList.add(new caf(paramContext, paramInt, paramcow));
    localArrayList.add(new clw(paramContext, paramInt, paramcow));
    localArrayList.add(new bwm(paramContext, paramInt, paramcow, paramcff));
    Iterator localIterator = mbb.c(paramContext, dfl.class).iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((dfl)localIterator.next()).a());
    }
    return (cop[])localArrayList.toArray(new cop[localArrayList.size()]);
  }
  
  public final fu<ArrayList<cop>> a(int paramInt, Bundle paramBundle)
  {
    cop[] arrayOfcop = this.d.D();
    Arrays.sort(arrayOfcop, new buw(this));
    return new buu(this.a, arrayOfcop, this.e, this.f);
  }
  
  public final void a()
  {
    Bundle localBundle = new Bundle();
    this.b.b(this.c, localBundle, this);
  }
  
  public final void a(fu<ArrayList<cop>> paramfu) {}
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     buv
 * JD-Core Version:    0.7.0.1
 */