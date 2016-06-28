import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.plus.service.EsService;
import java.util.Map;

public abstract class bzo
  extends mca
  implements gxv
{
  private Integer a;
  boolean ao;
  public final gzj ap = new gzj(this, this.bp);
  public final Handler aq = new bzp(this);
  private Integer b;
  private boolean c;
  
  public static void a(View paramView, int paramInt)
  {
    ((TextView)paramView.findViewById(aaw.eA)).setText(paramInt);
  }
  
  public abstract boolean A();
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle, int paramInt)
  {
    return paramLayoutInflater.inflate(paramInt, paramViewGroup, false);
  }
  
  public void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    if (paramBundle != null)
    {
      this.c = true;
      if (paramBundle.containsKey("n_pending_req")) {
        this.a = Integer.valueOf(paramBundle.getInt("n_pending_req"));
      }
      if (paramBundle.containsKey("o_pending_req")) {
        this.b = Integer.valueOf(paramBundle.getInt("o_pending_req"));
      }
    }
  }
  
  public final void a(View paramView)
  {
    if (this.c)
    {
      if ((!this.aq.hasMessages(0)) && (A())) {
        this.aq.sendEmptyMessageDelayed(0, 800L);
      }
      return;
    }
    b(paramView);
  }
  
  public final void a(ProgressBar paramProgressBar)
  {
    if (paramProgressBar == null) {
      return;
    }
    if ((this.a == null) && (this.b == null)) {}
    for (int i = 8;; i = 0)
    {
      paramProgressBar.setVisibility(i);
      return;
    }
  }
  
  public final void b(Bundle paramBundle) {}
  
  protected final void b(View paramView)
  {
    if (A())
    {
      View localView = paramView.findViewById(16908292);
      localView.setVisibility(0);
      localView.findViewById(aaw.eA).setVisibility(8);
      localView.findViewById(aaw.ez).setVisibility(0);
    }
  }
  
  public void c(Bundle paramBundle)
  {
    super.c(paramBundle);
    this.bo.a(gxv.class, this);
  }
  
  public final void c(View paramView)
  {
    this.aq.removeMessages(0);
    if (A())
    {
      View localView = paramView.findViewById(16908292);
      localView.setVisibility(0);
      localView.findViewById(aaw.eA).setVisibility(0);
      localView.findViewById(aaw.ez).setVisibility(8);
    }
  }
  
  public final void d(View paramView)
  {
    this.aq.removeMessages(0);
    paramView.findViewById(16908292).setVisibility(8);
  }
  
  public void e(Bundle paramBundle)
  {
    super.e(paramBundle);
    if (this.a != null) {
      paramBundle.putInt("n_pending_req", this.a.intValue());
    }
    if (this.b != null) {
      paramBundle.putInt("o_pending_req", this.b.intValue());
    }
  }
  
  public void m()
  {
    super.m();
    int i;
    if (this.a != null)
    {
      int k = this.a.intValue();
      if (EsService.b.containsKey(Integer.valueOf(k)))
      {
        if (!A()) {
          break label206;
        }
        a(this.N);
        i = 0;
      }
    }
    for (;;)
    {
      if (this.b != null)
      {
        int j = this.b.intValue();
        if (!EsService.b.containsKey(Integer.valueOf(j))) {
          break label196;
        }
        if (A()) {
          a(this.N);
        }
      }
      for (;;)
      {
        if ((i != 0) && (this.a == null) && (this.b == null) && (A()))
        {
          View localView1 = this.N;
          this.aq.removeMessages(0);
          if (A())
          {
            View localView2 = localView1.findViewById(16908292);
            localView2.setVisibility(0);
            localView2.findViewById(aaw.eA).setVisibility(0);
            localView2.findViewById(aaw.ez).setVisibility(8);
          }
        }
        this.ao = false;
        return;
        this.a = null;
        i = 1;
        break;
        label196:
        this.b = null;
        i = 1;
      }
      label206:
      i = 0;
    }
  }
  
  public void n()
  {
    super.n();
    this.ao = true;
  }
}


/* Location:           F:\apktool\apktool\com.google.android.apps.plus\classes-dex2jar.jar
 * Qualified Name:     bzo
 * JD-Core Version:    0.7.0.1
 */