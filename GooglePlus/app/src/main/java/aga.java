import android.os.Build.VERSION;
import android.os.Trace;
import android.view.ViewGroup;
import java.util.List;

public abstract class aga<VH extends agt>
{
  public final agb a = new agb();
  public boolean b = false;
  
  public abstract int a();
  
  public int a(int paramInt)
  {
    return 0;
  }
  
  public abstract VH a(ViewGroup paramViewGroup, int paramInt);
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.a.a(paramInt1, paramInt2, null);
  }
  
  public void a(VH paramVH) {}
  
  public abstract void a(VH paramVH, int paramInt);
  
  public long b(int paramInt)
  {
    return -1L;
  }
  
  public final void b(VH paramVH, int paramInt)
  {
    paramVH.b = paramInt;
    if (this.b) {
      paramVH.d = b(paramInt);
    }
    paramVH.a(1, 519);
    if (Build.VERSION.SDK_INT >= 18) {
      Trace.beginSection("RV OnBindView");
    }
    if ((0x400 & paramVH.i) == 0) {
      if ((paramVH.k != null) && (paramVH.k.size() != 0)) {}
    }
    for (;;)
    {
      a(paramVH, paramInt);
      paramVH.f();
      if (Build.VERSION.SDK_INT >= 18) {
        Trace.endSection();
      }
      return;
    }
  }
  
  public final void c(int paramInt)
  {
    this.a.a(paramInt, 1, null);
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     aga
 * JD-Core Version:    0.7.0.1
 */